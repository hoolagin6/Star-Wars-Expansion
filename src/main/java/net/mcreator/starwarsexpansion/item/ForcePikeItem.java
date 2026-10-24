
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class ForcePikeItem extends SwordItem {
	private static final Tier TIER = new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
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

	public ForcePikeItem() {
		super(TIER, new Item.Properties().attributes(SwordItem.createAttributes(TIER, 3, -2.2f)));
	}
}
