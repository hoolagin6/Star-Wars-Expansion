
package net.mcreator.starwarsexpansion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starwarsexpansion.entity.BibFortunaEntity;
import net.mcreator.starwarsexpansion.client.model.Modelbibfortuna;

public class BibFortunaRenderer extends MobRenderer<BibFortunaEntity, Modelbibfortuna<BibFortunaEntity>> {
	public BibFortunaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbibfortuna<BibFortunaEntity>(context.bakeLayer(Modelbibfortuna.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BibFortunaEntity entity) {
		return ResourceLocation.parse("star_wars_expansion:textures/entities/bib_fortuna.png");
	}
}
