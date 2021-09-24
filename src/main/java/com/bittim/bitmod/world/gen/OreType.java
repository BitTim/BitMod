package com.bittim.bitmod.world.gen;

import com.bittim.bitmod.setup.ModBlocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType
{
    TITANIUM(Lazy.of(ModBlocks.TITANIUM_ORE), 10, 0, 40, 2);



    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int frequency;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int frequency)
    {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.frequency = frequency;
    }

    public Lazy<Block> getBlock()
    {
        return block;
    }

    public int getMaxVeinSize()
    {
        return maxVeinSize;
    }

    public int getMinHeight()
    {
        return minHeight;
    }

    public int getMaxHeight()
    {
        return maxHeight;
    }

    public int getFrequency()
    {
        return frequency;
    }

    public static OreType get(Block block)
    {
        for(OreType ore : values())
        {
            if(block == ore.block){
                return ore;
            }
        }

        return null;
    }
}
