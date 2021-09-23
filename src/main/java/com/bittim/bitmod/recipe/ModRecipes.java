package com.bittim.bitmod.recipe;

import com.bittim.bitmod.BitMod;
import com.bittim.bitmod.setup.RegistryHandler;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.fml.RegistryObject;

public class ModRecipes
{
    public static class Types
    {
        public static final IRecipeType<AlloyingRecipe> ALLOYING = IRecipeType.register(BitMod.MOD_ID + ":alloying");
        public static void register() { }
    }

    public static class Serializers
    {
        public static final RegistryObject<IRecipeSerializer<?>> ALLOYING = RegistryHandler.RECIPE_SERIALIZERS.register("alloying", AlloyingRecipe.Serializer::new);
        public static void register() { }
    }

    public static void register() { }
}
