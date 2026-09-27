package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f41129b;

    public v0(double d10, double d11) {
        this.f41128a = d10;
        this.f41129b = d11;
    }

    public final double a() {
        return this.f41129b;
    }

    public final double b() {
        return this.f41128a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Double.compare(this.f41128a, v0Var.f41128a) == 0 && Double.compare(this.f41129b, v0Var.f41129b) == 0;
    }

    public int hashCode() {
        return (f0.i.a(this.f41128a) * 31) + f0.i.a(this.f41129b);
    }

    public String toString() {
        return "DoubleSize(width=" + this.f41128a + ", height=" + this.f41129b + gi.j.f86771d;
    }
}
