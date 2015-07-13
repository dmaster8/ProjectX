package projectx.machines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import projectx.machines.blocks.*;
import projectx.world.blocks.ItemBlockProjectXOre;

public class ProjectXMachinesBlocks {
	public static BlockXychoriumWater water;
	public static BlockXychoriumFire fire;
	public static BlockXychoriumSoil soil;
	public static BlockXyFluidVoid fluidVoid;
	public static BlockXychoriumIce ice;
	public static BlockEngineering engineering;
	public static BlockFabricator fabricator;
	public static BlockXychoriumFurnace furnace;

	public static void init() {
		water = new BlockXychoriumWater();
		fire = new BlockXychoriumFire();
		soil = new BlockXychoriumSoil();
		fluidVoid = new BlockXyFluidVoid();
		ice = new BlockXychoriumIce();
		engineering = new BlockEngineering(Material.iron, "paradigmLg", "machines/engineering", "paradigmMd");
		fabricator = new BlockFabricator();
		furnace = new BlockXychoriumFurnace();
		GameRegistry.registerBlock(water, water.getUnlocalizedName());
		GameRegistry.registerBlock(fire, fire.getUnlocalizedName());
		GameRegistry.registerBlock(soil, soil.getUnlocalizedName());
		GameRegistry.registerBlock(fluidVoid, fluidVoid.getUnlocalizedName());
		GameRegistry.registerBlock(ice, ice.getUnlocalizedName());
		GameRegistry.registerBlock(engineering, ItemBlockProjectXOre.class, engineering.getUnlocalizedName());
		GameRegistry.registerBlock(fabricator, fabricator.getUnlocalizedName());
		GameRegistry.registerBlock(furnace, furnace.getUnlocalizedName());
		
	}
}
