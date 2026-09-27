package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5216m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f97870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f97872f;

    public C5216m4(C5165k4 c5165k4) {
        this.f97867a = c5165k4.f97688a;
        this.f97868b = c5165k4.f97689b;
        this.f97869c = c5165k4.f97690c;
        this.f97870d = c5165k4.f97691d;
        this.f97871e = c5165k4.f97692e;
        this.f97872f = c5165k4.f97693f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5216m4.class == obj.getClass()) {
            C5216m4 c5216m4 = (C5216m4) obj;
            if (this.f97867a != c5216m4.f97867a || this.f97868b != c5216m4.f97868b || this.f97869c != c5216m4.f97869c || this.f97870d != c5216m4.f97870d || this.f97871e != c5216m4.f97871e) {
                return false;
            }
            Boolean bool = this.f97872f;
            Boolean bool2 = c5216m4.f97872f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((((this.f97867a ? 1 : 0) * 31) + (this.f97868b ? 1 : 0)) * 31) + (this.f97869c ? 1 : 0)) * 31) + (this.f97870d ? 1 : 0)) * 31) + (this.f97871e ? 1 : 0)) * 31;
        Boolean bool = this.f97872f;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f97867a + ", featuresCollectingEnabled=" + this.f97868b + ", googleAid=" + this.f97869c + ", simInfo=" + this.f97870d + ", huaweiOaid=" + this.f97871e + ", sslPinning=" + this.f97872f + fw.b.f85383j;
    }
}
