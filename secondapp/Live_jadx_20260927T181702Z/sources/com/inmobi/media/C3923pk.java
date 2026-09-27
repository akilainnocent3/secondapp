package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3923pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57339c;

    public C3923pk(long j10, long j11, long j12) {
        this.f57337a = j10;
        this.f57338b = j11;
        this.f57339c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3923pk)) {
            return false;
        }
        C3923pk c3923pk = (C3923pk) obj;
        return this.f57337a == c3923pk.f57337a && this.f57338b == c3923pk.f57338b && this.f57339c == c3923pk.f57339c;
    }

    public final int hashCode() {
        return f0.p.a(this.f57339c) + ((f0.p.a(this.f57338b) + (f0.p.a(this.f57337a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f57337a + ", readTimeoutInSec=" + this.f57338b + ", callTimeoutInSec=" + this.f57339c + gi.j.f86771d;
    }
}
