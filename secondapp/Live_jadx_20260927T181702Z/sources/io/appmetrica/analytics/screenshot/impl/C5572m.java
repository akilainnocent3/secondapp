package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5572m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5569j f99102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5573n f99103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5570k f99104c;

    public C5572m(C5569j c5569j, C5573n c5573n, C5570k c5570k) {
        this.f99102a = c5569j;
        this.f99103b = c5573n;
        this.f99104c = c5570k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5572m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C5572m c5572m = (C5572m) obj;
        return kotlin.jvm.internal.m0.g(this.f99102a, c5572m.f99102a) && kotlin.jvm.internal.m0.g(this.f99103b, c5572m.f99103b) && kotlin.jvm.internal.m0.g(this.f99104c, c5572m.f99104c);
    }

    public final int hashCode() {
        C5569j c5569j = this.f99102a;
        int iHashCode = (c5569j != null ? c5569j.hashCode() : 0) * 31;
        C5573n c5573n = this.f99103b;
        int iHashCode2 = (iHashCode + (c5573n != null ? c5573n.hashCode() : 0)) * 31;
        C5570k c5570k = this.f99104c;
        return iHashCode2 + (c5570k != null ? c5570k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f99102a + ", serviceCaptorConfig=" + this.f99103b + ", contentObserverCaptorConfig=" + this.f99104c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5572m(F f10) {
        C5584z c5584zA = f10.a();
        C5569j c5569j = c5584zA != null ? new C5569j(c5584zA) : null;
        H hC = f10.c();
        C5573n c5573n = hC != null ? new C5573n(hC) : null;
        B b10 = f10.b();
        this(c5569j, c5573n, b10 != null ? new C5570k(b10) : null);
    }
}
