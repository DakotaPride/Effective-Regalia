package net.dakotapride.effectiveRegalia.common.register;

import net.dakotapride.effectiveRegalia.common.item.RegaliaItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit implements Constants {

    public static Item REGALIA = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));
    public static RegaliaItem REGALIA_STRENGTH = new RegaliaItem(new FabricItemSettings().group(ItemGroup.COMBAT));


    public static void registerRegaliaItems() {
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia"), REGALIA);
        Registry.register(Registry.ITEM, new Identifier(modId, "regalia_strength"), REGALIA_STRENGTH);
    }

}
