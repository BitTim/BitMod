package com.bittim.bitmod.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{
    HARDENED_GOLD(2, 512, 12.0f, 2.0f, 22, () -> Ingredient.of(ModItems.HARDENED_GOLD_INGOT.get())),
    TITANIUM(3, 1661, 8.5f, 3.5f, 12, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
    REINFORCED_DIAMOND(3, 1861, 9.0f, 3.5f, 15, () -> Ingredient.of(ModItems.REINFORCED_DIAMOND.get())),
    GUILDED_REINFORCED_DIAMOND(3, 1961, 10.0f, 4.0f, 20, () -> Ingredient.of(ModItems.REINFORCED_DIAMOND.get())),
    REINFORCED_NETHERITE(4, 3031, 12.0f, 5.0f, 22, () -> Ingredient.of(ModItems.REINFORCED_NETHERITE_INGOT.get())),
    GUILDED_REINFORCED_NETHERITE(4, 3531, 15.0f, 5.5f, 22, () -> Ingredient.of(ModItems.REINFORCED_NETHERITE_INGOT.get()));
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
    
}
