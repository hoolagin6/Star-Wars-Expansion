package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.KoltoTankDisplayItem;

public class KoltoTankDisplayModel extends GeoModel<KoltoTankDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(KoltoTankDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/koltotank.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(KoltoTankDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/koltotank.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(KoltoTankDisplayItem entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/koltotank.png");
	}
}
