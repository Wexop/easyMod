
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.XpOreBlock;
import net.mcreator.test.block.SlimeOreBlock;
import net.mcreator.test.block.RandomeoreBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> SLIME_ORE = REGISTRY.register("slime_ore", () -> new SlimeOreBlock());
	public static final RegistryObject<Block> XP_ORE = REGISTRY.register("xp_ore", () -> new XpOreBlock());
	public static final RegistryObject<Block> RANDOMEORE = REGISTRY.register("randomeore", () -> new RandomeoreBlock());
}
