package com.startapp.sdk.internal;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c6 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f74630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f74631b;

    public c6(Comparator comparator, Comparator comparator2) {
        this.f74630a = comparator;
        this.f74631b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f74630a.compare(obj, obj2);
        return iCompare == 0 ? this.f74631b.compare(obj, obj2) : iCompare;
    }
}
