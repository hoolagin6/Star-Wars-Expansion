
package net.mcreator.starwarsexpansion.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class VibroAxeItem extends AxeItem {
	private static final Tier TIER = new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 9f;
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

	public VibroAxeItem() {
		super(TIER, new Item.Properties().attributes(AxeItem.createAttributes(TIER, 1, -3.1f)));
	}
}
