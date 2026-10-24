package net.mcreator.starwarsexpansion.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class CantinaMusicItem extends Item {
	public CantinaMusicItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).component(DataComponents.JUKEBOX_PLAYABLE,
				new JukeboxPlayable(new EitherHolder<>(ResourceKey.create(Registries.JUKEBOX_SONG,
						ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "cantina_music"))), true)));
	}
}
