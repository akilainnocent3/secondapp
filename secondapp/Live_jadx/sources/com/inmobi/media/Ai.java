package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54358b;

    public Ai(int i10, long j10, int i11) {
        this.f54357a = i10;
        this.f54358b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai)) {
            return false;
        }
        Ai ai2 = (Ai) obj;
        return this.f54357a == ai2.f54357a && this.f54358b == ai2.f54358b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return f0.i.a(1.0d) + ((f0.p.a(this.f54358b) + (this.f54357a * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f54357a + ", retryInterval=" + this.f54358b + ", delayFactor=1.0" + gi.j.f86771d;
    }

    public Ai(long j10, int i10) {
        this.f54357a = i10;
        this.f54358b = j10;
    }
}
