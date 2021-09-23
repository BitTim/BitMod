package com.bittim.bitmod.item;

import com.bittim.bitmod.setup.RegistryHandler;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> RAW_TITANIUM = RegistryHandler.ITEMS.register("raw_titanium", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = RegistryHandler.ITEMS.register("titanium_ingot", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLD_INGOT = RegistryHandler.ITEMS.register("hardened_gold_ingot", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLD_UPGRADE_KIT = RegistryHandler.ITEMS.register("hardened_gold_upgrade_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    

    public static final RegistryObject<Item> HARDENED_GOLDEN_SWORD = RegistryHandler.ITEMS.register("hardened_golden_sword", () ->
        new SwordItem(ModItemTier.HARDENED_GOLD, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> HARDENED_GOLDEN_PICKAXE = RegistryHandler.ITEMS.register("hardened_golden_pickaxe", () ->
        new PickaxeItem(ModItemTier.HARDENED_GOLD, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_AXE = RegistryHandler.ITEMS.register("hardened_golden_axe", () ->
        new AxeItem(ModItemTier.HARDENED_GOLD, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_SHOVEL = RegistryHandler.ITEMS.register("hardened_golden_shovel", () ->
        new ShovelItem(ModItemTier.HARDENED_GOLD, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_HOE = RegistryHandler.ITEMS.register("hardened_golden_hoe", () ->
        new HoeItem(ModItemTier.HARDENED_GOLD, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));



    public static final RegistryObject<Item> HARDENED_GOLDEN_HELMET = RegistryHandler.ITEMS.register("hardened_golden_helmet", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> HARDENED_GOLDEN_CHESTPLATE = RegistryHandler.ITEMS.register("hardened_golden_chestplate", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_LEGGINGS = RegistryHandler.ITEMS.register("hardened_golden_leggings", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_BOOTS = RegistryHandler.ITEMS.register("hardened_golden_boots", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));



    public static void register() { }
}

