package projectx.machines.inventory.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.SlotCrafting;

public class SlotFabricator extends SlotCrafting {
    public SlotFabricator(EntityPlayer player, IInventory craftingMatrix, IInventory inventory, int slot, int x, int y) {
        super(player, craftingMatrix, inventory, slot, x, y);
    }

    @Override
    public boolean canTakeStack(EntityPlayer player){
        return false;
    }

}
