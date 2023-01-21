package net.dakotapride.effectiveRegalia.common.register;

import net.dakotapride.effectiveRegalia.common.item.*;
import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.dakotapride.effectiveRegalia.common.item.NightVisionRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.RegenerationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.StrengthRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.SaturationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.JumpBoostRegaliaItem.*;

public class ItemInit implements Constants {

    public static Item REGALIA = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH = new StrengthRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION = new NightVisionRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION = new RegenerationRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION = new SaturationRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST = new JumpBoostRegaliaItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT));

    public static RegaliaItem REGALIA_STRENGTH_GOLDEN = new GoldenStrengthRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION_GOLDEN = new GoldenNightVisionRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION_GOLDEN = new GoldenRegenerationRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION_GOLDEN = new GoldenSaturationRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST_GOLDEN = new GoldenJumpBoostRegalia(new FabricItemSettings().maxDamage(2012).group(ItemGroup.COMBAT));

    public static RegaliaItem REGALIA_STRENGTH_PLATED = new NetheritePlatedStrengthRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION_PLATED = new NetheritePlatedNightVisionRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION_PLATED = new NetheritePlatedRegenerationRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_SATURATION_PLATED = new NetheritePlatedSaturationRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_JUMP_BOOST_PLATED = new NetheritePlatedJumpBoostRegalia(new FabricItemSettings().maxDamage(3018).group(ItemGroup.COMBAT));


    public static void registerRegaliaItems() {
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia"), REGALIA);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_strength"), REGALIA_STRENGTH);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_night_vision"), REGALIA_NIGHT_VISION);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_regeneration"), REGALIA_REGENERATION);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_saturation"), REGALIA_SATURATION);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_jump_boost"), REGALIA_JUMP_BOOST);

        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_strength"), REGALIA_STRENGTH_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_night_vision"), REGALIA_NIGHT_VISION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_regeneration"), REGALIA_REGENERATION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_saturation"), REGALIA_SATURATION_GOLDEN);
        Registry.register(Registry.ITEM, new Identifier(modId, "golden_regalia_jump_boost"), REGALIA_JUMP_BOOST_GOLDEN);

        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_strength"), REGALIA_STRENGTH_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_night_vision"), REGALIA_NIGHT_VISION_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_regeneration"), REGALIA_REGENERATION_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_saturation"), REGALIA_SATURATION_PLATED);
        Registry.register(Registry.ITEM, new Identifier(modId, "plated_regalia_jump_boost"), REGALIA_JUMP_BOOST_PLATED);
    }

}
