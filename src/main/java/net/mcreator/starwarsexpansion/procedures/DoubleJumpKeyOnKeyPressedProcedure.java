package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModItems;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;


public class DoubleJumpKeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.BROWN_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("doublejump", entity.getId(), false));
				}
			}
			StarWarsExpansionMod.queueServerWork(13, () -> {
				if (world.isClientSide()) {
					SetupAnimationsProcedure.setAnimationClientside((Player) entity, "recall", true);
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("recall", entity.getId(), true));
					}
				}
			});
			{
				boolean _setval = true;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.GRAY_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("doublejump", entity.getId(), false));
				}
			}
			{
				boolean _setval = true;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.BLACK_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("doublejump", entity.getId(), false));
				}
			}
			{
				boolean _setval = true;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.GRAND_MASTER_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("doublejump", entity.getId(), false));
				}
			}
			{
				boolean _setval = true;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.SITH_CLOTHES_CHESTPLATE.get())) : false)
				&& false == StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					PacketDistributor.sendToAllPlayers(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage("doublejump", entity.getId(), false));
				}
			}
			{
				boolean _setval = true;
				StarWarsExpansionModVariables.getPlayerVariables(entity).jumpvar = _setval;
				StarWarsExpansionModVariables.getPlayerVariables(entity).syncPlayerVariables(entity);
				StarWarsExpansionModVariables.storePlayerVariables(entity, StarWarsExpansionModVariables.getPlayerVariables(entity));
			}
		}
	}
}
