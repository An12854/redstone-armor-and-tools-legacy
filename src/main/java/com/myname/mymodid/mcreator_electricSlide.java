package mod.mcreator;

import net.minecraft.world.World;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.Achievement;
import net.minecraft.item.ItemStack;

import java.util.Random;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class mcreator_electricSlide {

	public mcreator_electricSlide() {
	}

	public Object instance;
	public static Achievement achievement = (new Achievement("achievement.electricSlide", "electricSlide", -7, -4, mcreator_redstoneArmor.body,
			AchievementList.acquireIron));

	public void load() {
		achievement.registerStat();
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
}
