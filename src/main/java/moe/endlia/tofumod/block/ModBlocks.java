package moe.endlia.tofumod.block;

import moe.endlia.tofumod.Tofumod;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    //the momen
    public static final Block MOMEN_TOFU_BLOCK = registerBlock("momen_tofu_block",
            new Block(AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_STAIRS = registerBlock("momen_tofu_stair",
            new StairsBlock(ModBlocks.MOMEN_TOFU_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_SLAB = registerBlock("momen_tofu_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_BUTTON = registerBlock("momen_tofu_button",
            new ButtonBlock(BlockSetType.OAK, 10, AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_PRESSURE_PLATE = registerBlock("momen_tofu_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_FENCE = registerBlock("momen_tofu_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_FENCE_GATE = registerBlock("momen_tofu_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_WALL = registerBlock("momen_tofu_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.6f)));
    public static final Block MOMEN_TOFU_DOOR = registerBlock("momen_tofu_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.6f).nonOpaque()));
    public static final Block MOMEN_TOFU_TRAPDOOR = registerBlock("momen_tofu_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.create().strength(0.6f).nonOpaque()));
    //the gem
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
