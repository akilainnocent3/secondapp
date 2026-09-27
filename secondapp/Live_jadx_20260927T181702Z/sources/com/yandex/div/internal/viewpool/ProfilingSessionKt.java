package com.yandex.div.internal.viewpool;

import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ProfilingSessionKt {
    private static final long floorTo(long j10, long j11) {
        return (j10 / j11) * j11;
    }

    @h1
    public static final long roundRoughly(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        if (j10 < 100) {
            return floorTo(j10, 20L);
        }
        if (j10 < 1000) {
            return floorTo(j10, 100L);
        }
        if (j10 < 2000) {
            return floorTo(j10, 200L);
        }
        if (j10 < 5000) {
            return floorTo(j10, 500L);
        }
        if (j10 < 10000) {
            return floorTo(j10, 1000L);
        }
        if (j10 < 20000) {
            return floorTo(j10, 2000L);
        }
        if (j10 < 50000) {
            return floorTo(j10, 5000L);
        }
        return 50000L;
    }
}
