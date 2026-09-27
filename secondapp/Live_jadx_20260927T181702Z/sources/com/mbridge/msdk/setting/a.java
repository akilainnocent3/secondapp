package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f68905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f68906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68907g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f68901a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f68902b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f68903c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68904d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68908h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f67149h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f67153l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f67157p));
                aVar.f(jSONObject.optInt("type", 0));
                aVar.a(jSONObject.optInt("batch_size", 1));
                aVar.c(jSONObject.optInt("duration", 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
                return aVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
    }

    public int b() {
        return this.f68902b;
    }

    public int c() {
        return this.f68903c;
    }

    public int d() {
        return this.f68904d;
    }

    public String e() {
        return this.f68905e;
    }

    public String f() {
        return this.f68906f;
    }

    public int g() {
        return this.f68907g;
    }

    public int h() {
        return this.f68908h;
    }

    public void b(int i10) {
        this.f68902b = i10;
    }

    public void c(int i10) {
        this.f68903c = i10;
    }

    public void d(int i10) {
        this.f68904d = i10;
    }

    public void e(int i10) {
        this.f68907g = i10;
    }

    public void f(int i10) {
        this.f68908h = i10;
    }

    public void b(String str) {
        this.f68905e = str;
    }

    public void c(String str) {
        this.f68906f = str;
    }

    public int a() {
        return this.f68901a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f68901a = i10;
    }
}
