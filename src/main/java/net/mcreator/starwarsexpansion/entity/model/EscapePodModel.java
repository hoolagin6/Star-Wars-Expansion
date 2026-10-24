package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.EscapePodEntity;

public class EscapePodModel extends GeoModel<EscapePodEntity> {
	@Override
	public ResourceLocation getAnimationResource(EscapePodEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/pod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EscapePodEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/pod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EscapePodEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

}
