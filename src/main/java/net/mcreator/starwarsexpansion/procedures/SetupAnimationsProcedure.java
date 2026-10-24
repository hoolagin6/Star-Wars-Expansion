package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import javax.annotation.Nullable;

import com.zigythebird.playeranim.api.PlayerAnimationAccess;
import com.zigythebird.playeranim.api.PlayerAnimationFactory;
import com.zigythebird.playeranim.animation.PlayerAnimManager;
import com.zigythebird.playeranim.animation.PlayerAnimationController;
import com.zigythebird.playeranimcore.animation.layered.IAnimation;
import com.zigythebird.playeranimcore.animation.layered.ModifierLayer;

@EventBusSubscriber(modid = "star_wars_expansion", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SetupAnimationsProcedure {
	private static final ResourceLocation ANIMATION_LAYER_ID = ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "player_animation");

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(ANIMATION_LAYER_ID, 1000, SetupAnimationsProcedure::registerPlayerAnimations);
	}

	private static IAnimation registerPlayerAnimations(net.minecraft.client.player.AbstractClientPlayer player) {
		return new ModifierLayer<>();
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public static class StarWarsExpansionModAnimationMessage implements CustomPacketPayload {
		public static final CustomPacketPayload.Type<StarWarsExpansionModAnimationMessage> TYPE = new CustomPacketPayload.Type<>(
				ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "player_animation_message"));

		public static final StreamCodec<FriendlyByteBuf, StarWarsExpansionModAnimationMessage> STREAM_CODEC = StreamCodec.of(
				(buffer, message) -> {
					buffer.writeUtf(message.animation);
					buffer.writeVarInt(message.target);
					buffer.writeBoolean(message.override);
				},
				buffer -> new StarWarsExpansionModAnimationMessage(buffer.readUtf(), buffer.readVarInt(),
						buffer.readBoolean()));

		String animation;
		int target;
		boolean override;

		public StarWarsExpansionModAnimationMessage(String animation, int target, boolean override) {
			this.animation = animation;
			this.target = target;
			this.override = override;
		}

		@Override
		public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
			return TYPE;
		}

		public static void handle(StarWarsExpansionModAnimationMessage message, IPayloadContext context) {
			context.enqueueWork(() -> {
				Level level = context.player().level();
				if (level.getEntity(message.target) != null) {
					Player player = (Player) level.getEntity(message.target);
					setAnimationClientside(player, message.animation, message.override);
				}
			});
		}

		@SubscribeEvent
		public static void register(RegisterPayloadHandlersEvent event) {
			event.registrar("1").playToClient(StarWarsExpansionModAnimationMessage.TYPE,
					StarWarsExpansionModAnimationMessage.STREAM_CODEC, StarWarsExpansionModAnimationMessage::handle);
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void setAnimationClientside(Player player, String anim, boolean override) {
		if (player instanceof net.minecraft.client.player.AbstractClientPlayer player_) {
			PlayerAnimManager manager;
			try {
				manager = PlayerAnimationAccess.getPlayerAnimManager(player_);
			} catch (IllegalArgumentException e) {
				return;
			}
			for (var layer : manager.getLayers()) {
				if (layer.second() instanceof PlayerAnimationController controller) {
					if (override || !controller.isActive()) {
						controller.triggerAnimation(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", anim));
					}
					break;
				}
			}
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}
