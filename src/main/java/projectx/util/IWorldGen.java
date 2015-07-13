package projectx.util;

import net.minecraft.world.World;

import java.util.Random;

public interface IWorldGen {
    void generateNether(World world, Random random, int x, int z);
    void generateSurface(World world, Random random, int x, int z);
    void generateEnd(World world, Random random, int x, int z);
}
