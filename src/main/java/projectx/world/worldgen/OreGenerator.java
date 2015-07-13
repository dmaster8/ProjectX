package projectx.world.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import projectx.util.IWorldGen;
import projectx.world.init.ProjectXWorldBlocks;

import java.util.Random;

public class OreGenerator implements IWorldGenerator, IWorldGen {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId){
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    @Override
    public void generateNether(World world, Random random, int x, int z) {

    }

    @Override
    public void generateSurface(World world, Random random, int x, int z) {
        for(int veins = 0; veins < 15; veins++){
            int metadata = random.nextInt(5);
            int ammount = random.nextInt(10);
            if(ammount < 6) ammount = 6;
            int xCoord = x + random.nextInt(16);
            int yCoord = random.nextInt(64);
            int zCoord = z + random.nextInt(16);

            (new WorldGenMinable(ProjectXWorldBlocks.ore, metadata, ammount, Blocks.stone)).generate(world, random, xCoord, yCoord, zCoord);
        }

        for(int veins = 0; veins < 8; veins++){
            int ammount = random.nextInt(10);
            if (ammount < 6) ammount = 6;
            int xCoord = x + random.nextInt(16);
            int yCoord = random.nextInt(64);
            int zCoord = z + random.nextInt(16);

            (new WorldGenMinable(ProjectXWorldBlocks.aluminumOre, 0, ammount, Blocks.stone)).generate(world, random, xCoord, yCoord, zCoord);
        }
    }

    @Override
    public void generateEnd(World world, Random random, int x, int z) {

    }
}
