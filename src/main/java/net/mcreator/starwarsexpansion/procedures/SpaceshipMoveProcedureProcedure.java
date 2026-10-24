package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;
import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SpaceshipMoveProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == true) {
			if ((entity.getVehicle()) instanceof XWingEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == false) {
			if ((entity.getVehicle()) instanceof XWingEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
		if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == true) {
			if ((entity.getVehicle()) instanceof TIEFighterEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == false) {
			if ((entity.getVehicle()) instanceof TIEFighterEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
		if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == true) {
			if ((entity.getVehicle()) instanceof SnowspeederEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if (StarWarsExpansionModVariables.getPlayerVariables(entity).ssmov == false) {
			if ((entity.getVehicle()) instanceof SnowspeederEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
	}
}
