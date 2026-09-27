package com.yandex.div.core.view2;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.font.DivTypefaceProvider;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public class DivTypefaceResolver {

    @oy.l
    private final DivTypefaceProvider defaultTypeface;

    @oy.l
    private final Map<String, DivTypefaceProvider> typefaceProviders;

    /* JADX WARN: Multi-variable type inference failed */
    @cr.a
    public DivTypefaceResolver(@oy.l Map<String, ? extends DivTypefaceProvider> map, @oy.l DivTypefaceProvider divTypefaceProvider) {
        this.typefaceProviders = map;
        this.defaultTypeface = divTypefaceProvider;
    }

    @oy.l
    public DivTypefaceProvider getTypefaceProvider(@oy.m String str) {
        DivTypefaceProvider divTypefaceProvider;
        return (str == null || (divTypefaceProvider = this.typefaceProviders.get(str)) == null) ? this.defaultTypeface : divTypefaceProvider;
    }
}
