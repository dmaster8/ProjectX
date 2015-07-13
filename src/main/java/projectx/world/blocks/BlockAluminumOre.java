package projectx.world.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import projectx.world.init.ProjectXWorldItems;

import java.util.Random;

public class BlockAluminumOre extends BlockAluminum {
    public BlockAluminumOre() {
        super();
    }

    @Override
    protected void dropBlockAsItem(World world, int x, int y, int z, ItemStack item){
        if (!world.isRemote && world.getGameRules().getGameRuleBooleanValue("doTileDrops") && !world.restoringBlockSnapshots) {
            Random random = new Random();
            int ammount = random.nextInt(5);
            if (ammount == 0) ammount = 1;
            item = new ItemStack(ProjectXWorldItems.aluminum, ammount);
            if (captureDrops.get()) {
                capturedDrops.get().add(item);
                return;
            }
            float f = 0.7F;
            double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(world, (double)x + d0, (double)y + d1, (double)z + d2, item);
            entityitem.delayBeforeCanPickup = 10;
            world.spawnEntityInWorld(entityitem);
        }
    }
}
