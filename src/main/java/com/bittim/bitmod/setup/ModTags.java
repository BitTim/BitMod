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
        public static final ITag.INamedTag<Block> REINFORCED_DIAMOND_BLOCKS = forge("storage_blocks/reinforced_diamond");
        public static final ITag.INamedTag<Block> REINFORCED_NETHERITE_BLOCKS = forge("storage_blocks/reinforced_netherite");

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
        public static final ITag.INamedTag<Item> REINFORCED_DIAMOND_BLOCKS = forge("storage_blocks/reinforced_diamond");
        public static final ITag.INamedTag<Item> REINFORCED_NETHERITE_BLOCKS = forge("storage_blocks/reinforced_netherite");

        public static final ITag.INamedTag<Item> TITANIUM_INGOT_ITEMS = forge("ingots/titanium");
        public static final ITag.INamedTag<Item> HARDENED_GOLD_INGOT_ITEMS = forge("ingots/hardened_gold");
        public static final ITag.INamedTag<Item> REINFORCED_DIAMOND_ITEMS = forge("gems/reinforced_diamond");
        public static final ITag.INamedTag<Item> REINFORCED_NETHERITE_INGOT_ITEMS = forge("ingots/reinforced_netherite");

        public static final ITag.INamedTag<Item> HARDENED_GOLD_UPGRADE_KIT_ITEMS = mod("kits/hardened_gold_upgrade");
        public static final ITag.INamedTag<Item> DIAMOND_UPGRADE_KIT_ITEMS = mod("kits/diamond_upgrade");
        public static final ITag.INamedTag<Item> DIAMOND_REINFORCEMENT_KIT_ITEMS = mod("kits/diamond_reinforcement");
        public static final ITag.INamedTag<Item> NETHERITE_REINFORCEMENT_KIT_ITEMS = mod("kits/netherite_reinforcement");
        public static final ITag.INamedTag<Item> REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS = mod("kits/reinforced_netherite_upgrade");

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
