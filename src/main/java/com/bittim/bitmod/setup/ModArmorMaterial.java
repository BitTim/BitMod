package com.bittim.bitmod.setup;

import java.util.function.Supplier;

import com.bittim.bitmod.BitMod;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ModArmorMaterial implements IArmorMaterial
{
    HARDENED_GOLD("hardened_gold", 24, new int[]{2, 6, 7, 3}, 12, SoundEvents.ARMOR_EQUIP_GOLD, 1f, 0f, () -> Ingredient.of(ModItems.HARDENED_GOLD_INGOT.get())),
    TITANIUM("titanium", 34, new int[]{3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_IRON, 2.3f, 0f, () -> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
    REINFORCED_DIAMOND("reinforced_diamond", 35, new int[]{4, 7, 9, 4}, 13, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5f, 0f, () -> Ingredient.of(ModItems.REINFORCED_DIAMOND.get())),
    GUILDED_REINFORCED_DIAMOND("guilded_reinforced_diamond", 36, new int[]{4, 7, 9, 4}, 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.7f, 0f, () -> Ingredient.of(ModItems.REINFORCED_DIAMOND.get())),
    REINFORCED_NETHERITE("reinforced_netherite", 38, new int[]{5, 8, 10, 5}, 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 4f, 0.2f, () -> Ingredient.of(ModItems.REINFORCED_NETHERITE_INGOT.get())),
    GUILDED_REINFORCED_NETHERITE("guilded_reinforced_netherite", 39, new int[]{5, 8, 10, 5}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.3f, 0.3f, () -> Ingredient.of(ModItems.REINFORCED_NETHERITE_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
   }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn) {
        return HEALTH_PER_SLOT[slotIn.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn) {
        return this.slotProtections[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return BitMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
