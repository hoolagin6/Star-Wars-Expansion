package net.mcreator.starwarsexpansion.procedures;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.phys.Vec3;

import net.mcreator.starwarsexpansion.entity.AncientSithLordEntity;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AncientSithLordAttackProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingIncomingDamageEvent event) {
        if (event != null && event.getEntity() != null && event.getSource().getEntity() != null) {
            execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(),
                    event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        execute(null, world, x, y, z, entity, sourceentity);
    }

    private static void execute(@Nullable LivingIncomingDamageEvent event, LevelAccessor world, double x, double y, double z,
                                Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null)
            return;

        if (sourceentity instanceof AncientSithLordEntity sith) {
            if (event != null) {
                event.setCanceled(true);
            }

            // Selección aleatoria entre las dos animaciones
            String animation = Math.random() < 0.5 ? "attack1" : "attack2";
            sith.setAnimation(animation);

            // Reproducir sonido según la animación
            if (world instanceof Level level) {
                ResourceLocation soundID = animation.equals("attack1")
                        ? ResourceLocation.parse("star_wars_expansion:force_lightning")
                        : ResourceLocation.parse("star_wars_expansion:swing");

                if (!level.isClientSide()) {
                    level.playSound(null, BlockPos.containing(x, y, z),
                            BuiltInRegistries.SOUND_EVENT.get(soundID),
                            SoundSource.NEUTRAL, 1, 1);
                } else {
                    level.playLocalSound(x, y, z,
                            BuiltInRegistries.SOUND_EVENT.get(soundID),
                            SoundSource.NEUTRAL, 1, 1, false);
                }
            }

            // Slowness temporal al atacante (5 ticks)
            if (sourceentity instanceof LivingEntity living && !living.level().isClientSide()) {
                living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 9, false, false));
            }

            // Daño después de 0.25 segundos (5 ticks)
            StarWarsExpansionMod.queueServerWork(5, () -> {
                double range = animation.equals("attack1") ? 3.0 : 2.0;
                double distance = sourceentity.distanceTo(entity);

                if (distance <= range && (sourceentity instanceof LivingEntity le ? le.hasLineOfSight(entity) : false)) {
                    if (!(entity instanceof LivingEntity target && target.isUsingItem() &&
                            target.getUseItem().getItem().equals(Items.SHIELD))) {

                        // Daño base
                        entity.hurt(new DamageSource(world.registryAccess()
                                .registryOrThrow(Registries.DAMAGE_TYPE)
                                .getHolderOrThrow(DamageTypes.GENERIC)), 3);

                        // Empuje solo en el ataque de rayo (attack1)
                        if (animation.equals("attack1")) {
                            Vec3 look = sourceentity.getLookAngle().normalize();
                            entity.setDeltaMovement(look.scale(4).x, 0.3, look.scale(4).z);
                            entity.hurtMarked = true;
                        }

                    } else {
                        // Sonido de bloqueo con escudo
                        if (world instanceof Level level) {
                            if (!level.isClientSide()) {
                                level.playSound(null, BlockPos.containing(x, y, z),
                                        BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.shield.block")),
                                        SoundSource.NEUTRAL, 1, 1);
                            } else {
                                level.playLocalSound(x, y, z,
                                        BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.shield.block")),
                                        SoundSource.NEUTRAL, 1, 1, false);
                            }
                        }
                    }
                }
            });
        }
    }
}
