package com.bittim.bitmod.tileentity;

import com.bittim.bitmod.block.ModBlocks;
import com.bittim.bitmod.setup.RegistryHandler;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntities
{
    public static final RegistryObject<TileEntityType<AlloyFurnaceTileEntity>> ALLOY_FURNACE = RegistryHandler.TILE_ENTITIES.register("alloy_furnace", () -> TileEntityType.Builder.of(
            AlloyFurnaceTileEntity::new, ModBlocks.ALLOY_FURNACE.get()).build(null));

    public static void register() { }
}
