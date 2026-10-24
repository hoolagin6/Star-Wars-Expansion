package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.StatueTileEntity;

public class StatueBlockModel extends GeoModel<StatueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StatueTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/statue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StatueTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/statue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StatueTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/statue.png");
	}
}
