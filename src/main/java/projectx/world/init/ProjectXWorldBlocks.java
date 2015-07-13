package projectx.world.init;

import net.minecraft.block.material.Material;
import projectx.ProjectX;
import projectx.world.blocks.BlockAluminum;
import projectx.world.blocks.BlockAluminumOre;
import projectx.world.blocks.BlockCorn;
import projectx.world.blocks.BlockProjectX;
import projectx.world.blocks.BlockProjectXOre;
import projectx.world.blocks.BlockTomato;
import projectx.world.blocks.BlockXyTorch;
import projectx.world.blocks.ItemBlockProjectX;
import projectx.world.blocks.ItemBlockProjectXOre;
import cpw.mods.fml.common.registry.GameRegistry;

public class ProjectXWorldBlocks {
	public static BlockAluminum aluminum;
	public static BlockAluminumOre aluminumOre;
	public static BlockProjectXOre ore;
	public static BlockProjectX bricks, plate, platform, shield, storage, structure, frame;
	public static BlockCorn corn;
	public static BlockTomato tomato;
	public static BlockXyTorch sulfurTorch, aluminumTorch;

	public static void init(){
		ore = (BlockProjectXOre) new BlockProjectXOre(Material.rock, "paradigmLg", "world/ore", "paradigmMd").setBlockName("ore");
		bricks = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/brick", "paradigmMd").setBlockName("bricks");
		plate = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/plate", "paradigmMd").setBlockName("plate");
		platform = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/platform", "paradigmMd").setBlockName("platform");
		shield = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/shield", "paradigmMd").setBlockName("shield");
		storage = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/storage", "paradigmMd").setBlockName("storage");
		structure = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/structure", "paradigmMd").setBlockName("structure");
        frame = (BlockProjectX) new BlockProjectX(Material.rock, "paradigmLg", "world/frame", "paradigmMd").setBlockName("frame");
		corn = new BlockCorn();
		tomato = (BlockTomato) new BlockTomato().setBlockName("tomato");
		sulfurTorch = (BlockXyTorch) new BlockXyTorch().setBlockTextureName(ProjectX.MODID + ":world/sulfurTorch").setBlockName("sulfurTorch");
		aluminumTorch = (BlockXyTorch) new BlockXyTorch().setBlockTextureName(ProjectX.MODID + ":world/aluminumTorch").setBlockName("aluminumTorch");
		aluminum = (BlockAluminum) new BlockAluminum().setBlockName("aluminum").setBlockTextureName(ProjectX.MODID + ":world/aluminum");
		aluminumOre = (BlockAluminumOre) new BlockAluminumOre().setBlockName("aluminumOre").setBlockTextureName(ProjectX.MODID + ":world/aluminumOre");


		GameRegistry.registerBlock(ore, ItemBlockProjectXOre.class, ore.getUnlocalizedName());
		GameRegistry.registerBlock(bricks, ItemBlockProjectX.class, bricks.getUnlocalizedName());
		GameRegistry.registerBlock(plate, ItemBlockProjectX.class, plate.getUnlocalizedName());
		GameRegistry.registerBlock(platform, ItemBlockProjectX.class, platform.getUnlocalizedName());
		GameRegistry.registerBlock(shield, ItemBlockProjectX.class, shield.getUnlocalizedName());
		GameRegistry.registerBlock(storage, ItemBlockProjectX.class, storage.getUnlocalizedName());
		GameRegistry.registerBlock(structure, ItemBlockProjectX.class, structure.getUnlocalizedName());
        GameRegistry.registerBlock(frame, ItemBlockProjectX.class, frame.getUnlocalizedName());
		GameRegistry.registerBlock(corn, corn.getUnlocalizedName());
		GameRegistry.registerBlock(tomato, tomato.getUnlocalizedName());
		GameRegistry.registerBlock(sulfurTorch, sulfurTorch.getUnlocalizedName());
		GameRegistry.registerBlock(aluminumTorch, aluminumTorch.getUnlocalizedName());
		GameRegistry.registerBlock(aluminum, aluminum.getUnlocalizedName());
		GameRegistry.registerBlock(aluminumOre, aluminumOre.getUnlocalizedName());
	}
}
