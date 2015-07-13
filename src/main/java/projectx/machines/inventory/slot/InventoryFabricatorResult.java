package projectx.machines.inventory.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.item.ItemStack;

public class InventoryFabricatorResult extends InventoryCraftResult {
    @Override
    public boolean isUseableByPlayer(EntityPlayer player){
        return false;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack item){
        return false;
    }
}
