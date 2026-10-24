package net.mcreator.starwarsexpansion.utils;

import software.bernie.geckolib.cache.object.GeoBone;


import net.minecraft.client.model.geom.ModelPart;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AnimUtils {
	public static void renderPartOverBone(ModelPart model, GeoBone bone, PoseStack stack, VertexConsumer buffer, int packedLightIn, int packedOverlayIn, float alpha) {
		renderPartOverBone(model, bone, stack, buffer, packedLightIn, packedOverlayIn, 1.0f, 1.0f, 1.0f, alpha);
	}

	public static void renderPartOverBone(ModelPart model, GeoBone bone, PoseStack stack, VertexConsumer buffer, int packedLightIn, int packedOverlayIn, float r, float g, float b, float a) {
		setupModelFromBone(model, bone);
		model.render(stack, buffer, packedLightIn, packedOverlayIn, (((int) (r * 255.0F)) << 24) | (((int) (g * 255.0F)) << 16) | (((int) (b * 255.0F)) << 8) | ((int) (a * 255.0F)));
	}

	public static void setupModelFromBone(ModelPart model, GeoBone bone) {
		model.setPos(bone.getPivotX(), bone.getPivotY(), bone.getPivotZ());
		model.xRot = 0.0f;
		model.yRot = 0.0f;
		model.zRot = 0.0f;
	}
}
