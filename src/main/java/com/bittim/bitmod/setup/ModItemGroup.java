package com.bittim.bitmod.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup BITMOD_BLOCKS_GROUP = new ItemGroup("bitmodBlocksTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModBlocks.HARDENED_GOLD_BLOCK.get());
        }
    };

    public static final ItemGroup BITMOD_ITEMS_GROUP = new ItemGroup("bitmodItemsTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.HARDENED_GOLD_INGOT.get());
        }
    };

    public static final ItemGroup BITMOD_TOOLS_GROUP = new ItemGroup("bitmodToolsTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.HARDENED_GOLDEN_PICKAXE.get());
        }
    };

    public static final ItemGroup BITMOD_ARMOR_GROUP = new ItemGroup("bitmodArmorTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.HARDENED_GOLDEN_HELMET.get());
        }
    };
}
