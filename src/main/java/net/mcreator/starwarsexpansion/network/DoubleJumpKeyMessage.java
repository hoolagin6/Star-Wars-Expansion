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

import net.mcreator.starwarsexpansion.procedures.DoubleJumpKeyOnKeyPressedProcedure;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DoubleJumpKeyMessage implements CustomPacketPayload {
	public static final CustomPacketPayload.Type<DoubleJumpKeyMessage> TYPE = new CustomPacketPayload.Type<>(
			ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "double_jump_key"));

	public static final StreamCodec<FriendlyByteBuf, DoubleJumpKeyMessage> STREAM_CODEC = StreamCodec.of(
			(buffer, message) -> {
				buffer.writeVarInt(message.type);
				buffer.writeVarInt(message.pressedms);
			},
			buffer -> new DoubleJumpKeyMessage(buffer.readVarInt(), buffer.readVarInt()));

	int type, pressedms;

	public DoubleJumpKeyMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	@Override
	public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(DoubleJumpKeyMessage message, IPayloadContext context) {
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

			DoubleJumpKeyOnKeyPressedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void register(RegisterPayloadHandlersEvent event) {
		event.registrar("1").playToServer(DoubleJumpKeyMessage.TYPE, DoubleJumpKeyMessage.STREAM_CODEC,
				DoubleJumpKeyMessage::handle);
	}
}
