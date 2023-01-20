package net.dakotapride.effectiveRegalia.common;

import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EffectiveRegalia implements ModInitializer {

    @Override
    public void onInitialize() {

        ItemInit.registerRegaliaItems();
    }
}
