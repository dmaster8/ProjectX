package projectx.world;

import cpw.mods.fml.common.registry.GameRegistry;
import projectx.util.ISubMod;
import projectx.world.init.ProjectXWorldBlocks;
import projectx.world.init.ProjectXWorldCrafting;
import projectx.world.init.ProjectXWorldItems;
import projectx.world.worldgen.OreGenerator;

public class ProjectXWorld implements ISubMod{

	public void preInit(){
		ProjectXWorldItems.init();
		ProjectXWorldBlocks.init();
		GameRegistry.registerWorldGenerator(new OreGenerator(), 2);
	}

	public void init(){
		ProjectXWorldCrafting.init();
	}

	public void postInit(){

	}

}
