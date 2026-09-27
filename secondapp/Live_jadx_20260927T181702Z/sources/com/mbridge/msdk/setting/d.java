package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f69010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69012h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69005a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69006b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69007c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69008d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69009e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69013i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f67146f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f67152k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f67156o));
                dVar.d(jSONObject.optInt("type", 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
                return dVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return dVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
    }

    public int b() {
        return this.f69008d;
    }

    public String c() {
        return this.f69010f;
    }

    public String d() {
        return this.f69011g;
    }

    public int e() {
        return this.f69012h;
    }

    public void b(int i10) {
        this.f69008d = i10;
    }

    public void c(String str) {
        this.f69011g = str;
    }

    public void d(int i10) {
        this.f69013i = i10;
    }

    public void b(String str) {
        this.f69010f = str;
    }

    public void c(int i10) {
        this.f69012h = i10;
    }

    public int a() {
        return this.f69007c;
    }

    public void a(int i10) {
        this.f69007c = i10;
    }
}
