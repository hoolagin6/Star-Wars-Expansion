package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.CarboniteDisplayItem;

public class CarboniteDisplayModel extends GeoModel<CarboniteDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarboniteDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/carbonite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarboniteDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/carbonite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarboniteDisplayItem entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/carbonite.png");
	}
}
