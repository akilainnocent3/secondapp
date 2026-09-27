package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95742a;

    public Dm(int i10) {
        this.f95742a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Dm) && this.f95742a == ((Dm) obj).f95742a;
    }

    public final int hashCode() {
        return this.f95742a;
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f95742a + ')';
    }
}
