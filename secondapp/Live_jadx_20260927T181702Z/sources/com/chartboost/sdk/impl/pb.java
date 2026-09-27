package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f40439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f40441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f40442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f40443e;

    public pb(o1 appRequest, boolean z10, Integer num, Integer num2) {
        kotlin.jvm.internal.m0.p(appRequest, "appRequest");
        this.f40439a = appRequest;
        this.f40440b = z10;
        this.f40441c = num;
        this.f40442d = num2;
        this.f40443e = new h0();
    }

    public final o1 a() {
        return this.f40439a;
    }

    public final Integer b() {
        return this.f40441c;
    }

    public final Integer c() {
        return this.f40442d;
    }

    public final h0 d() {
        return this.f40443e;
    }

    public final boolean e() {
        return this.f40440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return kotlin.jvm.internal.m0.g(this.f40439a, pbVar.f40439a) && this.f40440b == pbVar.f40440b && kotlin.jvm.internal.m0.g(this.f40441c, pbVar.f40441c) && kotlin.jvm.internal.m0.g(this.f40442d, pbVar.f40442d);
    }

    public int hashCode() {
        int iHashCode = ((this.f40439a.hashCode() * 31) + g8.a.a(this.f40440b)) * 31;
        Integer num = this.f40441c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f40442d;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f40439a + ", isCacheRequest=" + this.f40440b + ", bannerHeight=" + this.f40441c + ", bannerWidth=" + this.f40442d + gi.j.f86771d;
    }
}
