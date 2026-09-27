package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f39072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f39073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ma f39074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f39075i;

    public h4(String location, String adId, String to2, String cgn, String creative, Float f10, Float f11, ma impressionMediaType, Boolean bool) {
        kotlin.jvm.internal.m0.p(location, "location");
        kotlin.jvm.internal.m0.p(adId, "adId");
        kotlin.jvm.internal.m0.p(to2, "to");
        kotlin.jvm.internal.m0.p(cgn, "cgn");
        kotlin.jvm.internal.m0.p(creative, "creative");
        kotlin.jvm.internal.m0.p(impressionMediaType, "impressionMediaType");
        this.f39067a = location;
        this.f39068b = adId;
        this.f39069c = to2;
        this.f39070d = cgn;
        this.f39071e = creative;
        this.f39072f = f10;
        this.f39073g = f11;
        this.f39074h = impressionMediaType;
        this.f39075i = bool;
    }

    public final String a() {
        return this.f39068b;
    }

    public final String b() {
        return this.f39070d;
    }

    public final String c() {
        return this.f39071e;
    }

    public final ma d() {
        return this.f39074h;
    }

    public final String e() {
        return this.f39067a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return kotlin.jvm.internal.m0.g(this.f39067a, h4Var.f39067a) && kotlin.jvm.internal.m0.g(this.f39068b, h4Var.f39068b) && kotlin.jvm.internal.m0.g(this.f39069c, h4Var.f39069c) && kotlin.jvm.internal.m0.g(this.f39070d, h4Var.f39070d) && kotlin.jvm.internal.m0.g(this.f39071e, h4Var.f39071e) && kotlin.jvm.internal.m0.g(this.f39072f, h4Var.f39072f) && kotlin.jvm.internal.m0.g(this.f39073g, h4Var.f39073g) && this.f39074h == h4Var.f39074h && kotlin.jvm.internal.m0.g(this.f39075i, h4Var.f39075i);
    }

    public final Boolean f() {
        return this.f39075i;
    }

    public final String g() {
        return this.f39069c;
    }

    public final Float h() {
        return this.f39073g;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f39067a.hashCode() * 31) + this.f39068b.hashCode()) * 31) + this.f39069c.hashCode()) * 31) + this.f39070d.hashCode()) * 31) + this.f39071e.hashCode()) * 31;
        Float f10 = this.f39072f;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f39073g;
        int iHashCode3 = (((iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31) + this.f39074h.hashCode()) * 31;
        Boolean bool = this.f39075i;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Float i() {
        return this.f39072f;
    }

    public String toString() {
        return "ClickParams(location=" + this.f39067a + ", adId=" + this.f39068b + ", to=" + this.f39069c + ", cgn=" + this.f39070d + ", creative=" + this.f39071e + ", videoPosition=" + this.f39072f + ", videoDuration=" + this.f39073g + ", impressionMediaType=" + this.f39074h + ", retargetReinstall=" + this.f39075i + gi.j.f86771d;
    }
}
