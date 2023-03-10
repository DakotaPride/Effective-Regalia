package net.dakotapride.effectiveRegalia.common.register;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.dakotapride.effectiveRegalia.common.item.effect.*;
import net.dakotapride.effectiveRegalia.common.item.immune.*;
import net.dakotapride.effectiveRegalia.common.item.resistant.IllagerRegaliaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.dakotapride.effectiveRegalia.common.item.effect.NightVisionRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.RegenerationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.StrengthRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SaturationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.JumpBoostRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SlowFallingRegaliaItem.*;

import net.dakotapride.effectiveRegalia.common.item.immune.HungerImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.PoisonImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WitherImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.FireImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WeaknessImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.MiningFatigueImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.BlindnessImmuneRegaliaItem.*;

public class ItemInit implements Constants {

    public static RegaliaItem REGALIA = new RegaliaItem(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_GOLDEN = new RegaliaItem(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_PLATED = new RegaliaItem(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH = new StrengthRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH_GOLDEN = new GoldenStrengthRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH_PLATED = new NetheritePlatedStrengthRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION = new NightVisionRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION_GOLDEN = new GoldenNightVisionRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION_PLATED = new NetheritePlatedNightVisionRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION = new RegenerationRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION_GOLDEN = new GoldenRegenerationRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION_PLATED = new NetheritePlatedRegenerationRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION = new SaturationRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION_GOLDEN = new GoldenSaturationRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION_PLATED = new NetheritePlatedSaturationRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST = new JumpBoostRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST_GOLDEN = new GoldenJumpBoostRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST_PLATED = new NetheritePlatedJumpBoostRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SLOW_FALLING = new SlowFallingRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SLOW_FALLING_GOLDEN = new GoldenSlowFallingRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SLOW_FALLING_PLATED = new NetheritePlatedSlowFallingRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static Item BLAZING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item GOLDEN_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item CRYING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item LEAPING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item NIGHT_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static RegaliaItem REGALIA_HUNGER = new HungerImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_HUNGER_GOLDEN = new GoldenHungerImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_HUNGER_PLATED = new NetheritePlatedHungerImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_POISON = new PoisonImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_POISON_GOLDEN = new GoldenPoisonImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_POISON_PLATED = new NetheritePlatedPoisonImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WITHER = new WitherImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WITHER_GOLDEN = new GoldenWitherImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WITHER_PLATED = new NetheritePlatedWitherImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WEAKNESS = new WeaknessImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WEAKNESS_GOLDEN = new GoldenWeaknessImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_WEAKNESS_PLATED = new NetheritePlatedWeaknessImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_MINING_FATIGUE = new MiningFatigueImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_MINING_FATIGUE_GOLDEN = new GoldenMiningFatigueImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_MINING_FATIGUE_PLATED = new NetheritePlatedMiningFatigueImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_FIRE = new FireImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_FIRE_GOLDEN = new GoldenFireImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_FIRE_PLATED = new NetheritePlatedFireImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_BLINDNESS = new BlindnessImmuneRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_BLINDNESS_GOLDEN = new GoldenBlindnessImmuneRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_BLINDNESS_PLATED = new NetheritePlatedBlindnessImmuneRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static Item STARVING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item VENOMOUS_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item DECAYING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item WEAKENED_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item OCEANIC_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static Item UNFORESEEN_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    public static RegaliaItem REGALIA_ILLAGER_VOID = new IllagerRegaliaItem(new FabricItemSettings().maxDamage(4026).group(ItemGroup.COMBAT));
    //public static RegaliaItem REGALIA_UNDEAD_VOID = new UndeadRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    //public static RegaliaItem REGALIA_PLAYER_VOID = new PlayerRegaliaItem(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    //public static RegaliaItem REGALIA_ENDER_VOID = new EnderRegaliaItem(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    //public static RegaliaItem REGALIA_ARTHROPOD_VOID = new ArthropodRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    //public static RegaliaItem REGALIA_NETHER_VOID = new NetherRegaliaItem(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    //public static Item HORRID_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //public static Item UNDERLYING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //public static Item SELF_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //public static Item NEVER_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    //public static Item SWELETERING_RELIC = new Item(new FabricItemSettings().group(ItemGroup.MISC));

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
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_wither"), REGALIA_WITHER);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_wither"), REGALIA_WITHER_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_wither"), REGALIA_WITHER_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_weakness"), REGALIA_WEAKNESS);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_weakness"), REGALIA_WEAKNESS_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_weakness"), REGALIA_WEAKNESS_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_mining_fatigue"), REGALIA_MINING_FATIGUE);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_mining_fatigue"), REGALIA_MINING_FATIGUE_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_mining_fatigue"), REGALIA_MINING_FATIGUE_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_fire"), REGALIA_FIRE);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_fire"), REGALIA_FIRE_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_fire"), REGALIA_FIRE_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_blindness"), REGALIA_BLINDNESS);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_blindness"), REGALIA_BLINDNESS_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_blindness"), REGALIA_BLINDNESS_PLATED);

        Registry.register(Registry.ITEM, new Identifier(modId, "void_regalia_illager"), REGALIA_ILLAGER_VOID);

        Registry.register(Registry.ITEM, new Identifier(modId, "blazing_warrior"), BLAZING_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_meal"), GOLDEN_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "crying_soul"), CRYING_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "leaping_contender"), LEAPING_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "night_sky"), NIGHT_RELIC);

        Registry.register(Registry.ITEM, new Identifier(modId, "starving_servant"), STARVING_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "venomous_soldier"), VENOMOUS_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "decaying_wound"), DECAYING_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "weakened_moon"), WEAKENED_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "oceanic_currents"), OCEANIC_RELIC);
        Registry.register(Registry.ITEM, new Identifier(modId, "unforeseen"), UNFORESEEN_RELIC);
    }

}
