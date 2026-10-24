package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;



public class BlueLightsaberOpenToolInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide()) {
			SetupAnimationsProcedure.setAnimationClientside((Player) entity, "saberpose", true);
		}
		if (!world.isClientSide()) {
			if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("saberpose", entity.getId(), true));
			}
		}
	}
}
