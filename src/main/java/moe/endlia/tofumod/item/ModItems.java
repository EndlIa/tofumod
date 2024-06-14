package moe.endlia.tofumod.item;

import moe.endlia.tofumod.Tofumod;
import moe.endlia.tofumod.item.custom.MetalDetectorItem;

import moe.endlia.tofumod.item.custom.TofuScoopItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MOMEN_TOFU = registerItem("momen_tofu", new Item(new Item.Settings().food(ModFoodComponents.TOFU)));
    public static final Item KINUGOSHI_TOFU = registerItem("kinugoshi_tofu", new Item(new Item.Settings().food(ModFoodComponents.TOFU)));
    public static final Item TOFU_GEM = registerItem("tofu_gem", new Item(new Item.Settings()));
    public static final Item METALTEST = registerItem("metaltest", new MetalDetectorItem(new Item.Settings().maxDamage(64)));
    public static final Item TOFU_SCOOP = registerItem("tofu_scoop", new TofuScoopItem(new Item.Settings().maxDamage(64)));
    public static final Item MOMEN_TOFU_PICKAXE = registerItem("momen_tofu_pickaxe", new PickaxeItem(ModToolMaterial.MOMEN_TOFU, new Item.Settings()));
    public static final Item MOMEN_TOFU_HELMET = registerItem("momen_tofu_helmet", new ArmorItem(ModArmorMaterials.MOMEN_TOFU, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item MOMEN_TOFU_CHESTPLATE = registerItem("momen_tofu_chestplate", new ArmorItem(ModArmorMaterials.MOMEN_TOFU, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item MOMEN_TOFU_LEGGINGS = registerItem("momen_tofu_leggings", new ArmorItem(ModArmorMaterials.MOMEN_TOFU, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item MOMEN_TOFU_BOOTS = registerItem("momen_tofu_boots", new ArmorItem(ModArmorMaterials.MOMEN_TOFU, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final Item SOYBEANS = registerItem("soybeans", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tofumod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tofumod.LOGGER.info("Registering Mod Items for " + Tofumod.MOD_ID);

    }

}
