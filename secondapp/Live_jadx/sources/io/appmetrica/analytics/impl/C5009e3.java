package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5009e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97240a;

    public C5009e3(long j10) {
        this.f97240a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5009e3.class == obj.getClass() && this.f97240a == ((C5009e3) obj).f97240a;
    }

    public final int hashCode() {
        long j10 = this.f97240a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f97240a + fw.b.f85383j;
    }
}
