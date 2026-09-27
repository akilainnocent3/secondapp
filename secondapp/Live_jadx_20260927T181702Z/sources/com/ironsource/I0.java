package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f59213a;

    public I0(long j10) {
        this.f59213a = j10;
    }

    public final long a() {
        return this.f59213a;
    }

    public final long b() {
        return this.f59213a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.f59213a == ((I0) obj).f59213a;
    }

    public int hashCode() {
        return f0.p.a(this.f59213a);
    }

    @oy.l
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f59213a + gi.j.f86771d;
    }

    @oy.l
    public final I0 a(long j10) {
        return new I0(j10);
    }

    public static /* synthetic */ I0 a(I0 i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = i10.f59213a;
        }
        return i10.a(j10);
    }
}
