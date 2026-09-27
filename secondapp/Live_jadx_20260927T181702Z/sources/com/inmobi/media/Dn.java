package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jv.s0 f54532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54533b;

    public Dn(jv.s0 coroutineScope, int i10) {
        kotlin.jvm.internal.m0.p(coroutineScope, "coroutineScope");
        this.f54532a = coroutineScope;
        this.f54533b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dn)) {
            return false;
        }
        Dn dn2 = (Dn) obj;
        return kotlin.jvm.internal.m0.g(this.f54532a, dn2.f54532a) && this.f54533b == dn2.f54533b;
    }

    public final int hashCode() {
        return this.f54533b + (this.f54532a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.f54532a + ", impressionMinDuration=" + this.f54533b + gi.j.f86771d;
    }
}
