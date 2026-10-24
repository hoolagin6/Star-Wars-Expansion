
package net.mcreator.starwarsexpansion.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class TatooineSandstoneSlabBlock extends SlabBlock {
	public TatooineSandstoneSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

}
