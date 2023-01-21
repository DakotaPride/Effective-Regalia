package net.dakotapride.effectiveRegalia.common;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EffectiveRegalia implements ModInitializer {

    @Override
    public void onInitialize() {

        ItemInit.registerRegaliaItems();

    }
}
