package com.bittim.bitmod.setup;

import java.util.function.Supplier;

import com.bittim.bitmod.block.alloy_furnace.AlloyFurnaceBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
    public static final RegistryObject<Block> TITANIUM_ORE = register("titanium_ore", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.STONE)
            .strength(3)
            .sound(SoundType.STONE)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);

    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = register("raw_titanium_block", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.STONE)
            .strength(3)
            .sound(SoundType.STONE)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);

    public static final RegistryObject<Block> TITANIUM_BLOCK = register("titanium_block", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.METAL)
            .strength(3)
            .sound(SoundType.METAL)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);
    
    public static final RegistryObject<Block> HARDENED_GOLD_BLOCK = register("hardened_gold_block", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.METAL)
            .strength(3)
            .sound(SoundType.METAL)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);
    
    public static final RegistryObject<Block> REINFORCED_DIAMOND_BLOCK = register("reinforced_diamond_block", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.METAL)
            .strength(5)
            .sound(SoundType.METAL)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);
    
    public static final RegistryObject<Block> REINFORCED_NETHERITE_BLOCK = register("reinforced_netherite_block", () -> 
        new Block(AbstractBlock.Properties
            .of(Material.METAL)
            .strength(5)
            .sound(SoundType.METAL)
            .harvestLevel(3)
            .harvestTool(ToolType.PICKAXE)
            .requiresCorrectToolForDrops()),
        ModItemGroup.BITMOD_BLOCKS_GROUP);

    public static final RegistryObject<AlloyFurnaceBlock> ALLOY_FURNACE = register("alloy_furnace", () -> 
        new AlloyFurnaceBlock(AbstractBlock.Properties
            .of(Material.STONE)
            .strength(2)
            .sound(SoundType.STONE)
            .harvestLevel(0)
            .harvestTool(ToolType.PICKAXE)
            .lightLevel(AlloyFurnaceBlock.lightLevel)),
        ModItemGroup.BITMOD_BLOCKS_GROUP);
    




    


    public static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block)
    {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, ItemGroup group)
    {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(group)));
        return ret;
    }
}
