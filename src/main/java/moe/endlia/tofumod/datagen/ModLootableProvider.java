package moe.endlia.tofumod.datagen;

import moe.endlia.tofumod.block.ModBlocks;
import moe.endlia.tofumod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootableProvider extends FabricBlockLootTableProvider {


    public ModLootableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, registriesFuture);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TOFU_ORE_BLOCK, oreDrops(ModBlocks.TOFU_ORE_BLOCK, ModItems.TOFU_GEM));
    }
}
