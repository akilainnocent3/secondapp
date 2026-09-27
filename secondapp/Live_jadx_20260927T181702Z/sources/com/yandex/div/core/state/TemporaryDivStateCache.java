package com.yandex.div.core.state;

import com.yandex.div.core.dagger.DivScope;
import dr.w2;
import java.util.LinkedHashMap;
import java.util.Map;
import k.d;
import oy.l;
import oy.m;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public final class TemporaryDivStateCache {

    @l
    private final Map<String, Map<String, String>> temporaryCache = new LinkedHashMap();

    @cr.a
    public TemporaryDivStateCache() {
    }

    @d
    public final void clear() {
        this.temporaryCache.clear();
    }

    @d
    @m
    public final String getState(@l String str, @l String str2) {
        String str3;
        synchronized (this.temporaryCache) {
            Map<String, String> map = this.temporaryCache.get(str);
            str3 = map != null ? map.get(str2) : null;
        }
        return str3;
    }

    @d
    public final void putRootState(@l String str, @l String str2) {
        putState(str, c.userBaseDel, str2);
    }

    @d
    public final void putState(@l String str, @l String str2, @l String str3) {
        synchronized (this.temporaryCache) {
            try {
                Map<String, Map<String, String>> map = this.temporaryCache;
                Map<String, String> linkedHashMap = map.get(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                    map.put(str, linkedHashMap);
                }
                linkedHashMap.put(str2, str3);
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @d
    @m
    public final Map<String, String> resetCard(@l String str) {
        Map<String, String> mapRemove;
        synchronized (this.temporaryCache) {
            mapRemove = this.temporaryCache.remove(str);
        }
        return mapRemove;
    }
}
