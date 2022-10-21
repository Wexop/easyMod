
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.TestMod;

public class TestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TestMod.MODID);
	public static final RegistryObject<SoundEvent> MINEUR = REGISTRY.register("mineur", () -> new SoundEvent(new ResourceLocation("test", "mineur")));
	public static final RegistryObject<SoundEvent> PAS_MINEUR = REGISTRY.register("pas_mineur",
			() -> new SoundEvent(new ResourceLocation("test", "pas_mineur")));
	public static final RegistryObject<SoundEvent> HURT_MINEUR = REGISTRY.register("hurt_mineur",
			() -> new SoundEvent(new ResourceLocation("test", "hurt_mineur")));
	public static final RegistryObject<SoundEvent> MINEUR_MEURS = REGISTRY.register("mineur_meurs",
			() -> new SoundEvent(new ResourceLocation("test", "mineur_meurs")));
	public static final RegistryObject<SoundEvent> ATTAQUE_MINEUR = REGISTRY.register("attaque_mineur",
			() -> new SoundEvent(new ResourceLocation("test", "attaque_mineur")));
	public static final RegistryObject<SoundEvent> ENDERPOULEVIE = REGISTRY.register("enderpoulevie",
			() -> new SoundEvent(new ResourceLocation("test", "enderpoulevie")));
	public static final RegistryObject<SoundEvent> ENDERPOULEPAS = REGISTRY.register("enderpoulepas",
			() -> new SoundEvent(new ResourceLocation("test", "enderpoulepas")));
	public static final RegistryObject<SoundEvent> ENDERPOULEAIE = REGISTRY.register("enderpouleaie",
			() -> new SoundEvent(new ResourceLocation("test", "enderpouleaie")));
	public static final RegistryObject<SoundEvent> ENDERPOULEMORT = REGISTRY.register("enderpoulemort",
			() -> new SoundEvent(new ResourceLocation("test", "enderpoulemort")));
}
