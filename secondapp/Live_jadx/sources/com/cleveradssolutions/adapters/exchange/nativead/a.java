package com.cleveradssolutions.adapters.exchange.nativead;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42083d;

    public a(JSONObject jSONObject) {
        this.f42080a = jSONObject.optInt("type", 0);
        this.f42081b = jSONObject.optString("url", "");
        this.f42082c = jSONObject.optInt("w", 0);
        this.f42083d = jSONObject.optInt("h", 0);
    }

    public int a() {
        return this.f42080a;
    }

    public String b() {
        return this.f42081b;
    }

    public Integer c() {
        return Integer.valueOf(this.f42082c);
    }

    public Integer d() {
        return Integer.valueOf(this.f42083d);
    }
}
