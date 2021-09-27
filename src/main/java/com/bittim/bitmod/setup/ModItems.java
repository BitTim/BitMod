package com.bittim.bitmod.setup;

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
    public static final RegistryObject<Item> RAW_TITANIUM = Registration.ITEMS.register("raw_titanium", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_INGOT = Registration.ITEMS.register("titanium_ingot", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLD_INGOT = Registration.ITEMS.register("hardened_gold_ingot", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND = Registration.ITEMS.register("reinforced_diamond", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_INGOT = Registration.ITEMS.register("reinforced_netherite_ingot", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));




    public static final RegistryObject<Item> HARDENED_GOLD_UPGRADE_KIT = Registration.ITEMS.register("hardened_gold_upgrade_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> DIAMOND_UPGRADE_KIT = Registration.ITEMS.register("diamond_upgrade_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> DIAMOND_REINFORCEMENT_KIT = Registration.ITEMS.register("diamond_reinforcement_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> NETHERITE_REINFORCEMENT_KIT = Registration.ITEMS.register("netherite_reinforcement_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_UPGRADE_KIT = Registration.ITEMS.register("reinforced_netherite_upgrade_kit", () ->
        new Item(new Item.Properties().tab(ModItemGroup.BITMOD_ITEMS_GROUP)));

    


    public static final RegistryObject<Item> HARDENED_GOLDEN_SWORD = Registration.ITEMS.register("hardened_golden_sword", () ->
        new SwordItem(ModItemTier.HARDENED_GOLD, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> HARDENED_GOLDEN_PICKAXE = Registration.ITEMS.register("hardened_golden_pickaxe", () ->
        new PickaxeItem(ModItemTier.HARDENED_GOLD, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_AXE = Registration.ITEMS.register("hardened_golden_axe", () ->
        new AxeItem(ModItemTier.HARDENED_GOLD, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_SHOVEL = Registration.ITEMS.register("hardened_golden_shovel", () ->
        new ShovelItem(ModItemTier.HARDENED_GOLD, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_HOE = Registration.ITEMS.register("hardened_golden_hoe", () ->
        new HoeItem(ModItemTier.HARDENED_GOLD, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
        
    public static final RegistryObject<Item> TITANIUM_SWORD = Registration.ITEMS.register("titanium_sword", () ->
        new SwordItem(ModItemTier.TITANIUM, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = Registration.ITEMS.register("titanium_pickaxe", () ->
        new PickaxeItem(ModItemTier.TITANIUM, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_AXE = Registration.ITEMS.register("titanium_axe", () ->
        new AxeItem(ModItemTier.TITANIUM, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = Registration.ITEMS.register("titanium_shovel", () ->
        new ShovelItem(ModItemTier.TITANIUM, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HOE = Registration.ITEMS.register("titanium_hoe", () ->
        new HoeItem(ModItemTier.TITANIUM, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_SWORD = Registration.ITEMS.register("reinforced_diamond_sword", () ->
        new SwordItem(ModItemTier.REINFORCED_DIAMOND, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> REINFORCED_DIAMOND_PICKAXE = Registration.ITEMS.register("reinforced_diamond_pickaxe", () ->
        new PickaxeItem(ModItemTier.REINFORCED_DIAMOND, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_AXE = Registration.ITEMS.register("reinforced_diamond_axe", () ->
        new AxeItem(ModItemTier.REINFORCED_DIAMOND, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_SHOVEL = Registration.ITEMS.register("reinforced_diamond_shovel", () ->
        new ShovelItem(ModItemTier.REINFORCED_DIAMOND, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_HOE = Registration.ITEMS.register("reinforced_diamond_hoe", () ->
        new HoeItem(ModItemTier.REINFORCED_DIAMOND, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_SWORD = Registration.ITEMS.register("guilded_reinforced_diamond_sword", () ->
        new SwordItem(ModItemTier.GUILDED_REINFORCED_DIAMOND, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_PICKAXE = Registration.ITEMS.register("guilded_reinforced_diamond_pickaxe", () ->
        new PickaxeItem(ModItemTier.GUILDED_REINFORCED_DIAMOND, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_AXE = Registration.ITEMS.register("guilded_reinforced_diamond_axe", () ->
        new AxeItem(ModItemTier.GUILDED_REINFORCED_DIAMOND, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_SHOVEL = Registration.ITEMS.register("guilded_reinforced_diamond_shovel", () ->
        new ShovelItem(ModItemTier.GUILDED_REINFORCED_DIAMOND, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_HOE = Registration.ITEMS.register("guilded_reinforced_diamond_hoe", () ->
        new HoeItem(ModItemTier.GUILDED_REINFORCED_DIAMOND, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_SWORD = Registration.ITEMS.register("reinforced_netherite_sword", () ->
        new SwordItem(ModItemTier.REINFORCED_NETHERITE, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> REINFORCED_NETHERITE_PICKAXE = Registration.ITEMS.register("reinforced_netherite_pickaxe", () ->
        new PickaxeItem(ModItemTier.REINFORCED_NETHERITE, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_AXE = Registration.ITEMS.register("reinforced_netherite_axe", () ->
        new AxeItem(ModItemTier.REINFORCED_NETHERITE, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_SHOVEL = Registration.ITEMS.register("reinforced_netherite_shovel", () ->
        new ShovelItem(ModItemTier.REINFORCED_NETHERITE, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_HOE = Registration.ITEMS.register("reinforced_netherite_hoe", () ->
        new HoeItem(ModItemTier.REINFORCED_NETHERITE, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_SWORD = Registration.ITEMS.register("guilded_reinforced_netherite_sword", () ->
        new SwordItem(ModItemTier.GUILDED_REINFORCED_NETHERITE, 3, -2.4f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));
    
    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_PICKAXE = Registration.ITEMS.register("guilded_reinforced_netherite_pickaxe", () ->
        new PickaxeItem(ModItemTier.GUILDED_REINFORCED_NETHERITE, 1, -2.8f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_AXE = Registration.ITEMS.register("guilded_reinforced_netherite_axe", () ->
        new AxeItem(ModItemTier.GUILDED_REINFORCED_NETHERITE, 6, -3.1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_SHOVEL = Registration.ITEMS.register("guilded_reinforced_netherite_shovel", () ->
        new ShovelItem(ModItemTier.GUILDED_REINFORCED_NETHERITE, 1.5f, -3f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_HOE = Registration.ITEMS.register("guilded_reinforced_netherite_hoe", () ->
        new HoeItem(ModItemTier.GUILDED_REINFORCED_NETHERITE, -2, -1f, new Item.Properties().tab(ModItemGroup.BITMOD_TOOLS_GROUP)));




    public static final RegistryObject<Item> HARDENED_GOLDEN_HELMET = Registration.ITEMS.register("hardened_golden_helmet", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> HARDENED_GOLDEN_CHESTPLATE = Registration.ITEMS.register("hardened_golden_chestplate", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_LEGGINGS = Registration.ITEMS.register("hardened_golden_leggings", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_BOOTS = Registration.ITEMS.register("hardened_golden_boots", () ->
        new ArmorItem(ModArmorMaterial.HARDENED_GOLD, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_HELMET = Registration.ITEMS.register("titanium_helmet", () ->
        new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = Registration.ITEMS.register("titanium_chestplate", () ->
        new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = Registration.ITEMS.register("titanium_leggings", () ->
        new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = Registration.ITEMS.register("titanium_boots", () ->
        new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_HELMET = Registration.ITEMS.register("reinforced_diamond_helmet", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> REINFORCED_DIAMOND_CHESTPLATE = Registration.ITEMS.register("reinforced_diamond_chestplate", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_LEGGINGS = Registration.ITEMS.register("reinforced_diamond_leggings", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_DIAMOND_BOOTS = Registration.ITEMS.register("reinforced_diamond_boots", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_HELMET = Registration.ITEMS.register("guilded_reinforced_diamond_helmet", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_DIAMOND, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_CHESTPLATE = Registration.ITEMS.register("guilded_reinforced_diamond_chestplate", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_DIAMOND, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_LEGGINGS = Registration.ITEMS.register("guilded_reinforced_diamond_leggings", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_DIAMOND, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_DIAMOND_BOOTS = Registration.ITEMS.register("guilded_reinforced_diamond_boots", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_DIAMOND, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_HELMET = Registration.ITEMS.register("reinforced_netherite_helmet", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> REINFORCED_NETHERITE_CHESTPLATE = Registration.ITEMS.register("reinforced_netherite_chestplate", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_LEGGINGS = Registration.ITEMS.register("reinforced_netherite_leggings", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> REINFORCED_NETHERITE_BOOTS = Registration.ITEMS.register("reinforced_netherite_boots", () ->
        new ArmorItem(ModArmorMaterial.REINFORCED_NETHERITE, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_HELMET = Registration.ITEMS.register("guilded_reinforced_netherite_helmet", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_NETHERITE, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));
    
    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_CHESTPLATE = Registration.ITEMS.register("guilded_reinforced_netherite_chestplate", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_NETHERITE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_LEGGINGS = Registration.ITEMS.register("guilded_reinforced_netherite_leggings", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_NETHERITE, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));

    public static final RegistryObject<Item> GUILDED_REINFORCED_NETHERITE_BOOTS = Registration.ITEMS.register("guilded_reinforced_netherite_boots", () ->
        new ArmorItem(ModArmorMaterial.GUILDED_REINFORCED_NETHERITE, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroup.BITMOD_ARMOR_GROUP)));



    public static void register() { }
}

