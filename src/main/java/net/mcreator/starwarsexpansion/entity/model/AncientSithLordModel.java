package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.AncientSithLordEntity;

public class AncientSithLordModel extends GeoModel<AncientSithLordEntity> {
	@Override
	public ResourceLocation getAnimationResource(AncientSithLordEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/ancientsith.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AncientSithLordEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/ancientsith.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AncientSithLordEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

}
