package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99068b;

    public a0(boolean z10, long j10) {
        this.f99067a = z10;
        this.f99068b = j10;
    }

    public final long a() {
        return this.f99068b;
    }

    public final boolean b() {
        return this.f99067a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f99067a + ", delaySeconds=" + this.f99068b + ')';
    }

    public a0() {
        this(new P().f99043a, new P().f99044b);
    }
}
