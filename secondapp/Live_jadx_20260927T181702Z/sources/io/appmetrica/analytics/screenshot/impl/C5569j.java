package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5569j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99089a;

    public C5569j(boolean z10) {
        this.f99089a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(C5569j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f99089a == ((C5569j) obj).f99089a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return g8.a.a(this.f99089a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f99089a + ')';
    }

    public C5569j(C5584z c5584z) {
        this(c5584z.a());
    }
}
