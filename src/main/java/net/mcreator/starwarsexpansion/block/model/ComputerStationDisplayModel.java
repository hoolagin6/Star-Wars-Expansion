package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.ComputerStationDisplayItem;

public class ComputerStationDisplayModel extends GeoModel<ComputerStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ComputerStationDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/computerstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ComputerStationDisplayItem animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/computerstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ComputerStationDisplayItem entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/computerstation.png");
	}
}
