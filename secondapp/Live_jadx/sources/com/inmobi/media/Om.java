package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Om extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55284a;

    public Om(long j10) {
        this.f55284a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Om) && this.f55284a == ((Om) obj).f55284a;
    }

    public final int hashCode() {
        return f0.p.a(this.f55284a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.f55284a + gi.j.f86771d;
    }
}
