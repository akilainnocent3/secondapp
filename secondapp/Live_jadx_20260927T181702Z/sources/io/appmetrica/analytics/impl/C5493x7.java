package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5493x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98567b;

    public C5493x7(long j10, int i10) {
        this.f98566a = j10;
        this.f98567b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5493x7)) {
            return false;
        }
        C5493x7 c5493x7 = (C5493x7) obj;
        return this.f98566a == c5493x7.f98566a && this.f98567b == c5493x7.f98567b;
    }

    public final int hashCode() {
        return this.f98567b + (f0.p.a(this.f98566a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f98566a + ", exponent=" + this.f98567b + ')';
    }
}
