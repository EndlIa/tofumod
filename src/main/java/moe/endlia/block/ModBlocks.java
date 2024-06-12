package moe.endlia.block;

import moe.endlia.Tofumod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {


    public static final Block MOMEN_TOFU_BLOCK = registerBlock("momen_tofu_block",
            new Block(AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block TOFU_ORE_BLOCK = registerBlock("tofu_ore_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Tofumod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Tofumod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Tofumod.LOGGER.info("Registering Mod Blocks for" + Tofumod.MOD_ID);
    }
}
