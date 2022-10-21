package net.mcreator.test.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.mcreator.test.block.XpOreBlock;
import net.mcreator.test.block.SlimeOreBlock;
import net.mcreator.test.TestModElements;

import java.util.Map;

@TestModElements.ModElement.Tag
public class RandomeoreBlockDestroyedByPlayerProcedure extends TestModElements.ModElement {
	public RandomeoreBlockDestroyedByPlayerProcedure(TestModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RandomeoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RandomeoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RandomeoreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RandomeoreBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		boolean drop_roll = false;
		double roll = 0;
		double dropp_roll = 0;
		double drop_roll_notrare = 0;
		roll = (double) Math.random();
		dropp_roll = (double) (Math.random() * 3);
		drop_roll_notrare = (double) (Math.random() * 6);
		if (((roll) >= 0.9)) {
			for (int index0 = 0; index0 < (int) ((dropp_roll)); index0++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Items.DIAMOND, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index1 = 0; index1 < (int) ((drop_roll_notrare)); index1++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(SlimeOreBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((roll) >= 0.7) && ((roll) < 0.9))) {
			for (int index2 = 0; index2 < (int) ((drop_roll_notrare)); index2++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Items.LAPIS_LAZULI, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) ((dropp_roll)); index3++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(XpOreBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((roll) >= 0.4) && ((roll) < 0.7))) {
			for (int index4 = 0; index4 < (int) ((drop_roll_notrare)); index4++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.IRON_ORE, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < (int) ((dropp_roll)); index5++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(SlimeOreBlock.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((roll) >= 0.1) && ((roll) < 0.4))) {
			for (int index6 = 0; index6 < (int) ((drop_roll_notrare)); index6++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.GOLD_ORE, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index7 = 0; index7 < (int) ((dropp_roll)); index7++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Blocks.IRON_ORE, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index8 = 0; index8 < (int) ((drop_roll_notrare)); index8++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Items.REDSTONE, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((roll) >= 0) && ((roll) < 0.1))) {
			for (int index9 = 0; index9 < (int) ((dropp_roll)); index9++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(Items.EMERALD, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
