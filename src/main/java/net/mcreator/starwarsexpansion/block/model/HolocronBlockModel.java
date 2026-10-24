package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.HolocronTileEntity;

public class HolocronBlockModel extends GeoModel<HolocronTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HolocronTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/holocron.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HolocronTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/holocron.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HolocronTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/holocron_block.png");
	}
}
