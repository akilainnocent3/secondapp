package com.yandex.div.core.expression.local;

import java.util.ArrayList;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ChildPathUnitCache {

    @l
    public static final ChildPathUnitCache INSTANCE = new ChildPathUnitCache();

    @l
    private static ArrayList<String> cache = new ArrayList<>();

    private ChildPathUnitCache() {
    }

    private final void ensureGenerated(int i10) {
        if (cache.size() > i10) {
            return;
        }
        cache.ensureCapacity(i10 + 1);
        int size = cache.size();
        if (size > i10) {
            return;
        }
        while (true) {
            cache.add(size, "child#" + size);
            if (size == i10) {
                return;
            } else {
                size++;
            }
        }
    }

    @l
    public final String getValue$div_release(int i10) {
        ensureGenerated(i10);
        return cache.get(i10);
    }
}
