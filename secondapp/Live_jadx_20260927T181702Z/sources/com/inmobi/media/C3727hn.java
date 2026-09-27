package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3727hn extends Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56605a;

    public C3727hn(long j10) {
        this.f56605a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3727hn) && this.f56605a == ((C3727hn) obj).f56605a;
    }

    public final int hashCode() {
        return f0.p.a(this.f56605a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.f56605a + gi.j.f86771d;
    }
}
