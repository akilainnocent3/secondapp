package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4546ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Ne f64271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final C4579wd f64272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final Ad f64273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final U3 f64274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private final Q5 f64275e;

    public C4546ue(@oy.l Ne fullResponse) {
        kotlin.jvm.internal.m0.p(fullResponse, "fullResponse");
        this.f64271a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.j().optJSONObject(C4563ve.f64324a);
        this.f64272b = new C4579wd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.j().optJSONObject(C4563ve.f64325b);
        this.f64273c = new Ad(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.f64274d = new U3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.j().optJSONObject(C4563ve.f64327d);
        this.f64275e = new Q5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    @oy.l
    public final U3 a() {
        return this.f64274d;
    }

    @oy.l
    public final Q5 b() {
        return this.f64275e;
    }

    @oy.l
    public final Ne c() {
        return this.f64271a;
    }

    @oy.l
    public final C4579wd d() {
        return this.f64272b;
    }

    @oy.l
    public final Ad e() {
        return this.f64273c;
    }
}
