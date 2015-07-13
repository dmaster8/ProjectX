package projectx;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import projectx.machines.init.ProjectXMachinesBlocks;
import projectx.world.init.ProjectXWorldItems;

public class ProjectXTabs {
	public static CreativeTabs tabProjectXWorld, tabProjectXMachines;

	public static void init() {
		tabProjectXWorld = new CreativeTabs("tabProjectXWorld") {

			@Override
			public Item getTabIconItem() {
				return ProjectXWorldItems.xychorium;
			}
		};

		tabProjectXMachines = new CreativeTabs("tabProjectXMachines") {
			@Override
			public Item getTabIconItem() {
				return Item.getItemFromBlock(ProjectXMachinesBlocks.fire);
			}
		};
	}
}
