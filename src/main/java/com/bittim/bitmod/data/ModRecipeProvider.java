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
import net.minecraft.tags.ItemTags;
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

        ShapedRecipeBuilder.shaped(ModItems.DIAMOND_UPGRADE_KIT.get())
            .define('#', Tags.Items.GEMS_DIAMOND)
            .define('C', ItemTags.COALS)
            .pattern("##")
            .pattern("##")
            .pattern("CC")
            .unlockedBy("has_item", has(Items.DIAMOND))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DIAMOND_REINFORCEMENT_KIT.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('T', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("## ")
            .pattern("TTT")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.NETHERITE_REINFORCEMENT_KIT.get())
            .define('#', Tags.Items.INGOTS_NETHERITE)
            .define('T', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('H', ModTags.Items.HARDENED_GOLD_INGOT_ITEMS)
            .pattern("H#H")
            .pattern("TTT")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get())
            .define('#', ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS)
            .define('N', Tags.Items.INGOTS_NETHERITE)
            .pattern("N")
            .pattern("#")
            .unlockedBy("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
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

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_AXE.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern("#S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_HOE.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern(" S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_PICKAXE.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("###")
            .pattern(" S ")
            .pattern(" S ")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_SHOVEL.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("S")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_SWORD.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("#")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_AXE.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern("#S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_HOE.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern(" S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_PICKAXE.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('S', Items.STICK)
            .pattern("###")
            .pattern(" S ")
            .pattern(" S ")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_SHOVEL.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("S")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_SWORD.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("#")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_AXE.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern("#S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_HOE.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("##")
            .pattern(" S")
            .pattern(" S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_PICKAXE.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("###")
            .pattern(" S ")
            .pattern(" S ")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_SHOVEL.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("S")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_SWORD.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .define('S', Items.STICK)
            .pattern("#")
            .pattern("#")
            .pattern("S")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
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

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_HELMET.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_CHESTPLATE.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_LEGGINGS.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_BOOTS.get())
            .define('#', ModTags.Items.TITANIUM_INGOT_ITEMS)
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.TITANIUM_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_HELMET.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .pattern("###")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_CHESTPLATE.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_LEGGINGS.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .pattern("###")
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_DIAMOND_BOOTS.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_DIAMOND.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_HELMET.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_CHESTPLATE.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_LEGGINGS.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .pattern("###")
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.REINFORCED_NETHERITE_BOOTS.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
            .pattern("# #")
            .pattern("# #")
            .unlockedBy("has_item", has(ModItems.REINFORCED_NETHERITE_INGOT.get()))
            .save(consumer);
        



        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_AXE), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_AXE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HOE), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_HOE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_PICKAXE), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_PICKAXE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SHOVEL), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_SHOVEL.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_SWORD), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_SWORD.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_HELMET), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_HELMET.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.IRON_BOOTS), Ingredient.of(ModTags.Items.HARDENED_GOLD_UPGRADE_KIT_ITEMS), ModItems.HARDENED_GOLDEN_BOOTS.get())
            .unlocks("has_item", has(ModItems.HARDENED_GOLD_UPGRADE_KIT.get()))
            .save(consumer, modID("hardened_golden_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_AXE.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_AXE)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_HOE.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_HOE)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_PICKAXE.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_PICKAXE)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_SHOVEL.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_SHOVEL)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_SWORD.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_SWORD)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_HELMET.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_HELMET)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_CHESTPLATE.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_CHESTPLATE)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_LEGGINGS.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_LEGGINGS)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.HARDENED_GOLDEN_BOOTS.get()), Ingredient.of(ModTags.Items.DIAMOND_UPGRADE_KIT_ITEMS), Items.DIAMOND_BOOTS)
            .unlocks("has_item", has(ModItems.DIAMOND_UPGRADE_KIT.get()))
            .save(consumer, modID("diamond_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_AXE), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_AXE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HOE), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_HOE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_PICKAXE), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_PICKAXE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SHOVEL), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_SHOVEL.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SWORD), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_SWORD.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HELMET), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_HELMET.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_CHESTPLATE), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_LEGGINGS), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_BOOTS), Ingredient.of(ModTags.Items.DIAMOND_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_DIAMOND_BOOTS.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_diamond_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_AXE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_AXE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_axe_from_guilding"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_HOE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_HOE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_hoe_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_PICKAXE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_PICKAXE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_pickaxe_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_SHOVEL.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_SHOVEL.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_shovel_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_SWORD.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_SWORD.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_sword_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_HELMET.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_HELMET.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_helmet_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_CHESTPLATE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_chestplate_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_LEGGINGS.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_leggings_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_BOOTS.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_DIAMOND_BOOTS.get())
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_diamond_boots_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_AXE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_AXE)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_HOE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_HOE)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_PICKAXE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_PICKAXE)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_SHOVEL.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_SHOVEL)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_SWORD.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_SWORD)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_HELMET.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_HELMET)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_CHESTPLATE.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_CHESTPLATE)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_LEGGINGS.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_LEGGINGS)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_DIAMOND_BOOTS.get()), Ingredient.of(Tags.Items.INGOTS_NETHERITE), Items.NETHERITE_BOOTS)
            .unlocks("has_item", has(ModItems.DIAMOND_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("netherite_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_AXE), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_AXE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HOE), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_HOE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_PICKAXE), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_PICKAXE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SHOVEL), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_SHOVEL.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SWORD), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_SWORD.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_HELMET.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(ModTags.Items.NETHERITE_REINFORCEMENT_KIT_ITEMS), ModItems.REINFORCED_NETHERITE_BOOTS.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("reinforced_netherite_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_AXE.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_AXE.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_axe_from_smithing"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_HOE.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_HOE.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_hoe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_PICKAXE.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_PICKAXE.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_pickaxe_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_SHOVEL.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_SHOVEL.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_shovel_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_SWORD.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_SWORD.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_sword_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_HELMET.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_HELMET.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_helmet_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_CHESTPLATE.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_chestplate_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_LEGGINGS.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_leggings_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.GUILDED_REINFORCED_DIAMOND_BOOTS.get()), Ingredient.of(ModTags.Items.REINFORCED_NETHERITE_UPGRADE_KIT_ITEMS), ModItems.GUILDED_REINFORCED_NETHERITE_BOOTS.get())
            .unlocks("has_item", has(ModItems.REINFORCED_NETHERITE_UPGRADE_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_boots_from_smithing"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_AXE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_AXE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_axe_from_guilding"));
            
        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_HOE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_HOE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_hoe_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_PICKAXE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_PICKAXE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_pickaxe_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_SHOVEL.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_SHOVEL.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_shovel_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_SWORD.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_SWORD.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_sword_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_HELMET.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_HELMET.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_helmet_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_CHESTPLATE.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_CHESTPLATE.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_chestplate_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_LEGGINGS.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_LEGGINGS.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_leggings_from_guilding"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ModItems.REINFORCED_NETHERITE_BOOTS.get()), Ingredient.of(Tags.Items.INGOTS_GOLD), ModItems.GUILDED_REINFORCED_NETHERITE_BOOTS.get())
            .unlocks("has_item", has(ModItems.NETHERITE_REINFORCEMENT_KIT.get()))
            .save(consumer, modID("guilded_reinforced_netherite_boots_from_guilding"));




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

        ShapelessRecipeBuilder.shapeless(ModItems.REINFORCED_DIAMOND.get(), 9)
            .requires(ModBlocks.REINFORCED_DIAMOND_BLOCK.get())
            .unlockedBy("has_item", has(ModBlocks.ALLOY_FURNACE.get()))
            .save(consumer);
            
        ShapedRecipeBuilder.shaped(ModBlocks.REINFORCED_DIAMOND_BLOCK.get())
            .define('#', ModTags.Items.REINFORCED_DIAMOND_ITEMS)
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .unlockedBy("has_item", has(ModBlocks.ALLOY_FURNACE.get()))
            .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.REINFORCED_NETHERITE_INGOT.get(), 9)
            .requires(ModBlocks.REINFORCED_NETHERITE_BLOCK.get())
            .unlockedBy("has_item", has(ModBlocks.ALLOY_FURNACE.get()))
            .save(consumer);
            
        ShapedRecipeBuilder.shaped(ModBlocks.REINFORCED_NETHERITE_BLOCK.get())
            .define('#', ModTags.Items.REINFORCED_NETHERITE_INGOT_ITEMS)
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
