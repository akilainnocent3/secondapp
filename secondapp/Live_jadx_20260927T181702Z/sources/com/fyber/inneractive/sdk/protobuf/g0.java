package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47472b;

    public g0(int i10, Object obj) {
        this.f47471a = obj;
        this.f47472b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f47471a == g0Var.f47471a && this.f47472b == g0Var.f47472b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f47471a) * 65535) + this.f47472b;
    }
}
