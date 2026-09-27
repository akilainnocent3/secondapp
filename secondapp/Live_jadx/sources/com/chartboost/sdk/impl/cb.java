package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38412d;

    public cb(int i10, int i11, int i12, int i13) {
        this.f38409a = i10;
        this.f38410b = i11;
        this.f38411c = i12;
        this.f38412d = i13;
    }

    public final int a() {
        return this.f38412d;
    }

    public final int b() {
        return this.f38411c;
    }

    public final int c() {
        return this.f38409a;
    }

    public final int d() {
        return this.f38410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return this.f38409a == cbVar.f38409a && this.f38410b == cbVar.f38410b && this.f38411c == cbVar.f38411c && this.f38412d == cbVar.f38412d;
    }

    public int hashCode() {
        return (((((this.f38409a * 31) + this.f38410b) * 31) + this.f38411c) * 31) + this.f38412d;
    }

    public String toString() {
        return "IntRectangle(x=" + this.f38409a + ", y=" + this.f38410b + ", width=" + this.f38411c + ", height=" + this.f38412d + gi.j.f86771d;
    }

    public final void a(int i10) {
        this.f38412d = i10;
    }

    public final void b(int i10) {
        this.f38411c = i10;
    }

    public final void c(int i10) {
        this.f38409a = i10;
    }

    public final void d(int i10) {
        this.f38410b = i10;
    }

    public /* synthetic */ cb(int i10, int i11, int i12, int i13, int i14, kotlin.jvm.internal.x xVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
