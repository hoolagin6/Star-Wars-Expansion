package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.ATSTItemItem;

public class ATSTItemItemModel extends GeoModel<ATSTItemItem> {
	@Override
	public ResourceLocation getAnimationResource(ATSTItemItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/atst.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ATSTItemItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/atst.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ATSTItemItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/item/atst.png");
	}
}
