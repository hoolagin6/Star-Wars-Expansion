
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;

import net.mcreator.starwarsexpansion.world.inventory.PlanetAnchorGUIMenu;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PlanetAnchorGUIMenu>> PLANET_ANCHOR_GUI = REGISTRY.register("planet_anchor_gui", () -> IMenuTypeExtension.create(PlanetAnchorGUIMenu::new));
}
