package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4528td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final String f64162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final String f64163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final String f64164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final String f64165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private final String f64166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private final Boolean f64167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    private final JSONObject f64168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.m
    private final C4599y f64169h;

    public C4528td() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @oy.m
    public final String a() {
        return this.f64162a;
    }

    @oy.m
    public final String b() {
        return this.f64163b;
    }

    @oy.m
    public final String c() {
        return this.f64164c;
    }

    @oy.m
    public final String d() {
        return this.f64165d;
    }

    @oy.m
    public final String e() {
        return this.f64166e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4528td)) {
            return false;
        }
        C4528td c4528td = (C4528td) obj;
        return kotlin.jvm.internal.m0.g(this.f64162a, c4528td.f64162a) && kotlin.jvm.internal.m0.g(this.f64163b, c4528td.f64163b) && kotlin.jvm.internal.m0.g(this.f64164c, c4528td.f64164c) && kotlin.jvm.internal.m0.g(this.f64165d, c4528td.f64165d) && kotlin.jvm.internal.m0.g(this.f64166e, c4528td.f64166e) && kotlin.jvm.internal.m0.g(this.f64167f, c4528td.f64167f) && kotlin.jvm.internal.m0.g(this.f64168g, c4528td.f64168g) && kotlin.jvm.internal.m0.g(this.f64169h, c4528td.f64169h);
    }

    @oy.m
    public final Boolean f() {
        return this.f64167f;
    }

    @oy.m
    public final JSONObject g() {
        return this.f64168g;
    }

    @oy.m
    public final C4599y h() {
        return this.f64169h;
    }

    public int hashCode() {
        String str = this.f64162a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64163b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64164c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64165d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64166e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f64167f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.f64168g;
        int iHashCode7 = (iHashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4599y c4599y = this.f64169h;
        return iHashCode7 + (c4599y != null ? c4599y.hashCode() : 0);
    }

    @oy.m
    public final C4599y i() {
        return this.f64169h;
    }

    @oy.m
    public final String j() {
        return this.f64162a;
    }

    @oy.m
    public final JSONObject k() {
        return this.f64168g;
    }

    @oy.m
    public final Boolean l() {
        return this.f64167f;
    }

    @oy.m
    public final String m() {
        return this.f64165d;
    }

    @oy.m
    public final String n() {
        return this.f64164c;
    }

    @oy.m
    public final String o() {
        return this.f64163b;
    }

    @oy.m
    public final String p() {
        return this.f64166e;
    }

    @oy.l
    public String toString() {
        return "ProviderConfig2(adSourceName=" + this.f64162a + ", providerNetworkKey=" + this.f64163b + ", providerLoadName=" + this.f64164c + ", providerDefaultInstance=" + this.f64165d + ", spId=" + this.f64166e + ", mpis=" + this.f64167f + ", application=" + this.f64168g + ", adFormats=" + this.f64169h + gi.j.f86771d;
    }

    public C4528td(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m String str5, @oy.m Boolean bool, @oy.m JSONObject jSONObject, @oy.m C4599y c4599y) {
        this.f64162a = str;
        this.f64163b = str2;
        this.f64164c = str3;
        this.f64165d = str4;
        this.f64166e = str5;
        this.f64167f = bool;
        this.f64168g = jSONObject;
        this.f64169h = c4599y;
    }

    @oy.l
    public final C4528td a(@oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.m String str5, @oy.m Boolean bool, @oy.m JSONObject jSONObject, @oy.m C4599y c4599y) {
        return new C4528td(str, str2, str3, str4, str5, bool, jSONObject, c4599y);
    }

    public static /* synthetic */ C4528td a(C4528td c4528td, String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C4599y c4599y, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4528td.f64162a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4528td.f64163b;
        }
        if ((i10 & 4) != 0) {
            str3 = c4528td.f64164c;
        }
        if ((i10 & 8) != 0) {
            str4 = c4528td.f64165d;
        }
        if ((i10 & 16) != 0) {
            str5 = c4528td.f64166e;
        }
        if ((i10 & 32) != 0) {
            bool = c4528td.f64167f;
        }
        if ((i10 & 64) != 0) {
            jSONObject = c4528td.f64168g;
        }
        if ((i10 & 128) != 0) {
            c4599y = c4528td.f64169h;
        }
        JSONObject jSONObject2 = jSONObject;
        C4599y c4599y2 = c4599y;
        String str6 = str5;
        Boolean bool2 = bool;
        return c4528td.a(str, str2, str3, str4, str6, bool2, jSONObject2, c4599y2);
    }

    public /* synthetic */ C4528td(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, C4599y c4599y, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : jSONObject, (i10 & 128) != 0 ? null : c4599y);
    }
}
