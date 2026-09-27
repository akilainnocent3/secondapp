package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5573n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99106b;

    public C5573n(boolean z10, long j10) {
        this.f99105a = z10;
        this.f99106b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5573n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C5573n c5573n = (C5573n) obj;
        return this.f99105a == c5573n.f99105a && this.f99106b == c5573n.f99106b;
    }

    public final int hashCode() {
        return f0.p.a(this.f99106b) + (g8.a.a(this.f99105a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f99105a + ", delaySeconds=" + this.f99106b + ')';
    }

    public C5573n(H h10) {
        this(h10.b(), h10.a());
    }
}
