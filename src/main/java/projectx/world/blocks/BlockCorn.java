package projectx.world.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.util.ForgeDirection;
import projectx.ProjectX;
import projectx.world.init.ProjectXWorldBlocks;
import projectx.world.init.ProjectXWorldItems;

import java.util.ArrayList;
import java.util.Random;

public class BlockCorn extends BlockCrops implements IGrowable{

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;

	public BlockCorn(){
		setTickRandomly(true);
		setCreativeTab(null);
		setHardness(0.0F);
		setStepSound(soundTypeGrass);
		disableStats();
		setBlockName("corn");
		setBlockTextureName("corn");
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z){
		int meta = world.getBlockMetadata(x, y, z);

		if(meta <= 2){
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
		} else if(meta <= 4){
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
		} else if(meta <= 6){
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
		} else {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}
	}

	@Override
	public void onBlockHarvested(World world, int x, int y, int z, int meta, EntityPlayer player){
		if(world.getBlock(x, y, z) instanceof BlockCorn){
			if(world.getBlockMetadata(x, y, z) == 8){
				world.setBlockMetadataWithNotify(x, y - 1, z, 5, 2);
			}
		}
	}

	@Override
	protected boolean canPlaceBlockOn(Block block){
		return block == Blocks.farmland;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random){
		if(world.getBlockLightValue(x, y + 1, z) >= 9){
			int meta = world.getBlockMetadata(x, y, z);

			if((meta < 7) && (world.getBlock(x, y - 1, z) instanceof BlockFarmland)){
				if(random.nextInt(30) == 0){
					world.setBlockMetadataWithNotify(x, y, z, meta + 1, 2);
				}
			}

			if((meta == 7) && (world.getBlock(x, y - 1, z) instanceof BlockFarmland) && (world.getBlock(x, y + 1, z) instanceof BlockAir)){
				world.setBlock(x, y + 1, z, ProjectXWorldBlocks.corn, 8, 2);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta){
		if(meta < 0 || meta > 8){
			meta = 8;
		}

		return this.iconArray[meta];
	}

	@Override
	public int getRenderType(){
		return 6;
	}

	/**
	 * getSeed
	 * @return
	 */
	@Override
	protected Item func_149866_i(){
		return ProjectXWorldItems.cornSeeds;
	}

	/**
	 * getCrop
	 * @return
	 */
	@Override
	protected Item func_149865_P(){
		return ProjectXWorldItems.corn;
	}

	@Override
	public void dropBlockAsItemWithChance(World world, int x, int y, int z, int meta, float par5, int chance){
		super.dropBlockAsItemWithChance(world, x, y, z, meta, par5, 0);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int par3){
		return meta == 8 ? this.func_149865_P() : this.func_149866_i();
	}

	@Override
	public int quantityDropped(Random random){
		return 1;
	}

	/**
	 * canFertilize
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param isClient
	 * @return
	 */
	@Override
	public boolean func_149851_a(World world, int x, int y, int z, boolean isClient){
		return world.getBlockMetadata(x, y, z) < 7;
	}

	/**
	 * shouldFertilize
	 * @param world
	 * @param random
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	@Override
	public boolean func_149852_a(World world, Random random, int x, int y, int z){
		return true;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World world, int x, int y, int z){
		return this.func_149866_i();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon){
		this.iconArray = new IIcon[9];
		String basePath = ProjectX.MODID + ":world/";
		iconArray[0] = icon.registerIcon(basePath+"corn0");
		iconArray[1] = icon.registerIcon(basePath+"corn1");
		iconArray[2] = icon.registerIcon(basePath+"corn2");
		iconArray[3] = icon.registerIcon(basePath+"corn3bot");
		iconArray[4] = icon.registerIcon(basePath+"corn3top");
		iconArray[5] = icon.registerIcon(basePath+"corn4bot");
		iconArray[6] = icon.registerIcon(basePath+"corn4top");
		iconArray[7] = icon.registerIcon(basePath+"corn5bot");
		iconArray[8] = icon.registerIcon(basePath+"corn5top");
		
//		for(int c = 0; c < this.iconArray.length; c++){
//			int texture = 0;
//			if(c == 0 || c == 1){
//				texture = 0;
//			} else if(c == 2){
//				texture = 1;
//			} else if(c == 3 || c == 4){
//				texture = 2;
//			} else if(c == 5 || c == 6){
//				texture = 3;
//			} else if(c == 7){
//				texture = 4;
//			} else if(c == 8){
//				texture = 5;
//			}
//			if(texture == 5 || texture == 6)
//			{
//				this.iconArray[c] = icon.registerIcon(ProjectX.MODID + ":world/corn3bot");
//				break;
//			}
//			if(texture == 7)
//			{
//				this.iconArray[c] = icon.registerIcon(ProjectX.MODID + ":world/corn4bot");
//				break;
//			}
//			this.iconArray[c] = icon.registerIcon(ProjectX.MODID + ":world/corn" + texture);
//		}
	}

	/**
	 * fertilize
	 * @param world
	 * @param random
	 * @param x
	 * @param y
	 * @param z
	 */
	@Override
	public void func_149853_b(World world, Random random, int x, int y, int z){
		int meta = world.getBlockMetadata(x, y, z);
		if(world.getBlock(x, y + 1, z) instanceof BlockAir && (meta < 7) && !(world.getBlock(x, y - 1, z) instanceof BlockCorn)){
			meta = meta + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);

			if(meta > 6){
				world.setBlockMetadataWithNotify(x, y, z, 7, 2);
				world.setBlock(x, y + 1, z, ProjectXWorldBlocks.corn, 8, 2);
			} else {
				world.setBlockMetadataWithNotify(x, y, z, meta, 2);
			}
		}
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		if(metadata >= 8){
			for(int c = 0; c < 3 + fortune; ++c){
				if(world.rand.nextInt(15) <= metadata){
					ret.add(new ItemStack(this.func_149865_P(), 1, 0));
				}
			}

			if(world.rand.nextBoolean()){
				ret.add(new ItemStack(this.func_149866_i(), 1, 0));
			}
		} else if(metadata == 7){
			ret.add(new ItemStack(this.func_149866_i(), 1 + world.rand.nextInt(2), 0));
		} else {
			ret.add(new ItemStack(this.func_149866_i(), 1, 0));
		}

		return ret;
	}

	@Override
	public boolean canPlaceBlockAt(World world, int x, int y, int z){
		return super.canPlaceBlockAt(world, x, y, z) && world.isAirBlock(x, y + 1, z);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block){
		super.onNeighborBlockChange(world, x, y, z, block);
		if((world.getBlockMetadata(x, y, z) == 7) && (world.getBlock(x, y + 1, z) == Blocks.air)){
			world.setBlockMetadataWithNotify(x, y, z, 5, 3);
		}

		if((world.getBlockMetadata(x, y, z) == 8) && world.getBlockMetadata(x, y - 1, z) != 7){
			world.setBlockToAir(x, y, z);
		}

		if((world.getBlockMetadata(x, y, z) < 8) && (world.getBlock(x, y - 1, z) instanceof BlockCorn)){
			world.setBlockToAir(x, y, z);
		}
		this.checkAndDropBlock(world, x, y, z);
	}

	@Override
	protected void checkAndDropBlock(World world, int x, int y, int z){
		if(!this.canBlockStay(world, x, y, z)){
			int meta = world.getBlockMetadata(x, y, z);
			this.dropBlockAsItem(world, x, y, z, meta, 0);
			world.setBlock(x, y, z, Blocks.air, 0, 2);
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z){
		if(world.getBlock(x, y, z) != this) return super.canBlockStay(world, x, y, z);
		if(world.getBlock(x, y - 1, z).canSustainPlant(world, x, y, z, ForgeDirection.UP, this) && world.getBlock(x, y - 1, z).isFertile(world, x, y, z)){
			return true;
		}

		return (world.getBlock(x, y - 1, z) instanceof BlockCorn) && (world.getBlockMetadata(x, y - 1, z) == 7);
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z){
		return EnumPlantType.Crop;
	}
}
