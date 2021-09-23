package com.bittim.bitmod.recipe;

import javax.annotation.Nullable;

import com.google.gson.JsonObject;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class AlloyingRecipe implements IRecipe<IInventory>
{
    protected final IRecipeType<?> type;
    protected final ResourceLocation recipeID;
    protected final String group;
    protected final Ingredient[] ingredients;
    protected final ItemStack result;
    protected final float experience;
    protected final int cookTime;

    public AlloyingRecipe(ResourceLocation recipeID, Ingredient[] ingredients, ItemStack result, float experience, int cookTime) {
        this.type = ModRecipes.Types.ALLOYING;
        this.recipeID = recipeID;
        this.group = "";
        this.ingredients = ingredients;
        this.result = result;
        this.experience = experience;
        this.cookTime = cookTime;
    }

    public boolean matches(IInventory inv, World world) {
        return (this.ingredients[0].test(inv.getItem(0)) && this.ingredients[1].test(inv.getItem(1))) || (this.ingredients[0].test(inv.getItem(1)) && this.ingredients[1].test(inv.getItem(0)));
    }

    public ItemStack assemble(IInventory inv) {
        return this.result.copy();
    }

    public boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_) {
        return true;
    }

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredients[0]);
        nonnulllist.add(this.ingredients[1]);
        return nonnulllist;
    }

    public float getExperience() {
        return this.experience;
    }

    public ItemStack getResultItem() {
        return this.result;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCookTime() {
        return this.cookTime;
    }

    public ResourceLocation getId() {
        return this.recipeID;
    }

    public IRecipeType<?> getType() {
        return this.type;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<AlloyingRecipe>
    {

        @Override
        public AlloyingRecipe fromJson(ResourceLocation recipeID, JsonObject json) {
            Ingredient[] ingredients = new Ingredient[] {
                Ingredient.fromJson(json.getAsJsonArray("ingredients").get(0)),
                Ingredient.fromJson(json.getAsJsonArray("ingredients").get(1))};

            Ingredient resultIngredient = Ingredient.fromJson(json.get("result"));
            ItemStack result = resultIngredient.getItems()[0];
            
            int count = JSONUtils.getAsInt(json.getAsJsonObject("result"), "count", 1);
            result.setCount(count);

            int cookTime = JSONUtils.getAsInt(json, "cookTime", 200);
            float experience = JSONUtils.getAsFloat(json, "experience", 1f);
            
            return new AlloyingRecipe(recipeID, ingredients, result, experience, cookTime);
        }

        @Nullable
        @Override
        public AlloyingRecipe fromNetwork(ResourceLocation recipeID, PacketBuffer buffer) {
            int len = buffer.readByte();
            Ingredient[] ingredients = new Ingredient[len];

            for(int i = 0; i < len; i++)
            {
                ingredients[i] = Ingredient.fromNetwork(buffer);
            }

            float experience = buffer.readFloat();
            int cookTime = buffer.readVarInt();
            ItemStack result = buffer.readItem();

            return new AlloyingRecipe(recipeID, ingredients, result, experience, cookTime);
        }

        @Override
        public void toNetwork(PacketBuffer buffer, AlloyingRecipe recipe) {
            int len = recipe.ingredients.length;
            buffer.writeByte(len);

            for(int i = 0; i < len; i++)
            {
                recipe.ingredients[i].toNetwork(buffer);
            }

            buffer.writeFloat(recipe.experience);
            buffer.writeVarInt(recipe.cookTime);
            buffer.writeItem(recipe.result);
        }
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return ModRecipes.Serializers.ALLOYING.get();
    }
}
