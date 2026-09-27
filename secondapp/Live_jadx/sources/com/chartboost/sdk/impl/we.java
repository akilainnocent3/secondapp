package com.chartboost.sdk.impl;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f41347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f41348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f41349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f41351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f41352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f41353i;

    public we(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f41345a = num;
        this.f41346b = list;
        this.f41347c = num2;
        this.f41348d = num3;
        this.f41349e = jSONObject;
        this.f41350f = str;
        this.f41351g = str2;
        this.f41352h = str3;
        this.f41353i = str4;
    }

    public final String a() {
        return this.f41353i;
    }

    public final String b() {
        return this.f41352h;
    }

    public final Integer c() {
        return this.f41345a;
    }

    public final Integer d() {
        return this.f41348d;
    }

    public final Integer e() {
        return this.f41347c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        return kotlin.jvm.internal.m0.g(this.f41345a, weVar.f41345a) && kotlin.jvm.internal.m0.g(this.f41346b, weVar.f41346b) && kotlin.jvm.internal.m0.g(this.f41347c, weVar.f41347c) && kotlin.jvm.internal.m0.g(this.f41348d, weVar.f41348d) && kotlin.jvm.internal.m0.g(this.f41349e, weVar.f41349e) && kotlin.jvm.internal.m0.g(this.f41350f, weVar.f41350f) && kotlin.jvm.internal.m0.g(this.f41351g, weVar.f41351g) && kotlin.jvm.internal.m0.g(this.f41352h, weVar.f41352h) && kotlin.jvm.internal.m0.g(this.f41353i, weVar.f41353i);
    }

    public final String f() {
        return this.f41350f;
    }

    public final JSONObject g() {
        return this.f41349e;
    }

    public final String h() {
        return this.f41351g;
    }

    public int hashCode() {
        Integer num = this.f41345a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f41346b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f41347c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f41348d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.f41349e;
        int iHashCode5 = (iHashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f41350f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f41351g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f41352h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f41353i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final List i() {
        return this.f41346b;
    }

    public String toString() {
        return "PrivacyBodyFields(openRtbConsent=" + this.f41345a + ", whitelistedPrivacyStandardsList=" + this.f41346b + ", openRtbGdpr=" + this.f41347c + ", openRtbCoppa=" + this.f41348d + ", privacyListAsJson=" + this.f41349e + ", piDataUseConsent=" + this.f41350f + ", tcfString=" + this.f41351g + ", gppString=" + this.f41352h + ", gppSid=" + this.f41353i + gi.j.f86771d;
    }
}
