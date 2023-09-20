package net.qw09.pluguninonani.item;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    DARKNESS(99999, 90f, 90f, 5, 90,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private int ItemDurability;
    private float ItemMiningSpeed;
    private float ItemAttackDamage;
    private int ItemMiningLevel;
    private int Enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int itemDurability, float itemMiningSpeed, float itemAttackDamage, int itemMiningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        ItemDurability = itemDurability;
        ItemMiningSpeed = itemMiningSpeed;
        ItemAttackDamage = itemAttackDamage;
        ItemMiningLevel = itemMiningLevel;
        Enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.ItemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.ItemMiningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.ItemAttackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.ItemMiningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.Enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
