package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f26176a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f26177b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f26178c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26179d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f26180e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f26181f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f26182z;
    private int B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f26183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f26184h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f26190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f26192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f26194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f26195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f26196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f26197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f26198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f26199w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f26185i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f26186j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f26187k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f26188l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f26189m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f26200x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f26201y = -1;
    private int A = 50;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f26203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f26204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f26205c;

        public a(String str, String str2, long j10) {
            this.f26204b = str2;
            this.f26205c = j10;
            this.f26203a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f26205c)) + " : " + this.f26203a + ' ' + this.f26204b;
        }
    }

    private b(@NonNull Application application) {
        this.f26184h = application;
        this.f26183g = application;
        if (application != null) {
            try {
                this.f26183g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f26190n = activity.getClass().getName();
                        b.this.f26191o = System.currentTimeMillis();
                        boolean unused = b.f26177b = bundle != null;
                        boolean unused2 = b.f26178c = true;
                        b.this.f26185i.add(b.this.f26190n);
                        b.this.f26186j.add(Long.valueOf(b.this.f26191o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f26190n, b.this.f26191o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f26185i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f26185i.size()) {
                            b.this.f26185i.remove(iIndexOf);
                            b.this.f26186j.remove(iIndexOf);
                        }
                        b.this.f26187k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f26188l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f26196t = activity.getClass().getName();
                        b.this.f26197u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f26200x = false;
                            boolean unused = b.f26178c = false;
                            b.this.f26201y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f26200x = false;
                            boolean unused2 = b.f26178c = false;
                            b.this.f26201y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f26196t, b.this.f26197u, C4235d4.i.f61441t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f26194r = activity.getClass().getName();
                        b.this.f26195s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f26200x) {
                            if (b.f26176a) {
                                b.k();
                                int unused = b.f26179d = 1;
                                long unused2 = b.f26181f = b.this.f26195s;
                            }
                            if (!b.this.f26194r.equals(b.this.f26196t)) {
                                return;
                            }
                            if (b.f26178c && !b.f26177b) {
                                int unused3 = b.f26179d = 4;
                                long unused4 = b.f26181f = b.this.f26195s;
                                return;
                            } else if (!b.f26178c) {
                                int unused5 = b.f26179d = 3;
                                long unused6 = b.f26181f = b.this.f26195s;
                                return;
                            }
                        }
                        b.this.f26200x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f26194r, b.this.f26195s, C4235d4.i.f61443u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f26192p = activity.getClass().getName();
                        b.this.f26193q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f26192p, b.this.f26193q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f26198v = activity.getClass().getName();
                        b.this.f26199w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f26198v, b.this.f26199w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f26176a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f26185i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f26185i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f26185i.get(i10), this.f26186j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f26187k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f26187k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f26187k.get(i10), this.f26188l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f26190n, this.f26191o));
                jSONObject.put("last_start_activity", a(this.f26192p, this.f26193q));
                jSONObject.put("last_resume_activity", a(this.f26194r, this.f26195s));
                jSONObject.put("last_pause_activity", a(this.f26196t, this.f26197u));
                jSONObject.put("last_stop_activity", a(this.f26198v, this.f26199w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f26194r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f26189m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f26200x;
    }

    public static long c() {
        return f26181f;
    }

    public static b d() {
        if (f26182z == null) {
            synchronized (b.class) {
                try {
                    if (f26182z == null) {
                        f26182z = new b(com.apm.insight.e.h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f26182z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f26201y;
    }

    public static int b() {
        int i10 = f26179d;
        if (i10 == 1) {
            return f26180e ? 2 : 1;
        }
        return i10;
    }

    public static void a() {
        f26180e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f26189m.size() >= bVar.A) {
                    aVar = bVar.f26189m.poll();
                    if (aVar != null) {
                        bVar.f26189m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f26189m.add(aVar);
                }
                aVar.f26204b = str2;
                aVar.f26203a = str;
                aVar.f26205c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
