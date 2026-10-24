package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.CarboniteBlockModel;
import net.mcreator.starwarsexpansion.block.entity.CarboniteTileEntity;

public class CarboniteTileRenderer extends GeoBlockRenderer<CarboniteTileEntity> {
	public CarboniteTileRenderer() {
		super(new CarboniteBlockModel());
	}

	@Override
	public RenderType getRenderType(CarboniteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
