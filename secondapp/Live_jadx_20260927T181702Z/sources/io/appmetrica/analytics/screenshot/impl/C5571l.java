package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5571l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5572m f99099b;

    public C5571l(boolean z10, C5572m c5572m) {
        this.f99098a = z10;
        this.f99099b = c5572m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5571l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C5571l c5571l = (C5571l) obj;
        return this.f99098a == c5571l.f99098a && kotlin.jvm.internal.m0.g(this.f99099b, c5571l.f99099b);
    }

    public final int hashCode() {
        int iA = g8.a.a(this.f99098a) * 31;
        C5572m c5572m = this.f99099b;
        return iA + (c5572m != null ? c5572m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f99098a + ", config=" + this.f99099b + ')';
    }
}
