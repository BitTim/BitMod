package com.bittim.bitmod.data;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.bittim.bitmod.setup.ModBlocks;
import com.bittim.bitmod.setup.ModItems;
import com.bittim.bitmod.setup.Registration;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.functions.ApplyBonus;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModLootTableProvider extends LootTableProvider
{
    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
            Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((p_227508_1_, p_227508_2_) -> LootTableManager.validate(validationtracker, p_227508_1_, p_227508_2_));
    }

    public static class ModBlockLootTables extends BlockLootTables
    {
        @Override
        protected void addTables() {
            dropSelf(ModBlocks.HARDENED_GOLD_BLOCK.get());
            dropSelf(ModBlocks.TITANIUM_BLOCK.get());
            dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());
            dropSelf(ModBlocks.ALLOY_FURNACE.get());

            add(ModBlocks.TITANIUM_ORE.get(), createSilkTouchDispatchTable(ModBlocks.TITANIUM_ORE.get(),
                applyExplosionDecay(ModBlocks.TITANIUM_ORE.get(), ItemLootEntry.lootTableItem(ModItems.RAW_TITANIUM.get())
                    .apply(SetCount.setCount(RandomValueRange.between(1f, 1f)))
                    .apply(ApplyBonus.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
            )));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
        }
    }
}
