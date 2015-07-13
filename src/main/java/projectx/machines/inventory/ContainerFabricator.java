package projectx.machines.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import projectx.machines.inventory.slot.InventoryFabricatorCrafting;
import projectx.machines.inventory.slot.InventoryFabricatorResult;
import projectx.machines.inventory.slot.SlotFabricator;
import projectx.machines.tile.TileEntityFabricator;

public class ContainerFabricator extends Container {
	public InventoryFabricatorCrafting craftingMatrix = new InventoryFabricatorCrafting(this, 3, 3);
	public IInventory craftResult = new InventoryFabricatorResult();
	protected TileEntityFabricator fabricator;

	public ContainerFabricator(InventoryPlayer player, TileEntityFabricator fabricator) {
		this.fabricator = fabricator;
		addSlotToContainer(new SlotFabricator(player.player, this.craftingMatrix, this.craftResult, 0, 80, 35));
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				addSlotToContainer(new Slot(this.craftingMatrix, x + y * 3, 11 + x * 18, 17 + y * 18));
			}
		}

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				addSlotToContainer(new Slot(fabricator, x + y * 3, 113 + x * 18, 17 + y * 18));
			}
		}
		bindPlayerInventory(player);
		reloadCraftingMatrix();
		onCraftingMatrixChanged(craftingMatrix);
	}

	protected void bindPlayerInventory(InventoryPlayer player) {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
			}
		}

		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
		}
	}

	protected void reloadCraftingMatrix(){
		for(int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++){
			craftingMatrix.setInventorySlotContents(slot, fabricator.getCraftingMatrix()[slot]);
		}
	}

	public void onCraftingMatrixChanged(IInventory iInventory) {
		if(CraftingManager.getInstance().findMatchingRecipe(this.craftingMatrix, this.fabricator.getWorldObj()) != null){
			ItemStack stack = CraftingManager.getInstance().findMatchingRecipe(this.craftingMatrix, this.fabricator.getWorldObj());
			this.craftResult.setInventorySlotContents(0, stack);
			fabricator.setCraftingResult(stack);
		}
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
		Slot slotObj = (Slot) inventorySlots.get(slot);

		if (slotObj != null && slotObj.getHasStack()) {
			ItemStack stackInSlot = slotObj.getStack();
			stack = stackInSlot.copy();

			if (slot < fabricator.getSizeInventory()) {
				if (!this.mergeItemStack(stackInSlot, fabricator.getSizeInventory(), 36 + fabricator.getSizeInventory(), true)) {
					return null;
				}
			} else if (!this.mergeItemStack(stackInSlot, 0, fabricator.getSizeInventory(), false)) {
				return null;
			}

			if (stackInSlot.stackSize == 0) {
				slotObj.putStack(null);
			} else {
				slotObj.onSlotChanged();
			}

			if (stackInSlot.stackSize == stack.stackSize) {
				return null;
			}

			slotObj.onPickupFromSlot(player, stackInSlot);
		}
		return stack;
	}

	@Override
	public void onContainerClosed(EntityPlayer player){
		ItemStack[] stack = new ItemStack[craftingMatrix.getSizeInventory()];
		for(int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++){
			stack[slot] = craftingMatrix.getStackInSlot(slot);
		}
		fabricator.setCraftingMatrix(stack);
		fabricator.setCraftingResult(null);
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return fabricator.isUseableByPlayer(player);
	}

	@Override
	public boolean func_94530_a(ItemStack stack, Slot slot){
		return slot.inventory != this.craftResult && super.func_94530_a(stack, slot);
	}

	@Override
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		onCraftingMatrixChanged(this.craftingMatrix);
	}
}
