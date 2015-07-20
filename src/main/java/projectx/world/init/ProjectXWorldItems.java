package projectx.world.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemFood;
import projectx.ProjectX;
import projectx.ProjectXTabs;
import projectx.world.items.ItemCornSeed;
import projectx.world.items.ItemPopcorn;
import projectx.world.items.ItemProjectX;
import projectx.world.items.tools.*;

public class ProjectXWorldItems {

	public static ItemProjectX xychorium, xychoridite;
	public static ItemPopcorn popcorn;
	public static ItemFood cornOnTheCob, corn, tomato;
	public static Item cornSeeds, henequenSeeds, twine, henequenLeaf, tomatoSeeds, sulfur, aluminum;
	public static ItemProjectXShovel shovelBlack, shovelBlue, shovelGreen, shovelRed, shovelWhite;
	public static ItemProjectXSword swordBlack, swordBlue, swordGreen, swordRed, swordWhite;
	public static ItemProjectXHoe hoeBlack, hoeBlue, hoeGreen, hoeRed, hoeWhite;
	public static ItemProjectXAxe axeBlack, axeBlue, axeGreen, axeRed, axeWhite;
	public static ItemProjectXPickaxe pickaxeBlack, pickaxeBlue, pickaxeGreen, pickaxeRed, pickaxeWhite;
	public static int black = 0x444444, //1973019,
			blue = 0x0000FF,
			green = 0x00FF00,
			red = 0xFF0000,
			white = 15790320;

