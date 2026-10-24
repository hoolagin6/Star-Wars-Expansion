
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import net.mcreator.starwarsexpansion.block.WorkspaceBenchBlock;
import net.mcreator.starwarsexpansion.block.TatooineSandstoneWallBlock;
import net.mcreator.starwarsexpansion.block.TatooineSandstoneStairsBlock;
import net.mcreator.starwarsexpansion.block.TatooineSandstoneSlabBlock;
import net.mcreator.starwarsexpansion.block.TatooineSandstoneBlock;
import net.mcreator.starwarsexpansion.block.TatooineSandBlock;
import net.mcreator.starwarsexpansion.block.TatooineDoorBlock;
import net.mcreator.starwarsexpansion.block.StatueBlock;
import net.mcreator.starwarsexpansion.block.RubberOreBlock;
import net.mcreator.starwarsexpansion.block.RedwoodLogBlock;
import net.mcreator.starwarsexpansion.block.QuadaniumOreBlock;
import net.mcreator.starwarsexpansion.block.MoistureVaporatorBlock;
import net.mcreator.starwarsexpansion.block.ModernStairsBlock;
import net.mcreator.starwarsexpansion.block.ModernSlabBlock;
import net.mcreator.starwarsexpansion.block.ModernPillarBlock;
import net.mcreator.starwarsexpansion.block.ModernLanternBlock;
import net.mcreator.starwarsexpansion.block.ModernCrateBlock;
import net.mcreator.starwarsexpansion.block.ModernCrate4Block;
import net.mcreator.starwarsexpansion.block.ModernCrate3Block;
import net.mcreator.starwarsexpansion.block.ModernCrate2Block;
import net.mcreator.starwarsexpansion.block.ModernBookshelfBlock;
import net.mcreator.starwarsexpansion.block.MetalTrapdoorBlock;
import net.mcreator.starwarsexpansion.block.MetalStairsBlock;
import net.mcreator.starwarsexpansion.block.MetalSlabBlock;
import net.mcreator.starwarsexpansion.block.MetalBlockBlock;
import net.mcreator.starwarsexpansion.block.KorribanStoneBlock;
import net.mcreator.starwarsexpansion.block.KorribanRuneBlockBlock;
import net.mcreator.starwarsexpansion.block.KoltoTankBlock;
import net.mcreator.starwarsexpansion.block.HothStoneBlock;
import net.mcreator.starwarsexpansion.block.HothSnowBlock;
import net.mcreator.starwarsexpansion.block.HolocronBlock;
import net.mcreator.starwarsexpansion.block.HardenedMudBlock;
import net.mcreator.starwarsexpansion.block.GridMetalBlockBlock;
import net.mcreator.starwarsexpansion.block.DooniumOreBlock;
import net.mcreator.starwarsexpansion.block.CopperSandstoneOreBlock;
import net.mcreator.starwarsexpansion.block.ControlStationBlock;
import net.mcreator.starwarsexpansion.block.ControlPanelBlock;
import net.mcreator.starwarsexpansion.block.ComputerStationBlock;
import net.mcreator.starwarsexpansion.block.CarboniteBlock;
import net.mcreator.starwarsexpansion.block.CantinaLightBlock;
import net.mcreator.starwarsexpansion.block.AurodiumOreBlock;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(Registries.BLOCK, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<Block, Block> TATOOINE_SAND = REGISTRY.register("tatooine_sand", () -> new TatooineSandBlock());
	public static final DeferredHolder<Block, Block> TATOOINE_SANDSTONE = REGISTRY.register("tatooine_sandstone", () -> new TatooineSandstoneBlock());
	public static final DeferredHolder<Block, Block> TATOOINE_SANDSTONE_STAIRS = REGISTRY.register("tatooine_sandstone_stairs", () -> new TatooineSandstoneStairsBlock());
	public static final DeferredHolder<Block, Block> TATOOINE_SANDSTONE_SLAB = REGISTRY.register("tatooine_sandstone_slab", () -> new TatooineSandstoneSlabBlock());
	public static final DeferredHolder<Block, Block> TATOOINE_SANDSTONE_WALL = REGISTRY.register("tatooine_sandstone_wall", () -> new TatooineSandstoneWallBlock());
	public static final DeferredHolder<Block, Block> TATOOINE_DOOR = REGISTRY.register("tatooine_door", () -> new TatooineDoorBlock());
	public static final DeferredHolder<Block, Block> MODERN_LANTERN = REGISTRY.register("modern_lantern", () -> new ModernLanternBlock());
	public static final DeferredHolder<Block, Block> MOISTURE_VAPORATOR = REGISTRY.register("moisture_vaporator", () -> new MoistureVaporatorBlock());
	public static final DeferredHolder<Block, Block> DOONIUM_ORE = REGISTRY.register("doonium_ore", () -> new DooniumOreBlock());
	public static final DeferredHolder<Block, Block> METAL_BLOCK = REGISTRY.register("metal_block", () -> new MetalBlockBlock());
	public static final DeferredHolder<Block, Block> METAL_STAIRS = REGISTRY.register("metal_stairs", () -> new MetalStairsBlock());
	public static final DeferredHolder<Block, Block> METAL_SLAB = REGISTRY.register("metal_slab", () -> new MetalSlabBlock());
	public static final DeferredHolder<Block, Block> WORKSPACE_BENCH = REGISTRY.register("workspace_bench", () -> new WorkspaceBenchBlock());
	public static final DeferredHolder<Block, Block> CONTROL_PANEL = REGISTRY.register("control_panel", () -> new ControlPanelBlock());
	public static final DeferredHolder<Block, Block> MODERN_PILLAR = REGISTRY.register("modern_pillar", () -> new ModernPillarBlock());
	public static final DeferredHolder<Block, Block> MODERN_STAIRS = REGISTRY.register("modern_stairs", () -> new ModernStairsBlock());
	public static final DeferredHolder<Block, Block> MODERN_SLAB = REGISTRY.register("modern_slab", () -> new ModernSlabBlock());
	public static final DeferredHolder<Block, Block> CANTINA_LIGHT = REGISTRY.register("cantina_light", () -> new CantinaLightBlock());
	public static final DeferredHolder<Block, Block> MODERN_CRATE = REGISTRY.register("modern_crate", () -> new ModernCrateBlock());
	public static final DeferredHolder<Block, Block> MODERN_CRATE_2 = REGISTRY.register("modern_crate_2", () -> new ModernCrate2Block());
	public static final DeferredHolder<Block, Block> MODERN_CRATE_3 = REGISTRY.register("modern_crate_3", () -> new ModernCrate3Block());
	public static final DeferredHolder<Block, Block> MODERN_CRATE_4 = REGISTRY.register("modern_crate_4", () -> new ModernCrate4Block());
	public static final DeferredHolder<Block, Block> RUBBER_ORE = REGISTRY.register("rubber_ore", () -> new RubberOreBlock());
	public static final DeferredHolder<Block, Block> QUADANIUM_ORE = REGISTRY.register("quadanium_ore", () -> new QuadaniumOreBlock());
	public static final DeferredHolder<Block, Block> MODERN_BOOKSHELF = REGISTRY.register("modern_bookshelf", () -> new ModernBookshelfBlock());
	public static final DeferredHolder<Block, Block> HOLOCRON = REGISTRY.register("holocron", () -> new HolocronBlock());
	public static final DeferredHolder<Block, Block> STATUE = REGISTRY.register("statue", () -> new StatueBlock());
	public static final DeferredHolder<Block, Block> COPPER_SANDSTONE_ORE = REGISTRY.register("copper_sandstone_ore", () -> new CopperSandstoneOreBlock());
	public static final DeferredHolder<Block, Block> HOTH_SNOW = REGISTRY.register("hoth_snow", () -> new HothSnowBlock());
	public static final DeferredHolder<Block, Block> HOTH_STONE = REGISTRY.register("hoth_stone", () -> new HothStoneBlock());
	public static final DeferredHolder<Block, Block> AURODIUM_ORE = REGISTRY.register("aurodium_ore", () -> new AurodiumOreBlock());
	public static final DeferredHolder<Block, Block> METAL_TRAPDOOR = REGISTRY.register("metal_trapdoor", () -> new MetalTrapdoorBlock());
	public static final DeferredHolder<Block, Block> GRID_METAL_BLOCK = REGISTRY.register("grid_metal_block", () -> new GridMetalBlockBlock());
	public static final DeferredHolder<Block, Block> COMPUTER_STATION = REGISTRY.register("computer_station", () -> new ComputerStationBlock());
	public static final DeferredHolder<Block, Block> CONTROL_STATION = REGISTRY.register("control_station", () -> new ControlStationBlock());
	public static final DeferredHolder<Block, Block> KOLTO_TANK = REGISTRY.register("kolto_tank", () -> new KoltoTankBlock());
	public static final DeferredHolder<Block, Block> REDWOOD_LOG = REGISTRY.register("redwood_log", () -> new RedwoodLogBlock());
	public static final DeferredHolder<Block, Block> HARDENED_MUD = REGISTRY.register("hardened_mud", () -> new HardenedMudBlock());
	public static final DeferredHolder<Block, Block> KORRIBAN_STONE = REGISTRY.register("korriban_stone", () -> new KorribanStoneBlock());
	public static final DeferredHolder<Block, Block> KORRIBAN_RUNE_BLOCK = REGISTRY.register("korriban_rune_block", () -> new KorribanRuneBlockBlock());
	public static final DeferredHolder<Block, Block> CARBONITE = REGISTRY.register("carbonite", () -> new CarboniteBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
