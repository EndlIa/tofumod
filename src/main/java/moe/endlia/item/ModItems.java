package moe.endlia.item;

import moe.endlia.Tofumod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MOMEN_TOFU = registerItem("momen_tofu", new Item(new Item.Settings()));
    public static final Item KINUGOSHI_TOFU = registerItem("kinugoshi_tofu", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tofumod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tofumod.LOGGER.info("Registering Mod Items for " + Tofumod.MOD_ID);
    }
}
