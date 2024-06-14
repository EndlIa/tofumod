package moe.endlia.tofumod.item;
import moe.endlia.tofumod.Tofumod;

import moe.endlia.tofumod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup TOFU_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Tofumod.MOD_ID, "tofugroup"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.tofugroup"))
                    .icon(() -> new ItemStack(ModItems.MOMEN_TOFU))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MOMEN_TOFU);
                        entries.add(ModItems.KINUGOSHI_TOFU);
                        entries.add(ModItems.TOFU_GEM);
                        entries.add(ModItems.MOMEN_TOFU_PICKAXE);
                        entries.add(ModItems.MOMEN_TOFU_HELMET);entries.add(ModItems.MOMEN_TOFU_CHESTPLATE);entries.add(ModItems.MOMEN_TOFU_LEGGINGS);entries.add(ModItems.MOMEN_TOFU_BOOTS);
                        entries.add(ModItems.METALTEST);
                        entries.add(ModItems.TOFU_SCOOP);
                        entries.add(ModItems.SOYBEANS);

                        entries.add(ModBlocks.MOMEN_TOFU_BLOCK);entries.add(ModBlocks.MOMEN_TOFU_BUTTON);entries.add(ModBlocks.MOMEN_TOFU_DOOR);entries.add(ModBlocks.MOMEN_TOFU_FENCE);entries.add(ModBlocks.MOMEN_TOFU_TRAPDOOR);entries.add(ModBlocks.MOMEN_TOFU_FENCE_GATE);entries.add(ModBlocks.MOMEN_TOFU_SLAB);entries.add(ModBlocks.MOMEN_TOFU_WALL);entries.add(ModBlocks.MOMEN_TOFU_PRESSURE_PLATE);entries.add(ModBlocks.MOMEN_TOFU_STAIRS);
                        entries.add(ModBlocks.TOFU_ORE_BLOCK);


                    })
                    .build());

    public static void registerItemGroups(){
        Tofumod.LOGGER.info("Registering Mod Item Groups for " + Tofumod.MOD_ID);
    }
}
