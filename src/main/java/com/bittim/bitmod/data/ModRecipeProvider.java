package com.bittim.bitmod.data;

import java.util.function.Consumer;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.ModBlocks;
import com.bittim.bitmod.setup.ModItems;
import com.bittim.bitmod.setup.ModTags;

import net.minecraft.block.Blocks;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLD_UPGRADE_KIT.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('G', Tags.Items.INGOTS_GOLD)
            .pattern("##")
            .pattern("GG")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);





        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_AXE.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern("#S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_HOE.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern(" S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_PICKAXE.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("###")
            .pattern(" S ")
            .pattern(" S ")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_SHOVEL.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("S")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_SWORD.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("#")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_HELMET.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_CHESTPLATE.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_LEGGINGS.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.HARDENED_GOLDEN_BOOTS.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer);
        



        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_AXE), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_AXE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HOE), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_HOE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_PICKAXE), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_PICKAXE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SHOVEL), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_SHOVEL.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SWORD), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_SWORD.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HELMET), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_HELMET.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_BOOTS), Ingredient.of(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()), ModItems.HARDENED_GOLDEN_BOOTS.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_INGOT.get()))
            .save(consumer, modID("hardened_golden_boots_from_smithing"));




        ShapelessRecipeBuilder.shapeless(ModItems.HARDENED_GOLD_INGOT.get(), 9)
            .requires(ModBlocks.HARDENED_GOLD_BLOCK.get())
            .unlockedBy("has_item", has(ModBlocks.ALLOY_FURNACE.get()))
            .save(consumer);
            
        ShapedRecipeBuilder.shaped(ModBlocks.HARDENED_GOLD_BLOCK.get())
            .define('#', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModBlocks.ALLOY_FURNACE.get()))
            .save(consumer);
        
        ShapelessRecipeBuilder.shapeless(ModItems.RAW_TITANIUM.get(), 9)
            .requires(ModBlocks.RAW_TITANIUM_BLOCK.get())
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.RAW_TITANIUM_BLOCK.get())
            .define('#', ModItems.RAW_TITANIUM.get())
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer);
        
            ShapelessRecipeBuilder.shapeless(ModItems.TITANIUM_INGOT.get(), 9)
            .requires(ModBlocks.TITANIUM_BLOCK.get())
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer);
        
        ShapedRecipeBuilder.shaped(ModBlocks.TITANIUM_BLOCK.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer);




        CookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TITANIUM.get()), ModItems.TITANIUM_INGOT.get(), 0.7f, 200)
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer, modID("titanium_ingot_from_smelting_raw"));

        CookingRecipeBuilder.blasting(Ingredient.of(ModItems.RAW_TITANIUM.get()), ModItems.TITANIUM_INGOT.get(), 0.7f, 100)
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer, modID("titanium_ingot_from_blasting_raw"));

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TITANIUM_ORE.get()), ModItems.TITANIUM_INGOT.get(), 0.7f, 200)
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer, modID("titanium_ingot_from_smelting_ore"));

        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TITANIUM_ORE.get()), ModItems.TITANIUM_INGOT.get(), 0.7f, 100)
            .unlockedBy("has_item", has(ModItems.RAW_TITANIUM.get()))
            .save(consumer, modID("titanium_ingot_from_blasting_ore"));
        
        ShapedRecipeBuilder.shaped(ModBlocks.ALLOY_FURNACE.get())
            .define('I', Items.IRON_INGOT)
            .define('#', Blocks.SMOOTH_STONE)
            .define('B', Blocks.BLAST_FURNACE)
            .pattern("III")
            .pattern("IBI")
            .pattern("###")
            .unlockedBy("has_item", has(Blocks.BLAST_FURNACE))
            .save(consumer);
    }

    private static ResourceLocation modID(String path) {
        return new ResourceLocation(BitMod.MOD_ID, path);
    }
}
