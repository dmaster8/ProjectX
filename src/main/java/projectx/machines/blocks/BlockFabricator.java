package projectx.machines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import projectx.ProjectX;
import projectx.machines.tile.TileEntityFabricator;

import java.util.Random;

public class BlockFabricator extends BlockMachine implements ITileEntityProvider{
    public BlockFabricator() {
        super("fabricator", 1973019);
        this.setCreativeTab(null);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float par7, float par8, float par9){
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(tileEntity == null || player.isSneaking()){
            return false;
        }
        player.openGui(ProjectX.INSTANCE, 0, world, x, y, z);
        return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata){
        dropItems(world, x, y, z);
        super.breakBlock(world, x, y, z, block, metadata);
    }

    protected void dropItems(World world, int x, int y, int z){
        Random random = new Random();
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if(!(tileEntity instanceof IInventory)){
            return;
        }

        IInventory inventory = (IInventory) tileEntity;

        for(int slot = 0; slot < inventory.getSizeInventory(); slot++){
            ItemStack itemStack = inventory.getStackInSlot(slot);

            if(itemStack != null && itemStack.stackSize > 0){
                float rx = random.nextFloat() * 0.8F + 0.1F;
                float ry = random.nextFloat() * 0.8F + 0.1F;
                float rz = random.nextFloat() * 0.8F + 0.1F;

                EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz, itemStack.copy());

                if(itemStack.hasTagCompound()){
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
                }

                float factor = 0.05F;
                entityItem.motionX = random.nextGaussian() * factor;
                entityItem.motionY = random.nextGaussian() * factor + 0.2F;
                entityItem.motionZ = random.nextGaussian() * factor;
                world.spawnEntityInWorld(entityItem);
                itemStack = null;
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par2) {
        return new TileEntityFabricator();
    }
}
