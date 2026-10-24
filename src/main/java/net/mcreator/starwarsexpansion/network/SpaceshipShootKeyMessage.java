package net.mcreator.starwarsexpansion.network;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.procedures.SpaceshipShootKeyOnKeyReleasedProcedure;
import net.mcreator.starwarsexpansion.procedures.SpaceshipShootKeyOnKeyPressedProcedure;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SpaceshipShootKeyMessage implements CustomPacketPayload {
	public static final CustomPacketPayload.Type<SpaceshipShootKeyMessage> TYPE = new CustomPacketPayload.Type<>(
			ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "spaceship_shoot_key"));

	public static final StreamCodec<FriendlyByteBuf, SpaceshipShootKeyMessage> STREAM_CODEC = StreamCodec.of(
			(buffer, message) -> {
				buffer.writeVarInt(message.type);
				buffer.writeVarInt(message.pressedms);
			},
			buffer -> new SpaceshipShootKeyMessage(buffer.readVarInt(), buffer.readVarInt()));

	int type, pressedms;

	public SpaceshipShootKeyMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	@Override
	public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(SpaceshipShootKeyMessage message, IPayloadContext context) {
		context.enqueueWork(() -> {
			pressAction(context.player(), message.type, message.pressedms);
		});
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			SpaceshipShootKeyOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			SpaceshipShootKeyOnKeyReleasedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void register(RegisterPayloadHandlersEvent event) {
		event.registrar("1").playToServer(SpaceshipShootKeyMessage.TYPE, SpaceshipShootKeyMessage.STREAM_CODEC,
				SpaceshipShootKeyMessage::handle);
	}
}
