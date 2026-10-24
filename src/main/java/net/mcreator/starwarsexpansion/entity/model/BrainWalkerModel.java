package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.BrainWalkerEntity;

public class BrainWalkerModel extends GeoModel<BrainWalkerEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrainWalkerEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/brainwalker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrainWalkerEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/brainwalker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrainWalkerEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

}
