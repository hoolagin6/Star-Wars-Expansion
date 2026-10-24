
package net.mcreator.starwarsexpansion.item;

import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

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

import net.mcreator.starwarsexpansion.procedures.JediClothesFallProcedureProcedure;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModArmorMaterials;
import net.mcreator.starwarsexpansion.client.model.Modelsnowsuit;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

import com.google.common.collect.Iterables;

public abstract class SnowSuitItem extends ArmorItem {
	public SnowSuitItem(ArmorItem.Type type, Item.Properties properties) {
		super(StarWarsExpansionModArmorMaterials.get("snow_suit", 0, 1, 1, 1, 9, "item.armor.equip_leather", 0f, 0f, "snowsuit"), type, properties.durability(0));
	}

	public static class Helmet extends SnowSuitItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
							Map.of("head", new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
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

	}

	public static class Chestplate extends SnowSuitItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(), Map.of("body", new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).body, "left_arm",
							new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).rightArm, "right_arm",
							new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).leftArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), location -> RenderType.entityTranslucent(location));
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
				JediClothesFallProcedureProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends SnowSuitItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).rightLeg, "right_leg",
									new Modelsnowsuit(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsnowsuit.LAYER_LOCATION)).leftLeg, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), location -> RenderType.entityTranslucent(location));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

	}
}
