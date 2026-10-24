
package net.mcreator.starwarsexpansion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.starwarsexpansion.entity.SkiffGuardEntity;

public class SkiffGuardRenderer extends HumanoidMobRenderer<SkiffGuardEntity, HumanoidModel<SkiffGuardEntity>> {
	public SkiffGuardRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SkiffGuardEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SkiffGuardEntity entity) {
		return ResourceLocation.parse("star_wars_expansion:textures/entities/human_blue.png");
	}
}
