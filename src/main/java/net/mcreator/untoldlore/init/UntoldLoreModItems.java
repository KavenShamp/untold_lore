
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untoldlore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.untoldlore.item.WarpedStickItem;
import net.mcreator.untoldlore.item.VindicatorAxeItem;
import net.mcreator.untoldlore.item.ScarletiteingotItem;
import net.mcreator.untoldlore.item.RavagerHornItem;
import net.mcreator.untoldlore.item.PillagsteelItem;
import net.mcreator.untoldlore.item.PillagerarmorItem;
import net.mcreator.untoldlore.item.PiglinarmorItem;
import net.mcreator.untoldlore.item.PiglinSicaItem;
import net.mcreator.untoldlore.item.PiglinShieldItem;
import net.mcreator.untoldlore.item.PiglinScissorItem;
import net.mcreator.untoldlore.item.PiglinBidentItem;
import net.mcreator.untoldlore.item.HoglinSkinItem;
import net.mcreator.untoldlore.item.HoglinRobeItem;
import net.mcreator.untoldlore.item.HoglinQuillsItem;
import net.mcreator.untoldlore.item.HoglinQuillsClothItem;
import net.mcreator.untoldlore.item.CrimsonStickItem;
import net.mcreator.untoldlore.item.ChampionhelmetItem;
import net.mcreator.untoldlore.item.BruteAxeItem;
import net.mcreator.untoldlore.item.BeasthelmetItem;
import net.mcreator.untoldlore.UntoldLoreMod;

public class UntoldLoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UntoldLoreMod.MODID);
	public static final RegistryObject<Item> PILLAGERARMOR_HELMET = REGISTRY.register("pillagerarmor_helmet", () -> new PillagerarmorItem.Helmet());
	public static final RegistryObject<Item> PILLAGERARMOR_CHESTPLATE = REGISTRY.register("pillagerarmor_chestplate",
			() -> new PillagerarmorItem.Chestplate());
	public static final RegistryObject<Item> PILLAGERARMOR_LEGGINGS = REGISTRY.register("pillagerarmor_leggings",
			() -> new PillagerarmorItem.Leggings());
	public static final RegistryObject<Item> PILLAGERARMOR_BOOTS = REGISTRY.register("pillagerarmor_boots", () -> new PillagerarmorItem.Boots());
	public static final RegistryObject<Item> PIGLINARMOR_HELMET = REGISTRY.register("piglinarmor_helmet", () -> new PiglinarmorItem.Helmet());
	public static final RegistryObject<Item> PIGLINARMOR_CHESTPLATE = REGISTRY.register("piglinarmor_chestplate",
			() -> new PiglinarmorItem.Chestplate());
	public static final RegistryObject<Item> PIGLINARMOR_LEGGINGS = REGISTRY.register("piglinarmor_leggings", () -> new PiglinarmorItem.Leggings());
	public static final RegistryObject<Item> PIGLINARMOR_BOOTS = REGISTRY.register("piglinarmor_boots", () -> new PiglinarmorItem.Boots());
	public static final RegistryObject<Item> CHAMPIONHELMET_HELMET = REGISTRY.register("championhelmet_helmet",
			() -> new ChampionhelmetItem.Helmet());
	public static final RegistryObject<Item> BEASTHELMET_HELMET = REGISTRY.register("beasthelmet_helmet", () -> new BeasthelmetItem.Helmet());
	public static final RegistryObject<Item> SCARLETITEINGOT = REGISTRY.register("scarletiteingot", () -> new ScarletiteingotItem());
	public static final RegistryObject<Item> PILLAGSTEEL = REGISTRY.register("pillagsteel", () -> new PillagsteelItem());
	public static final RegistryObject<Item> PIGLIN_SICKLE = REGISTRY.register("piglin_sickle", () -> new PiglinSicaItem());
	public static final RegistryObject<Item> PIGLIN_TRIDENT = REGISTRY.register("piglin_trident", () -> new PiglinBidentItem());
	public static final RegistryObject<Item> PIGLIN_CLAW = REGISTRY.register("piglin_claw", () -> new PiglinScissorItem());
	public static final RegistryObject<Item> BRUTE_AXE = REGISTRY.register("brute_axe", () -> new BruteAxeItem());
	public static final RegistryObject<Item> VINDICATOR_AXE = REGISTRY.register("vindicator_axe", () -> new VindicatorAxeItem());
	public static final RegistryObject<Item> PIGLIN_SHIELD = REGISTRY.register("piglin_shield", () -> new PiglinShieldItem());
	public static final RegistryObject<Item> HOGLIN_ROBE_HELMET = REGISTRY.register("hoglin_robe_helmet", () -> new HoglinRobeItem.Helmet());
	public static final RegistryObject<Item> HOGLIN_ROBE_CHESTPLATE = REGISTRY.register("hoglin_robe_chestplate",
			() -> new HoglinRobeItem.Chestplate());
	public static final RegistryObject<Item> CRIMSON_STICK = REGISTRY.register("crimson_stick", () -> new CrimsonStickItem());
	public static final RegistryObject<Item> WARPED_STICK = REGISTRY.register("warped_stick", () -> new WarpedStickItem());
	public static final RegistryObject<Item> HOGLIN_QUILLS = REGISTRY.register("hoglin_quills", () -> new HoglinQuillsItem());
	public static final RegistryObject<Item> HOGLIN_QUILLS_CLOTH = REGISTRY.register("hoglin_quills_cloth", () -> new HoglinQuillsClothItem());
	public static final RegistryObject<Item> RAVAGER_HORN = REGISTRY.register("ravager_horn", () -> new RavagerHornItem());
	public static final RegistryObject<Item> HOGLIN_SKIN = REGISTRY.register("hoglin_skin", () -> new HoglinSkinItem());
}
