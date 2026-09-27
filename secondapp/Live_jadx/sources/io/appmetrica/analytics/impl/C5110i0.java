package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5110i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97546b;

    public C5110i0(String str, long j10) {
        this.f97545a = str;
        this.f97546b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5110i0.class == obj.getClass()) {
            C5110i0 c5110i0 = (C5110i0) obj;
            if (this.f97546b != c5110i0.f97546b) {
                return false;
            }
            String str = this.f97545a;
            String str2 = c5110i0.f97545a;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f97545a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f97546b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
