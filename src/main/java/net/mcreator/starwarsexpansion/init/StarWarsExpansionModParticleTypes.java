
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LASER_PARTICLE = REGISTRY.register("laser_particle", () -> new SimpleParticleType(true));
}
