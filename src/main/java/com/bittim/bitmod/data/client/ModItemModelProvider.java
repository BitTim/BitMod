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
        withExistingParent("hardened_gold_block", modLoc("block/hardened_gold_block"));
        withExistingParent("alloy_furnace", modLoc("block/alloy_furnace"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        builder(itemGenerated, "raw_titanium");
        builder(itemGenerated, "titanium_ingot");
        builder(itemGenerated, "hardened_gold_ingot");
        builder(itemGenerated, "hardened_gold_upgrade_kit");

        builder(itemHandheld, "hardened_golden_sword");
        builder(itemHandheld, "hardened_golden_pickaxe");
        builder(itemHandheld, "hardened_golden_axe");
        builder(itemHandheld, "hardened_golden_shovel");
        builder(itemHandheld, "hardened_golden_hoe");

        builder(itemGenerated, "hardened_golden_helmet");
        builder(itemGenerated, "hardened_golden_chestplate");
        builder(itemGenerated, "hardened_golden_leggings");
        builder(itemGenerated, "hardened_golden_boots");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
