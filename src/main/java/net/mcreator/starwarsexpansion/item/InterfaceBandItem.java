
package net.mcreator.starwarsexpansion.item;

import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.starwarsexpansion.procedures.InterfaceBandHelmetTickEventProcedure;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModArmorMaterials;
import net.mcreator.starwarsexpansion.client.model.Modelband;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

import com.google.common.collect.Iterables;

public abstract class InterfaceBandItem extends ArmorItem {
	public InterfaceBandItem(ArmorItem.Type type, Item.Properties properties) {
		super(StarWarsExpansionModArmorMaterials.get("interface_band", 0, 0, 0, 2, 9, "item.armor.equip_netherite", 0f, 0f, "band"), type, properties.durability(0));
	}

	public static class Helmet extends InterfaceBandItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelband(Minecraft.getInstance().getEntityModels().bakeLayer(Modelband.LAYER_LOCATION)).head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
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
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				InterfaceBandHelmetTickEventProcedure.execute(entity);
			}
		}
	}
}
