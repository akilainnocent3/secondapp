package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f99031b;

    public J(boolean z10, W w10) {
        this.f99030a = z10;
        this.f99031b = w10;
    }

    public final W a() {
        return this.f99031b;
    }

    public final boolean b() {
        return this.f99030a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f99030a + ", config=" + this.f99031b + ')';
    }

    public J() {
        this(new S().f99050a, new W());
    }
}
