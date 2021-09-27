package com.bittim.bitmod.data;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.ModItems;
import com.bittim.bitmod.setup.ModTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
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
        copy(ModTags.Blocks.REINFORCED_DIAMOND_BLOCKS, ModTags.Items.REINFORCED_DIAMOND_BLOCKS);
        copy(ModTags.Blocks.REINFORCED_NETHERITE_BLOCKS, ModTags.Items.REINFORCED_NETHERITE_BLOCKS);

        tag(ModTags.Items.HARDENED_GOLD_INGOT_ITEMS).add(ModItems.HARDENED_GOLD_INGOT.get());
        tag(ModTags.Items.TITANIUM_INGOT_ITEMS).add(ModItems.TITANIUM_INGOT.get());
        tag(ModTags.Items.REINFORCED_DIAMOND_ITEMS).add(ModItems.REINFORCED_DIAMOND.get());
        tag(ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS).add(ModItems.REINFORCED_NETHERITE_INGOT.get());

        tag(ModTags.Items.ALLOYABLE_ITEMS)
            .addTag(Tags.Items.INGOTS_IRON)
            .addTag(Tags.Items.INGOTS_GOLD)
            .addTag(Tags.Items.GEMS_DIAMOND)
            .addTag(Tags.Items.INGOTS_NETHERITE)
            .addTag(ModTags.Items.TITANIUM_INGOT_ITEMS);

        tag(ModTags.Items.ALLOY_ITEMS)
            .addTag(ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .addTag(ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .addTag(ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS);

        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        
        tag(Tags.Items.INGOTS)
            .addTag(ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .addTag(ModTags.Items.TITANIUM_INGOT_ITEMS)
            .addTag(ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS);
        
        tag(Tags.Items.GEMS).addTag(ModTags.Items.REINFORCED_DIAMOND_ITEMS);

        tag(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS).add(ModItems.HARDENED_GOLD_UPGRADE_KIT.get());
        tag(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS).add(ModItems.DIAMOND_UPGRADE_KIT.get());
        tag(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS).add(ModItems.DIAMOND_REINFORCEMENT_KIT.get());
        tag(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS).add(ModItems.NETHERITE_REINFORCEMENT_KIT.get());
        tag(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS).add(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get());
    }
}
