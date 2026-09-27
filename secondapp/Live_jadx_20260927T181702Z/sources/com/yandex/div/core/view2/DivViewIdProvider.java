package com.yandex.div.core.view2;

import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.internal.util.CollectionsKt;
import f2.z1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public final class DivViewIdProvider {

    @oy.l
    private final Map<String, Integer> cache = CollectionsKt.arrayMap();

    @cr.a
    public DivViewIdProvider() {
    }

    public final int getViewId(@oy.m String str) {
        if (str == null) {
            return -1;
        }
        Map<String, Integer> map = this.cache;
        Integer numValueOf = map.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(z1.D());
            map.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final void reset() {
        this.cache.clear();
    }
}
