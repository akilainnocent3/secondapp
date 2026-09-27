package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95676a;

    public C9(long j10) {
        this.f95676a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9) && this.f95676a == ((C9) obj).f95676a;
    }

    public final int hashCode() {
        return f0.p.a(this.f95676a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f95676a + ')';
    }
}
