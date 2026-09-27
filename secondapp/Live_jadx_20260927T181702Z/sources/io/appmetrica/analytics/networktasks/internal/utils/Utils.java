package io.appmetrica.analytics.networktasks.internal.utils;

import cs.o;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Utils {

    @l
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @o
    public static final boolean isBadRequest(int i10) {
        return i10 == 400;
    }
}
