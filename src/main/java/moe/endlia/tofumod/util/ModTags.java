package moe.endlia.tofumod.util;

import moe.endlia.tofumod.Tofumod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> TOFU_SCOOPABLE = createTag("tofu_scoopable");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Tofumod.MOD_ID, name));
        }
    }
}
