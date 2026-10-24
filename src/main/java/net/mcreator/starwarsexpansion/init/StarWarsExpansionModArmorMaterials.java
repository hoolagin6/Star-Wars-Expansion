package net.mcreator.starwarsexpansion.init;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1.21 turned {@link ArmorMaterial} into a registry backed record, so the material can no longer be
 * created inline in the {@link ArmorItem} constructor. The materials are registered on demand (while
 * the item registry is still open) and cached, so every armour piece shares one material.
 */
public final class StarWarsExpansionModArmorMaterials {
	private static final Map<String, Holder<ArmorMaterial>> MATERIALS = new HashMap<>();

	private StarWarsExpansionModArmorMaterials() {
	}

	public static synchronized Holder<ArmorMaterial> get(String name, int boots, int leggings, int chestplate, int helmet, int enchantmentValue, String equipSound, float toughness, float knockbackResistance, String armorTextureAsset) {
		return MATERIALS.computeIfAbsent(name, key -> {
			Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
			defense.put(ArmorItem.Type.BOOTS, boots);
			defense.put(ArmorItem.Type.LEGGINGS, leggings);
			defense.put(ArmorItem.Type.CHESTPLATE, chestplate);
			defense.put(ArmorItem.Type.HELMET, helmet);

			Holder<SoundEvent> equipSoundHolder = BuiltInRegistries.SOUND_EVENT.getHolderOrThrow(
					ResourceKey.create(Registries.SOUND_EVENT, ResourceLocation.withDefaultNamespace(equipSound)));

			// @armorTextureAsset resolves to assets/star_wars_expansion/textures/models/armor/<asset>_layer_1.png
			// and <asset>_layer_2.png (inner layer). Without layers the armor renders nothing.
			List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(
					ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, armorTextureAsset)));

			ArmorMaterial material = new ArmorMaterial(defense, enchantmentValue, equipSoundHolder, () -> Ingredient.EMPTY, layers, toughness, knockbackResistance);

			return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL,
					ResourceKey.create(Registries.ARMOR_MATERIAL, ResourceLocation.fromNamespaceAndPath(StarWarsExpansionMod.MODID, key)), material);
		});
	}
}
