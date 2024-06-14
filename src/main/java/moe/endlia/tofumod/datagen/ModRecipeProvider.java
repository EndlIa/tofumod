package moe.endlia.tofumod.datagen;

import moe.endlia.tofumod.block.ModBlocks;
import moe.endlia.tofumod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offer2x2CompactingRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOMEN_TOFU_BLOCK, ModItems.MOMEN_TOFU);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOFU_SCOOP, 1)
                .pattern("I")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('I', Items.IRON_BARS)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.IRON_BARS), conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOFU_SCOOP)));
    }
}
