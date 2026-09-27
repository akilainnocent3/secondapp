package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4325i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f61997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f61998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f61999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62000d;

    public C4325i4(String str) {
        this.f61997a = str;
    }

    public String a() {
        return this.f62000d;
    }

    public String b() {
        return this.f61997a;
    }

    public JSONObject c() {
        return this.f61998b;
    }

    public String d() {
        return this.f61999c;
    }

    public C4325i4(String str, JSONObject jSONObject) {
        this.f61997a = str;
        this.f61998b = jSONObject;
    }

    public C4325i4(String str, String str2, String str3) {
        this.f61997a = str;
        this.f61999c = str2;
        this.f62000d = str3;
    }

    public C4325i4(String str, JSONObject jSONObject, String str2, String str3) {
        this.f61997a = str;
        this.f61998b = jSONObject;
        this.f61999c = str2;
        this.f62000d = str3;
    }
}
