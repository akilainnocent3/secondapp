package com.chartboost.sdk.impl;

import com.ironsource.C4235d4;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class bj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38310g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5 f38312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p5 f38314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38316f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final bj a(JSONObject jsonObject) {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("endcard_countdown");
            return new bj(jsonObject.optBoolean("video_clickthrough_enabled", true), jSONObjectOptJSONObject != null ? j5.f39552c.a(jSONObjectOptJSONObject) : null, jsonObject.optBoolean("show_endcard", true), p5.f40417e.a(jsonObject.optJSONObject(C4235d4.i.G0)), jsonObject.optInt("endcard_ignore_safe_area", 0), jsonObject.optBoolean("endcard_optional", true));
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public bj(boolean z10, j5 j5Var, boolean z11, p5 p5Var, int i10, boolean z12) {
        this.f38311a = z10;
        this.f38312b = j5Var;
        this.f38313c = z11;
        this.f38314d = p5Var;
        this.f38315e = i10;
        this.f38316f = z12;
    }

    public final p5 a() {
        return this.f38314d;
    }

    public final j5 b() {
        return this.f38312b;
    }

    public final int c() {
        return this.f38315e;
    }

    public final boolean d() {
        return this.f38316f;
    }

    public final boolean e() {
        return this.f38313c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj)) {
            return false;
        }
        bj bjVar = (bj) obj;
        return this.f38311a == bjVar.f38311a && kotlin.jvm.internal.m0.g(this.f38312b, bjVar.f38312b) && this.f38313c == bjVar.f38313c && kotlin.jvm.internal.m0.g(this.f38314d, bjVar.f38314d) && this.f38315e == bjVar.f38315e && this.f38316f == bjVar.f38316f;
    }

    public final boolean f() {
        return this.f38311a;
    }

    public int hashCode() {
        int iA = g8.a.a(this.f38311a) * 31;
        j5 j5Var = this.f38312b;
        int iHashCode = (((iA + (j5Var == null ? 0 : j5Var.hashCode())) * 31) + g8.a.a(this.f38313c)) * 31;
        p5 p5Var = this.f38314d;
        return ((((iHashCode + (p5Var != null ? p5Var.hashCode() : 0)) * 31) + this.f38315e) * 31) + g8.a.a(this.f38316f);
    }

    public String toString() {
        return "VASTConfig(videoClickthroughEnabled=" + this.f38311a + ", endCardCountdown=" + this.f38312b + ", showEndCard=" + this.f38313c + ", callToAction=" + this.f38314d + ", endCardIgnoreSafeAreaFlags=" + this.f38315e + ", endcardOptional=" + this.f38316f + gi.j.f86771d;
    }
}
