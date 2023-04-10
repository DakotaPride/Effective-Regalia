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
                .offerTo(exporter, new Identifier("regalia/base/" + RecipeProvider.getRecipeName(ItemInit.REGALIA)));

        ShapedRecipeJsonBuilder.create(ItemInit.REGALIA_GOLDEN)
                .pattern(" ##")
                .pattern("# #")
                .pattern("## ")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier("regalia/base/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_GOLDEN)));

        SmithingRecipeJsonBuilder.create(Ingredient.ofItems(ItemInit.REGALIA_GOLDEN),
                Ingredient.ofItems(Items.NETHERITE_SCRAP), ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(Items.NETHERITE_SCRAP),
                        RecipeProvider.conditionsFromItem(Items.NETHERITE_SCRAP))
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_GOLDEN),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_GOLDEN))
                .offerTo(exporter, new Identifier("regalia/base/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_PLATED)));

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
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS)));
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
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS_GOLDEN)));
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
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_BLINDNESS_PLATED)));

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
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE)));
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
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE_GOLDEN)));
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
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_FIRE_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_HUNGER)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.ROTTEN_FLESH)
                .criterion(RecipeProvider.hasItem(Items.ROTTEN_FLESH),
                        RecipeProvider.conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_HUNGER)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_HUNGER_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.ROTTEN_FLESH)
                .criterion(RecipeProvider.hasItem(Items.ROTTEN_FLESH),
                        RecipeProvider.conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_HUNGER_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_HUNGER_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.ROTTEN_FLESH)
                .criterion(RecipeProvider.hasItem(Items.ROTTEN_FLESH),
                        RecipeProvider.conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_HUNGER_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_JUMP_BOOST)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.RABBIT_FOOT)
                .criterion(RecipeProvider.hasItem(Items.RABBIT_FOOT),
                        RecipeProvider.conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_JUMP_BOOST)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_JUMP_BOOST_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.RABBIT_FOOT)
                .criterion(RecipeProvider.hasItem(Items.RABBIT_FOOT),
                        RecipeProvider.conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_JUMP_BOOST_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_JUMP_BOOST_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.RABBIT_FOOT)
                .criterion(RecipeProvider.hasItem(Items.RABBIT_FOOT),
                        RecipeProvider.conditionsFromItem(Items.RABBIT_FOOT))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_JUMP_BOOST_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_MINING_FATIGUE)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PRISMARINE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_MINING_FATIGUE)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_MINING_FATIGUE_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PRISMARINE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_MINING_FATIGUE_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_MINING_FATIGUE_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PRISMARINE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_MINING_FATIGUE_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_NIGHT_VISION)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GOLDEN_CARROT)
                .criterion(RecipeProvider.hasItem(Items.GOLDEN_CARROT),
                        RecipeProvider.conditionsFromItem(Items.GOLDEN_CARROT))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_NIGHT_VISION)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_NIGHT_VISION_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GOLDEN_CARROT)
                .criterion(RecipeProvider.hasItem(Items.GOLDEN_CARROT),
                        RecipeProvider.conditionsFromItem(Items.GOLDEN_CARROT))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_NIGHT_VISION_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_NIGHT_VISION_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GOLDEN_CARROT)
                .criterion(RecipeProvider.hasItem(Items.GOLDEN_CARROT),
                        RecipeProvider.conditionsFromItem(Items.GOLDEN_CARROT))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_NIGHT_VISION_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_POISON)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.SPIDER_EYE)
                .criterion(RecipeProvider.hasItem(Items.SPIDER_EYE),
                        RecipeProvider.conditionsFromItem(Items.SPIDER_EYE))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_POISON)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_POISON_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.SPIDER_EYE)
                .criterion(RecipeProvider.hasItem(Items.SPIDER_EYE),
                        RecipeProvider.conditionsFromItem(Items.SPIDER_EYE))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_POISON_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_POISON_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.SPIDER_EYE)
                .criterion(RecipeProvider.hasItem(Items.SPIDER_EYE),
                        RecipeProvider.conditionsFromItem(Items.SPIDER_EYE))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_POISON_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_REGENERATION)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GHAST_TEAR)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_REGENERATION)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_REGENERATION_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GHAST_TEAR)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_REGENERATION_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_REGENERATION_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GHAST_TEAR)
                .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                        RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_REGENERATION_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SATURATION)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.APPLE)
                .criterion(RecipeProvider.hasItem(Items.APPLE),
                        RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SATURATION)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SATURATION_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.APPLE)
                .criterion(RecipeProvider.hasItem(Items.APPLE),
                        RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SATURATION_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SATURATION_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.APPLE)
                .criterion(RecipeProvider.hasItem(Items.APPLE),
                        RecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SATURATION_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SLOW_FALLING)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(RecipeProvider.hasItem(Items.PHANTOM_MEMBRANE),
                        RecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SLOW_FALLING)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SLOW_FALLING_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(RecipeProvider.hasItem(Items.PHANTOM_MEMBRANE),
                        RecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SLOW_FALLING_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_SLOW_FALLING_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.PHANTOM_MEMBRANE)
                .criterion(RecipeProvider.hasItem(Items.PHANTOM_MEMBRANE),
                        RecipeProvider.conditionsFromItem(Items.PHANTOM_MEMBRANE))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_SLOW_FALLING_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_STRENGTH)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_STRENGTH)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_STRENGTH_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_STRENGTH_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_STRENGTH_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_STRENGTH_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WEAKNESS)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BROWN_MUSHROOM)
                .criterion(RecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WEAKNESS)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WEAKNESS_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BROWN_MUSHROOM)
                .criterion(RecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WEAKNESS_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WEAKNESS_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.BROWN_MUSHROOM)
                .criterion(RecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WEAKNESS_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WITHER)
                .input(ItemInit.REGALIA)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.WITHER_ROSE)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE),
                        RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier("regalia/iron/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WITHER)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WITHER_GOLDEN)
                .input(ItemInit.REGALIA_GOLDEN)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.WITHER_ROSE)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE),
                        RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier("regalia/golden/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WITHER_GOLDEN)));
        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_WITHER_PLATED)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.WITHER_ROSE)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE),
                        RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_WITHER_PLATED)));

        ShapelessRecipeJsonBuilder.create(ItemInit.REGALIA_HEALTH)
                .input(ItemInit.REGALIA_PLATED)
                .criterion(RecipeProvider.hasItem(ItemInit.REGALIA_PLATED),
                        RecipeProvider.conditionsFromItem(ItemInit.REGALIA_PLATED))
                .input(Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .input(Items.GHAST_TEAR)
                .input(Items.POPPY)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE),
                        RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier("regalia/plated/" + RecipeProvider.getRecipeName(ItemInit.REGALIA_HEALTH)));
    }
}
