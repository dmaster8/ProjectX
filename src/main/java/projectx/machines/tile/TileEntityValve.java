package projectx.machines.tile;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityValve extends TileEntity {

    private Block base, glass;

    @Override
    public void writeToNBT(NBTTagCompound tagCompound){
        super.writeToNBT(tagCompound);
    }

    @Override
    public void readFromNBT(NBTTagCompound tagCompound){
        super.readFromNBT(tagCompound);
    }

    @Override
    public void updateEntity(){
        if(worldObj.getWorldTime() % 600 == 0){
            base = worldObj.getBlock(xCoord, yCoord - 1, zCoord);
            glass = worldObj.getBlock(xCoord, yCoord + 1, zCoord);
            if(isCompleteTank(base, glass)){

            }
        }
    }

    public boolean isCompleteTank(Block base, Block glass){

        return true;
    }
}
