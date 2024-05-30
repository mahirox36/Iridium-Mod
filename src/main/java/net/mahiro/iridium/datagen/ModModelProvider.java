package net.mahiro.iridium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mahiro.iridium.block.ModBlocks;
import net.mahiro.iridium.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ruby, Models.GENERATED);
        itemModelGenerator.register(ModItems.raw_ruby, Models.GENERATED);

//        itemModelGenerator.register(ModItems.COAL_BRIQUETTE, Models.GENERATED);
//        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
//        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}