	public static void init() {
		xychorium = (ItemProjectX) new ItemProjectX("xychor/xychorium").setUnlocalizedName("xychorium");
		xychoridite = (ItemProjectX) new ItemProjectX("xychor/ingotAnimated").setUnlocalizedName("xychoridite");

		shovelBlack = (ItemProjectXShovel) new ItemProjectXShovel(black).setUnlocalizedName("shovelBlack").setTextureName(ProjectX.MODID + ":shovelBlack");
		swordBlack = (ItemProjectXSword) new ItemProjectXSword(black).setUnlocalizedName("swordBlack");
		hoeBlack = (ItemProjectXHoe) new ItemProjectXHoe().setUnlocalizedName("hoeBlack").setTextureName(ProjectX.MODID + ":hoeBlack");
		axeBlack = (ItemProjectXAxe) new ItemProjectXAxe(black).setUnlocalizedName("axeBlack").setTextureName(ProjectX.MODID + ":axeBlack");
		pickaxeBlack = (ItemProjectXPickaxe) new ItemProjectXPickaxe(black).setUnlocalizedName("pickaxeBlack");
		
		shovelBlue = (ItemProjectXShovel) new ItemProjectXShovel(blue).setUnlocalizedName("shovelBlue").setTextureName(ProjectX.MODID + ":shovelBlue");
		swordBlue = (ItemProjectXSword) new ItemProjectXSword(blue).setUnlocalizedName("swordBlue");
		hoeBlue = (ItemProjectXHoe) new ItemProjectXHoe().setUnlocalizedName("hoeBlue").setTextureName(ProjectX.MODID + ":hoeBlue");
		axeBlue = (ItemProjectXAxe) new ItemProjectXAxe(blue).setUnlocalizedName("axeBlue").setTextureName(ProjectX.MODID + ":axeBlue");
		pickaxeBlue = (ItemProjectXPickaxe) new ItemProjectXPickaxe(blue).setUnlocalizedName("pickaxeBlue");

		shovelGreen = (ItemProjectXShovel) new ItemProjectXShovel(green).setUnlocalizedName("shovelGreen");
		swordGreen = (ItemProjectXSword) new ItemProjectXSword(green).setUnlocalizedName("swordGreen");
		hoeGreen = (ItemProjectXHoe) new ItemProjectXHoe().setUnlocalizedName("hoeGreen").setTextureName(ProjectX.MODID + ":hoeGreen");
		axeGreen = (ItemProjectXAxe) new ItemProjectXAxe(green).setUnlocalizedName("axeGreen");
		pickaxeGreen = (ItemProjectXPickaxe) new ItemProjectXPickaxe(green).setUnlocalizedName("pickaxeGreen");

		shovelRed = (ItemProjectXShovel) new ItemProjectXShovel(red).setUnlocalizedName("shovelRed");
		swordRed = (ItemProjectXSword) new ItemProjectXSword(red).setUnlocalizedName("swordRed");
		hoeRed = (ItemProjectXHoe) new ItemProjectXHoe().setUnlocalizedName("hoeRed").setTextureName(ProjectX.MODID + ":hoeRed");
		axeRed = (ItemProjectXAxe) new ItemProjectXAxe(red).setUnlocalizedName("axeRed");
		pickaxeRed = (ItemProjectXPickaxe) new ItemProjectXPickaxe(red).setUnlocalizedName("pickaxeRed");

		shovelWhite = (ItemProjectXShovel) new ItemProjectXShovel(white).setUnlocalizedName("shovelWhite");
		swordWhite = (ItemProjectXSword) new ItemProjectXSword(white).setUnlocalizedName("swordWhite");
		hoeWhite = (ItemProjectXHoe) new ItemProjectXHoe().setUnlocalizedName("hoeWhite").setTextureName(ProjectX.MODID + ":hoeWhite");
		axeWhite = (ItemProjectXAxe) new ItemProjectXAxe(white).setUnlocalizedName("axeWhite");
		pickaxeWhite = (ItemProjectXPickaxe) new ItemProjectXPickaxe(white).setUnlocalizedName("pickaxeWhite");

		popcorn = (ItemPopcorn) new ItemPopcorn().setUnlocalizedName("popcorn").setTextureName(ProjectX.MODID + ":popcorn");
		corn = (ItemFood) new ItemFood(3, false).setUnlocalizedName("corn").setCreativeTab(ProjectXTabs.tabProjectXWorld).setTextureName(ProjectX.MODID + ":corn");
		cornOnTheCob = (ItemFood) new ItemFood(6, false).setUnlocalizedName("cornOnTheCob").setCreativeTab(ProjectXTabs.tabProjectXWorld).setTextureName(ProjectX.MODID + ":cornOnTheCob");
		cornSeeds = new ItemCornSeed().setUnlocalizedName("cornSeeds").setCreativeTab(ProjectXTabs.tabProjectXWorld).setTextureName(ProjectX.MODID + ":popcornSeeds");

		tomatoSeeds = new Item().setUnlocalizedName("tomatoSeeds").setTextureName(ProjectX.MODID + ":tomatoSeeds");//.setCreativeTab(ProjectXTabs.tabProjectXWorld);
		tomato = (ItemFood) new ItemFood(3, false).setUnlocalizedName("tomato").setTextureName(ProjectX.MODID + ":tomato");//.setCreativeTab(ProjectXTabs.tabProjectXWorld);

		henequenSeeds = new Item().setUnlocalizedName("henequenSeeds").setTextureName(ProjectX.MODID + ":henequenSeeds");//.setCreativeTab(ProjectXTabs.tabProjectXWorld);
		twine = new Item().setUnlocalizedName("twine").setTextureName(ProjectX.MODID + ":twine").setCreativeTab(ProjectXTabs.tabProjectXWorld);
		henequenLeaf = new Item().setUnlocalizedName("henequenLeaf").setTextureName(ProjectX.MODID + ":henequenLeaf");//.setCreativeTab(ProjectXTabs.tabProjectXWorld)

		sulfur = new Item().setUnlocalizedName("sulfur").setCreativeTab(ProjectXTabs.tabProjectXWorld).setTextureName(ProjectX.MODID + ":sulfur");
		aluminum = new Item().setUnlocalizedName("aluminum").setCreativeTab(ProjectXTabs.tabProjectXWorld).setTextureName(ProjectX.MODID +":aluminum");

		GameRegistry.registerItem(xychorium, xychorium.getUnlocalizedName());
		GameRegistry.registerItem(xychoridite, xychoridite.getUnlocalizedName());

		GameRegistry.registerItem(shovelBlack, shovelBlack.getUnlocalizedName());
		GameRegistry.registerItem(swordBlack, swordBlack.getUnlocalizedName());
		GameRegistry.registerItem(hoeBlack, hoeBlack.getUnlocalizedName());
		GameRegistry.registerItem(axeBlack, axeBlack.getUnlocalizedName());
		GameRegistry.registerItem(pickaxeBlack, pickaxeBlack.getUnlocalizedName());

		GameRegistry.registerItem(shovelBlue, shovelBlue.getUnlocalizedName());
		GameRegistry.registerItem(swordBlue, swordBlue.getUnlocalizedName());
		GameRegistry.registerItem(hoeBlue, hoeBlue.getUnlocalizedName());
		GameRegistry.registerItem(axeBlue, axeBlue.getUnlocalizedName());
		GameRegistry.registerItem(pickaxeBlue, pickaxeBlue.getUnlocalizedName());

		GameRegistry.registerItem(shovelGreen, shovelGreen.getUnlocalizedName());
		GameRegistry.registerItem(swordGreen, swordGreen.getUnlocalizedName());
		GameRegistry.registerItem(hoeGreen, hoeGreen.getUnlocalizedName());
		GameRegistry.registerItem(axeGreen, axeGreen.getUnlocalizedName());
		GameRegistry.registerItem(pickaxeGreen, pickaxeGreen.getUnlocalizedName());

		GameRegistry.registerItem(shovelRed, shovelRed.getUnlocalizedName());
		GameRegistry.registerItem(swordRed, swordRed.getUnlocalizedName());
		GameRegistry.registerItem(hoeRed, hoeRed.getUnlocalizedName());
		GameRegistry.registerItem(axeRed, axeRed.getUnlocalizedName());
		GameRegistry.registerItem(pickaxeRed, pickaxeRed.getUnlocalizedName());

		GameRegistry.registerItem(shovelWhite, shovelWhite.getUnlocalizedName());
		GameRegistry.registerItem(swordWhite, swordWhite.getUnlocalizedName());
		GameRegistry.registerItem(hoeWhite, hoeWhite.getUnlocalizedName());
		GameRegistry.registerItem(axeWhite, axeWhite.getUnlocalizedName());
		GameRegistry.registerItem(pickaxeWhite, pickaxeWhite.getUnlocalizedName());

		GameRegistry.registerItem(popcorn, popcorn.getUnlocalizedName());
		GameRegistry.registerItem(corn, corn.getUnlocalizedName());
		GameRegistry.registerItem(cornOnTheCob, cornOnTheCob.getUnlocalizedName());
		GameRegistry.registerItem(cornSeeds, cornSeeds.getUnlocalizedName());

		GameRegistry.registerItem(tomatoSeeds, tomatoSeeds.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());

		GameRegistry.registerItem(henequenSeeds, henequenSeeds.getUnlocalizedName());
		GameRegistry.registerItem(henequenLeaf, henequenLeaf.getUnlocalizedName());
		GameRegistry.registerItem(twine, twine.getUnlocalizedName());

		GameRegistry.registerItem(sulfur, sulfur.getUnlocalizedName());
		GameRegistry.registerItem(aluminum, aluminum.getUnlocalizedName());
	}
}
