package net.mcreator.starwarsexpansion.init;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@EventBusSubscriber(modid = StarWarsExpansionMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModCapabilities {
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.MOISTURE_VAPORATOR.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.WORKSPACE_BENCH.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.CONTROL_PANEL.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.HOLOCRON.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.STATUE.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.COMPUTER_STATION.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.CONTROL_STATION.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.KOLTO_TANK.get(),
				(be, side) -> be.getItemHandler(side));
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, StarWarsExpansionModBlockEntities.CARBONITE.get(),
				(be, side) -> be.getItemHandler(side));
	}
}
