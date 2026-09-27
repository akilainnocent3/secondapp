package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Kn implements Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96081c = 0;

    public Kn(int i10, int i11) {
        this.f96079a = i10;
        this.f96080b = i11;
    }

    public final int a() {
        return this.f96080b;
    }

    public final boolean b() {
        int i10 = this.f96081c;
        this.f96081c = i10 + 1;
        return i10 < this.f96079a;
    }

    public final void c() {
        this.f96081c = 0;
    }
}
