package projectx.world.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;
import projectx.ProjectX;
import projectx.world.ProjectXWorld;

public class ProjectXWorldCrafting {

	public static void init() {
		crafting();
		smelting();
		seeds();
	}

	private static void crafting() {
		//Items
		GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldItems.twine, 1), new Object[]{new ItemStack(ProjectXWorldItems.henequenLeaf, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"xx ", "xx ", "   ", 'x', new ItemStack(ProjectXWorldItems.twine, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{" xx", " xx", "   ", 'x', new ItemStack(ProjectXWorldItems.twine, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", "xx ", "xx ", 'x', new ItemStack(ProjectXWorldItems.twine, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", " xx", " xx", 'x', new ItemStack(ProjectXWorldItems.twine, 1)});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeBlack, 1), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeBlue, 1), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeGreen, 1), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeRed, 1), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeWhite, 1), new Object[]{"xx ", "xy ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeBlack, 1), new Object[]{" xx", " yx", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeBlue, 1), new Object[] { " xx", " yx", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeGreen, 1), new Object[] { " xx", " yx", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeRed, 1), new Object[] { " xx", " yx", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.axeWhite, 1), new Object[] { " xx", " yx", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.swordBlack, 1), new Object[] { " x ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.swordBlue, 1), new Object[] { " x ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.swordGreen, 1), new Object[] { " x ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.swordRed, 1), new Object[] { " x ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.swordWhite, 1), new Object[] { " x ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.shovelBlack, 1), new Object[] { " x ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.shovelBlue, 1), new Object[] { " x ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.shovelGreen, 1), new Object[] { " x ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.shovelRed, 1), new Object[] { " x ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.shovelWhite, 1), new Object[] { " x ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeBlack, 1), new Object[] { "xx ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeBlue, 1), new Object[] { "xx ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeGreen, 1), new Object[] { "xx ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeRed, 1), new Object[] { "xx ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeWhite, 1), new Object[] { "xx ", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeBlack, 1), new Object[] { " xx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeBlue, 1), new Object[] { " xx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeGreen, 1), new Object[] { " xx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeRed, 1), new Object[] { " xx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.hoeWhite, 1), new Object[] { " xx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.pickaxeBlack, 1), new Object[] { "xxx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.pickaxeBlue, 1), new Object[] { "xxx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.pickaxeGreen, 1), new Object[] { "xxx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.pickaxeRed, 1), new Object[] { "xxx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stickWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldItems.pickaxeWhite, 1), new Object[] { "xxx", " y ", " y ", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stickWood" }));

		//Blocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, 0), new Object[] {"xyx", "yyy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, 4), new Object[] {"xyx", "yyy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, 2), new Object[] {"xyx", "yyy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, 1), new Object[] {"xyx", "yyy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, 15), new Object[] {"xyx", "yyy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1, 0)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 2, 0), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.brick, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 2, 4), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.brick, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 2, 2), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.brick, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 2, 1), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.brick, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 2, 15), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.brick, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 4, 0), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 4, 4), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 4, 2), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 4, 1), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 4, 15), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 8, 0), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Blocks.obsidian, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 8, 4), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Blocks.obsidian, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 8, 2), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Blocks.obsidian, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 8, 1), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Blocks.obsidian, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 8, 15), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Blocks.obsidian, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 16, 0), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.diamond, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 16, 4), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.diamond, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 16, 2), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.diamond, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 16, 1), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.diamond, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.plate, 16, 15), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1, 0), 'z', new ItemStack(Items.diamond, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, 0), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', new ItemStack(Blocks.glass, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, 4), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', new ItemStack(Blocks.glass, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, 2), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', new ItemStack(Blocks.glass, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, 1), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', new ItemStack(Blocks.glass, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, 15), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', new ItemStack(Blocks.glass, 1, 0), 'z', new ItemStack(Items.iron_ingot, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, 0), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, 4), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, 2), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, 1), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, 15), new Object[] {"xxx", "xxx", "xxx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4)}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, 0), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.stick, 1), 'y', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, 4), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.stick, 1), 'y', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, 2), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.stick, 1), 'y', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, 1), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.stick, 1), 'y', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, 15), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.stick, 1), 'y', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4)}));


		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, 0), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.iron_ingot, 1), 'y', new ItemStack(ProjectXWorldBlocks.plate, 1, 0)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, 4), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.iron_ingot, 1), 'y', new ItemStack(ProjectXWorldBlocks.plate, 1, 4)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, 2), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.iron_ingot, 1), 'y', new ItemStack(ProjectXWorldBlocks.plate, 1, 2)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, 1), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.iron_ingot, 1), 'y', new ItemStack(ProjectXWorldBlocks.plate, 1, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, 15), new Object[] {"xyx", "yxy", "xyx", 'x', new ItemStack(Items.iron_ingot, 1), 'y', new ItemStack(ProjectXWorldBlocks.plate, 1, 15)}));

		for(int color = 0; color < 16; color++){
			GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.bricks, 1, color), new ItemStack(ProjectXWorldBlocks.bricks, 1), new ItemStack(Items.dye, 1, color));
			GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.plate, 1, color), new ItemStack(ProjectXWorldBlocks.plate, 1), new ItemStack(Items.dye, 1, color));
			GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.platform, 1, color), new ItemStack(ProjectXWorldBlocks.platform, 1), new ItemStack(Items.dye, 1, color));
			GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.shield, 1, color), new ItemStack(ProjectXWorldBlocks.shield, 1), new ItemStack(Items.dye, 1, color));
			GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.storage, 1, color), new ItemStack(ProjectXWorldBlocks.storage, 1), new ItemStack(Items.dye, 1, color));
            GameRegistry.addShapelessRecipe(new ItemStack(ProjectXWorldBlocks.frame, 1, color), new ItemStack(ProjectXWorldBlocks.frame, 1), new ItemStack(Items.dye, 1, color));

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.structure, 1, color), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychorium, 1, 0), 'y', new ItemStack(Blocks.stonebrick, 1), 'z', new ItemStack(Items.dye, 1, color)}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.structure, 1, color), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychorium, 1, 1), 'y', new ItemStack(Blocks.stonebrick, 1), 'z', new ItemStack(Items.dye, 1, color)}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.structure, 1, color), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychorium, 1, 2), 'y', new ItemStack(Blocks.stonebrick, 1), 'z', new ItemStack(Items.dye, 1, color)}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.structure, 1, color), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychorium, 1, 3), 'y', new ItemStack(Blocks.stonebrick, 1), 'z', new ItemStack(Items.dye, 1, color)}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.structure, 1, color), new Object[] {"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychorium, 1, 4), 'y', new ItemStack(Blocks.stonebrick, 1), 'z', new ItemStack(Items.dye, 1, color)}));
		}

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{"x  ", "y  ", "   ", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{" x ", " y ", "   ", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{"  x", "  y", "   ", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{"   ", "x  ", "y  ", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{"   ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.aluminumTorch, 1), new Object[]{"   ", "  x", "  y", 'x', new ItemStack(ProjectXWorldItems.aluminum, 1), 'y', new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1)}));

		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{"x  ", "y  ", "   ", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{" x ", " y ", "   ", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{"  x", "  y", "   ", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{"   ", "x  ", "y  ", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{"   ", " x ", " y ", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXWorldBlocks.sulfurTorch, 1), new Object[]{"   ", "  x", "  y", 'x', new ItemStack(ProjectXWorldItems.sulfur, 1), 'y', "stickWood"}));
	}

	private static void smelting() {
		for (int meta = 0; meta < 5; meta++) {
			GameRegistry.addSmelting(new ItemStack(ProjectXWorldItems.xychorium, 1, meta), new ItemStack(ProjectXWorldItems.xychoridite, 1, meta), 2.0F);
		}
		GameRegistry.addSmelting(ProjectXWorldItems.cornSeeds, new ItemStack(ProjectXWorldItems.popcorn, 1), 0.5F);
		GameRegistry.addSmelting(ProjectXWorldItems.corn, new ItemStack(ProjectXWorldItems.cornOnTheCob, 1), 0.5F);
		GameRegistry.addSmelting(Items.gunpowder, new ItemStack(ProjectXWorldItems.sulfur, 1), 0.5F);
	}

	private static void seeds() {
		MinecraftForge.addGrassSeed(new ItemStack(ProjectXWorldItems.cornSeeds, 1), 20);
		MinecraftForge.addGrassSeed(new ItemStack(ProjectXWorldItems.henequenSeeds, 1), 20);
	}
}
