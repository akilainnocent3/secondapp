package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class I4 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95928b;

    public I4(@oy.l R4 r10) {
        this.f95927a = String.format("component_%s.db", Arrays.copyOf(new Object[]{r10.d() ? "main" : r10.b()}, 1));
        this.f95928b = "db_metrica_" + r10;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @oy.l
    public final String a() {
        return this.f95928b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @oy.l
    public final String b() {
        return this.f95927a;
    }
}
