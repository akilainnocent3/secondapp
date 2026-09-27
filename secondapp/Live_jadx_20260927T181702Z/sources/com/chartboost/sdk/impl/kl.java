package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f39815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f39816h;

    public kl(String str, String str2, List impressions, List creatives, List extensions, String vastAdTagURI, List adVerifications, List viewableImpressions) {
        kotlin.jvm.internal.m0.p(impressions, "impressions");
        kotlin.jvm.internal.m0.p(creatives, "creatives");
        kotlin.jvm.internal.m0.p(extensions, "extensions");
        kotlin.jvm.internal.m0.p(vastAdTagURI, "vastAdTagURI");
        kotlin.jvm.internal.m0.p(adVerifications, "adVerifications");
        kotlin.jvm.internal.m0.p(viewableImpressions, "viewableImpressions");
        this.f39809a = str;
        this.f39810b = str2;
        this.f39811c = impressions;
        this.f39812d = creatives;
        this.f39813e = extensions;
        this.f39814f = vastAdTagURI;
        this.f39815g = adVerifications;
        this.f39816h = viewableImpressions;
    }

    public final List a() {
        return this.f39815g;
    }

    public final List b() {
        return this.f39812d;
    }

    public final String c() {
        return this.f39810b;
    }

    public final List d() {
        return this.f39813e;
    }

    public final List e() {
        return this.f39811c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return kotlin.jvm.internal.m0.g(this.f39809a, klVar.f39809a) && kotlin.jvm.internal.m0.g(this.f39810b, klVar.f39810b) && kotlin.jvm.internal.m0.g(this.f39811c, klVar.f39811c) && kotlin.jvm.internal.m0.g(this.f39812d, klVar.f39812d) && kotlin.jvm.internal.m0.g(this.f39813e, klVar.f39813e) && kotlin.jvm.internal.m0.g(this.f39814f, klVar.f39814f) && kotlin.jvm.internal.m0.g(this.f39815g, klVar.f39815g) && kotlin.jvm.internal.m0.g(this.f39816h, klVar.f39816h);
    }

    public final String f() {
        return this.f39814f;
    }

    public final List g() {
        return this.f39816h;
    }

    public int hashCode() {
        String str = this.f39809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f39810b;
        return ((((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f39811c.hashCode()) * 31) + this.f39812d.hashCode()) * 31) + this.f39813e.hashCode()) * 31) + this.f39814f.hashCode()) * 31) + this.f39815g.hashCode()) * 31) + this.f39816h.hashCode();
    }

    public String toString() {
        return "Wrapper(adSystem=" + this.f39809a + ", error=" + this.f39810b + ", impressions=" + this.f39811c + ", creatives=" + this.f39812d + ", extensions=" + this.f39813e + ", vastAdTagURI=" + this.f39814f + ", adVerifications=" + this.f39815g + ", viewableImpressions=" + this.f39816h + gi.j.f86771d;
    }
}
