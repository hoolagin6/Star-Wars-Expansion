
package net.mcreator.starwarsexpansion.block;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;

public class TatooineDoorBlock extends DoorBlock {
	public TatooineDoorBlock() {
		super(BlockSetType.STONE, BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

}
