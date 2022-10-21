
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.test.world.features.ores.XpOreFeature;
import net.mcreator.test.world.features.ores.SlimeOreFeature;
import net.mcreator.test.world.features.ores.RandomeoreFeature;
import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber
public class TestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TestMod.MODID);
	public static final RegistryObject<Feature<?>> SLIME_ORE = REGISTRY.register("slime_ore", SlimeOreFeature::feature);
	public static final RegistryObject<Feature<?>> XP_ORE = REGISTRY.register("xp_ore", XpOreFeature::feature);
	public static final RegistryObject<Feature<?>> RANDOMEORE = REGISTRY.register("randomeore", RandomeoreFeature::feature);
}
