package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df f38289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f38290b;

    public bf(df target, ds.a onReached) {
        kotlin.jvm.internal.m0.p(target, "target");
        kotlin.jvm.internal.m0.p(onReached, "onReached");
        this.f38289a = target;
        this.f38290b = onReached;
    }

    public final ds.a a() {
        return this.f38290b;
    }

    public final df b() {
        return this.f38289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return kotlin.jvm.internal.m0.g(this.f38289a, bfVar.f38289a) && kotlin.jvm.internal.m0.g(this.f38290b, bfVar.f38290b);
    }

    public int hashCode() {
        return (this.f38289a.hashCode() * 31) + this.f38290b.hashCode();
    }

    public String toString() {
        return "ProgressEvent(target=" + this.f38289a + ", onReached=" + this.f38290b + gi.j.f86771d;
    }
}
