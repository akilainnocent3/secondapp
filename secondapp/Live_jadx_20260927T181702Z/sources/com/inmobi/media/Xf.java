package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rf f55782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f55785d;

    public Xf(Rf ping, int i10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kotlin.jvm.internal.m0.p(ping, "ping");
        this.f55782a = ping;
        this.f55783b = i10;
        this.f55784c = str;
        this.f55785d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xf)) {
            return false;
        }
        Xf xf2 = (Xf) obj;
        return kotlin.jvm.internal.m0.g(this.f55782a, xf2.f55782a) && this.f55783b == xf2.f55783b && kotlin.jvm.internal.m0.g(this.f55784c, xf2.f55784c) && this.f55785d == xf2.f55785d;
    }

    public final int hashCode() {
        int iA = AbstractC3671fi.a(this.f55783b, this.f55782a.hashCode() * 31, 31);
        String str = this.f55784c;
        return f0.p.a(this.f55785d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PingResult(ping=" + this.f55782a + ", statusCode=" + this.f55783b + ", error=" + this.f55784c + ", timestamp=" + this.f55785d + gi.j.f86771d;
    }
}
