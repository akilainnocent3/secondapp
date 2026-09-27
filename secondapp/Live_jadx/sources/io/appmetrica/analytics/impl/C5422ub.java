package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ub, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5422ub implements Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia f98405a;

    public C5422ub(Ia ia2) {
        this.f98405a = ia2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, String str2) {
        this.f98405a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        this.f98405a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z10) {
        return this.f98405a.getBoolean(str, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i10) {
        return this.f98405a.getInt(str, i10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        return this.f98405a.getLong(str, j10);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        return this.f98405a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        this.f98405a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        this.f98405a.a(str, j10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(int i10, String str) {
        this.f98405a.a(i10, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z10) {
        this.f98405a.a(str, z10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        this.f98405a.a(str, f10);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        return this.f98405a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        return this.f98405a.a();
    }
}
