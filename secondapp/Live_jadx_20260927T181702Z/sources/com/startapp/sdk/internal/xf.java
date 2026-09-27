package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class xf {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f75826o = MetaData.E().o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f75828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f75829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f75830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TrackingParams f75831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f75832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75835i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakReference f75837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public vf f75838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f75839m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f75827a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f75836j = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f75840n = new Object();

    public xf(Context context, AdPreferences.Placement placement, String[] strArr, TrackingParams trackingParams, long j10, boolean z10, wf wfVar) {
        Context contextA = w0.a(context);
        this.f75828b = contextA != null ? contextA : context;
        this.f75829c = placement;
        this.f75830d = strArr;
        this.f75831e = trackingParams;
        this.f75832f = j10;
        this.f75839m = z10;
        this.f75837k = new WeakReference(wfVar);
    }

    public final void a() {
        if (this.f75834h && this.f75835i) {
            this.f75827a.removeCallbacksAndMessages(null);
            this.f75832f -= System.currentTimeMillis() - this.f75833g;
            this.f75835i = false;
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        boolean z10;
        synchronized (this.f75840n) {
            try {
                z10 = this.f75839m;
                if (z10) {
                    this.f75838l = new vf(this, str, jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            c(str, jSONObject);
            return;
        }
        if (a(4)) {
            d9 d9Var = new d9(e9.f74721d);
            d9Var.f74675d = "SI.defImp";
            d9Var.f74680i = "reason=" + str;
            d9Var.a();
        }
    }

    public final void c() {
        if (this.f75836j.get() != 0) {
            return;
        }
        if (!f75826o) {
            b(null, null);
            return;
        }
        long j10 = this.f75832f;
        if (this.f75835i) {
            return;
        }
        this.f75835i = true;
        if (!this.f75834h) {
            this.f75834h = true;
        }
        this.f75833g = System.currentTimeMillis();
        this.f75827a.postDelayed(new uf(this), j10);
    }

    public final void a(String str, JSONObject jSONObject) {
        b(str, jSONObject);
        this.f75834h = false;
        this.f75827a.removeCallbacksAndMessages(null);
        this.f75835i = false;
        this.f75833g = 0L;
    }

    public static boolean a(int i10) {
        AnalyticsConfig analyticsConfigH = MetaData.E().h();
        ComponentInfoEventConfig componentInfoEventConfigI = analyticsConfigH != null ? analyticsConfigH.i() : null;
        return componentInfoEventConfigI != null && componentInfoEventConfigI.a((long) i10);
    }

    public final void c(String str, JSONObject jSONObject) {
        if (!this.f75836j.compareAndSet(0, 1)) {
            int iIncrementAndGet = this.f75836j.incrementAndGet();
            if (a(str != null ? 2 : 1)) {
                d9 d9Var = new d9(e9.f74721d);
                d9Var.f74675d = "SI.repImp";
                d9Var.f74680i = "reason=" + str;
                d9Var.f74676e = String.valueOf(iIncrementAndGet);
                d9Var.a();
                return;
            }
            return;
        }
        String strA = null;
        if (str == null) {
            Context context = this.f75828b;
            String[] strArr = this.f75830d;
            TrackingParams trackingParams = this.f75831e;
            if (context != null && strArr != null) {
                b9.a(context, Arrays.asList(strArr), trackingParams);
            }
            wf wfVar = (wf) this.f75837k.get();
            if (wfVar != null) {
                String[] strArr2 = this.f75830d;
                if (strArr2 != null && strArr2.length > 0) {
                    strA = g0.a(strArr2[0], (String) null);
                }
                wfVar.a(strA);
            }
            try {
                u0 u0Var = (u0) com.startapp.sdk.components.a.a(this.f75828b).Q.a();
                AdPreferences.Placement placement = this.f75829c;
                ConcurrentHashMap concurrentHashMap = u0Var.f75585c;
                Integer num = (Integer) concurrentHashMap.get(placement);
                concurrentHashMap.put(placement, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            } catch (Throwable th2) {
                d9.a(th2);
                return;
            }
        }
        String[] strArr3 = this.f75830d;
        TrackingParams trackingParams2 = this.f75831e;
        g0.a(strArr3, trackingParams2 != null ? trackingParams2.a() : null, 0, str, jSONObject);
    }

    public final void b() {
        vf vfVar;
        synchronized (this.f75840n) {
            vfVar = this.f75838l;
            this.f75839m = false;
            this.f75838l = null;
        }
        if (vfVar != null) {
            vfVar.run();
        }
        if (a(4)) {
            d9 d9Var = new d9(e9.f74721d);
            d9Var.f74675d = "SI.prcImp";
            StringBuilder sb2 = new StringBuilder("impr=");
            sb2.append(vfVar != null);
            d9Var.f74680i = sb2.toString();
            d9Var.a();
        }
    }
}
