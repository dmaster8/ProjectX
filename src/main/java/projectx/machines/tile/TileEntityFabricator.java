package projectx.machines.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import projectx.machines.inventory.slot.InventoryFabricatorCrafting;

public class TileEntityFabricator extends TileEntity implements IInventory{

    private ItemStack[] inventory = new ItemStack[9];
    private InventoryFabricatorCrafting crafting;
    private ItemStack[] craftingMatrix = new ItemStack[9];
    private ItemStack craftingResult;

    public TileEntityFabricator(){}

    @Override
    public void updateEntity(){
        if(!worldObj.isRemote && craftingMatrix != null && craftingResult != null) {
            //I don't understand
        }
    }

    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventory[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int ammount) {
        ItemStack stack = getStackInSlot(slot);
        if(stack != null){
            if(stack.stackSize <= ammount){
                setInventorySlotContents(slot, null);
            } else {
                stack = stack.splitStack(ammount);
                if(stack.stackSize == 0){
                    setInventorySlotContents(slot, null);
                }
            }
        }
        return stack;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        ItemStack stack = getStackInSlot(slot);
        if(stack != null){
            setInventorySlotContents(slot, null);
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        inventory[slot] = stack;
        if(stack != null && stack.stackSize > getInventoryStackLimit()){
            stack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
    }

    @Override
    public void openInventory() {}

    @Override
    public void closeInventory() {}

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack) {
        return true;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);
        NBTTagList inv = new NBTTagList();
        for(int slot = 0; slot < inventory.length; slot++){
            ItemStack stack = inventory[slot];
            if(stack != null){
                NBTTagCompound nbt = new NBTTagCompound();
                nbt.setByte("Slot", (byte) slot);
                stack.writeToNBT(nbt);
                inv.appendTag(nbt);
            }
        }

        NBTTagList craft = new NBTTagList();
        for(int slot = 0; slot < craftingMatrix.length; slot++){
            ItemStack stack = craftingMatrix[slot];
            if(stack != null){
                NBTTagCompound nbt = new NBTTagCompound();
                nbt.setByte("Slot", (byte) slot);
                stack.writeToNBT(nbt);
                craft.appendTag(nbt);
            }
        }

        tag.setTag("Inventory", inv);
        tag.setTag("CraftMatrix", craft);
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        NBTTagList tagList = tag.getTagList("Inventory", 10);
        for(int slot = 0; slot < tagList.tagCount(); slot++){
            NBTTagCompound nbt = tagList.getCompoundTagAt(slot);
            byte slotNum = nbt.getByte("Slot");
            if(slotNum >= 0 && slotNum < inventory.length){
                inventory[slotNum] = ItemStack.loadItemStackFromNBT(nbt);
            }
        }

        NBTTagList craft = tag.getTagList("CraftMatrix", 10);
        for(int x = 0; x < craft.tagCount(); x++){
            NBTTagCompound nbtTagCompound = craft.getCompoundTagAt(x);
            byte slot = nbtTagCompound.getByte("Slot");
            if(slot >= 0 && slot < craftingMatrix.length){
                craftingMatrix[slot] = ItemStack.loadItemStackFromNBT(nbtTagCompound);
            }
        }
    }

    public void setCrafting(InventoryFabricatorCrafting crafting){
        this.crafting = crafting;
    }

    public void setCraftingMatrix(ItemStack[] craftingMatrix){
        this.craftingMatrix = craftingMatrix;
    }

    public void setCraftingResult(ItemStack craftingResult){
        this.craftingResult = craftingResult;
    }

    public ItemStack[] getCraftingMatrix(){
        return craftingMatrix;
    }
}
