
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.starwarsexpansion.procedures.StunBatonLivingEntityIsHitWithToolProcedure;

public class StunBatonItem extends SwordItem {
	private static final Tier TIER = new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		
			@Override
			public TagKey<Block> getIncorrectBlocksForDrops() {
				return BlockTags.INCORRECT_FOR_IRON_TOOL;
			}
		};

	public StunBatonItem() {
		super(TIER, new Item.Properties().attributes(SwordItem.createAttributes(TIER, 3, -2f)));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		StunBatonLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
