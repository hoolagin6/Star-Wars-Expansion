package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.entity.ControlPanelTileEntity;

public class ControlPanelBlockModel extends GeoModel<ControlPanelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ControlPanelTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/panel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlPanelTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/panel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlPanelTileEntity animatable) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "textures/block/panel.png");
	}
}
