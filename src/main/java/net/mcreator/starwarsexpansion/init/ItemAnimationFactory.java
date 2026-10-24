package net.mcreator.starwarsexpansion.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;

import net.mcreator.starwarsexpansion.item.XWingItemItem;
import net.mcreator.starwarsexpansion.item.Westar34Item;
import net.mcreator.starwarsexpansion.item.TIEFighterItemItem;
import net.mcreator.starwarsexpansion.item.SpeederBikeItemItem;
import net.mcreator.starwarsexpansion.item.SnowspeederItemItem;
import net.mcreator.starwarsexpansion.item.LightsaberGeoYellowItem;
import net.mcreator.starwarsexpansion.item.LightsaberGeoPurpleItem;
import net.mcreator.starwarsexpansion.item.LightsaberGeoItem;
import net.mcreator.starwarsexpansion.item.LightsaberGeoGreenItem;
import net.mcreator.starwarsexpansion.item.LighstanerGeoRedItem;
import net.mcreator.starwarsexpansion.item.LandspeederItemItem;
import net.mcreator.starwarsexpansion.item.EscapePodItemItem;
import net.mcreator.starwarsexpansion.item.EE3Item;
import net.mcreator.starwarsexpansion.item.DoubleLightsaberYellowItem;
import net.mcreator.starwarsexpansion.item.DoubleLightsaberRedItem;
import net.mcreator.starwarsexpansion.item.DoubleLightsaberPurpleItem;
import net.mcreator.starwarsexpansion.item.DoubleLightsaberGreenItem;
import net.mcreator.starwarsexpansion.item.DoubleLightsaberGeoItem;
import net.mcreator.starwarsexpansion.item.DL44Item;
import net.mcreator.starwarsexpansion.item.BlasterE11Item;
import net.mcreator.starwarsexpansion.item.ATSTItemItem;

@EventBusSubscriber
public class ItemAnimationFactory {
	@SubscribeEvent
	public static void animatedItems(PlayerTickEvent.Pre event) {
		String animation = "";
		ItemStack mainhandItem = event.getEntity().getMainHandItem().copy();
		ItemStack offhandItem = event.getEntity().getOffhandItem().copy();
		if ((mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem)) {
			if (mainhandItem.getItem() instanceof BlasterE11Item animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BlasterE11Item) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof BlasterE11Item animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((BlasterE11Item) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LandspeederItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LandspeederItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LandspeederItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LandspeederItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof XWingItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((XWingItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof XWingItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((XWingItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LightsaberGeoItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LightsaberGeoItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LighstanerGeoRedItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LighstanerGeoRedItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LighstanerGeoRedItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LighstanerGeoRedItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LightsaberGeoGreenItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoGreenItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LightsaberGeoGreenItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoGreenItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LightsaberGeoYellowItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoYellowItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LightsaberGeoYellowItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoYellowItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof LightsaberGeoPurpleItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoPurpleItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof LightsaberGeoPurpleItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((LightsaberGeoPurpleItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof SpeederBikeItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((SpeederBikeItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof SpeederBikeItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((SpeederBikeItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof TIEFighterItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((TIEFighterItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof TIEFighterItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((TIEFighterItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof EscapePodItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EscapePodItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof EscapePodItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EscapePodItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DL44Item animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DL44Item) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DL44Item animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DL44Item) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof Westar34Item animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((Westar34Item) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof Westar34Item animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((Westar34Item) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof EE3Item animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EE3Item) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof EE3Item animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((EE3Item) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof ATSTItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((ATSTItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof ATSTItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((ATSTItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof SnowspeederItemItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((SnowspeederItemItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof SnowspeederItemItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((SnowspeederItemItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DoubleLightsaberGeoItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberGeoItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DoubleLightsaberGeoItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberGeoItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DoubleLightsaberRedItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberRedItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DoubleLightsaberRedItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberRedItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DoubleLightsaberGreenItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberGreenItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DoubleLightsaberGreenItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberGreenItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DoubleLightsaberYellowItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberYellowItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DoubleLightsaberYellowItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberYellowItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof DoubleLightsaberPurpleItem animatable) {
				animation = mainhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getMainHandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberPurpleItem) event.getEntity().getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof DoubleLightsaberPurpleItem animatable) {
				animation = offhandItem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					CustomData.update(DataComponents.CUSTOM_DATA, event.getEntity().getOffhandItem(), tag -> tag.putString("geckoAnim", ""));
					if (event.getEntity().level().isClientSide()) {
						((DoubleLightsaberPurpleItem) event.getEntity().getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
		}
	}
}
