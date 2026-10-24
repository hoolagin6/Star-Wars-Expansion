
package net.mcreator.starwarsexpansion.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class TatooineSandstoneWallBlock extends WallBlock {
	public TatooineSandstoneWallBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f).forceSolidOn());
	}

}
