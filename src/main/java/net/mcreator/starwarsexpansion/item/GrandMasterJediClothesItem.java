
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
import net.mcreator.starwarsexpansion.client.model.Modelgrandmasterjediclothes;

import java.util.function.Consumer;
import java.util.Map;
import java.util.Collections;

import com.google.common.collect.Iterables;

public abstract class GrandMasterJediClothesItem extends ArmorItem {
	public GrandMasterJediClothesItem(ArmorItem.Type type, Item.Properties properties) {
		super(StarWarsExpansionModArmorMaterials.get("grand_master_jedi_clothes", 0, 0, 11, 0, 9, "item.armor.equip_leather", 0f, 0f, "grand_master_jedi_clothes"), type, properties.durability(0));
	}

	public static class Chestplate extends GrandMasterJediClothesItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
							Map.of("body", new Modelgrandmasterjediclothes(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgrandmasterjediclothes.LAYER_LOCATION)).body, "left_arm",
									new Modelgrandmasterjediclothes(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgrandmasterjediclothes.LAYER_LOCATION)).rightArm, "right_arm",
									new Modelgrandmasterjediclothes(Minecraft.getInstance().getEntityModels().bakeLayer(Modelgrandmasterjediclothes.LAYER_LOCATION)).leftArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
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
				JediClothesFallProcedureProcedure.execute(entity);
			}
		}
	}
}
