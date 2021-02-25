package com.drakeerv.drakeerv_mod.registry;

import com.drakeerv.drakeerv_mod.drakeerv_mod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class modblocks {
    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).strength(5f, 30f).requiresTool().sounds(BlockSoundGroup.METAL));
    public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 2).strength(3f, 15f).requiresTool().sounds(BlockSoundGroup.STONE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(drakeerv_mod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(drakeerv_mod.MOD_ID, "ruby_ore"), RUBY_ORE);
    }
}
