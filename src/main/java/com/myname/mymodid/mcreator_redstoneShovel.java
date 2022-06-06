package mod.mcreator;

import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.init.Items;

import java.util.Set;
import java.util.Random;
import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class mcreator_redstoneShovel {

	public mcreator_redstoneShovel() {
	}

	public static Item block;
	public static Object instance;

	public void load() {
		ItemStack stack = new ItemStack(block, 1);
		GameRegistry.addRecipe(stack, new Object[]{"X1X", "X4X", "XXX", Character.valueOf('1'), new ItemStack(mcreator_redstoneIngot.block, 1),
				Character.valueOf('4'), new ItemStack(Items.iron_shovel, 1),});
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	public void registerRenderers() {
	}

	static {
		Item.ToolMaterial enumt = EnumHelper.addToolMaterial("REDSTONESHOVEL", 2, 270, 7F, 3, 20);
		block = (Item) (new ItemSpade(enumt) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}).setUnlocalizedName("RedstoneShovel").setTextureName("redstone_shovel");
		Item.itemRegistry.addObject(431, "RedstoneShovel", block);

	}

}
