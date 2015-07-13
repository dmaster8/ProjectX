package projectx.machines.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockXychoriumFurnace extends BlockMachine {

	public BlockXychoriumFurnace() {
		super("xyfurnace", 0xFF55FF);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		if (player.getCurrentEquippedItem() != null)
			if (world.getBlock(x, y - 1, z) != null && world.getBlock(x, y - 1, z).getMaterial() == Material.lava) {
				if (FurnaceRecipes.smelting().getSmeltingResult(player.getCurrentEquippedItem().copy()) != null) {
					EntityItem item = new EntityItem(world, x + 0.5, y + 1.5, z + 0.5, FurnaceRecipes.smelting().getSmeltingResult(player.getCurrentEquippedItem().copy()).copy());
					if (!world.isRemote) {
						world.spawnEntityInWorld(item);
						player.inventory.decrStackSize(player.inventory.currentItem, 1);
					}
					return true;
				}
			}
		return false;
	}

}
