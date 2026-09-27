package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4599y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final JSONObject f64469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final JSONObject f64470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final JSONObject f64471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private final JSONObject f64472d;

    public C4599y() {
        this(null, null, null, null, 15, null);
    }

    @oy.m
    public final JSONObject a() {
        return this.f64469a;
    }

    @oy.m
    public final JSONObject b() {
        return this.f64470b;
    }

    @oy.m
    public final JSONObject c() {
        return this.f64471c;
    }

    @oy.m
    public final JSONObject d() {
        return this.f64472d;
    }

    @oy.m
    public final JSONObject e() {
        return this.f64471c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4599y)) {
            return false;
        }
        C4599y c4599y = (C4599y) obj;
        return kotlin.jvm.internal.m0.g(this.f64469a, c4599y.f64469a) && kotlin.jvm.internal.m0.g(this.f64470b, c4599y.f64470b) && kotlin.jvm.internal.m0.g(this.f64471c, c4599y.f64471c) && kotlin.jvm.internal.m0.g(this.f64472d, c4599y.f64472d);
    }

    @oy.m
    public final JSONObject f() {
        return this.f64470b;
    }

    @oy.m
    public final JSONObject g() {
        return this.f64472d;
    }

    @oy.m
    public final JSONObject h() {
        return this.f64469a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.f64469a;
        int iHashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.f64470b;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.f64471c;
        int iHashCode3 = (iHashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.f64472d;
        return iHashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    @oy.l
    public String toString() {
        return "AdFormatsConfig2(rewarded=" + this.f64469a + ", interstitial=" + this.f64470b + ", banner=" + this.f64471c + ", nativeAd=" + this.f64472d + gi.j.f86771d;
    }

    public C4599y(@oy.m JSONObject jSONObject, @oy.m JSONObject jSONObject2, @oy.m JSONObject jSONObject3, @oy.m JSONObject jSONObject4) {
        this.f64469a = jSONObject;
        this.f64470b = jSONObject2;
        this.f64471c = jSONObject3;
        this.f64472d = jSONObject4;
    }

    @oy.l
    public final C4599y a(@oy.m JSONObject jSONObject, @oy.m JSONObject jSONObject2, @oy.m JSONObject jSONObject3, @oy.m JSONObject jSONObject4) {
        return new C4599y(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ C4599y a(C4599y c4599y, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = c4599y.f64469a;
        }
        if ((i10 & 2) != 0) {
            jSONObject2 = c4599y.f64470b;
        }
        if ((i10 & 4) != 0) {
            jSONObject3 = c4599y.f64471c;
        }
        if ((i10 & 8) != 0) {
            jSONObject4 = c4599y.f64472d;
        }
        return c4599y.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ C4599y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : jSONObject, (i10 & 2) != 0 ? null : jSONObject2, (i10 & 4) != 0 ? null : jSONObject3, (i10 & 8) != 0 ? null : jSONObject4);
    }
}
