package com.drakeerv.drakeerv_mod.modtool;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class pickaxe extends PickaxeItem {
    public pickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}