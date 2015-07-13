package projectx.machines.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import projectx.world.init.ProjectXWorldItems;

public class ProjectXMachinesCrafting {
    public static void init(){
        crafting();
        smelting();
    }

    private static void crafting(){
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.water, 2), new Object[]{"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 'y', "stone", 'z', new ItemStack(Items.water_bucket, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.fluidVoid, 2), new Object[]{"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 'y', "stone", 'z', new ItemStack(Items.bucket, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.soil, 2), new Object[]{"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 'y', "treeSapling", 'z', new ItemStack(Items.iron_ingot, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.ice, 1), new Object[]{"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stone", 'z', new ItemStack(Items.snowball, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.ice, 4), new Object[]{"xyx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 'y', "stone", 'z', new ItemStack(Blocks.snow, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.fire, 1), new Object[]{"xbx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stone", 'z', new ItemStack(Items.gunpowder, 1), 'b', new ItemStack(Blocks.iron_bars, 1)}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.fire, 4), new Object[]{"xbx", "yzy", "xyx", 'x', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 'y', "stone", 'z', new ItemStack(Items.lava_bucket, 1), 'b', new ItemStack(Blocks.iron_bars, 1)}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.engineering, 1, 0), new Object[]{"isi", "srs", "isi", 'i', new ItemStack(ProjectXWorldItems.xychoridite, 1, 0), 's', new ItemStack(Blocks.stonebrick, 1), 'r', "dustRedstone"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.engineering, 1, 1), new Object[]{"isi", "srs", "isi", 'i', new ItemStack(ProjectXWorldItems.xychoridite, 1, 1), 's', new ItemStack(Blocks.stonebrick, 1), 'r', "dustRedstone"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.engineering, 1, 2), new Object[]{"isi", "srs", "isi", 'i', new ItemStack(ProjectXWorldItems.xychoridite, 1, 2), 's', new ItemStack(Blocks.stonebrick, 1), 'r', "dustRedstone"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.engineering, 1, 3), new Object[]{"isi", "srs", "isi", 'i', new ItemStack(ProjectXWorldItems.xychoridite, 1, 3), 's', new ItemStack(Blocks.stonebrick, 1), 'r', "dustRedstone"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ProjectXMachinesBlocks.engineering, 1, 4), new Object[]{"isi", "srs", "isi", 'i', new ItemStack(ProjectXWorldItems.xychoridite, 1, 4), 's', new ItemStack(Blocks.stonebrick, 1), 'r', "dustRedstone"}));
    }

    private static void smelting(){


    }
}
