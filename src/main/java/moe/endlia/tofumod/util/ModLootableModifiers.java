package moe.endlia.tofumod.util;

import moe.endlia.tofumod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootableModifiers {

    public static void modifyLootables(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if (Blocks.SHORT_GRASS.getLootTableKey() == key && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.SOYBEANS));
                tableBuilder.pool(pool);
            }
        });
    }
}
