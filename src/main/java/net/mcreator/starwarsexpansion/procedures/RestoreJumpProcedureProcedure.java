package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.neoforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RestoreJumpProcedureProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			{
				boolean _setval = false;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
	}
}
