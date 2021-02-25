package com.drakeerv.drakeerv_mod.generator;

import com.drakeerv.drakeerv_mod.drakeerv_mod;
import com.drakeerv.drakeerv_mod.registry.modblocks;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class modgenerate {
    public static final ConfiguredFeature<?, ?> RUBY_ORE_GENERATOR = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,modblocks.RUBY_ORE.getDefaultState(), 6)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0,0,45))).spreadHorizontally().repeat(10);

    public static void registerGenerator() {
        RegistryKey<ConfiguredFeature<?, ?>> ruby_ore_generator = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(drakeerv_mod.MOD_ID, "ruby_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ruby_ore_generator.getValue(), RUBY_ORE_GENERATOR);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ruby_ore_generator);
    }
}
