package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.setting.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f66665q = com.mbridge.msdk.foundation.controller.c.class.getSimpleName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static HashMap<String, String> f66666r = new HashMap<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static com.mbridge.msdk.config.component.status.b f66667s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f66669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f66670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f66671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f66672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f66673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66674g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f66677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f66678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66679l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<Context> f66681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private JSONObject f66682o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f66668a = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f66675h = new JSONObject();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66676i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f66680m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f66683p = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0624a implements Runnable {
        public RunnableC0624a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.e.a(a.this.f66670c).a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.report.crashreport.d.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f66669b = (String) y0.a(aVar.f66670c, "sp_appId", "");
            } catch (Throwable th2) {
                q0.b(a.f66665q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.f66677j = (String) y0.a(aVar.f66670c, "sp_appKey", "");
            } catch (Throwable th2) {
                q0.b(a.f66665q, th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
    }

    private void m() {
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.i() && com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object objA = y0.a(this.f66670c, MBridgeConstans.SP_GA_ID, "");
                Object objA2 = y0.a(this.f66670c, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (objA instanceof String) {
                    String str = (String) objA;
                    if (TextUtils.isEmpty(str)) {
                        g.d();
                    } else {
                        g.a(str);
                    }
                    if (objA2 instanceof Integer) {
                        g.a(((Integer) objA2).intValue());
                    }
                }
            }
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public abstract void a(e eVar);

    public void b(int i10) {
        this.f66679l = i10;
    }

    public void c(int i10) {
        this.f66683p = i10;
    }

    public Context d() {
        return this.f66670c;
    }

    public s e() {
        return this.f66668a;
    }

    public Context f() {
        WeakReference<Context> weakReference = this.f66681n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int g() {
        return this.f66674g;
    }

    public String h() {
        return !TextUtils.isEmpty(this.f66678k) ? this.f66678k : "";
    }

    public String i() {
        try {
            if (!TextUtils.isEmpty(this.f66671d)) {
                return this.f66671d;
            }
            Context context = this.f66670c;
            if (context == null) {
                return null;
            }
            String packageName = context.getPackageName();
            this.f66671d = packageName;
            return packageName;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String j() {
        if (!TextUtils.isEmpty(this.f66678k)) {
            return this.f66678k;
        }
        Context context = this.f66670c;
        if (context != null) {
            return (String) y0.a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    public JSONObject k() {
        return this.f66682o;
    }

    public int l() {
        return this.f66683p;
    }

    public WeakReference<Activity> a() {
        return this.f66672e;
    }

    public void b(e eVar) {
        try {
            m0.C(this.f66670c);
            a(eVar);
            h.a(this.f66670c, this.f66669b);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                try {
                    try {
                        m0.d(this.f66670c.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled ? 1 : 2);
                    } catch (Throwable th2) {
                        q0.b(f66665q, th2.getMessage());
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    m0.d(0);
                }
            }
            try {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                s sVarE = com.mbridge.msdk.foundation.controller.c.n().e();
                if (sVarE != null && sVarE.b() && gVarD != null && gVarD.F() == 1) {
                    com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0624a());
                }
                if (sVarE == null || !sVarE.a()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.threadpool.a.c().post(new b());
            } catch (Throwable th3) {
                q0.b(f66665q, th3.getMessage());
            }
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public void c(e eVar) {
        if (this.f66676i) {
            return;
        }
        m();
        try {
            JSONObject jSONObject = new JSONObject();
            this.f66682o = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            q0.b(f66665q, e10.getMessage());
        }
        b(eVar);
    }

    public void d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f66678k = str;
            Context context = this.f66670c;
            if (context != null) {
                y0.b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void e(String str) {
        Context context;
        try {
            this.f66669b = str;
            if (TextUtils.isEmpty(str) || (context = this.f66670c) == null) {
                return;
            }
            y0.b(context, "sp_appId", str);
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public void f(String str) {
        Context context;
        try {
            this.f66677j = str;
            if (TextUtils.isEmpty(str) || (context = this.f66670c) == null) {
                return;
            }
            y0.b(context, "sp_appKey", str);
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public void a(WeakReference<Activity> weakReference) {
        this.f66672e = weakReference;
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f66681n = new WeakReference<>(context);
        }
    }

    public void a(int i10) {
        this.f66674g = i10;
    }

    public BitmapDrawable a(String str, int i10) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str2;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f66680m) == null || !concurrentHashMap.containsKey(str) || !s0.a().a("w_m_r_l", true)) {
            return null;
        }
        String str3 = this.f66680m.get(str);
        BitmapDrawable bitmapDrawableN = v0.n(str3);
        int i11 = TextUtils.isEmpty(str3) ? 2 : 1;
        if (TextUtils.isEmpty(str3)) {
            str2 = "get watermark failed";
        } else {
            str2 = bitmapDrawableN != null ? "" : "str to bitmap failed";
        }
        j.a(str, i10, i11, str2, bitmapDrawableN == null ? 2 : 1, str3);
        return bitmapDrawableN;
    }

    public String c() {
        try {
            if (!TextUtils.isEmpty(this.f66677j)) {
                return this.f66677j;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new d());
            return "";
        } catch (Throwable th2) {
            q0.b(f66665q, th2.getMessage());
            return "";
        }
    }

    public void a(JSONObject jSONObject) {
        this.f66682o = jSONObject;
    }

    public void a(String str) {
        try {
            if (this.f66680m != null && !TextUtils.isEmpty(str) && this.f66680m.containsKey(str)) {
                this.f66680m.remove(str);
            }
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f66671d = str;
    }

    public void a(String str, JSONObject jSONObject) {
        if (s0.a().a("w_m_r_l", true)) {
            try {
                if (this.f66675h == null) {
                    this.f66675h = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        this.f66675h.put(next, jSONObject.get(next));
                    }
                }
                if (this.f66675h.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f66680m == null) {
                        this.f66680m = new ConcurrentHashMap<>();
                    }
                    this.f66680m.put(str, this.f66675h.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e10) {
                q0.b(f66665q, e10.getMessage());
            }
        }
    }

    public String b() {
        try {
            if (!TextUtils.isEmpty(this.f66669b)) {
                return this.f66669b;
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            return "";
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
            return "";
        }
    }

    public void b(String str) {
        Context context;
        try {
            this.f66673f = str;
            if (TextUtils.isEmpty(str) || (context = this.f66670c) == null) {
                return;
            }
            y0.b(context, "applicationIds", str);
        } catch (Exception e10) {
            q0.b(f66665q, e10.getMessage());
        }
    }

    public void b(Context context) {
        this.f66670c = context;
    }
}
