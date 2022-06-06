package mod.mcreator;

import net.minecraftforge.common.util.EnumHelper;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class mcreator_redstoneArmor {

	public mcreator_redstoneArmor() {
	}

	public static Item helmet;
	public static Item body;
	public static Item legs;
	public static Item boots;
	public Object instance;

	public void load() {
		GameRegistry.addRecipe(new ItemStack(helmet, 1), new Object[]{"X1X", "X4X", "XXX", Character.valueOf('1'),
				new ItemStack(mcreator_redstoneIngot.block, 1), Character.valueOf('4'), new ItemStack(Items.iron_helmet, 1),});
		GameRegistry.addRecipe(new ItemStack(body, 1), new Object[]{"X1X", "X4X", "XXX", Character.valueOf('1'),
				new ItemStack(mcreator_redstoneIngot.block, 1), Character.valueOf('4'), new ItemStack(Items.iron_chestplate, 1),});
		GameRegistry.addRecipe(new ItemStack(legs, 1), new Object[]{"X1X", "X4X", "XXX", Character.valueOf('1'),
				new ItemStack(mcreator_redstoneIngot.block, 1), Character.valueOf('4'), new ItemStack(Items.iron_leggings, 1),});
		GameRegistry.addRecipe(new ItemStack(boots, 1), new Object[]{"X1X", "X4X", "XXX", Character.valueOf('1'),
				new ItemStack(mcreator_redstoneIngot.block, 1), Character.valueOf('4'), new ItemStack(Items.iron_boots, 1),});
		helmet.setCreativeTab(CreativeTabs.tabCombat);
		body.setCreativeTab(CreativeTabs.tabCombat);
		legs.setCreativeTab(CreativeTabs.tabCombat);
		boots.setCreativeTab(CreativeTabs.tabCombat);
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
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("REDSTONEARMOR", 25, new int[]{2, 6, 5, 2}, 20);

		int armorPreffix = 0;
		if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
			armorPreffix = RenderingRegistry.addNewArmourRendererPrefix("redstonearmorlayer");
		helmet = (new ItemArmor(enuma, armorPreffix, 0) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("redstone_helmet").setTextureName("redstone_helmet");
		helmet.setMaxStackSize(1);
		body = (new ItemArmor(enuma, armorPreffix, 1) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("redstone_chestplate").setTextureName("redstone_chestplate");
		body.setMaxStackSize(1);
		legs = (new ItemArmor(enuma, armorPreffix, 2) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("redstone_leggings").setTextureName("redstone_leggings");
		legs.setMaxStackSize(1);
		boots = (new ItemArmor(enuma, armorPreffix, 3) {
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
				int i = (int) entity.posX;
				int j = (int) entity.posY;
				int k = (int) entity.posZ;
			}
		}).setUnlocalizedName("redstone_boots").setTextureName("redstone_boots");
		boots.setMaxStackSize(1);

		Item.itemRegistry.addObject(423, "redstone_helmet", helmet);
		Item.itemRegistry.addObject(424, "redstone_chestplate", body);
		Item.itemRegistry.addObject(425, "redstone_leggings", legs);
		Item.itemRegistry.addObject(426, "redstone_boots", boots);

	}

}
