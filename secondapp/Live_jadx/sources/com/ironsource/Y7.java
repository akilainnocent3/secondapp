package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f60378b;

    public Y7(int i10, int i11) {
        this.f60377a = i10;
        this.f60378b = i11;
    }

    public final int a() {
        return this.f60377a;
    }

    public final int b() {
        return this.f60378b;
    }

    public final int c() {
        return this.f60378b;
    }

    public final int d() {
        return this.f60377a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y7)) {
            return false;
        }
        Y7 y10 = (Y7) obj;
        return this.f60377a == y10.f60377a && this.f60378b == y10.f60378b;
    }

    public int hashCode() {
        return (this.f60377a * 31) + this.f60378b;
    }

    @oy.l
    public String toString() {
        return "ISContainerParams(width=" + this.f60377a + ", height=" + this.f60378b + gi.j.f86771d;
    }

    @oy.l
    public final Y7 a(int i10, int i11) {
        return new Y7(i10, i11);
    }

    public static /* synthetic */ Y7 a(Y7 y10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = y10.f60377a;
        }
        if ((i12 & 2) != 0) {
            i11 = y10.f60378b;
        }
        return y10.a(i10, i11);
    }
}
