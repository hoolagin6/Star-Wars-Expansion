package net.mcreator.starwarsexpansion;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;

import net.mcreator.starwarsexpansion.world.features.StructureFeature;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModModels;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModVillagerProfessions;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModTabs;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModSounds;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModParticleTypes;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModMenus;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModItems;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModEntities;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModBlocks;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModBlockEntities;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("star_wars_expansion")
public class StarWarsExpansionMod {
	public static final Logger LOGGER = LogManager.getLogger(StarWarsExpansionMod.class);
	public static final String MODID = "star_wars_expansion";

	public StarWarsExpansionMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		NeoForge.EVENT_BUS.register(this);
		IEventBus bus = ModLoadingContext.get().getActiveContainer().getEventBus();
		StarWarsExpansionModSounds.REGISTRY.register(bus);
		StarWarsExpansionModBlocks.REGISTRY.register(bus);
		StarWarsExpansionModBlockEntities.REGISTRY.register(bus);
		StarWarsExpansionModItems.REGISTRY.register(bus);
		StarWarsExpansionModEntities.REGISTRY.register(bus);

		StarWarsExpansionModTabs.REGISTRY.register(bus);

		StructureFeature.REGISTRY.register(bus);

		StarWarsExpansionModParticleTypes.REGISTRY.register(bus);
		StarWarsExpansionModVillagerProfessions.PROFESSIONS.register(bus);

		// Register client-side model layer definitions for armor rendering
		bus.register(StarWarsExpansionModModels.class);
		StarWarsExpansionModMenus.REGISTRY.register(bus);

		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(ServerTickEvent.Post event) {
		List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
		workQueue.forEach(work -> {
			work.setValue(work.getValue() - 1);
			if (work.getValue() == 0)
				actions.add(work);
		});
		actions.forEach(e -> e.getKey().run());
		workQueue.removeAll(actions);
	}
}
