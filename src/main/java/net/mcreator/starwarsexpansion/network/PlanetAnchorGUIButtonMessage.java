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
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.world.inventory.PlanetAnchorGUIMenu;
import net.mcreator.starwarsexpansion.procedures.TravelTatooineProcedureProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelHothProcedureProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelEndorProcedureProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelEarthProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelDenyProcedureProcedure;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PlanetAnchorGUIButtonMessage implements CustomPacketPayload {
	public static final CustomPacketPayload.Type<PlanetAnchorGUIButtonMessage> TYPE = new CustomPacketPayload.Type<>(
			ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, "planet_anchor_gui_button"));

	public static final StreamCodec<FriendlyByteBuf, PlanetAnchorGUIButtonMessage> STREAM_CODEC = StreamCodec.of(
			(buffer, message) -> {
				buffer.writeVarInt(message.buttonID);
				buffer.writeVarInt(message.x);
				buffer.writeVarInt(message.y);
				buffer.writeVarInt(message.z);
			},
			buffer -> new PlanetAnchorGUIButtonMessage(buffer.readVarInt(), buffer.readVarInt(), buffer.readVarInt(),
					buffer.readVarInt()));

	private final int buttonID, x, y, z;

	public PlanetAnchorGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
		return TYPE;
	}

	public static void handle(PlanetAnchorGUIButtonMessage message, IPayloadContext context) {
		context.enqueueWork(() -> {
			Player entity = context.player();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = PlanetAnchorGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TravelTatooineProcedureProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TravelEndorProcedureProcedure.execute(entity);
		}
		if (buttonID == 2) {

			TravelDenyProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			TravelHothProcedureProcedure.execute(entity);
		}
		if (buttonID == 4) {

			TravelEarthProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void register(RegisterPayloadHandlersEvent event) {
		event.registrar("1").playToServer(PlanetAnchorGUIButtonMessage.TYPE,
				PlanetAnchorGUIButtonMessage.STREAM_CODEC, PlanetAnchorGUIButtonMessage::handle);
	}
}
