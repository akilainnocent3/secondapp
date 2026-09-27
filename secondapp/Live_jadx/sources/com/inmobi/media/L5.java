package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class L5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55044c;

    public L5(int i10, int i11, float f10) {
        this.f55042a = i10;
        this.f55043b = i11;
        this.f55044c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l10 = (L5) obj;
        return this.f55042a == l10.f55042a && this.f55043b == l10.f55043b && Float.compare(this.f55044c, l10.f55044c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55044c) + AbstractC3671fi.a(this.f55043b, this.f55042a * 31, 31);
    }

    public final String toString() {
        return "DisplayProperties(width=" + this.f55042a + ", height=" + this.f55043b + ", density=" + this.f55044c + gi.j.f86771d;
    }
}
