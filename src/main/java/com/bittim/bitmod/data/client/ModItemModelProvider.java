package com.bittim.bitmod.data.client;

import com.bittim.bitmod.BitMod;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BitMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("titanium_ore", modLoc("block/titanium_ore"));
        withExistingParent("raw_titanium_block", modLoc("block/raw_titanium_block"));
        withExistingParent("titanium_block", modLoc("block/titanium_block"));
        withExistingParent("reinforced_diamond_block", modLoc("block/reinforced_diamond_block"));
        withExistingParent("reinforced_netherite_block", modLoc("block/reinforced_netherite_block"));
        withExistingParent("hardened_gold_block", modLoc("block/hardened_gold_block"));
        withExistingParent("alloy_furnace", modLoc("block/alloy_furnace"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        builder(itemGenerated, "raw_titanium");
        builder(itemGenerated, "titanium_ingot");
        builder(itemGenerated, "hardened_gold_ingot");
        builder(itemGenerated, "reinforced_diamond");
        builder(itemGenerated, "reinforced_netherite_ingot");
        builder(itemGenerated, "hardened_gold_upgrade_kit");
        builder(itemGenerated, "diamond_upgrade_kit");
        builder(itemGenerated, "diamond_reinforcement_kit");
        builder(itemGenerated, "netherite_reinforcement_kit");
        builder(itemGenerated, "reinforced_netherite_upgrade_kit");

        builder(itemHandheld, "hardened_golden_sword");
        builder(itemHandheld, "hardened_golden_pickaxe");
        builder(itemHandheld, "hardened_golden_axe");
        builder(itemHandheld, "hardened_golden_shovel");
        builder(itemHandheld, "hardened_golden_hoe");
        builder(itemHandheld, "titanium_sword");
        builder(itemHandheld, "titanium_pickaxe");
        builder(itemHandheld, "titanium_axe");
        builder(itemHandheld, "titanium_shovel");
        builder(itemHandheld, "titanium_hoe");
        builder(itemHandheld, "reinforced_diamond_sword");
        builder(itemHandheld, "reinforced_diamond_pickaxe");
        builder(itemHandheld, "reinforced_diamond_axe");
        builder(itemHandheld, "reinforced_diamond_shovel");
        builder(itemHandheld, "reinforced_diamond_hoe");
        builder(itemHandheld, "guilded_reinforced_diamond_sword");
        builder(itemHandheld, "guilded_reinforced_diamond_pickaxe");
        builder(itemHandheld, "guilded_reinforced_diamond_axe");
        builder(itemHandheld, "guilded_reinforced_diamond_shovel");
        builder(itemHandheld, "guilded_reinforced_diamond_hoe");
        builder(itemHandheld, "reinforced_netherite_sword");
        builder(itemHandheld, "reinforced_netherite_pickaxe");
        builder(itemHandheld, "reinforced_netherite_axe");
        builder(itemHandheld, "reinforced_netherite_shovel");
        builder(itemHandheld, "reinforced_netherite_hoe");
        builder(itemHandheld, "guilded_reinforced_netherite_sword");
        builder(itemHandheld, "guilded_reinforced_netherite_pickaxe");
        builder(itemHandheld, "guilded_reinforced_netherite_axe");
        builder(itemHandheld, "guilded_reinforced_netherite_shovel");
        builder(itemHandheld, "guilded_reinforced_netherite_hoe");

        builder(itemGenerated, "hardened_golden_helmet");
        builder(itemGenerated, "hardened_golden_chestplate");
        builder(itemGenerated, "hardened_golden_leggings");
        builder(itemGenerated, "hardened_golden_boots");
        builder(itemGenerated, "titanium_helmet");
        builder(itemGenerated, "titanium_chestplate");
        builder(itemGenerated, "titanium_leggings");
        builder(itemGenerated, "titanium_boots");
        builder(itemGenerated, "reinforced_diamond_helmet");
        builder(itemGenerated, "reinforced_diamond_chestplate");
        builder(itemGenerated, "reinforced_diamond_leggings");
        builder(itemGenerated, "reinforced_diamond_boots");
        builder(itemGenerated, "guilded_reinforced_diamond_helmet");
        builder(itemGenerated, "guilded_reinforced_diamond_chestplate");
        builder(itemGenerated, "guilded_reinforced_diamond_leggings");
        builder(itemGenerated, "guilded_reinforced_diamond_boots");
        builder(itemGenerated, "reinforced_netherite_helmet");
        builder(itemGenerated, "reinforced_netherite_chestplate");
        builder(itemGenerated, "reinforced_netherite_leggings");
        builder(itemGenerated, "reinforced_netherite_boots");
        builder(itemGenerated, "guilded_reinforced_netherite_helmet");
        builder(itemGenerated, "guilded_reinforced_netherite_chestplate");
        builder(itemGenerated, "guilded_reinforced_netherite_leggings");
        builder(itemGenerated, "guilded_reinforced_netherite_boots");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
