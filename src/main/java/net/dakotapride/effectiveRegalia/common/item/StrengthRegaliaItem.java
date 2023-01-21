package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;

public class StrengthRegaliaItem extends RegaliaItem {
    public StrengthRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void getRegaliaEffect() {
        effect = strength;
    }
}
