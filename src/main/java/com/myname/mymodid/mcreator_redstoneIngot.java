package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@SuppressWarnings("unchecked")
public class mcreator_redstoneIngot {

	public mcreator_redstoneIngot() {
	}

	public static Item block;
	public static Object instance;

	public void load() {

		GameRegistry.addSmelting(Items.redstone, new ItemStack(block), 1.0f);
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
		block = (new ItemredstoneIngot(427));
		Item.itemRegistry.addObject(427, "RedstoneIngot", block);

	}

	static class ItemredstoneIngot extends Item {

		public ItemredstoneIngot(int par1) {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("RedstoneIngot");
			setTextureName("redstone_ingot");
			setCreativeTab(CreativeTabs.tabRedstone);
		}

		public int getItemEnchantability() {
			return 0;
		}

		public int getMaxItemUseDuration(ItemStack par1ItemStack) {
			return 0;
		}

		public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
			return 1.0F;
		}

	}
}
