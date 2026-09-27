package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f40863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f40864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f40865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f40866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f40867i;

    public sa(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        kotlin.jvm.internal.m0.p(impressions, "impressions");
        kotlin.jvm.internal.m0.p(creatives, "creatives");
        kotlin.jvm.internal.m0.p(extensions, "extensions");
        kotlin.jvm.internal.m0.p(adVerifications, "adVerifications");
        kotlin.jvm.internal.m0.p(viewableImpressions, "viewableImpressions");
        this.f40859a = str;
        this.f40860b = str2;
        this.f40861c = str3;
        this.f40862d = str4;
        this.f40863e = impressions;
        this.f40864f = creatives;
        this.f40865g = extensions;
        this.f40866h = adVerifications;
        this.f40867i = viewableImpressions;
    }

    public final sa a(String str, String str2, String str3, String str4, List impressions, List creatives, List extensions, List adVerifications, List viewableImpressions) {
        kotlin.jvm.internal.m0.p(impressions, "impressions");
        kotlin.jvm.internal.m0.p(creatives, "creatives");
        kotlin.jvm.internal.m0.p(extensions, "extensions");
        kotlin.jvm.internal.m0.p(adVerifications, "adVerifications");
        kotlin.jvm.internal.m0.p(viewableImpressions, "viewableImpressions");
        return new sa(str, str2, str3, str4, impressions, creatives, extensions, adVerifications, viewableImpressions);
    }

    public final List b() {
        return this.f40864f;
    }

    public final List c() {
        return this.f40865g;
    }

    public final List d() {
        return this.f40863e;
    }

    public final List e() {
        return this.f40867i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return kotlin.jvm.internal.m0.g(this.f40859a, saVar.f40859a) && kotlin.jvm.internal.m0.g(this.f40860b, saVar.f40860b) && kotlin.jvm.internal.m0.g(this.f40861c, saVar.f40861c) && kotlin.jvm.internal.m0.g(this.f40862d, saVar.f40862d) && kotlin.jvm.internal.m0.g(this.f40863e, saVar.f40863e) && kotlin.jvm.internal.m0.g(this.f40864f, saVar.f40864f) && kotlin.jvm.internal.m0.g(this.f40865g, saVar.f40865g) && kotlin.jvm.internal.m0.g(this.f40866h, saVar.f40866h) && kotlin.jvm.internal.m0.g(this.f40867i, saVar.f40867i);
    }

    public int hashCode() {
        String str = this.f40859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40860b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f40861c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f40862d;
        return ((((((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f40863e.hashCode()) * 31) + this.f40864f.hashCode()) * 31) + this.f40865g.hashCode()) * 31) + this.f40866h.hashCode()) * 31) + this.f40867i.hashCode();
    }

    public String toString() {
        return "InLine(adSystem=" + this.f40859a + ", adTitle=" + this.f40860b + ", description=" + this.f40861c + ", error=" + this.f40862d + ", impressions=" + this.f40863e + ", creatives=" + this.f40864f + ", extensions=" + this.f40865g + ", adVerifications=" + this.f40866h + ", viewableImpressions=" + this.f40867i + gi.j.f86771d;
    }

    public static /* synthetic */ sa a(sa saVar, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = saVar.f40859a;
        }
        if ((i10 & 2) != 0) {
            str2 = saVar.f40860b;
        }
        if ((i10 & 4) != 0) {
            str3 = saVar.f40861c;
        }
        if ((i10 & 8) != 0) {
            str4 = saVar.f40862d;
        }
        if ((i10 & 16) != 0) {
            list = saVar.f40863e;
        }
        if ((i10 & 32) != 0) {
            list2 = saVar.f40864f;
        }
        if ((i10 & 64) != 0) {
            list3 = saVar.f40865g;
        }
        if ((i10 & 128) != 0) {
            list4 = saVar.f40866h;
        }
        if ((i10 & 256) != 0) {
            list5 = saVar.f40867i;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list2;
        List list9 = list3;
        List list10 = list;
        String str5 = str3;
        return saVar.a(str, str2, str5, str4, list10, list8, list9, list6, list7);
    }

    public final List a() {
        return this.f40866h;
    }
}
