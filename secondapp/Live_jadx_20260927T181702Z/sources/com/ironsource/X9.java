package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class X9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    U6 f60308a = new U6();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AbstractRunnableC4335ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EnumC4512se f60309b;

        public a(EnumC4512se enumC4512se) {
            this.f60309b = enumC4512se;
        }

        @Override // com.ironsource.AbstractRunnableC4335ie
        public void a() {
            X9.this.f60308a.a(Q6.f59870g0, new JSONArray().put(this.f60309b.b()));
        }
    }

    public void a(JSONObject jSONObject) {
        this.f60308a.a(Q6.f59911u, (Object) jSONObject);
    }

    public void b(JSONObject jSONObject) {
        this.f60308a.a(Q6.f59868f1, (Object) jSONObject);
    }

    public void c(String str) {
        this.f60308a.a(Q6.K0, str);
    }

    public void d(String str) {
        this.f60308a.a(Q6.M0, str);
    }

    public void e(String str) {
        this.f60308a.a(com.ironsource.mediationsdk.metadata.a.f62748i, str);
    }

    public void f(String str) {
        this.f60308a.a(Q6.f59853a1, str);
    }

    public void g(String str) {
        this.f60308a.a(Q6.A, str);
    }

    public void h(String str) {
        this.f60308a.a("sid", str);
    }

    public void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60308a.a(Q6.f59864e0, str);
    }

    public void a(boolean z10) {
        this.f60308a.a(Q6.R0, Boolean.valueOf(z10));
    }

    public void b(boolean z10) {
        this.f60308a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(int i10) {
        this.f60308a.a(Q6.f59867f0, Integer.valueOf(i10));
    }

    public void a(Context context) {
        this.f60308a.a(context);
    }

    public void b(int i10) {
        if (i10 >= 0) {
            this.f60308a.a(Q6.T0, Integer.valueOf(i10));
        }
    }

    public void a(Boolean bool) {
        this.f60308a.a(Q6.U0, bool);
    }

    public void b(@oy.m String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60308a.a(Q6.D1, str);
    }

    public void a(EnumC4512se enumC4512se) {
        new Thread(new a(enumC4512se)).start();
    }

    public void b(Context context) {
        B7 b7I = Lb.U().i();
        ActivityManager.MemoryInfo memoryInfoN = b7I.n(context);
        this.f60308a.a(Q6.f59917w, b7I.c(memoryInfoN));
        this.f60308a.a(Q6.f59920x, b7I.b(memoryInfoN));
    }

    public void a(@oy.l U7 u10) {
        try {
            HashMap map = new HashMap();
            map.put(Q6.E, u10.a());
            map.put(Q6.D, u10.b());
            map.put(Q6.V, u10.c());
            this.f60308a.a(map);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f60308a.a("abt", str);
    }

    public void a(int i10) {
        this.f60308a.a(Q6.f59879j0, Integer.valueOf(i10));
    }
}
