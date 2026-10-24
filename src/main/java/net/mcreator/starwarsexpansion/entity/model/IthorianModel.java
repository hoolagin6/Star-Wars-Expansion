package net.mcreator.starwarsexpansion.entity.model;

import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.entity.IthorianEntity;

public class IthorianModel extends GeoModel<IthorianEntity> {
	@Override
	public ResourceLocation getAnimationResource(IthorianEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "animations/hammerhead.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IthorianEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "geo/hammerhead.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IthorianEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("star_wars_expansion",  "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(IthorianEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
