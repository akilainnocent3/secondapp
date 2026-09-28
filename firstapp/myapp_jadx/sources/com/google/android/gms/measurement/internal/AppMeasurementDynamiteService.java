package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzr;
import defpackage.ael0;
import defpackage.b4l0;
import defpackage.bdl0;
import defpackage.cgl0;
import defpackage.cwk0;
import defpackage.dxk0;
import defpackage.eym;
import defpackage.fcl0;
import defpackage.gdl0;
import defpackage.hm20;
import defpackage.hwk0;
import defpackage.ib5;
import defpackage.igl0;
import defpackage.ijl0;
import defpackage.k8l0;
import defpackage.kal0;
import defpackage.khl0;
import defpackage.l9c;
import defpackage.lel0;
import defpackage.nfl0;
import defpackage.odl0;
import defpackage.opl0;
import defpackage.ox0;
import defpackage.p7l0;
import defpackage.pcl0;
import defpackage.r7l0;
import defpackage.rbl0;
import defpackage.rcy;
import defpackage.rdl0;
import defpackage.rfl0;
import defpackage.tcl0;
import defpackage.tdl0;
import defpackage.tnl0;
import defpackage.tvk0;
import defpackage.u4l0;
import defpackage.ugl0;
import defpackage.vdl0;
import defpackage.vfl0;
import defpackage.wel0;
import defpackage.wok0;
import defpackage.xfl0;
import defpackage.y4l0;
import defpackage.ydl0;
import defpackage.yol0;
import defpackage.zvk0;
import defpackage.zwk0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.luBk.Chyeyik;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public class AppMeasurementDynamiteService extends tvk0 {
    public k8l0 a = null;
    public final ox0 b = new ox0();

    public final void b() {
        if (this.a != null) {
            return;
        }
        ib5.a("Attempting to perform action before initialize.");
    }

    @Override // defpackage.vvk0
    public void beginAdUnitExposure(String str, long j) {
        b();
        hwk0 hwk0Var = this.a.n;
        k8l0.j(hwk0Var);
        hwk0Var.h(j, str);
    }

    @Override // defpackage.vvk0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.u(str, str2, bundle);
    }

    @Override // defpackage.vvk0
    public void clearMeasurementEnabled(long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.h();
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new ael0(nfl0Var, null));
    }

    public final void d(String str, zvk0 zvk0Var) {
        b();
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        yol0Var.P(str, zvk0Var);
    }

    @Override // defpackage.vvk0
    public void endAdUnitExposure(String str, long j) {
        b();
        hwk0 hwk0Var = this.a.n;
        k8l0.j(hwk0Var);
        hwk0Var.i(j, str);
    }

    @Override // defpackage.vvk0
    public void generateEventId(zvk0 zvk0Var) {
        b();
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        long jD0 = yol0Var.d0();
        b();
        yol0 yol0Var2 = this.a.i;
        k8l0.k(yol0Var2);
        yol0Var2.Q(zvk0Var, jD0);
    }

    @Override // defpackage.vvk0
    public void getAppInstanceId(zvk0 zvk0Var) {
        b();
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new r7l0(this, zvk0Var));
    }

    @Override // defpackage.vvk0
    public void getCachedAppInstanceId(zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        d((String) nfl0Var.g.get(), zvk0Var);
    }

    @Override // defpackage.vvk0
    public void getConditionalUserProperties(String str, String str2, zvk0 zvk0Var) {
        b();
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new ugl0(this, zvk0Var, str, str2));
    }

    @Override // defpackage.vvk0
    public void getCurrentScreenClass(zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        khl0 khl0Var = nfl0Var.a.l;
        k8l0.l(khl0Var);
        igl0 igl0Var = khl0Var.c;
        d(igl0Var != null ? igl0Var.b : null, zvk0Var);
    }

    @Override // defpackage.vvk0
    public void getCurrentScreenName(zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        khl0 khl0Var = nfl0Var.a.l;
        k8l0.l(khl0Var);
        igl0 igl0Var = khl0Var.c;
        d(igl0Var != null ? igl0Var.a : null, zvk0Var);
    }

    @Override // defpackage.vvk0
    public void getGmpAppId(zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        d(nfl0Var.v(), zvk0Var);
    }

    @Override // defpackage.vvk0
    public void getMaxUserProperties(String str, zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        hm20.e(str);
        wok0 wok0Var = nfl0Var.a.d;
        b();
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        yol0Var.R(zvk0Var, 25);
    }

    @Override // defpackage.vvk0
    public void getSessionId(zvk0 zvk0Var) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new odl0(nfl0Var, zvk0Var));
    }

    @Override // defpackage.vvk0
    public void getTestFlag(zvk0 zvk0Var, int i) {
        b();
        if (i == 0) {
            yol0 yol0Var = this.a.i;
            k8l0.k(yol0Var);
            nfl0 nfl0Var = this.a.m;
            k8l0.l(nfl0Var);
            AtomicReference atomicReference = new AtomicReference();
            p7l0 p7l0Var = nfl0Var.a.g;
            k8l0.m(p7l0Var);
            yol0Var.P((String) p7l0Var.q(atomicReference, 15000L, "String test flag value", new rdl0(nfl0Var, atomicReference)), zvk0Var);
            return;
        }
        if (i == 1) {
            yol0 yol0Var2 = this.a.i;
            k8l0.k(yol0Var2);
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            p7l0 p7l0Var2 = nfl0Var2.a.g;
            k8l0.m(p7l0Var2);
            yol0Var2.Q(zvk0Var, ((Long) p7l0Var2.q(atomicReference2, 15000L, "long test flag value", new tdl0(nfl0Var2, atomicReference2))).longValue());
            return;
        }
        if (i == 2) {
            yol0 yol0Var3 = this.a.i;
            k8l0.k(yol0Var3);
            nfl0 nfl0Var3 = this.a.m;
            k8l0.l(nfl0Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            p7l0 p7l0Var3 = nfl0Var3.a.g;
            k8l0.m(p7l0Var3);
            double dDoubleValue = ((Double) p7l0Var3.q(atomicReference3, 15000L, "double test flag value", new ydl0(nfl0Var3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                zvk0Var.O(bundle);
                return;
            } catch (RemoteException e) {
                y4l0 y4l0Var = yol0Var3.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            yol0 yol0Var4 = this.a.i;
            k8l0.k(yol0Var4);
            nfl0 nfl0Var4 = this.a.m;
            k8l0.l(nfl0Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            p7l0 p7l0Var4 = nfl0Var4.a.g;
            k8l0.m(p7l0Var4);
            yol0Var4.R(zvk0Var, ((Integer) p7l0Var4.q(atomicReference4, 15000L, "int test flag value", new vdl0(nfl0Var4, atomicReference4))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        yol0 yol0Var5 = this.a.i;
        k8l0.k(yol0Var5);
        nfl0 nfl0Var5 = this.a.m;
        k8l0.l(nfl0Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        p7l0 p7l0Var5 = nfl0Var5.a.g;
        k8l0.m(p7l0Var5);
        yol0Var5.T(zvk0Var, ((Boolean) p7l0Var5.q(atomicReference5, 15000L, "boolean test flag value", new bdl0(nfl0Var5, atomicReference5))).booleanValue());
    }

    @Override // defpackage.vvk0
    public void getUserProperties(String str, String str2, boolean z, zvk0 zvk0Var) {
        b();
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new pcl0(this, zvk0Var, str, str2, z));
    }

    @Override // defpackage.vvk0
    public void initForTests(Map map) {
        b();
    }

    @Override // defpackage.vvk0
    public void initialize(eym eymVar, zzdd zzddVar, long j) {
        k8l0 k8l0Var = this.a;
        if (k8l0Var == null) {
            Context context = (Context) rcy.d(eymVar);
            hm20.h(context);
            this.a = k8l0.r(context, zzddVar, Long.valueOf(j));
        } else {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.vvk0
    public void isDataCollectionEnabled(zvk0 zvk0Var) {
        b();
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new ijl0(this, zvk0Var));
    }

    @Override // defpackage.vvk0
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.l(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.vvk0
    public void logEventAndBundle(String str, String str2, Bundle bundle, zvk0 zvk0Var, long j) {
        b();
        hm20.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        zzbg zzbgVar = new zzbg(str2, new zzbe(bundle), "app", j);
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new kal0(this, zvk0Var, zzbgVar, str));
    }

    @Override // defpackage.vvk0
    public void logHealthData(int i, String str, eym eymVar, eym eymVar2, eym eymVar3) {
        b();
        Object objD = eymVar == null ? null : rcy.d(eymVar);
        Object objD2 = eymVar2 == null ? null : rcy.d(eymVar2);
        Object objD3 = eymVar3 != null ? rcy.d(eymVar3) : null;
        y4l0 y4l0Var = this.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.l(i, true, false, str, objD, objD2, objD3);
    }

    @Override // defpackage.vvk0
    public void onActivityCreated(eym eymVar, Bundle bundle, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityCreatedByScionActivityInfo(zzdf.G0(activity), bundle, j);
    }

    @Override // defpackage.vvk0
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        lel0 lel0Var = nfl0Var.c;
        if (lel0Var != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
            lel0Var.a(zzdfVar, bundle);
        }
    }

    @Override // defpackage.vvk0
    public void onActivityDestroyed(eym eymVar, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.G0(activity), j);
    }

    @Override // defpackage.vvk0
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        lel0 lel0Var = nfl0Var.c;
        if (lel0Var != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
            lel0Var.b(zzdfVar);
        }
    }

    @Override // defpackage.vvk0
    public void onActivityPaused(eym eymVar, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityPausedByScionActivityInfo(zzdf.G0(activity), j);
    }

    @Override // defpackage.vvk0
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        lel0 lel0Var = nfl0Var.c;
        if (lel0Var != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
            lel0Var.c(zzdfVar);
        }
    }

    @Override // defpackage.vvk0
    public void onActivityResumed(eym eymVar, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityResumedByScionActivityInfo(zzdf.G0(activity), j);
    }

    @Override // defpackage.vvk0
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        lel0 lel0Var = nfl0Var.c;
        if (lel0Var != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
            lel0Var.d(zzdfVar);
        }
    }

    @Override // defpackage.vvk0
    public void onActivitySaveInstanceState(eym eymVar, zvk0 zvk0Var, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.G0(activity), zvk0Var, j);
    }

    @Override // defpackage.vvk0
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zvk0 zvk0Var, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        lel0 lel0Var = nfl0Var.c;
        Bundle bundle = new Bundle();
        if (lel0Var != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
            lel0Var.e(zzdfVar, bundle);
        }
        try {
            zvk0Var.O(bundle);
        } catch (RemoteException e) {
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.vvk0
    public void onActivityStarted(eym eymVar, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityStartedByScionActivityInfo(zzdf.G0(activity), j);
    }

    @Override // defpackage.vvk0
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        if (nfl0Var.c != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
        }
    }

    @Override // defpackage.vvk0
    public void onActivityStopped(eym eymVar, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        onActivityStoppedByScionActivityInfo(zzdf.G0(activity), j);
    }

    @Override // defpackage.vvk0
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        if (nfl0Var.c != null) {
            nfl0 nfl0Var2 = this.a.m;
            k8l0.l(nfl0Var2);
            nfl0Var2.z();
        }
    }

    @Override // defpackage.vvk0
    public void performAction(Bundle bundle, zvk0 zvk0Var, long j) {
        b();
        zvk0Var.O(null);
    }

    @Override // defpackage.vvk0
    public void registerOnMeasurementEventListener(zwk0 zwk0Var) {
        Object opl0Var;
        b();
        ox0 ox0Var = this.b;
        synchronized (ox0Var) {
            try {
                opl0Var = (rbl0) ox0Var.get(Integer.valueOf(zwk0Var.zzf()));
                if (opl0Var == null) {
                    opl0Var = new opl0(this, zwk0Var);
                    ox0Var.put(Integer.valueOf(zwk0Var.zzf()), opl0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.h();
        if (nfl0Var.e.add(opl0Var)) {
            return;
        }
        y4l0 y4l0Var = nfl0Var.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.i.a("OnEventListener already registered");
    }

    @Override // defpackage.vvk0
    public void resetAnalyticsData(long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.g.set(null);
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new gdl0(nfl0Var, j));
    }

    @Override // defpackage.vvk0
    public void retrieveAndUploadBatches(cwk0 cwk0Var) {
        cgl0 cgl0Var;
        b();
        final nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.h();
        k8l0 k8l0Var = nfl0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        if (p7l0Var.m()) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        if (Thread.currentThread() == p7l0Var2.d) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zC = l9c.c();
        y4l0 y4l0Var3 = k8l0Var.f;
        if (zC) {
            k8l0.m(y4l0Var3);
            y4l0Var3.f.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        k8l0.m(y4l0Var3);
        y4l0Var3.n.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            y4l0 y4l0Var4 = k8l0Var.f;
            k8l0.m(y4l0Var4);
            y4l0Var4.n.a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            p7l0 p7l0Var3 = k8l0Var.g;
            k8l0.m(p7l0Var3);
            p7l0Var3.q(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: mfl0
                @Override // java.lang.Runnable
                public final void run() {
                    final ikl0 ikl0VarO = nfl0Var.a.o();
                    final zzoo zzooVarG0 = zzoo.G0(egl0.SGTM_CLIENT);
                    ikl0VarO.g();
                    ikl0VarO.h();
                    final zzr zzrVarW = ikl0VarO.w(false);
                    final AtomicReference atomicReference2 = atomicReference;
                    ikl0VarO.u(new Runnable() { // from class: ckl0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ikl0 ikl0Var = ikl0VarO;
                            AtomicReference atomicReference3 = atomicReference2;
                            zzr zzrVar = zzrVarW;
                            zzoo zzooVar = zzooVarG0;
                            synchronized (atomicReference3) {
                                try {
                                    o3l0 o3l0Var = ikl0Var.d;
                                    if (o3l0Var != null) {
                                        o3l0Var.R(zzrVar, zzooVar, new shl0(ikl0Var, atomicReference3));
                                        ikl0Var.t();
                                    } else {
                                        y4l0 y4l0Var5 = ikl0Var.a.f;
                                        k8l0.m(y4l0Var5);
                                        y4l0Var5.f.a("[sgtm] Failed to get upload batches; not connected to service");
                                    }
                                } catch (RemoteException e) {
                                    y4l0 y4l0Var6 = ikl0Var.a.f;
                                    k8l0.m(y4l0Var6);
                                    y4l0Var6.f.b(e, "[sgtm] Failed to get upload batches; remote exception");
                                    atomicReference3.notifyAll();
                                }
                            }
                        }
                    });
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.a;
            if (list.isEmpty()) {
                break;
            }
            y4l0 y4l0Var5 = k8l0Var.f;
            k8l0.m(y4l0Var5);
            y4l0Var5.n.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                final zzom zzomVar = (zzom) it.next();
                try {
                    URL url = new URI(zzomVar.c).toURL();
                    final AtomicReference atomicReference2 = new AtomicReference();
                    b4l0 b4l0VarQ = nfl0Var.a.q();
                    b4l0VarQ.h();
                    hm20.h(b4l0VarQ.g);
                    String str = b4l0VarQ.g;
                    k8l0 k8l0Var2 = nfl0Var.a;
                    y4l0 y4l0Var6 = k8l0Var2.f;
                    k8l0.m(y4l0Var6);
                    u4l0 u4l0Var = y4l0Var6.n;
                    Long lValueOf = Long.valueOf(zzomVar.a);
                    u4l0Var.d(lValueOf, "[sgtm] Uploading data from app. row_id, url, uncompressed size", zzomVar.c, Integer.valueOf(zzomVar.b.length));
                    if (!TextUtils.isEmpty(zzomVar.i)) {
                        y4l0 y4l0Var7 = k8l0Var2.f;
                        k8l0.m(y4l0Var7);
                        y4l0Var7.n.c(lValueOf, "[sgtm] Uploading data from app. row_id", zzomVar.i);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = zzomVar.d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    xfl0 xfl0Var = k8l0Var2.o;
                    k8l0.m(xfl0Var);
                    byte[] bArr = zzomVar.b;
                    rfl0 rfl0Var = new rfl0() { // from class: nel0
                        /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                        /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r8
                          0x002d: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:13:0x0063  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0066  */
                        @Override // defpackage.rfl0
                        public final void a(String str3, int i2, Throwable th, byte[] bArr2, Map map2) {
                            cgl0 cgl0Var2;
                            nfl0 nfl0Var2 = nfl0Var;
                            nfl0Var2.g();
                            zzom zzomVar2 = zzomVar;
                            if (i2 == 200 || i2 == 204) {
                                if (th == null) {
                                    y4l0 y4l0Var8 = nfl0Var2.a.f;
                                    k8l0.m(y4l0Var8);
                                    y4l0Var8.n.b(Long.valueOf(zzomVar2.a), "[sgtm] Upload succeeded for row_id");
                                    cgl0Var2 = cgl0.SUCCESS;
                                } else {
                                    y4l0 y4l0Var9 = nfl0Var2.a.f;
                                    k8l0.m(y4l0Var9);
                                    y4l0Var9.i.d(Long.valueOf(zzomVar2.a), Chyeyik.GnDzwCcCQ, Integer.valueOf(i2), th);
                                    if (Arrays.asList(((String) v2l0.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                        cgl0Var2 = cgl0.BACKOFF;
                                    } else {
                                        cgl0Var2 = cgl0.FAILURE;
                                    }
                                }
                            } else if (i2 == 304) {
                                i2 = 304;
                                if (th == null) {
                                    y4l0 y4l0Var10 = nfl0Var2.a.f;
                                    k8l0.m(y4l0Var10);
                                    y4l0Var10.n.b(Long.valueOf(zzomVar2.a), "[sgtm] Upload succeeded for row_id");
                                    cgl0Var2 = cgl0.SUCCESS;
                                } else {
                                    y4l0 y4l0Var11 = nfl0Var2.a.f;
                                    k8l0.m(y4l0Var11);
                                    y4l0Var11.i.d(Long.valueOf(zzomVar2.a), Chyeyik.GnDzwCcCQ, Integer.valueOf(i2), th);
                                    if (Arrays.asList(((String) v2l0.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                        cgl0Var2 = cgl0.BACKOFF;
                                    } else {
                                        cgl0Var2 = cgl0.FAILURE;
                                    }
                                }
                            } else {
                                y4l0 y4l0Var12 = nfl0Var2.a.f;
                                k8l0.m(y4l0Var12);
                                y4l0Var12.i.d(Long.valueOf(zzomVar2.a), Chyeyik.GnDzwCcCQ, Integer.valueOf(i2), th);
                                if (Arrays.asList(((String) v2l0.u.a(null)).split(",")).contains(String.valueOf(i2))) {
                                    cgl0Var2 = cgl0.BACKOFF;
                                } else {
                                    cgl0Var2 = cgl0.FAILURE;
                                }
                            }
                            AtomicReference atomicReference3 = atomicReference2;
                            final ikl0 ikl0VarO = nfl0Var2.a.o();
                            long j = zzomVar2.a;
                            final zzaf zzafVar = new zzaf(cgl0Var2.a, j, zzomVar2.f);
                            ikl0VarO.g();
                            ikl0VarO.h();
                            final zzr zzrVarW = ikl0VarO.w(true);
                            ikl0VarO.u(new Runnable() { // from class: ekl0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzr zzrVar = zzrVarW;
                                    zzaf zzafVar2 = zzafVar;
                                    ikl0 ikl0Var = ikl0VarO;
                                    k8l0 k8l0Var3 = ikl0Var.a;
                                    o3l0 o3l0Var = ikl0Var.d;
                                    if (o3l0Var == null) {
                                        y4l0 y4l0Var13 = k8l0Var3.f;
                                        k8l0.m(y4l0Var13);
                                        y4l0Var13.f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                                        return;
                                    }
                                    try {
                                        o3l0Var.H(zzrVar, zzafVar2);
                                        ikl0Var.t();
                                    } catch (RemoteException e) {
                                        y4l0 y4l0Var14 = k8l0Var3.f;
                                        k8l0.m(y4l0Var14);
                                        y4l0Var14.f.c(Long.valueOf(zzafVar2.a), "[sgtm] Failed to update batch upload status, rowId, exception", e);
                                    }
                                }
                            });
                            y4l0 y4l0Var13 = nfl0Var2.a.f;
                            k8l0.m(y4l0Var13);
                            y4l0Var13.n.c(Long.valueOf(j), "[sgtm] Updated status for row_id", cgl0Var2);
                            synchronized (atomicReference3) {
                                atomicReference3.set(cgl0Var2);
                                atomicReference3.notifyAll();
                            }
                        }
                    };
                    xfl0Var.i();
                    hm20.h(url);
                    hm20.h(bArr);
                    p7l0 p7l0Var4 = xfl0Var.a.g;
                    k8l0.m(p7l0Var4);
                    p7l0Var4.s(new vfl0(xfl0Var, str, url, bArr, map, rfl0Var));
                    try {
                        yol0 yol0Var = k8l0Var2.i;
                        k8l0.k(yol0Var);
                        k8l0 k8l0Var3 = yol0Var.a;
                        k8l0Var3.k.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = jCurrentTimeMillis + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    k8l0Var3.k.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        y4l0 y4l0Var8 = nfl0Var.a.f;
                        k8l0.m(y4l0Var8);
                        y4l0Var8.i.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    cgl0Var = atomicReference2.get() == null ? cgl0.UNKNOWN : (cgl0) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    y4l0 y4l0Var9 = nfl0Var.a.f;
                    k8l0.m(y4l0Var9);
                    y4l0Var9.f.d(zzomVar.c, "[sgtm] Bad upload url for row_id", Long.valueOf(zzomVar.a), e);
                    cgl0Var = cgl0.FAILURE;
                }
                if (cgl0Var != cgl0.SUCCESS) {
                    if (cgl0Var == cgl0.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        y4l0 y4l0Var10 = k8l0Var.f;
        k8l0.m(y4l0Var10);
        y4l0Var10.n.c(Integer.valueOf(size), "[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i));
        try {
            cwk0Var.zze();
        } catch (RemoteException e2) {
            k8l0 k8l0Var4 = this.a;
            hm20.h(k8l0Var4);
            y4l0 y4l0Var11 = k8l0Var4.f;
            k8l0.m(y4l0Var11);
            y4l0Var11.i.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.vvk0
    public void setConditionalUserProperty(Bundle bundle, long j) {
        b();
        k8l0 k8l0Var = this.a;
        if (bundle == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Conditional user property must not be null");
        } else {
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.t(bundle, j);
        }
    }

    @Override // defpackage.vvk0
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // defpackage.vvk0
    public void setConsentThirdParty(Bundle bundle, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.A(bundle, -20, j);
    }

    @Override // defpackage.vvk0
    public void setCurrentScreen(eym eymVar, String str, String str2, long j) {
        b();
        Activity activity = (Activity) rcy.d(eymVar);
        hm20.h(activity);
        setCurrentScreenByScionActivityInfo(zzdf.G0(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r2 <= 500) goto L31;
     */
    @Override // defpackage.vvk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.vvk0
    public void setDataCollectionEnabled(boolean z) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.h();
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new fcl0(nfl0Var, z));
    }

    @Override // defpackage.vvk0
    public void setDefaultEventParameters(Bundle bundle) {
        b();
        final nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new Runnable() { // from class: gfl0
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle3;
                nfl0 nfl0Var2 = nfl0Var;
                qdl0 qdl0Var = nfl0Var2.w;
                k8l0 k8l0Var = nfl0Var2.a;
                Bundle bundle4 = bundle2;
                if (bundle4.isEmpty()) {
                    bundle3 = bundle4;
                } else {
                    j6l0 j6l0Var = k8l0Var.e;
                    yol0 yol0Var = k8l0Var.i;
                    wok0 wok0Var = k8l0Var.d;
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.k(j6l0Var);
                    bundle3 = new Bundle(j6l0Var.y.a());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            k8l0.k(yol0Var);
                            if (yol0.p0(obj)) {
                                yol0.w(qdl0Var, null, 27, null, null, 0);
                            }
                            k8l0.m(y4l0Var);
                            y4l0Var.k.c(str, "Invalid default event parameter type. Name, value", obj);
                        } else if (yol0.F(str)) {
                            k8l0.m(y4l0Var);
                            y4l0Var.k.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle3.remove(str);
                        } else {
                            k8l0.k(yol0Var);
                            wok0Var.getClass();
                            if (yol0Var.q0("param", str, 500, obj)) {
                                yol0Var.v(bundle3, str, obj);
                            }
                        }
                    }
                    k8l0.k(yol0Var);
                    yol0 yol0Var2 = wok0Var.a.i;
                    k8l0.k(yol0Var2);
                    int i = yol0Var2.M(201500000) ? 100 : 25;
                    if (bundle3.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle3.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle3.remove(str2);
                            }
                        }
                        k8l0.k(yol0Var);
                        yol0.w(qdl0Var, null, 26, null, null, 0);
                        k8l0.m(y4l0Var);
                        y4l0Var.k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                j6l0 j6l0Var2 = k8l0Var.e;
                k8l0.k(j6l0Var2);
                j6l0Var2.y.b(bundle3);
                if (!bundle4.isEmpty() || k8l0Var.d.q(null, v2l0.W0)) {
                    k8l0Var.o().l(bundle3);
                }
            }
        });
    }

    @Override // defpackage.vvk0
    public void setEventInterceptor(zwk0 zwk0Var) {
        b();
        tnl0 tnl0Var = new tnl0(this, zwk0Var);
        p7l0 p7l0Var = this.a.g;
        k8l0.m(p7l0Var);
        boolean zM = p7l0Var.m();
        k8l0 k8l0Var = this.a;
        if (!zM) {
            p7l0 p7l0Var2 = k8l0Var.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.p(new wel0(this, tnl0Var));
            return;
        }
        nfl0 nfl0Var = k8l0Var.m;
        k8l0.l(nfl0Var);
        nfl0Var.g();
        nfl0Var.h();
        tnl0 tnl0Var2 = nfl0Var.d;
        if (tnl0Var != tnl0Var2) {
            hm20.j("EventInterceptor already set.", tnl0Var2 == null);
        }
        nfl0Var.d = tnl0Var;
    }

    @Override // defpackage.vvk0
    public void setInstanceIdProvider(dxk0 dxk0Var) {
        b();
    }

    @Override // defpackage.vvk0
    public void setMeasurementEnabled(boolean z, long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        nfl0Var.h();
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new ael0(nfl0Var, boolValueOf));
    }

    @Override // defpackage.vvk0
    public void setMinimumSessionDuration(long j) {
        b();
    }

    @Override // defpackage.vvk0
    public void setSessionTimeoutDuration(long j) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        p7l0 p7l0Var = nfl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new tcl0(nfl0Var, j));
    }

    @Override // defpackage.vvk0
    public void setSgtmDebugInfo(Intent intent) {
        b();
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        k8l0 k8l0Var = nfl0Var.a;
        Uri data = intent.getData();
        if (data == null) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.l.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.l.a("[sgtm] Preview Mode was not enabled.");
            k8l0Var.d.c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        y4l0 y4l0Var3 = k8l0Var.f;
        k8l0.m(y4l0Var3);
        y4l0Var3.l.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        k8l0Var.d.c = queryParameter2;
    }

    @Override // defpackage.vvk0
    public void setUserId(final String str, long j) {
        b();
        final nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        k8l0 k8l0Var = nfl0Var.a;
        if (str != null && TextUtils.isEmpty(str)) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("User ID must be non-empty or null");
        } else {
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new Runnable() { // from class: ifl0
                @Override // java.lang.Runnable
                public final void run() {
                    k8l0 k8l0Var2 = nfl0Var.a;
                    b4l0 b4l0VarQ = k8l0Var2.q();
                    String str2 = b4l0VarQ.q;
                    String str3 = str;
                    boolean z = false;
                    if (str2 != null && !str2.equals(str3)) {
                        z = true;
                    }
                    b4l0VarQ.q = str3;
                    if (z) {
                        k8l0Var2.q().l();
                    }
                }
            });
            nfl0Var.q(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.vvk0
    public void setUserProperty(String str, String str2, eym eymVar, boolean z, long j) {
        b();
        Object objD = rcy.d(eymVar);
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.q(str, str2, objD, z, j);
    }

    @Override // defpackage.vvk0
    public void unregisterOnMeasurementEventListener(zwk0 zwk0Var) {
        Object opl0Var;
        b();
        ox0 ox0Var = this.b;
        synchronized (ox0Var) {
            opl0Var = (rbl0) ox0Var.remove(Integer.valueOf(zwk0Var.zzf()));
        }
        if (opl0Var == null) {
            opl0Var = new opl0(this, zwk0Var);
        }
        nfl0 nfl0Var = this.a.m;
        k8l0.l(nfl0Var);
        nfl0Var.h();
        if (nfl0Var.e.remove(opl0Var)) {
            return;
        }
        y4l0 y4l0Var = nfl0Var.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.i.a("OnEventListener had not been registered");
    }
}
