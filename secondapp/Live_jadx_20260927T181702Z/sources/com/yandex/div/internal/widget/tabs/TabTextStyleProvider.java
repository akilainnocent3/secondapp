package com.yandex.div.internal.widget.tabs;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.font.DivTypefaceProvider;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public final class TabTextStyleProvider {

    @l
    private final DivTypefaceProvider typefaceProvider;

    @cr.a
    public TabTextStyleProvider(@l DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProvider = divTypefaceProvider;
    }

    @l
    public final DivTypefaceProvider getTypefaceProvider() {
        return this.typefaceProvider;
    }
}
