package moe.endlia.item;
import moe.endlia.Tofumod;

import moe.endlia.block.ModBlocks;
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
                        entries.add(ModBlocks.MOMEN_TOFU_BLOCK);
                    })
                    .build());

    public static void registerItemGroups(){
        Tofumod.LOGGER.info("Registering Mod Item Groups for " + Tofumod.MOD_ID);
    }
}
