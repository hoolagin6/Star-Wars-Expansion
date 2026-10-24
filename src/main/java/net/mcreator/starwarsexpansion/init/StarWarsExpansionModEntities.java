
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.WampaEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekPinkEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekOrangeEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekDefaultEntity;
import net.mcreator.starwarsexpansion.entity.TwiLekBlueEntity;
import net.mcreator.starwarsexpansion.entity.TuskenRaiderEntity;
import net.mcreator.starwarsexpansion.entity.TauntaunSaddleEntity;
import net.mcreator.starwarsexpansion.entity.TauntaunEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.T3M4Entity;
import net.mcreator.starwarsexpansion.entity.SpeederBikeEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;
import net.mcreator.starwarsexpansion.entity.SkiffGuardEntity;
import net.mcreator.starwarsexpansion.entity.RodianRedEntity;
import net.mcreator.starwarsexpansion.entity.RodianGreenEntity;
import net.mcreator.starwarsexpansion.entity.RodianDefaultEntity;
import net.mcreator.starwarsexpansion.entity.RodianBlueEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidWhiteEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidPinkEntity;
import net.mcreator.starwarsexpansion.entity.ProtocolDroidGoldEntity;
import net.mcreator.starwarsexpansion.entity.PorgEntity;
import net.mcreator.starwarsexpansion.entity.PirateWestEntity;
import net.mcreator.starwarsexpansion.entity.PirateLizardEntity;
import net.mcreator.starwarsexpansion.entity.PirateHumanEntity;
import net.mcreator.starwarsexpansion.entity.PirateEntity;
import net.mcreator.starwarsexpansion.entity.MouseDroidEntity;
import net.mcreator.starwarsexpansion.entity.LaserProjectileEntity;
import net.mcreator.starwarsexpansion.entity.LandspeederEntity;
import net.mcreator.starwarsexpansion.entity.KryknaEntity;
import net.mcreator.starwarsexpansion.entity.JawaEntity;
import net.mcreator.starwarsexpansion.entity.IthorianEntity;
import net.mcreator.starwarsexpansion.entity.HuttEntity;
import net.mcreator.starwarsexpansion.entity.HumanEntity;
import net.mcreator.starwarsexpansion.entity.GonkDroidEntity;
import net.mcreator.starwarsexpansion.entity.GamorreanEntity;
import net.mcreator.starwarsexpansion.entity.EwokEntity;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;
import net.mcreator.starwarsexpansion.entity.EnemyLaserProjectileEntity;
import net.mcreator.starwarsexpansion.entity.CantinaBandEntity;
import net.mcreator.starwarsexpansion.entity.BrokenEscapePodEntity;
import net.mcreator.starwarsexpansion.entity.BrainWalkerEntity;
import net.mcreator.starwarsexpansion.entity.BibFortunaEntity;
import net.mcreator.starwarsexpansion.entity.BattleDroidEntity;
import net.mcreator.starwarsexpansion.entity.BanthaEntity;
import net.mcreator.starwarsexpansion.entity.BallDroidEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidRedEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidPinkEntity;
import net.mcreator.starwarsexpansion.entity.AstromechDroidBlueEntity;
import net.mcreator.starwarsexpansion.entity.ArgesFrogEntity;
import net.mcreator.starwarsexpansion.entity.AncientSithLordEntity;
import net.mcreator.starwarsexpansion.entity.ATSTEntity;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class StarWarsExpansionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, StarWarsExpansionMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AstromechDroidBlueEntity>> ASTROMECH_DROID_BLUE = register("astromech_droid_blue", EntityType.Builder.<AstromechDroidBlueEntity>of(AstromechDroidBlueEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtocolDroidGoldEntity>> PROTOCOL_DROID_GOLD = register("protocol_droid_gold", EntityType.Builder.<ProtocolDroidGoldEntity>of(ProtocolDroidGoldEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AstromechDroidRedEntity>> ASTROMECH_DROID_RED = register("astromech_droid_red", EntityType.Builder.<AstromechDroidRedEntity>of(AstromechDroidRedEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<AstromechDroidPinkEntity>> ASTROMECH_DROID_PINK = register("astromech_droid_pink", EntityType.Builder.<AstromechDroidPinkEntity>of(AstromechDroidPinkEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtocolDroidWhiteEntity>> PROTOCOL_DROID_WHITE = register("protocol_droid_white", EntityType.Builder.<ProtocolDroidWhiteEntity>of(ProtocolDroidWhiteEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ProtocolDroidPinkEntity>> PROTOCOL_DROID_PINK = register("protocol_droid_pink", EntityType.Builder.<ProtocolDroidPinkEntity>of(ProtocolDroidPinkEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GonkDroidEntity>> GONK_DROID = register("gonk_droid",
			EntityType.Builder.<GonkDroidEntity>of(GonkDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<LaserProjectileEntity>> LASER_PROJECTILE = register("laser_projectile", EntityType.Builder.<LaserProjectileEntity>of(LaserProjectileEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MouseDroidEntity>> MOUSE_DROID = register("mouse_droid", EntityType.Builder.<MouseDroidEntity>of(MouseDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).fireImmune().sized(0.3f, 0.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<RodianGreenEntity>> RODIAN_GREEN = register("rodian_green",
			EntityType.Builder.<RodianGreenEntity>of(RodianGreenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RodianBlueEntity>> RODIAN_BLUE = register("rodian_blue",
			EntityType.Builder.<RodianBlueEntity>of(RodianBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RodianRedEntity>> RODIAN_RED = register("rodian_red",
			EntityType.Builder.<RodianRedEntity>of(RodianRedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RodianDefaultEntity>> RODIAN_DEFAULT = register("rodian_default",
			EntityType.Builder.<RodianDefaultEntity>of(RodianDefaultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IthorianEntity>> ITHORIAN = register("ithorian",
			EntityType.Builder.<IthorianEntity>of(IthorianEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<JawaEntity>> JAWA = register("jawa",
			EntityType.Builder.<JawaEntity>of(JawaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TwiLekBlueEntity>> TWI_LEK_BLUE = register("twi_lek_blue",
			EntityType.Builder.<TwiLekBlueEntity>of(TwiLekBlueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TwiLekOrangeEntity>> TWI_LEK_ORANGE = register("twi_lek_orange",
			EntityType.Builder.<TwiLekOrangeEntity>of(TwiLekOrangeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TwiLekPinkEntity>> TWI_LEK_PINK = register("twi_lek_pink",
			EntityType.Builder.<TwiLekPinkEntity>of(TwiLekPinkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TwiLekDefaultEntity>> TWI_LEK_DEFAULT = register("twi_lek_default",
			EntityType.Builder.<TwiLekDefaultEntity>of(TwiLekDefaultEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TuskenRaiderEntity>> TUSKEN_RAIDER = register("tusken_raider",
			EntityType.Builder.<TuskenRaiderEntity>of(TuskenRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BanthaEntity>> BANTHA = register("bantha",
			EntityType.Builder.<BanthaEntity>of(BanthaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BattleDroidEntity>> BATTLE_DROID = register("battle_droid",
			EntityType.Builder.<BattleDroidEntity>of(BattleDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EnemyLaserProjectileEntity>> ENEMY_LASER_PROJECTILE = register("enemy_laser_projectile", EntityType.Builder.<EnemyLaserProjectileEntity>of(EnemyLaserProjectileEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.2f, 0.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<KryknaEntity>> KRYKNA = register("krykna",
			EntityType.Builder.<KryknaEntity>of(KryknaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ArgesFrogEntity>> ARGES_FROG = register("arges_frog",
			EntityType.Builder.<ArgesFrogEntity>of(ArgesFrogEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HumanEntity>> HUMAN = register("human",
			EntityType.Builder.<HumanEntity>of(HumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<LandspeederEntity>> LANDSPEEDER = register("landspeeder", EntityType.Builder.<LandspeederEntity>of(LandspeederEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<XWingEntity>> X_WING = register("x_wing",
			EntityType.Builder.<XWingEntity>of(XWingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<T3M4Entity>> T_3_M_4 = register("t_3_m_4",
			EntityType.Builder.<T3M4Entity>of(T3M4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpeederBikeEntity>> SPEEDER_BIKE = register("speeder_bike", EntityType.Builder.<SpeederBikeEntity>of(SpeederBikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TIEFighterEntity>> TIE_FIGHTER = register("tie_fighter", EntityType.Builder.<TIEFighterEntity>of(TIEFighterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).fireImmune().sized(2f, 4.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EscapePodEntity>> ESCAPE_POD = register("escape_pod",
			EntityType.Builder.<EscapePodEntity>of(EscapePodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(2f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrokenEscapePodEntity>> BROKEN_ESCAPE_POD = register("broken_escape_pod", EntityType.Builder.<BrokenEscapePodEntity>of(BrokenEscapePodEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<ATSTEntity>> ATST = register("atst",
			EntityType.Builder.<ATSTEntity>of(ATSTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(3f, 9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SnowspeederEntity>> SNOWSPEEDER = register("snowspeeder", EntityType.Builder.<SnowspeederEntity>of(SnowspeederEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TauntaunEntity>> TAUNTAUN = register("tauntaun",
			EntityType.Builder.<TauntaunEntity>of(TauntaunEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<TauntaunSaddleEntity>> TAUNTAUN_SADDLE = register("tauntaun_saddle",
			EntityType.Builder.<TauntaunSaddleEntity>of(TauntaunSaddleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<GamorreanEntity>> GAMORREAN = register("gamorrean",
			EntityType.Builder.<GamorreanEntity>of(GamorreanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HuttEntity>> HUTT = register("hutt",
			EntityType.Builder.<HuttEntity>of(HuttEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PirateLizardEntity>> PIRATE_LIZARD = register("pirate_lizard",
			EntityType.Builder.<PirateLizardEntity>of(PirateLizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PirateHumanEntity>> PIRATE_HUMAN = register("pirate_human",
			EntityType.Builder.<PirateHumanEntity>of(PirateHumanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PirateWestEntity>> PIRATE_WEST = register("pirate_west",
			EntityType.Builder.<PirateWestEntity>of(PirateWestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PirateEntity>> PIRATE = register("pirate",
			EntityType.Builder.<PirateEntity>of(PirateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EwokEntity>> EWOK = register("ewok",
			EntityType.Builder.<EwokEntity>of(EwokEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<PorgEntity>> PORG = register("porg",
			EntityType.Builder.<PorgEntity>of(PorgEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<BallDroidEntity>> BALL_DROID = register("ball_droid",
			EntityType.Builder.<BallDroidEntity>of(BallDroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AncientSithLordEntity>> ANCIENT_SITH_LORD = register("ancient_sith_lord", EntityType.Builder.<AncientSithLordEntity>of(AncientSithLordEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CantinaBandEntity>> CANTINA_BAND = register("cantina_band",
			EntityType.Builder.<CantinaBandEntity>of(CantinaBandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BrainWalkerEntity>> BRAIN_WALKER = register("brain_walker",
			EntityType.Builder.<BrainWalkerEntity>of(BrainWalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<WampaEntity>> WAMPA = register("wampa",
			EntityType.Builder.<WampaEntity>of(WampaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkiffGuardEntity>> SKIFF_GUARD = register("skiff_guard",
			EntityType.Builder.<SkiffGuardEntity>of(SkiffGuardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BibFortunaEntity>> BIB_FORTUNA = register("bib_fortuna", EntityType.Builder.<BibFortunaEntity>of(BibFortunaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			AstromechDroidBlueEntity.init();
			ProtocolDroidGoldEntity.init();
			AstromechDroidRedEntity.init();
			AstromechDroidPinkEntity.init();
			ProtocolDroidWhiteEntity.init();
			ProtocolDroidPinkEntity.init();
			GonkDroidEntity.init();
			MouseDroidEntity.init();
			RodianGreenEntity.init();
			RodianBlueEntity.init();
			RodianRedEntity.init();
			RodianDefaultEntity.init();
			IthorianEntity.init();
			JawaEntity.init();
			TwiLekBlueEntity.init();
			TwiLekOrangeEntity.init();
			TwiLekPinkEntity.init();
			TwiLekDefaultEntity.init();
			TuskenRaiderEntity.init();
			BanthaEntity.init();
			BattleDroidEntity.init();
			KryknaEntity.init();
			ArgesFrogEntity.init();
			HumanEntity.init();
			LandspeederEntity.init();
			XWingEntity.init();
			T3M4Entity.init();
			SpeederBikeEntity.init();
			TIEFighterEntity.init();
			EscapePodEntity.init();
			BrokenEscapePodEntity.init();
			ATSTEntity.init();
			SnowspeederEntity.init();
			TauntaunEntity.init();
			TauntaunSaddleEntity.init();
			GamorreanEntity.init();
			HuttEntity.init();
			PirateLizardEntity.init();
			PirateHumanEntity.init();
			PirateWestEntity.init();
			PirateEntity.init();
			EwokEntity.init();
			PorgEntity.init();
			BallDroidEntity.init();
			AncientSithLordEntity.init();
			CantinaBandEntity.init();
			BrainWalkerEntity.init();
			WampaEntity.init();
			SkiffGuardEntity.init();
			BibFortunaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ASTROMECH_DROID_BLUE.get(), AstromechDroidBlueEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_GOLD.get(), ProtocolDroidGoldEntity.createAttributes().build());
		event.put(ASTROMECH_DROID_RED.get(), AstromechDroidRedEntity.createAttributes().build());
		event.put(ASTROMECH_DROID_PINK.get(), AstromechDroidPinkEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_WHITE.get(), ProtocolDroidWhiteEntity.createAttributes().build());
		event.put(PROTOCOL_DROID_PINK.get(), ProtocolDroidPinkEntity.createAttributes().build());
		event.put(GONK_DROID.get(), GonkDroidEntity.createAttributes().build());
		event.put(MOUSE_DROID.get(), MouseDroidEntity.createAttributes().build());
		event.put(RODIAN_GREEN.get(), RodianGreenEntity.createAttributes().build());
		event.put(RODIAN_BLUE.get(), RodianBlueEntity.createAttributes().build());
		event.put(RODIAN_RED.get(), RodianRedEntity.createAttributes().build());
		event.put(RODIAN_DEFAULT.get(), RodianDefaultEntity.createAttributes().build());
		event.put(ITHORIAN.get(), IthorianEntity.createAttributes().build());
		event.put(JAWA.get(), JawaEntity.createAttributes().build());
		event.put(TWI_LEK_BLUE.get(), TwiLekBlueEntity.createAttributes().build());
		event.put(TWI_LEK_ORANGE.get(), TwiLekOrangeEntity.createAttributes().build());
		event.put(TWI_LEK_PINK.get(), TwiLekPinkEntity.createAttributes().build());
		event.put(TWI_LEK_DEFAULT.get(), TwiLekDefaultEntity.createAttributes().build());
		event.put(TUSKEN_RAIDER.get(), TuskenRaiderEntity.createAttributes().build());
		event.put(BANTHA.get(), BanthaEntity.createAttributes().build());
		event.put(BATTLE_DROID.get(), BattleDroidEntity.createAttributes().build());
		event.put(KRYKNA.get(), KryknaEntity.createAttributes().build());
		event.put(ARGES_FROG.get(), ArgesFrogEntity.createAttributes().build());
		event.put(HUMAN.get(), HumanEntity.createAttributes().build());
		event.put(LANDSPEEDER.get(), LandspeederEntity.createAttributes().build());
		event.put(X_WING.get(), XWingEntity.createAttributes().build());
		event.put(T_3_M_4.get(), T3M4Entity.createAttributes().build());
		event.put(SPEEDER_BIKE.get(), SpeederBikeEntity.createAttributes().build());
		event.put(TIE_FIGHTER.get(), TIEFighterEntity.createAttributes().build());
		event.put(ESCAPE_POD.get(), EscapePodEntity.createAttributes().build());
		event.put(BROKEN_ESCAPE_POD.get(), BrokenEscapePodEntity.createAttributes().build());
		event.put(ATST.get(), ATSTEntity.createAttributes().build());
		event.put(SNOWSPEEDER.get(), SnowspeederEntity.createAttributes().build());
		event.put(TAUNTAUN.get(), TauntaunEntity.createAttributes().build());
		event.put(TAUNTAUN_SADDLE.get(), TauntaunSaddleEntity.createAttributes().build());
		event.put(GAMORREAN.get(), GamorreanEntity.createAttributes().build());
		event.put(HUTT.get(), HuttEntity.createAttributes().build());
		event.put(PIRATE_LIZARD.get(), PirateLizardEntity.createAttributes().build());
		event.put(PIRATE_HUMAN.get(), PirateHumanEntity.createAttributes().build());
		event.put(PIRATE_WEST.get(), PirateWestEntity.createAttributes().build());
		event.put(PIRATE.get(), PirateEntity.createAttributes().build());
		event.put(EWOK.get(), EwokEntity.createAttributes().build());
		event.put(PORG.get(), PorgEntity.createAttributes().build());
		event.put(BALL_DROID.get(), BallDroidEntity.createAttributes().build());
		event.put(ANCIENT_SITH_LORD.get(), AncientSithLordEntity.createAttributes().build());
		event.put(CANTINA_BAND.get(), CantinaBandEntity.createAttributes().build());
		event.put(BRAIN_WALKER.get(), BrainWalkerEntity.createAttributes().build());
		event.put(WAMPA.get(), WampaEntity.createAttributes().build());
		event.put(SKIFF_GUARD.get(), SkiffGuardEntity.createAttributes().build());
		event.put(BIB_FORTUNA.get(), BibFortunaEntity.createAttributes().build());
	}
}
