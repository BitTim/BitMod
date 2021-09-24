package com.bittim.bitmod.data;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.ModItems;
import com.bittim.bitmod.setup.ModTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagProvider, BitMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        copy(ModTags.Blocks.TITANIUM_ORE_BLOCKS, ModTags.Items.TITANIUM_ORE_BLOCKS);
        copy(ModTags.Blocks.TITANIUM_BLOCKS, ModTags.Items.TITANIUM_BLOCKS);
        copy(ModTags.Blocks.HARDENED_GOLD_BLOCKS, ModTags.Items.HARDENED_GOLD_BLOCKS);

        tag(ModTags.Items.HARDENED_GOLD_INGOT_ITEMS).add(ModItems.HARDENED_GOLD_INGOT.get());
        tag(ModTags.Items.TITANIUM_INGOT_ITEMS).add(ModItems.TITANIUM_INGOT.get());

        tag(ModTags.Items.ALLOYABLE_ITEMS)
            .add(Items.IRON_INGOT)
            .add(Items.GOLD_INGOT)
            .add(Items.DIAMOND)
            .add(Items.NETHERITE_INGOT)
            .add(ModItems.TITANIUM_INGOT.get());

        tag(ModTags.Items.ALLOY_ITEMS).add(ModItems.HARDENED_GOLD_INGOT.get());

        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        
        tag(Tags.Items.INGOTS)
            .addTag(ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .addTag(ModTags.Items.TITANIUM_INGOT_ITEMS);
    }
}
