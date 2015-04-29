package jtrent238.swordcraft;



import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "swordcraft", name = "Sword Craft", version = "1.0.0")
public class SwordCraft {

	  public static Item itemTable;
	  public static Item itemSwordFragment;
	  public static Item itemdiamondFragment;
	  public static Item itemgoldFragment;
	  public static Item itememerldFragment;
	  public static Item itemironFragment;
	  public static Item itemcoalFragment;
	  public static Item itemlapizFragment;
	  public static Item itemredstoneFragment;
	  public static Item itemdiamondapple;
	  public static Item itemcoalapple;
	  public static Item itemredstoneapple;
	  public static Item itemgoldapple;
	  public static Item itememeraldapple;
	  public static Item itemlapizapple;
	  public static Item itemironapple;
	  public static Item itemcheese;
	  public static Item itemcheesesword;
	  public static Item itemcheeseaxe;
	  public static Item itemchessepickaxe;
	  public static Item itemcheesehoe;
	  public static Item itemcheeseshovel;
	  public static Item itemruby;
	  public static Item itemrubysword;
	  public static Item itemrubyaxe;
	  public static Item itemrubypickaxe;
	  public static Item itemrubyhoe;
	  public static Item itemrubyshovel;
	  public static Item itemgrilledcheese;
	  public static Item itemgrilledcheesesandwhich;
	  public static Item itemrainbowwand;
	  public static Item itemmagicwand;
	  public static Item itemendertear;
	  public static Item itemdiamondknife;
	  public static Item itemgoldknife;
	  public static Item itemwoodknife;
	  public static Item itemstoneknife;
	  public static Item itemironknife;
	  public static Item itemcheeseknife;
	  public static Item itembigdiamondsword;
	  public static Item itembiggoldsword;
	  public static Item itembigstonesword;
	  public static Item itembigwoodsword;
	  public static Item itembigironsword;
	  public static Item itembigcheesesword;
	  public static Item itembigrubysword;
	  public static Item itemgodsword;
	  public static Item itembonesword;
	  
	  
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//item/block init registing
		//config handling
		itemTable = new ItemTable().setUnlocalizedName("itemTable");
		GameRegistry.registerItem(itemTable, itemTable.getUnlocalizedName().substring(5));
		itemSwordFragment = new ItemSwordFragment().setUnlocalizedName("itemSwordFragment");
		GameRegistry.registerItem(itemSwordFragment, itemSwordFragment.getUnlocalizedName().substring(5));
		itemdiamondFragment = new ItemdiamondFragment().setUnlocalizedName("itemdiamondFragment").setTextureName("swordcraft:itemdiamondFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemdiamondFragment, itemdiamondFragment.getUnlocalizedName().substring(5));
		itemgoldFragment = new ItemgoldFragment().setUnlocalizedName("itemgoldFragment").setTextureName("swordcraft:itemgoldFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemgoldFragment, itemgoldFragment.getUnlocalizedName().substring(5));
		itememerldFragment = new ItememerldFragment().setUnlocalizedName("itememerldFragment").setTextureName("swordcraft:itememerldFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itememerldFragment, itememerldFragment.getUnlocalizedName().substring(5));
		itemironFragment = new ItemironFragment().setUnlocalizedName("itemironFragment").setTextureName("swordcraft:itemironFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemironFragment, itemironFragment.getUnlocalizedName().substring(5));
		itemcoalFragment = new ItemcoalFragment().setUnlocalizedName("itemcoalFragment").setTextureName("swordcraft:itemcoalFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemcoalFragment, itemcoalFragment.getUnlocalizedName().substring(5));
		itemlapizFragment = new ItemlapizFragment().setUnlocalizedName("itemlapizFragment").setTextureName("swordcraft:itemlapizFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemlapizFragment, itemlapizFragment.getUnlocalizedName().substring(5));
		itemredstoneFragment = new ItemredstoneFragment().setUnlocalizedName("itemredstoneFragment").setTextureName("swordcraft:itemredstoneFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemredstoneFragment, itemredstoneFragment.getUnlocalizedName().substring(5));
		 Item itemrainbowFragment = new ItemrainbowFragment().setUnlocalizedName("itemrainbowFragment").setTextureName("swordcraft:itemrainbowFragment").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrainbowFragment, itemrainbowFragment.getUnlocalizedName().substring(5));
		itemdiamondapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemdiamondapple").setTextureName("swordcraft:itemdiamondapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemdiamondapple, itemdiamondapple.getUnlocalizedName().substring(5));
		itemcoalapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemcoalapple").setTextureName("swordcraft:itemcoalapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemcoalapple, itemcoalapple.getUnlocalizedName().substring(5));
		itemgoldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemgoldapple").setTextureName("swordcraft:itemgoldapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemgoldapple, itemgoldapple.getUnlocalizedName().substring(5));
		itemredstoneapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemredstoneapple").setTextureName("swordcraft:itemredstoneapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemredstoneapple, itemredstoneapple.getUnlocalizedName().substring(5));
		itememeraldapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itememeraldapple").setTextureName("swordcraft:itememeraldapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itememeraldapple, itememeraldapple.getUnlocalizedName().substring(5));
		itemlapizapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemlapizapple").setTextureName("swordcraft:itemlapizapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemlapizapple, itemlapizapple.getUnlocalizedName().substring(5));
		itemironapple = new ItemFood(5, 0.2F, false).setUnlocalizedName("itemironapple").setTextureName("swordcraft:itemironapple").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemironapple, itemironapple.getUnlocalizedName().substring(5));
		itemcheese = new ItemFood(3, 0.2F, false).setUnlocalizedName("itemcheese");
		GameRegistry.registerItem(itemcheese, itemcheese.getUnlocalizedName().substring(5));
		itemgrilledcheese = new ItemFood(6, 0.2F, false).setUnlocalizedName("itemgrilledcheese");
		GameRegistry.registerItem(itemgrilledcheese, itemgrilledcheese.getUnlocalizedName().substring(5));
		itemrainbowwand = new Itemrainbowwand().setUnlocalizedName("itemrainbowwand").setTextureName("swordcraft:itemrainbowwand").setFull3D().setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrainbowwand, itemrainbowwand.getUnlocalizedName().substring(5));
		itemmagicwand = new Itemmagicwand().setUnlocalizedName("itemmagicwand").setTextureName("swordcraft:itemmagicwand").setFull3D().setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemmagicwand, itemmagicwand.getUnlocalizedName().substring(5));
		itemendertear = new Itemendertear().setUnlocalizedName("itemendertear").setTextureName("swordcraft:itemendertear").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemendertear, itemendertear.getUnlocalizedName().substring(5));
		itemdiamondknife = new Itemdiamondknife().setUnlocalizedName("itemdiamondknife").setFull3D().setTextureName("swordcraft:itemdiamondknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemdiamondknife, itemdiamondknife.getUnlocalizedName().substring(5));
		itemgoldknife = new Itemgoldknife().setUnlocalizedName("itemgoldknife").setFull3D().setTextureName("swordcraft:itemgoldknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemgoldknife, itemgoldknife.getUnlocalizedName().substring(5));
		itemwoodknife = new Itemwoodknife().setUnlocalizedName("itemwoodknife").setFull3D().setTextureName("swordcraft:itemwoodknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemwoodknife, itemwoodknife.getUnlocalizedName().substring(5));
		itemstoneknife = new Itemstoneknife().setUnlocalizedName("itemstoneknife").setFull3D().setTextureName("swordcraft:itemstoneknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemstoneknife, itemstoneknife.getUnlocalizedName().substring(5));
		itemironknife = new Itemironknife().setUnlocalizedName("itemironknife").setFull3D().setTextureName("swordcraft:itemironknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemironknife, itemironknife.getUnlocalizedName().substring(5));
		itemcheeseknife = new Itemcheeseknife().setUnlocalizedName("itemcheeseknife").setFull3D().setTextureName("swordcraft:itemcheeseknife").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemcheeseknife, itemcheeseknife.getUnlocalizedName().substring(5));
		itemruby = new Itemruby().setUnlocalizedName("itemruby").setFull3D().setTextureName("swordcraft:itemruby").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemruby, itemruby.getUnlocalizedName().substring(5));
		itemrubysword = new Itemrubysword().setUnlocalizedName("itemrubysword").setFull3D().setTextureName("swordcraft:itemrubysword").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubysword, itemrubysword.getUnlocalizedName().substring(5));
		itemrubyaxe = new Itemrubyaxe().setUnlocalizedName("itemrubyaxe").setFull3D().setTextureName("swordcraft:itemrubyaxe").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubyaxe, itemrubyaxe.getUnlocalizedName().substring(5));
		itemrubypickaxe = new Itemrubypickaxe().setUnlocalizedName("itemrubypickaxe").setFull3D().setTextureName("swordcraft:itemrubypickaxe").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubypickaxe, itemrubypickaxe.getUnlocalizedName().substring(5));
		itemrubyhoe = new Itemrubyhoe().setUnlocalizedName("itemrubyhoe").setFull3D().setTextureName("swordcraft:itemrubyhoe").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubyhoe, itemrubyhoe.getUnlocalizedName().substring(5));
		itemrubyshovel = new Itemrubyshovel().setUnlocalizedName("itemrubyshovel").setFull3D().setTextureName("swordcraft:itemrubyshovel").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubyshovel, itemrubyshovel.getUnlocalizedName().substring(5));
		itemrubysword = new Itemrubysword().setUnlocalizedName("itemrubysword").setFull3D().setTextureName("swordcraft:itemrubysword").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubysword, itemrubysword.getUnlocalizedName().substring(5));
		itemrubysword = new Itemrubysword().setUnlocalizedName("itemrubysword").setFull3D().setTextureName("swordcraft:itemrubysword").setCreativeTab(tabSwordCraft);
		GameRegistry.registerItem(itemrubysword, itemrubysword.getUnlocalizedName().substring(5));
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs tabSwordCraft = new CreativeTabs("tabSwordCraft"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Items.diamond_sword).getItem();
		}
	};
}
