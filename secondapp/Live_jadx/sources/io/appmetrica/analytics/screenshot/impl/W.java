package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5564e f99053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f99054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5575p f99055c;

    public W(C5564e c5564e, a0 a0Var, C5575p c5575p) {
        this.f99053a = c5564e;
        this.f99054b = a0Var;
        this.f99055c = c5575p;
    }

    public final C5564e a() {
        return this.f99053a;
    }

    public final C5575p b() {
        return this.f99055c;
    }

    public final a0 c() {
        return this.f99054b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f99053a + ", serviceCaptorConfig=" + this.f99054b + ", contentObserverCaptorConfig=" + this.f99055c + ')';
    }

    public W() {
        this(new C5564e(), new a0(), new C5575p());
    }
}
