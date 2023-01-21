package net.dakotapride.effectiveRegalia.common.register;

import net.dakotapride.effectiveRegalia.common.item.HealthBoostRegaliaItem;
import net.dakotapride.effectiveRegalia.common.item.NightVisionRegaliaItem;
import net.dakotapride.effectiveRegalia.common.item.RegenerationRegaliaItem;
import net.dakotapride.effectiveRegalia.common.item.StrengthRegaliaItem;
import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit implements Constants {

    public static Item REGALIA = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH = new StrengthRegaliaItem(new FabricItemSettings().maxDamage(1024).maxCount(1).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_NIGHT_VISION = new NightVisionRegaliaItem(new FabricItemSettings().maxDamage(1024).maxCount(1).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_REGENERATION = new RegenerationRegaliaItem(new FabricItemSettings().maxDamage(1024).maxCount(1).group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_HEALTH_BOOST = new HealthBoostRegaliaItem(new FabricItemSettings().maxDamage(1024).maxCount(1).group(ItemGroup.COMBAT));


    public static void registerRegaliaItems() {
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia"), REGALIA);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_strength"), REGALIA_STRENGTH);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_night_vision"), REGALIA_NIGHT_VISION);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_regeneration"), REGALIA_REGENERATION);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_health_boost"), REGALIA_HEALTH_BOOST);
    }

}
