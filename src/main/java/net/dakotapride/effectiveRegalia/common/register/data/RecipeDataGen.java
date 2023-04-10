package net.dakotapride.effectiveRegalia.common.register.data;

import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class RecipeDataGen extends FabricRecipeProvider {
    public RecipeDataGen(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        // Regalia, Golden Regalia, Plated Regalia
        generateBaseRegaliaRecipes(exporter);

        // Effect/Function Regalia
        generateFunctionRegaliaRecipes(exporter);
    }



    private void generateBaseRegaliaRecipes(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(ItemInit.REGALIA)
                .pattern(" ##")
                .pattern("# #")
                .pattern("## ")
                .input('#', Items.IRON_INGOT)
                .criterion(RecipeProvider.hasItem(Items.IRON_INGOT),
                        RecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA)));

        ShapedRecipeJsonBuilder.create(ItemInit.REGALIA_GOLDEN)
                .pattern(" ##")
                .pattern("# #")
                .pattern("## ")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_GOLDEN)));

        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(ItemInit.REGALIA_GOLDEN),
                Ingredient.ofItems(Items.NETHERITE_SCRAP), ItemInit.REGALIA_PLATED);

    }

    private void generateFunctionRegaliaRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_BLINDNESS)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.CHARCOAL)
                .criterion(RecipeProvider.hasItem(Items.CHARCOAL),
                        RecipeProvider.conditionsFromItem(Items.CHARCOAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_BLINDNESS_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.CHARCOAL)
                .criterion(RecipeProvider.hasItem(Items.CHARCOAL),
                        RecipeProvider.conditionsFromItem(Items.CHARCOAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_BLINDNESS_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.CHARCOAL)
                .criterion(RecipeProvider.hasItem(Items.CHARCOAL),
                        RecipeProvider.conditionsFromItem(Items.CHARCOAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_FIRE)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.MAGMA_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.MAGMA_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_FIRE_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.MAGMA_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.MAGMA_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_FIRE_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.MAGMA_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.MAGMA_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE_PLATED)));
    }
}
