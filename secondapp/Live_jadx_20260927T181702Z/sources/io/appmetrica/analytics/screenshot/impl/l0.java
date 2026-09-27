package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99101b;

    public l0(boolean z10, long j10) {
        this.f99100a = z10;
        this.f99101b = j10;
    }

    public final long a() {
        return this.f99101b;
    }

    public final boolean b() {
        return this.f99100a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f99100a + ", delaySeconds=" + this.f99101b + ')';
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
