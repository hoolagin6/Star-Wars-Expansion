
package net.mcreator.starwarsexpansion.item;

import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModArmorMaterials;
import net.mcreator.starwarsexpansion.client.model.Modelancientsithmask;

import java.util.function.Consumer;
import java.util.Map;
import java.util.List;
import java.util.Collections;

public abstract class AncientSithLordMaskItem extends ArmorItem {
	public AncientSithLordMaskItem(ArmorItem.Type type, Item.Properties properties) {
		super(StarWarsExpansionModArmorMaterials.get("ancient_sith_lord_mask", 0, 0, 0, 4, 9, "item.armor.equip_netherite", 0f, 0f, "ancient_sith_mask"), type, properties.durability(0));
	}

	public static class Helmet extends AncientSithLordMaskItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelancientsithmask(Minecraft.getInstance().getEntityModels().bakeLayer(Modelancientsithmask.LAYER_LOCATION)).head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))), location -> RenderType.entityTranslucent(location));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.star_wars_expansion.ancient_sith_lord_mask_helmet.description_0"));
		}

	}
}
