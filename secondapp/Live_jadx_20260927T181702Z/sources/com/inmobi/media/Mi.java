package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55158c;

    public Mi(int i10, int i11, int i12) {
        this.f55156a = i10;
        this.f55157b = i11;
        this.f55158c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mi)) {
            return false;
        }
        Mi mi2 = (Mi) obj;
        return this.f55156a == mi2.f55156a && this.f55157b == mi2.f55157b && this.f55158c == mi2.f55158c;
    }

    public final int hashCode() {
        return this.f55158c + AbstractC3671fi.a(this.f55157b, this.f55156a * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f55156a + ", minor=" + this.f55157b + ", patch=" + this.f55158c + gi.j.f86771d;
    }
}
