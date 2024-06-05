package moe.endlia.item;

import moe.endlia.Tofumod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOFU = registerItem("tofu", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tofumod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tofumod.LOGGER.info("Registering Mod Items for " + Tofumod.MOD_ID);
    }
}
