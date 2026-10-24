/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModVillagerProfessions {
	private static final Map<String, ProfessionPoiType> POI_TYPES = new HashMap<>();
	public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(Registries.VILLAGER_PROFESSION, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<VillagerProfession, VillagerProfession> BUTCHER_TRADER = registerProfession("butcher_trader", () -> StarWarsExpansionModBlocks.MODERN_CRATE.get(),
			() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> WEAPONSMITH_TRADER = registerProfession("weaponsmith_trader", () -> StarWarsExpansionModBlocks.MODERN_CRATE_2.get(),
			() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> LUMBERJACK_TRADER = registerProfession("lumberjack_trader", () -> StarWarsExpansionModBlocks.MODERN_CRATE_3.get(),
			() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> SPACESHIP_TRADER = registerProfession("spaceship_trader", () -> StarWarsExpansionModBlocks.WORKSPACE_BENCH.get(),
			() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> DROID_TRADER = registerProfession("droid_trader", () -> StarWarsExpansionModBlocks.CONTROL_PANEL.get(), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));
	public static final DeferredHolder<VillagerProfession, VillagerProfession> MINER_TRADER = registerProfession("miner_trader", () -> StarWarsExpansionModBlocks.MODERN_CRATE_4.get(), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.anvil.step")));

	private static DeferredHolder<VillagerProfession, VillagerProfession> registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		POI_TYPES.put(name, new ProfessionPoiType(block, null));
		return PROFESSIONS.register(name, () -> {
			Predicate<Holder<PoiType>> poiPredicate = poiTypeHolder -> (POI_TYPES.get(name).poiType != null) && (poiTypeHolder.value() == POI_TYPES.get(name).poiType.value());
			return new VillagerProfession(StarWarsExpansionMod.MODID + ":" + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get());
		});
	}

	@SubscribeEvent
	public static void registerProfessionPointsOfInterest(RegisterEvent event) {
		event.register(Registries.POINT_OF_INTEREST_TYPE, registerHelper -> {
			for (Map.Entry<String, ProfessionPoiType> entry : POI_TYPES.entrySet()) {
				Block block = entry.getValue().block.get();
				String name = entry.getKey();
				Optional<Holder<PoiType>> existingCheck = PoiTypes.forState(block.defaultBlockState());
				if (existingCheck.isPresent()) {
					StarWarsExpansionMod.LOGGER.error("Skipping villager profession " + name + " that uses POI block " + block + " that is already in use by " + existingCheck);
					continue;
				}
				PoiType poiType = new PoiType(ImmutableSet.copyOf(block.getStateDefinition().getPossibleStates()), 1, 1);
				ResourceLocation poiId = ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, name);
				registerHelper.register(poiId, poiType);
				entry.getValue().poiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.getHolder(poiId).orElse(null);
			}
		});
	}

	private static class ProfessionPoiType {
		final Supplier<Block> block;
		Holder<PoiType> poiType;

		ProfessionPoiType(Supplier<Block> block, Holder<PoiType> poiType) {
			this.block = block;
			this.poiType = poiType;
		}
	}
}
