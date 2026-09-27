package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float f10 = ((s) obj).f47140c;
        float f11 = ((s) obj2).f47140c;
        if (f10 < f11) {
            return -1;
        }
        return f11 < f10 ? 1 : 0;
    }
}
