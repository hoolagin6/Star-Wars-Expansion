package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.PorgEntity;

public class PorgModel extends GeoModel<PorgEntity> {
	@Override
	public ResourceLocation getAnimationResource(PorgEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/porg.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PorgEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/porg.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PorgEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

}
