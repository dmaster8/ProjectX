package projectx;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import projectx.client.gui.GuiHandler;
import projectx.machines.ProjectXMachines;
import projectx.proxy.CommonProxy;
import projectx.world.ProjectXWorld;

import java.util.logging.Logger;

@Mod(modid = ProjectX.MODID, name = ProjectX.NAME, version = ProjectX.VERSION)
public class ProjectX {
	public static final String MODID = "projectx";
	public static final String NAME = "ProjectX";
	public static final String VERSION = "0.1.1";
	public static int renderID;

	public static final ProjectXWorld X_WORLD = new ProjectXWorld();
	public static final ProjectXMachines X_MACHINES = new ProjectXMachines();

    @Mod.Instance
	public static ProjectX INSTANCE;
	public static Logger logger = Logger.getLogger(MODID);

	@SidedProxy(clientSide = "projectx.proxy.ClientProxy", serverSide = "projectx.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		NetworkRegistry.INSTANCE.registerGuiHandler(ProjectX.INSTANCE, new GuiHandler());
        ProjectXTabs.init();
		X_WORLD.preInit();
		X_MACHINES.preInit();
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		X_WORLD.init();
		X_MACHINES.init();
		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		X_WORLD.postInit();
		X_MACHINES.postInit();
	}
}
