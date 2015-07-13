package projectx.world.items;

import projectx.world.init.ProjectXWorldBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemCornSeed extends Item{

	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int meta, float hitX, float hitY, float hitZ) {
		if(world.getBlock(x, y, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, ProjectXWorldBlocks.corn)){
				world.setBlock(x, y+1, z, ProjectXWorldBlocks.corn);
			return true;
		}
		return false;
	}
}
