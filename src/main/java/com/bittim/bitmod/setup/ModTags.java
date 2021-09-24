package com.bittim.bitmod.setup;

import com.bittim.bitmod.BitMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

@SuppressWarnings("all")
public class ModTags
{
    public static class Blocks
    {
        public static final Tags.IOptionalNamedTag<Block> TITANIUM_ORE_BLOCKS = forge("ores/titanium");
        public static final Tags.IOptionalNamedTag<Block> TITANIUM_BLOCKS = forge("storage_blocks/titanium");
        public static final Tags.IOptionalNamedTag<Block> HARDENED_GOLD_BLOCKS = forge("storage_blocks/hardened_gold");

        private static Tags.IOptionalNamedTag<Block> forge(String name)
        {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }

        private static Tags.IOptionalNamedTag<Block> mod(String name)
        {
            return BlockTags.createOptional(new ResourceLocation(BitMod.MOD_ID, name));
        }
    }

    public static class Items
    {
        public static final Tags.IOptionalNamedTag<Item> TITANIUM_ORE_BLOCKS = forge("ores/titanium");
        public static final Tags.IOptionalNamedTag<Item> TITANIUM_BLOCKS = forge("storage_blocks/titanium");
        public static final Tags.IOptionalNamedTag<Item> HARDENED_GOLD_BLOCKS = forge("storage_blocks/hardened_gold");

        public static final Tags.IOptionalNamedTag<Item> RAW_TITANIUM_ITEMS = forge("raw/titanium");
        public static final Tags.IOptionalNamedTag<Item> TITANIUM_INGOT_ITEMS = forge("ingots/titanium");
        public static final Tags.IOptionalNamedTag<Item> HARDENED_GOLD_INGOT_ITEMS = forge("ingots/hardened_gold");

        public static final Tags.IOptionalNamedTag<Item> ALLOYABLE_ITEMS = mod("alloyable");
        public static final Tags.IOptionalNamedTag<Item> ALLOY_ITEMS = mod("alloy");

        private static Tags.IOptionalNamedTag<Item> forge(String name)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

        private static Tags.IOptionalNamedTag<Item> mod(String name)
        {
            return ItemTags.createOptional(new ResourceLocation(BitMod.MOD_ID, name));
        }
    }
}
