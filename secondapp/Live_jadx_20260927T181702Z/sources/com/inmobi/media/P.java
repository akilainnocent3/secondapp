package com.inmobi.media;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class P implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        F6 f10 = (F6) obj2;
        F6 f11 = (F6) obj;
        return jr.g.l(Integer.valueOf(f10.f54604c * f10.f54605d), Integer.valueOf(f11.f54604c * f11.f54605d));
    }
}
