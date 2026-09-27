package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40822c;

    public rj(String url, String vendor, String params) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(vendor, "vendor");
        kotlin.jvm.internal.m0.p(params, "params");
        this.f40820a = url;
        this.f40821b = vendor;
        this.f40822c = params;
    }

    public final String a() {
        return this.f40822c;
    }

    public final String b() {
        return this.f40820a;
    }

    public final String c() {
        return this.f40821b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj)) {
            return false;
        }
        rj rjVar = (rj) obj;
        return kotlin.jvm.internal.m0.g(this.f40820a, rjVar.f40820a) && kotlin.jvm.internal.m0.g(this.f40821b, rjVar.f40821b) && kotlin.jvm.internal.m0.g(this.f40822c, rjVar.f40822c);
    }

    public int hashCode() {
        return (((this.f40820a.hashCode() * 31) + this.f40821b.hashCode()) * 31) + this.f40822c.hashCode();
    }

    public String toString() {
        return "VerificationModel(url=" + this.f40820a + ", vendor=" + this.f40821b + ", params=" + this.f40822c + gi.j.f86771d;
    }
}
