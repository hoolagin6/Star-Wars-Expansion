package net.mcreator.starwarsexpansion.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.starwarsexpansion.block.model.CarboniteDisplayModel;
import net.mcreator.starwarsexpansion.block.display.CarboniteDisplayItem;

public class CarboniteDisplayItemRenderer extends GeoItemRenderer<CarboniteDisplayItem> {
	public CarboniteDisplayItemRenderer() {
		super(new CarboniteDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarboniteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
