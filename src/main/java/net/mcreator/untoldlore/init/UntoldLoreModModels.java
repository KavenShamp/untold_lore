
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untoldlore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.untoldlore.client.model.Modelpillager_pants;
import net.mcreator.untoldlore.client.model.Modelpillager_helmet;
import net.mcreator.untoldlore.client.model.Modelpillager_gambeson;
import net.mcreator.untoldlore.client.model.Modelpillager_boots;
import net.mcreator.untoldlore.client.model.Modelpiglin_leggins;
import net.mcreator.untoldlore.client.model.Modelpiglin_helmet;
import net.mcreator.untoldlore.client.model.Modelpiglin_chestplate;
import net.mcreator.untoldlore.client.model.Modelpiglin_boots;
import net.mcreator.untoldlore.client.model.Modelhoglin_cloak;
import net.mcreator.untoldlore.client.model.Modelchampion_helmet;
import net.mcreator.untoldlore.client.model.Modelbeast_helmet;
import net.mcreator.untoldlore.client.model.ModelHoglin_cowl;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UntoldLoreModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbeast_helmet.LAYER_LOCATION, Modelbeast_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelpillager_boots.LAYER_LOCATION, Modelpillager_boots::createBodyLayer);
		event.registerLayerDefinition(Modelpiglin_leggins.LAYER_LOCATION, Modelpiglin_leggins::createBodyLayer);
		event.registerLayerDefinition(Modelpiglin_boots.LAYER_LOCATION, Modelpiglin_boots::createBodyLayer);
		event.registerLayerDefinition(Modelpillager_gambeson.LAYER_LOCATION, Modelpillager_gambeson::createBodyLayer);
		event.registerLayerDefinition(Modelpillager_pants.LAYER_LOCATION, Modelpillager_pants::createBodyLayer);
		event.registerLayerDefinition(Modelpiglin_chestplate.LAYER_LOCATION, Modelpiglin_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelpiglin_helmet.LAYER_LOCATION, Modelpiglin_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelchampion_helmet.LAYER_LOCATION, Modelchampion_helmet::createBodyLayer);
		event.registerLayerDefinition(Modelpillager_helmet.LAYER_LOCATION, Modelpillager_helmet::createBodyLayer);
		event.registerLayerDefinition(ModelHoglin_cowl.LAYER_LOCATION, ModelHoglin_cowl::createBodyLayer);
		event.registerLayerDefinition(Modelhoglin_cloak.LAYER_LOCATION, Modelhoglin_cloak::createBodyLayer);
	}
}
