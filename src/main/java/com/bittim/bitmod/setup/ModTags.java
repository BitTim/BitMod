package com.bittim.bitmod.setup;

import com.bittim.bitmod.BitMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

@SuppressWarnings("all")
public class ModTags
{
    public static class Blocks
    {
        public static final ITag.INamedTag<Block> TITANIUM_ORE_BLOCKS = forge("ores/titanium");
        public static final ITag.INamedTag<Block> TITANIUM_BLOCKS = forge("storage_blocks/titanium");
        public static final ITag.INamedTag<Block> HARDENED_GOLD_BLOCKS = forge("storage_blocks/hardened_gold");

        private static ITag.INamedTag<Block> forge(String name)
        {
            return BlockTags.bind(new ResourceLocation("forge", name).toString());
        }

        private static ITag.INamedTag<Block> mod(String name)
        {
            return BlockTags.bind(new ResourceLocation(BitMod.MOD_ID, name).toString());
        }
    }

    public static class Items
    {
        public static final ITag.INamedTag<Item> TITANIUM_ORE_BLOCKS = forge("ores/titanium");
        public static final ITag.INamedTag<Item> TITANIUM_BLOCKS = forge("storage_blocks/titanium");
        public static final ITag.INamedTag<Item> HARDENED_GOLD_BLOCKS = forge("storage_blocks/hardened_gold");

        public static final ITag.INamedTag<Item> TITANIUM_INGOT_ITEMS = forge("ingots/titanium");
        public static final ITag.INamedTag<Item> HARDENED_GOLD_INGOT_ITEMS = forge("ingots/hardened_gold");

        public static final ITag.INamedTag<Item> ALLOYABLE_ITEMS = mod("alloyable");
        public static final ITag.INamedTag<Item> ALLOY_ITEMS = mod("alloy");

        private static ITag.INamedTag<Item> forge(String name)
        {
            return ItemTags.bind(new ResourceLocation("forge", name).toString());
        }

        private static ITag.INamedTag<Item> mod(String name)
        {
            return ItemTags.bind(new ResourceLocation(BitMod.MOD_ID, name).toString());
        }
    }
}
