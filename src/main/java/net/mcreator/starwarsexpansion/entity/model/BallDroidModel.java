package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.BallDroidEntity;

public class BallDroidModel extends GeoModel<BallDroidEntity> {
	@Override
	public ResourceLocation getAnimationResource(BallDroidEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/bb8.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallDroidEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/bb8.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallDroidEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

}
