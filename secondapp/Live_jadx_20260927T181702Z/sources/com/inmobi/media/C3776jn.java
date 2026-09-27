package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.jn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3776jn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56760a;

    public C3776jn(long j10) {
        this.f56760a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3776jn) && this.f56760a == ((C3776jn) obj).f56760a;
    }

    public final int hashCode() {
        return f0.p.a(this.f56760a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.f56760a + gi.j.f86771d;
    }
}
