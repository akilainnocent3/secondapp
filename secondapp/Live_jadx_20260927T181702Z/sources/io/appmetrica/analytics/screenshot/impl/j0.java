package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f99091b;

    public j0(boolean z10, k0 k0Var) {
        this.f99090a = z10;
        this.f99091b = k0Var;
    }

    public final k0 a() {
        return this.f99091b;
    }

    public final boolean b() {
        return this.f99090a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f99090a + ", config=" + this.f99091b + ')';
    }

    public j0() {
        this(new J());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(J j10) {
        boolean zB = j10.b();
        W wA = j10.a();
        this(zB, wA != null ? new k0(wA) : null);
    }
}
