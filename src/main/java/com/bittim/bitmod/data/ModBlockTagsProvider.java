package com.bittim.bitmod.data;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.ModBlocks;
import com.bittim.bitmod.setup.ModTags;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, BitMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.TITANIUM_ORE_BLOCKS).add(ModBlocks.TITANIUM_ORE.get());
        tag(ModTags.Blocks.TITANIUM_BLOCKS).add(ModBlocks.TITANIUM_BLOCK.get());
        tag(ModTags.Blocks.HARDENED_GOLD_BLOCKS).add(ModBlocks.HARDENED_GOLD_BLOCK.get());
        tag(ModTags.Blocks.REINFORCED_DIAMOND_BLOCKS).add(ModBlocks.REINFORCED_DIAMOND_BLOCK.get());
        tag(ModTags.Blocks.REINFORCED_NETHERITE_BLOCKS).add(ModBlocks.REINFORCED_NETHERITE_BLOCK.get());
        
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.TITANIUM_ORE_BLOCKS);
        tag(Tags.Blocks.STORAGE_BLOCKS)
            .addTag(ModTags.Blocks.TITANIUM_BLOCKS)
            .addTag(ModTags.Blocks.HARDENED_GOLD_BLOCKS)
            .addTag(ModTags.Blocks.REINFORCED_DIAMOND_BLOCKS)
            .addTag(ModTags.Blocks.REINFORCED_NETHERITE_BLOCKS);
    }
}
