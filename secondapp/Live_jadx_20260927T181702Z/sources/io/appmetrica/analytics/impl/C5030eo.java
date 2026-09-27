package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5030eo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f97305c = {0, 1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f97306a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97307b = 0;

    public C5030eo(int[] iArr) {
        for (int i10 : iArr) {
            this.f97306a.put(i10, new HashMap());
        }
    }
}
