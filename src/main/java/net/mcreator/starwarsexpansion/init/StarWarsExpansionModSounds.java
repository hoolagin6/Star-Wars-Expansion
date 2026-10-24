
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> SWING = REGISTRY.register("swing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "swing")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_ON = REGISTRY.register("lightsaber_on", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "lightsaber_on")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTSABER_OFF = REGISTRY.register("lightsaber_off", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "lightsaber_off")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MECHDROID_DEATH = REGISTRY.register("mechdroid_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "mechdroid_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MECHDROID_IDLE = REGISTRY.register("mechdroid_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "mechdroid_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PROTOCOLDROID_HURT = REGISTRY.register("protocoldroid_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "protocoldroid_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GONK_IDLE = REGISTRY.register("gonk_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "gonk_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BLASTER_SHOT = REGISTRY.register("blaster_shot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "blaster_shot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOUSEDROID_IDLE = REGISTRY.register("mousedroid_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "mousedroid_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RODIAN_DEATH = REGISTRY.register("rodian_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "rodian_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RODIAN_IDLE = REGISTRY.register("rodian_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "rodian_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RODIAN_HURT = REGISTRY.register("rodian_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "rodian_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITHORIAN_IDLE = REGISTRY.register("ithorian_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "ithorian_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITHORIAN_HURT = REGISTRY.register("ithorian_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "ithorian_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ITHORIAN_DEATH = REGISTRY.register("ithorian_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "ithorian_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JAWA_IDLE = REGISTRY.register("jawa_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "jawa_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JAWA_DEATH = REGISTRY.register("jawa_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "jawa_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TWILEK_IDLE = REGISTRY.register("twilek_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "twilek_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TUSKEN_IDLE = REGISTRY.register("tusken_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "tusken_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TUSKEN_DEATH = REGISTRY.register("tusken_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "tusken_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BANTHA_HURT = REGISTRY.register("bantha_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "bantha_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BANTHA_IDLE = REGISTRY.register("bantha_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "bantha_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DROID_IDLE = REGISTRY.register("droid_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "droid_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPACESHIP_IDLE = REGISTRY.register("spaceship_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "spaceship_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WESTAR_SHOT = REGISTRY.register("westar_shot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "westar_shot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TAUNTAUN_DEATH = REGISTRY.register("tauntaun_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "tauntaun_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TAUNTAUN_IDLE = REGISTRY.register("tauntaun_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "tauntaun_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_IDLE = REGISTRY.register("ewok_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "ewok_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EWOK_HURT = REGISTRY.register("ewok_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "ewok_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PORG_IDLE = REGISTRY.register("porg_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "porg_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BB_IDLE = REGISTRY.register("bb_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "bb_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SITH_IDLE = REGISTRY.register("sith_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "sith_idle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FORCE_LIGHTNING = REGISTRY.register("force_lightning", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "force_lightning")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SITH_DEATH = REGISTRY.register("sith_death", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "sith_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CANTINA_MUSIC = REGISTRY.register("cantina_music", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "cantina_music")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUTT_IDLE = REGISTRY.register("hutt_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("star_wars_expansion", "hutt_idle")));
}
