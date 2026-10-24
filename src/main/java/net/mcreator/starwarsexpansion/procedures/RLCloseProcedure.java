package net.mcreator.starwarsexpansion.procedures;

import net.mcreator.starwarsexpansion.item.RedLightsaberClosedItem;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModItems;

public class RLCloseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(StarWarsExpansionModItems.LIGHSTANER_GEO_RED.get()).copy();
			_setstack.setCount(1);
			if(((LivingEntity) entity).getItemInHand(InteractionHand.MAIN_HAND).getItem() instanceof RedLightsaberClosedItem) {
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			}else {
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
			}
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("star_wars_expansion:lightsaber_on")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("star_wars_expansion:lightsaber_on")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}