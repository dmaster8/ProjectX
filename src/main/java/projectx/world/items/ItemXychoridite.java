package projectx.world.items;

import projectx.ProjectX;
import projectx.world.init.ProjectXWorldBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemXychoridite extends ItemProjectX {

	
	public ItemXychoridite() {
		super("xychoridite");
	}

	@Override
	public void registerIcons(IIconRegister icon) {
		this.itemIcon = icon.registerIcon(ProjectX.MODID + ":xychoridite");
	}

}
