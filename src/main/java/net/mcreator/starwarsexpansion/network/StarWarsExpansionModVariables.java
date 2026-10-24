package net.mcreator.starwarsexpansion.network;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.Map;
import java.util.WeakHashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModVariables {
	public static final EntityCapability<PlayerVariables, Void> PLAYER_VARIABLES_CAPABILITY = EntityCapability.createVoid(
			ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "player_variables"), PlayerVariables.class);

	private static final Map<Player, PlayerVariables> CACHE = new WeakHashMap<>();

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.registerEntity(PLAYER_VARIABLES_CAPABILITY, EntityType.PLAYER, (entity, ctx) -> {
			if (entity instanceof Player player)
				return getPlayerVariables(player);
			return null;
		});
	}

	public static PlayerVariables getPlayerVariables(Entity entity) {
		if (!(entity instanceof Player player))
			return new PlayerVariables();
		PlayerVariables cached = CACHE.get(player);
		if (cached != null)
			return cached;
		PlayerVariables variables = new PlayerVariables();
		CompoundTag tag = player.getPersistentData();
		if (tag.contains("PlayerVariables"))
			variables.readNBT(tag.getCompound("PlayerVariables"));
		CACHE.put(player, variables);
		return variables;
	}

	public static void storePlayerVariables(Entity entity, PlayerVariables variables) {
		if (!(entity instanceof Player player))
			return;
		CompoundTag tag = player.getPersistentData();
		tag.put("PlayerVariables", (CompoundTag) variables.writeNBT());
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				getPlayerVariables(event.getEntity()).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				getPlayerVariables(event.getEntity()).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				getPlayerVariables(event.getEntity()).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = getPlayerVariables(event.getOriginal());
			PlayerVariables clone = getPlayerVariables(event.getEntity());
			if (!event.isWasDeath()) {
				clone.jumpvar = original.jumpvar;
				clone.ssmov = original.ssmov;
				storePlayerVariables(event.getEntity(), clone);
			}
		}
	}

	public static class PlayerVariables {
		public boolean jumpvar = false;
		public boolean ssmov = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("jumpvar", jumpvar);
			nbt.putBoolean("ssmov", ssmov);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			jumpvar = nbt.getBoolean("jumpvar");
			ssmov = nbt.getBoolean("ssmov");
		}
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public static class PlayerVariablesSyncMessage implements CustomPacketPayload {
		public static final CustomPacketPayload.Type<PlayerVariablesSyncMessage> TYPE = new CustomPacketPayload.Type<>(
				ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "player_variables_sync"));

		public static final StreamCodec<FriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec.of(
				(buffer, message) -> buffer.writeNbt((CompoundTag) message.data.writeNBT()),
				buffer -> {
					PlayerVariables variables = new PlayerVariables();
					CompoundTag tag = buffer.readNbt();
					if (tag != null)
						variables.readNBT(tag);
					return new PlayerVariablesSyncMessage(variables);
					});

		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		@Override
		public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
			return TYPE;
		}

		public static void handle(PlayerVariablesSyncMessage message, IPayloadContext context) {
			context.enqueueWork(() -> {
				Player player = context.player();
				PlayerVariables variables = getPlayerVariables(player);
				variables.jumpvar = message.data.jumpvar;
				variables.ssmov = message.data.ssmov;
				storePlayerVariables(player, variables);
			});
		}

		@SubscribeEvent
		public static void register(RegisterPayloadHandlersEvent event) {
			event.registrar("1").playToClient(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC,
					PlayerVariablesSyncMessage::handle);
		}
	}
}
