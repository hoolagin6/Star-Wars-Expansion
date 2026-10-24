/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.starwarsexpansion.client.gui.PlanetAnchorGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsExpansionModScreens {
	@SubscribeEvent
	public static void registerScreens(RegisterMenuScreensEvent event) {
		event.register(StarWarsExpansionModMenus.PLANET_ANCHOR_GUI.get(), PlanetAnchorGUIScreen::new);
	}
}
