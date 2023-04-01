package net.dakotapride.effectiveRegalia.common.register;

import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.dakotapride.effectiveRegalia.common.item.effect.*;
import net.dakotapride.effectiveRegalia.common.item.immune.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.dakotapride.effectiveRegalia.common.item.effect.StrengthRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.NightVisionRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.RegenerationRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SaturationRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.JumpBoostRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SlowFallingRegaliaTrinketItem.*;

import net.dakotapride.effectiveRegalia.common.item.immune.HungerImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.PoisonImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WeaknessImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WitherImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.BlindnessImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.MiningFatigueImmunityRegaliaTrinketItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.FireImmunityRegaliaTrinketItem.*;

public class ItemInit implements Constants {

    // Bonus Effects

    public static BaseRegaliaTrinketItem REGALIA = new BaseRegaliaTrinketItem
            (new FabricItemSettings().maxCount(16).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_GOLDEN = new BaseRegaliaTrinketItem
            (new FabricItemSettings().maxCount(16).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_PLATED = new BaseRegaliaTrinketItem
            (new FabricItemSettings().maxCount(16).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_STRENGTH = new StrengthRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_STRENGTH_GOLDEN = new GoldenStrengthRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_STRENGTH_PLATED = new PlatedStrengthRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_NIGHT_VISION = new NightVisionRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_NIGHT_VISION_GOLDEN = new GoldenNightVisionRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_NIGHT_VISION_PLATED = new PlatedNightVisionRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_REGENERATION = new RegenerationRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_REGENERATION_GOLDEN = new GoldenRegenerationRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_REGENERATION_PLATED = new PlatedRegenerationRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_SATURATION = new SaturationRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_SATURATION_GOLDEN = new GoldenSaturationRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_SATURATION_PLATED = new PlatedSaturationRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_JUMP_BOOST = new JumpBoostRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_JUMP_BOOST_GOLDEN = new GoldenJumpBoostRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_JUMP_BOOST_PLATED = new PlatedJumpBoostRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_SLOW_FALLING = new SlowFallingRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_SLOW_FALLING_GOLDEN = new GoldenSlowFallingRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_SLOW_FALLING_PLATED = new PlatedSlowFallingRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    // Immunities

    public static BaseRegaliaTrinketItem REGALIA_HUNGER = new HungerImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_HUNGER_GOLDEN = new GoldenHungerImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_HUNGER_PLATED = new PlatedHungerImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_POISON = new PoisonImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_POISON_GOLDEN = new GoldenPoisonImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_POISON_PLATED = new PlatedPoisonImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_WEAKNESS = new WeaknessImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_WEAKNESS_GOLDEN = new GoldenWeaknessImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_WEAKNESS_PLATED = new PlatedWeaknessImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_WITHER = new WitherImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_WITHER_GOLDEN = new GoldenWitherImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_WITHER_PLATED = new PlatedWitherImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_MINING_FATIGUE = new MiningFatigueImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_MINING_FATIGUE_GOLDEN = new GoldenMiningFatigueImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_MINING_FATIGUE_PLATED = new PlatedMiningFatigueImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_BLINDNESS = new BlindnessImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_BLINDNESS_GOLDEN = new GoldenBlindnessImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_BLINDNESS_PLATED = new PlatedBlindnessImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));

    public static BaseRegaliaTrinketItem REGALIA_FIRE = new FireImmunityRegaliaTrinketItem
            (new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_FIRE_GOLDEN = new GoldenFireImmunityRegalia
            (new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static BaseRegaliaTrinketItem REGALIA_FIRE_PLATED = new PlatedFireImmunityRegalia
            (new FabricItemSettings().maxDamage(1526).group(ItemGroup.COMBAT));


    /*

    public static RegaliaItem REGALIA_ILLAGER_VOID = new IllagerRegaliaItem(new FabricItemSettings().maxDamage(4026).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_UNDEAD_VOID = new UndeadRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_PLAYER_VOID = new PlayerRegaliaItem(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_ENDER_VOID = new EnderRegaliaItem(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_ARTHROPOD_VOID = new ArthropodRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NETHER_VOID = new NetherRegaliaItem(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));

     */

    public static void registerRegaliaItems() {
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia"), REGALIA);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia"), REGALIA_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia"), REGALIA_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_strength"), REGALIA_STRENGTH);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_strength"), REGALIA_STRENGTH_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_strength"), REGALIA_STRENGTH_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_night_vision"), REGALIA_NIGHT_VISION);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_night_vision"), REGALIA_NIGHT_VISION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_night_vision"), REGALIA_NIGHT_VISION_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_regeneration"), REGALIA_REGENERATION);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_regeneration"), REGALIA_REGENERATION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_regeneration"), REGALIA_REGENERATION_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_saturation"), REGALIA_SATURATION);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_saturation"), REGALIA_SATURATION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_saturation"), REGALIA_SATURATION_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_jump_boost"), REGALIA_JUMP_BOOST);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_jump_boost"), REGALIA_JUMP_BOOST_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_jump_boost"), REGALIA_JUMP_BOOST_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_slow_falling"), REGALIA_SLOW_FALLING);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_slow_falling"), REGALIA_SLOW_FALLING_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_slow_falling"), REGALIA_SLOW_FALLING_PLATED);



        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_hunger"), REGALIA_HUNGER);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_hunger"), REGALIA_HUNGER_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_hunger"), REGALIA_HUNGER_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_poison"), REGALIA_POISON);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_poison"), REGALIA_POISON_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_poison"), REGALIA_POISON_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_weakness"), REGALIA_WEAKNESS);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_weakness"), REGALIA_WEAKNESS_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_weakness"), REGALIA_WEAKNESS_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_wither"), REGALIA_WITHER);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_wither"), REGALIA_WITHER_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_wither"), REGALIA_WITHER_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_mining_fatigue"), REGALIA_MINING_FATIGUE);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_mining_fatigue"), REGALIA_MINING_FATIGUE_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_mining_fatigue"), REGALIA_MINING_FATIGUE_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_blindness"), REGALIA_BLINDNESS);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_blindness"), REGALIA_BLINDNESS_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_blindness"), REGALIA_BLINDNESS_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_fire"), REGALIA_FIRE);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_fire"), REGALIA_FIRE_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_fire"), REGALIA_FIRE_PLATED);
    }

}
