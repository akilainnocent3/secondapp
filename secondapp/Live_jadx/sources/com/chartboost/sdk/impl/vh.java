package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41241d;

    public vh(String url, String method, String str, String str2) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(method, "method");
        this.f41238a = url;
        this.f41239b = method;
        this.f41240c = str;
        this.f41241d = str2;
    }

    public final String a() {
        return this.f41240c;
    }

    public final String b() {
        return this.f41241d;
    }

    public final String c() {
        return this.f41239b;
    }

    public final String d() {
        return this.f41238a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return kotlin.jvm.internal.m0.g(this.f41238a, vhVar.f41238a) && kotlin.jvm.internal.m0.g(this.f41239b, vhVar.f41239b) && kotlin.jvm.internal.m0.g(this.f41240c, vhVar.f41240c) && kotlin.jvm.internal.m0.g(this.f41241d, vhVar.f41241d);
    }

    public int hashCode() {
        int iHashCode = ((this.f41238a.hashCode() * 31) + this.f41239b.hashCode()) * 31;
        String str = this.f41240c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41241d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackerConfig(url=" + this.f41238a + ", method=" + this.f41239b + ", bodyTemplate=" + this.f41240c + ", contentType=" + this.f41241d + gi.j.f86771d;
    }

    public /* synthetic */ vh(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
