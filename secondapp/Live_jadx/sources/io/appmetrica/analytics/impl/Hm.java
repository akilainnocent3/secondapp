package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95915a;

    public Hm(long j10) {
        this.f95915a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f95915a == ((Hm) obj).f95915a;
    }

    public final int hashCode() {
        long j10 = this.f95915a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f95915a + fw.b.f85383j;
    }
}
