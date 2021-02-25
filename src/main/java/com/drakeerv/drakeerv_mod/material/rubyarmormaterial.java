package com.drakeerv.drakeerv_mod.material;

import com.drakeerv.drakeerv_mod.registry.moditems;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class rubyarmormaterial implements ArmorMaterial {
    public static final rubyarmormaterial RUBYARMORMATERIAL = new rubyarmormaterial();
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {3, 8, 6, 3};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 1;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 15;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(moditems.RUBY);
	}
 
	@Override
	public String getName() {
		return "ruby";
	}
 
	@Override
	public float getToughness() {
		return 2f;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 1f;
	}
}
