package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f70266b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f70267a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f70267a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f70218a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f70269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f70270b;

        public b(e eVar, JSONObject jSONObject) {
            this.f70269a = eVar;
            this.f70270b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f70267a.g().a(this.f70269a);
                JSONObject jSONObject = this.f70270b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f70270b.put("track_time", jArrE[0]);
                    this.f70270b.put("track_count", jArrE[1]);
                    this.f70269a.a(this.f70270b);
                }
                this.f70269a.b(m.this.f70267a.b().f70467f);
                m.this.f70267a.g().b(this.f70269a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f70267a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m b(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f70266b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public JSONObject c() {
        return this.f70267a.o();
    }

    public String d() {
        return this.f70267a.s();
    }

    public long[] e() {
        return this.f70267a.g().a();
    }

    public String f() {
        return this.f70267a.v();
    }

    public boolean g() {
        return !this.f70267a.w();
    }

    public String h() {
        if (!g()) {
            return this.f70267a.x();
        }
        if (com.mbridge.msdk.tracker.a.f70218a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f70266b;
        m mVar = concurrentHashMap.get(str);
        if (y.b(mVar)) {
            concurrentHashMap.put(str, new m(str, context, xVar));
        } else {
            mVar.f70267a.a(xVar);
        }
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f70267a.w()) {
            if (com.mbridge.msdk.tracker.a.f70218a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has("ts")) {
                try {
                    jSONObjectI.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f70267a.h().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f70218a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f70266b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f70218a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public void a() {
        try {
            this.f70267a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f70218a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f70267a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f70267a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
