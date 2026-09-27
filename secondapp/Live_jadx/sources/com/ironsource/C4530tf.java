package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4530tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f64173a;

    public C4530tf(JSONObject jSONObject) {
        this.f64173a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f64173a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f64173a.optBoolean(C4235d4.a.f61296o, false);
    }

    public boolean c() {
        return this.f64173a.optBoolean(C4235d4.a.f61297p, false);
    }

    public boolean d() {
        return this.f64173a.optBoolean(C4235d4.a.f61293l, false);
    }

    public boolean e() {
        return this.f64173a.optBoolean(C4235d4.a.f61295n, false);
    }
}
