package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a4 {
    public static final int b(bh.j jVar, bh.j jVar2) {
        long j10 = jVar.f21392g;
        long j11 = jVar2.f21392g;
        if (j10 - j11 == 0) {
            return jVar.compareTo(jVar2);
        }
        return j10 < j11 ? -1 : 1;
    }
}
