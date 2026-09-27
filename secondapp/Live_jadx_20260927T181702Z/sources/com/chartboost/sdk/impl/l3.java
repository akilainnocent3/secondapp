package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f39853b;

    public l3(String url, Boolean bool) {
        kotlin.jvm.internal.m0.p(url, "url");
        this.f39852a = url;
        this.f39853b = bool;
    }

    public final Boolean a() {
        return this.f39853b;
    }

    public final String b() {
        return this.f39852a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return kotlin.jvm.internal.m0.g(this.f39852a, l3Var.f39852a) && kotlin.jvm.internal.m0.g(this.f39853b, l3Var.f39853b);
    }

    public int hashCode() {
        int iHashCode = this.f39852a.hashCode() * 31;
        Boolean bool = this.f39853b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.f39852a + ", shouldDismiss=" + this.f39853b + gi.j.f86771d;
    }
}
