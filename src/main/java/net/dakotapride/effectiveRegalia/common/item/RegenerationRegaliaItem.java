package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;

public class RegenerationRegaliaItem extends RegaliaItem {
    public RegenerationRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void getRegaliaEffect() {
        effect = regeneration;
    }
}
