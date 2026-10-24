package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;

public class SpaceshipMoveKeyOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
		}
	}
}
