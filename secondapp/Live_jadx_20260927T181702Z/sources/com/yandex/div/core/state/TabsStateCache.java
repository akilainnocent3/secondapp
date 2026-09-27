package com.yandex.div.core.state;

import com.yandex.div.core.dagger.DivScope;
import java.util.LinkedHashMap;
import java.util.Map;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public final class TabsStateCache {

    @l
    private final Map<String, Map<String, Integer>> temporaryCache = new LinkedHashMap();

    @cr.a
    public TabsStateCache() {
    }

    @m
    public final Integer getSelectedTab(@l String str, @l String str2) {
        Map<String, Integer> map = this.temporaryCache.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final void putSelectedTab(@l String str, @l String str2, int i10) {
        Map<String, Map<String, Integer>> map = this.temporaryCache;
        Map<String, Integer> linkedHashMap = map.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, Integer.valueOf(i10));
    }
}
