
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

import net.mcreator.starwarsexpansion.block.entity.WorkspaceBenchTileEntity;
import net.mcreator.starwarsexpansion.block.entity.StatueTileEntity;
import net.mcreator.starwarsexpansion.block.entity.MoistureVaporatorTileEntity;
import net.mcreator.starwarsexpansion.block.entity.KoltoTankTileEntity;
import net.mcreator.starwarsexpansion.block.entity.HolocronTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ControlStationTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ControlPanelTileEntity;
import net.mcreator.starwarsexpansion.block.entity.ComputerStationTileEntity;
import net.mcreator.starwarsexpansion.block.entity.CarboniteTileEntity;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MoistureVaporatorTileEntity>> MOISTURE_VAPORATOR = REGISTRY.register("moisture_vaporator",
			() -> BlockEntityType.Builder.of(MoistureVaporatorTileEntity::new, StarWarsExpansionModBlocks.MOISTURE_VAPORATOR.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WorkspaceBenchTileEntity>> WORKSPACE_BENCH = REGISTRY.register("workspace_bench",
			() -> BlockEntityType.Builder.of(WorkspaceBenchTileEntity::new, StarWarsExpansionModBlocks.WORKSPACE_BENCH.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ControlPanelTileEntity>> CONTROL_PANEL = REGISTRY.register("control_panel",
			() -> BlockEntityType.Builder.of(ControlPanelTileEntity::new, StarWarsExpansionModBlocks.CONTROL_PANEL.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<HolocronTileEntity>> HOLOCRON = REGISTRY.register("holocron", () -> BlockEntityType.Builder.of(HolocronTileEntity::new, StarWarsExpansionModBlocks.HOLOCRON.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StatueTileEntity>> STATUE = REGISTRY.register("statue", () -> BlockEntityType.Builder.of(StatueTileEntity::new, StarWarsExpansionModBlocks.STATUE.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ComputerStationTileEntity>> COMPUTER_STATION = REGISTRY.register("computer_station",
			() -> BlockEntityType.Builder.of(ComputerStationTileEntity::new, StarWarsExpansionModBlocks.COMPUTER_STATION.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ControlStationTileEntity>> CONTROL_STATION = REGISTRY.register("control_station",
			() -> BlockEntityType.Builder.of(ControlStationTileEntity::new, StarWarsExpansionModBlocks.CONTROL_STATION.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<KoltoTankTileEntity>> KOLTO_TANK = REGISTRY.register("kolto_tank", () -> BlockEntityType.Builder.of(KoltoTankTileEntity::new, StarWarsExpansionModBlocks.KOLTO_TANK.get()).build(null));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CarboniteTileEntity>> CARBONITE = REGISTRY.register("carbonite", () -> BlockEntityType.Builder.of(CarboniteTileEntity::new, StarWarsExpansionModBlocks.CARBONITE.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
