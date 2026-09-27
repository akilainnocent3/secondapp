package com.chartboost.sdk.impl;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f41595m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ob f41596n = ob.SEQUENTIAL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa f41598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f41599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n2 f41600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f41602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f41603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f41605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f41606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f41607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ob f41608l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final y a(JSONObject jsonObject, String auctionId) throws JSONException {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            kotlin.jvm.internal.m0.p(auctionId, "auctionId");
            List listA = p7.a(jsonObject.optJSONArray("event_trackers"));
            wa.a aVar = wa.f41335c;
            JSONObject jSONObject = jsonObject.getJSONObject("info_icon");
            kotlin.jvm.internal.m0.o(jSONObject, "getJSONObject(...)");
            wa waVarA = aVar.a(jSONObject);
            n2.a aVar2 = n2.f40068d;
            return new y(auctionId, waVarA, aVar2.a(jsonObject.optJSONObject("top_left_button_group")), aVar2.a(jsonObject.optJSONObject("top_right_button_group")), jsonObject.optInt("expiration", 3600), Integer.valueOf(jsonObject.optInt("reward_duration", -1)), jsonObject.optInt("click_browser", 0), jsonObject.optBoolean("resolve_redirections", true), listA, jsonObject.optBoolean("default_muted", false), jsonObject.optInt("load_timeout", 30), ob.f40288c.a(jsonObject.optInt("load_mode", y.f41596n.c())));
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public y(String auctionId, wa infoIcon, n2 n2Var, n2 n2Var2, int i10, Integer num, int i11, boolean z10, List eventTrackers, boolean z11, int i12, ob loadMode) {
        kotlin.jvm.internal.m0.p(auctionId, "auctionId");
        kotlin.jvm.internal.m0.p(infoIcon, "infoIcon");
        kotlin.jvm.internal.m0.p(eventTrackers, "eventTrackers");
        kotlin.jvm.internal.m0.p(loadMode, "loadMode");
        this.f41597a = auctionId;
        this.f41598b = infoIcon;
        this.f41599c = n2Var;
        this.f41600d = n2Var2;
        this.f41601e = i10;
        this.f41602f = num;
        this.f41603g = i11;
        this.f41604h = z10;
        this.f41605i = eventTrackers;
        this.f41606j = z11;
        this.f41607k = i12;
        this.f41608l = loadMode;
    }

    public final String b() {
        return this.f41597a;
    }

    public final boolean c() {
        return this.f41606j;
    }

    public final List d() {
        return this.f41605i;
    }

    public final int e() {
        return this.f41601e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m0.g(this.f41597a, yVar.f41597a) && kotlin.jvm.internal.m0.g(this.f41598b, yVar.f41598b) && kotlin.jvm.internal.m0.g(this.f41599c, yVar.f41599c) && kotlin.jvm.internal.m0.g(this.f41600d, yVar.f41600d) && this.f41601e == yVar.f41601e && kotlin.jvm.internal.m0.g(this.f41602f, yVar.f41602f) && this.f41603g == yVar.f41603g && this.f41604h == yVar.f41604h && kotlin.jvm.internal.m0.g(this.f41605i, yVar.f41605i) && this.f41606j == yVar.f41606j && this.f41607k == yVar.f41607k && this.f41608l == yVar.f41608l;
    }

    public final wa f() {
        return this.f41598b;
    }

    public final ob g() {
        return this.f41608l;
    }

    public final int h() {
        return this.f41607k;
    }

    public int hashCode() {
        int iHashCode = ((this.f41597a.hashCode() * 31) + this.f41598b.hashCode()) * 31;
        n2 n2Var = this.f41599c;
        int iHashCode2 = (iHashCode + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        n2 n2Var2 = this.f41600d;
        int iHashCode3 = (((iHashCode2 + (n2Var2 == null ? 0 : n2Var2.hashCode())) * 31) + this.f41601e) * 31;
        Integer num = this.f41602f;
        return ((((((((((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.f41603g) * 31) + g8.a.a(this.f41604h)) * 31) + this.f41605i.hashCode()) * 31) + g8.a.a(this.f41606j)) * 31) + this.f41607k) * 31) + this.f41608l.hashCode();
    }

    public final Integer i() {
        return this.f41602f;
    }

    public final n2 j() {
        return this.f41599c;
    }

    public final n2 k() {
        return this.f41600d;
    }

    public String toString() {
        return "AdMarkupConfig(auctionId=" + this.f41597a + ", infoIcon=" + this.f41598b + ", topLeftButtonGroup=" + this.f41599c + ", topRightButtonGroup=" + this.f41600d + ", expiration=" + this.f41601e + ", rewardDuration=" + this.f41602f + ", clickBrowser=" + this.f41603g + ", resolveRedirections=" + this.f41604h + ", eventTrackers=" + this.f41605i + ", defaultMuted=" + this.f41606j + ", loadTimeoutSeconds=" + this.f41607k + ", loadMode=" + this.f41608l + gi.j.f86771d;
    }
}
