package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class K1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final JSONObject f59342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f59343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f59344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f59346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f59348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f59349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f59350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f59351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f59352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.m
    private final JSONObject f59353l;

    public K1(@oy.l JSONObject config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f59342a = config;
        this.f59343b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", T5.f60118j);
        kotlin.jvm.internal.m0.o(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f59344c = strOptString;
        this.f59345d = config.optBoolean("sid", true);
        this.f59346e = config.optBoolean("radvid", false);
        this.f59347f = config.optInt("uaeh", 0);
        this.f59348g = config.optBoolean("sharedThreadPool", false);
        this.f59349h = config.optBoolean("sharedThreadPoolADP", true);
        this.f59350i = config.optInt(Q6.T0, -1);
        this.f59351j = config.optBoolean("axal", false);
        this.f59352k = config.optBoolean("psrt", false);
        this.f59353l = config.optJSONObject(C4235d4.a.f61284c);
    }

    private final JSONObject a() {
        return this.f59342a;
    }

    public final int b() {
        return this.f59350i;
    }

    @oy.m
    public final JSONObject c() {
        return this.f59353l;
    }

    @oy.l
    public final String d() {
        return this.f59344c;
    }

    public final boolean e() {
        return this.f59352k;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && kotlin.jvm.internal.m0.g(this.f59342a, ((K1) obj).f59342a);
    }

    public final boolean f() {
        return this.f59346e;
    }

    public final boolean g() {
        return this.f59345d;
    }

    public final boolean h() {
        return this.f59348g;
    }

    public int hashCode() {
        return this.f59342a.hashCode();
    }

    public final boolean i() {
        return this.f59349h;
    }

    public final int j() {
        return this.f59347f;
    }

    public final boolean k() {
        return this.f59351j;
    }

    public final boolean l() {
        return this.f59343b;
    }

    @oy.l
    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f59342a + gi.j.f86771d;
    }

    @oy.l
    public final K1 a(@oy.l JSONObject config) {
        kotlin.jvm.internal.m0.p(config, "config");
        return new K1(config);
    }

    public static /* synthetic */ K1 a(K1 k10, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = k10.f59342a;
        }
        return k10.a(jSONObject);
    }
}
