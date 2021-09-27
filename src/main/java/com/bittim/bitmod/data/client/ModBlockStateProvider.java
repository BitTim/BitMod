package com.bittim.bitmod.data.client;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.ModBlocks;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BitMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.HARDENED_GOLD_BLOCK.get());
        simpleBlock(ModBlocks.TITANIUM_ORE.get());
        simpleBlock(ModBlocks.TITANIUM_BLOCK.get());
        simpleBlock(ModBlocks.REINFORCED_DIAMOND_BLOCK.get());
        simpleBlock(ModBlocks.REINFORCED_NETHERITE_BLOCK.get());
        simpleBlock(ModBlocks.RAW_TITANIUM_BLOCK.get());
    }
}
