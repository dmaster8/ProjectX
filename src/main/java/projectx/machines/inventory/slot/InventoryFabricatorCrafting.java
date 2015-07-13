package projectx.machines.inventory.slot;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;

public class InventoryFabricatorCrafting extends InventoryCrafting {
    public InventoryFabricatorCrafting(Container container, int width, int height) {
        super(container, width, height);
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack){
        return false;
    }
}
