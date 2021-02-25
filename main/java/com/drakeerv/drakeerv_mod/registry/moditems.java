package com.drakeerv.drakeerv_mod.registry;

import com.drakeerv.drakeerv_mod.drakeerv_mod;
import com.drakeerv.drakeerv_mod.material.rubyarmormaterial;
import com.drakeerv.drakeerv_mod.material.rubytoolmaterial;
import com.drakeerv.drakeerv_mod.modtool.axe;
import com.drakeerv.drakeerv_mod.modtool.hoe;
import com.drakeerv.drakeerv_mod.modtool.pickaxe;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class moditems {
    // Items
    public static final ToolItem RUBY_AXE = new axe(rubytoolmaterial.RUBYTOOLMATERIAL, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item RUBY_HOE = new hoe(rubytoolmaterial.RUBYTOOLMATERIAL, 7, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Item RUBY_PICKAXE = new pickaxe(rubytoolmaterial.RUBYTOOLMATERIAL, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem RUBY_SHOVEL = new ShovelItem(rubytoolmaterial.RUBYTOOLMATERIAL, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));

    public static final Item RUBY_BOOTS = new ArmorItem(rubyarmormaterial.RUBYARMORMATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_CHESTPLATE = new ArmorItem(rubyarmormaterial.RUBYARMORMATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_HELMET = new ArmorItem(rubyarmormaterial.RUBYARMORMATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item RUBY_LEGGINGS = new ArmorItem(rubyarmormaterial.RUBYARMORMATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem RUBY_SWORD = new SwordItem(rubytoolmaterial.RUBYTOOLMATERIAL, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item RUBY_HORSE_ARMOR = new Item(new Item.Settings().group(ItemGroup.MISC));

    // Blocks
    public static final BlockItem RUBY_BLOCK = new BlockItem(modblocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RUBY_ORE = new BlockItem(modblocks.RUBY_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        // Items
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_axe"), RUBY_AXE);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_hoe"), RUBY_HOE);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_pickaxe"), RUBY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_shovel"), RUBY_SHOVEL);

        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_boots"), RUBY_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_chestplate"), RUBY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_helmet"), RUBY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_leggings"), RUBY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_sword"), RUBY_SWORD);

        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby"), RUBY);

        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_horse_armor"), RUBY_HORSE_ARMOR);

        // Blocks
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(drakeerv_mod.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
