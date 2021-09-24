package com.bittim.bitmod.setup;

import com.bittim.bitmod.block.alloy_furnace.AlloyFurnaceTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class ModTileEntities
{
    public static final RegistryObject<TileEntityType<AlloyFurnaceTileEntity>> ALLOY_FURNACE = Registration.TILE_ENTITIES.register("alloy_furnace", () -> TileEntityType.Builder.of(
            AlloyFurnaceTileEntity::new, ModBlocks.ALLOY_FURNACE.get()).build(null));

    public static void register() { }
}
