package net.mcreator.test.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.test.init.TestModBlocks;

public class RandomeoreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean drop_roll = false;
		double roll = 0;
		double dropp_roll = 0;
		double drop_roll_notrare = 0;
		roll = Math.random();
		dropp_roll = Math.random() * 3;
		drop_roll_notrare = Math.random() * 6;
		if (roll >= 0.95) {
			for (int index0 = 0; index0 < (int) (dropp_roll); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index1 = 0; index1 < (int) (drop_roll_notrare); index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TestModBlocks.SLIME_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (roll >= 0.85 && roll < 0.95) {
			for (int index2 = 0; index2 < (int) (drop_roll_notrare); index2++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.LAPIS_LAZULI));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) (dropp_roll); index3++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TestModBlocks.XP_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (roll >= 0.4 && roll < 0.85) {
			for (int index4 = 0; index4 < (int) (drop_roll_notrare); index4++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.IRON_ORE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index5 = 0; index5 < (int) (dropp_roll); index5++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(TestModBlocks.SLIME_ORE.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (roll >= 0.05 && roll < 0.4) {
			for (int index6 = 0; index6 < (int) (drop_roll_notrare); index6++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.GOLD_ORE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index7 = 0; index7 < (int) (dropp_roll); index7++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.IRON_ORE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			for (int index8 = 0; index8 < (int) (drop_roll_notrare); index8++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.REDSTONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (roll >= 0 && roll < 0.05) {
			for (int index9 = 0; index9 < (int) (dropp_roll); index9++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
