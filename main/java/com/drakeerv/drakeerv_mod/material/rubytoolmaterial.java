package com.drakeerv.drakeerv_mod.material;

import com.drakeerv.drakeerv_mod.registry.moditems;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class rubytoolmaterial implements ToolMaterial {
    public static final rubytoolmaterial RUBYTOOLMATERIAL = new rubytoolmaterial();

    @Override
    public int getDurability() {
        return 1300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5f;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(moditems.RUBY);
    }
}
