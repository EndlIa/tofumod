package moe.endlia.tofumod.datagen;

import moe.endlia.tofumod.block.ModBlocks;
import moe.endlia.tofumod.block.custom.SoyCrop;
import moe.endlia.tofumod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool momenPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOMEN_TOFU_BLOCK);
        momenPool.button(ModBlocks.MOMEN_TOFU_BUTTON);
        momenPool.slab(ModBlocks.MOMEN_TOFU_SLAB);
        momenPool.fence(ModBlocks.MOMEN_TOFU_FENCE);
        momenPool.fenceGate(ModBlocks.MOMEN_TOFU_FENCE_GATE);
        momenPool.wall(ModBlocks.MOMEN_TOFU_WALL);
        momenPool.pressurePlate(ModBlocks.MOMEN_TOFU_PRESSURE_PLATE);
        momenPool.stairs(ModBlocks.MOMEN_TOFU_STAIRS);
        blockStateModelGenerator.registerDoor(ModBlocks.MOMEN_TOFU_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MOMEN_TOFU_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TOFU_ORE_BLOCK);

        blockStateModelGenerator.registerCrop(ModBlocks.SOYBEANS_CROP, SoyCrop.AGE, 0, 1, 2, 3, 4);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MOMEN_TOFU, Models.GENERATED);
        itemModelGenerator.register(ModItems.KINUGOSHI_TOFU, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOFU_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOFU_SCOOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOFU_BUGLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOMEN_TOFU_PICKAXE, Models.GENERATED);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MOMEN_TOFU_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MOMEN_TOFU_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MOMEN_TOFU_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MOMEN_TOFU_BOOTS);
    }
}
