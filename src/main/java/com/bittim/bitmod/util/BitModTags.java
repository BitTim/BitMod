package com.bittim.bitmod.util;

import com.bittim.bitmod.BitMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class BitModTags
{
    public static class Blocks
    {
        public static final Tags.IOptionalNamedTag<Block> TITANIUM_ORE_BLOCKS = createTag("ore/titanium", true);
        public static final Tags.IOptionalNamedTag<Block> TITANIUM_BLOCKS = createTag("block/titanium", true);
        public static final Tags.IOptionalNamedTag<Block> HARDENED_GOLD_BLOCKS = createTag("block/hardened_gold", true);

        private static Tags.IOptionalNamedTag<Block> createTag(String name, boolean forge)
        {
            return BlockTags.createOptional(new ResourceLocation(forge ? "forge" : BitMod.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final Tags.IOptionalNamedTag<Item> RAW_TITANIUM_ITEMS = createTag("raw/titanium", true);
        public static final Tags.IOptionalNamedTag<Item> TITANIUM_INGOT_ITEMS = createTag("ingot/titanium", true);
        public static final Tags.IOptionalNamedTag<Item> HARDENED_GOLD_INGOT_ITEMS = createTag("ingot/hardened_gold", true);

        public static final Tags.IOptionalNamedTag<Item> ALLOYABLE_ITEMS = createTag("alloyable", false);
        public static final Tags.IOptionalNamedTag<Item> ALLOY_ITEMS = createTag("alloy", false);

        private static Tags.IOptionalNamedTag<Item> createTag(String name, boolean forge)
        {
            return ItemTags.createOptional(new ResourceLocation(forge ? "forge" : BitMod.MOD_ID, name));
        }
    }
}
