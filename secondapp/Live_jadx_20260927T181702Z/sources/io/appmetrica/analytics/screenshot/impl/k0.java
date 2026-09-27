package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f99095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f99096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f99097c;

    public k0(h0 h0Var, l0 l0Var, i0 i0Var) {
        this.f99095a = h0Var;
        this.f99096b = l0Var;
        this.f99097c = i0Var;
    }

    public final h0 a() {
        return this.f99095a;
    }

    public final i0 b() {
        return this.f99097c;
    }

    public final l0 c() {
        return this.f99096b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f99095a + ", serviceCaptorConfig=" + this.f99096b + ", contentObserverCaptorConfig=" + this.f99097c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(W w10) {
        C5564e c5564eA = w10.a();
        h0 h0Var = c5564eA != null ? new h0(c5564eA) : null;
        a0 a0VarC = w10.c();
        l0 l0Var = a0VarC != null ? new l0(a0VarC) : null;
        C5575p c5575pB = w10.b();
        this(h0Var, l0Var, c5575pB != null ? new i0(c5575pB) : null);
    }
}
