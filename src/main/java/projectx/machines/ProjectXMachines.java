package projectx.machines;

import cpw.mods.fml.common.registry.GameRegistry;
import projectx.machines.init.ProjectXMachinesBlocks;
import projectx.machines.init.ProjectXMachinesCrafting;
import projectx.machines.init.ProjectXMachinesItems;
import projectx.machines.tile.TileEntityFabricator;
import projectx.util.ISubMod;

public class ProjectXMachines implements ISubMod {
	@Override
	public void preInit() {
		ProjectXMachinesBlocks.init();
		ProjectXMachinesItems.init();
		ProjectXMachinesCrafting.init();
		GameRegistry.registerTileEntity(TileEntityFabricator.class, "containerFabricator");
	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}
}
