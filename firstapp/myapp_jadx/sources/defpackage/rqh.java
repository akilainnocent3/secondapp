package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class rqh {
    public static final p80 e = p80.d();
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final n730<d650> b;
    public final sph c;
    public final n730<pug0> d;

    public rqh(yoh yohVar, n730<d650> n730Var, sph sphVar, n730<pug0> n730Var2, RemoteConfigManager remoteConfigManager, bpa bpaVar, SessionManager sessionManager) {
        Bundle bundle;
        this.b = n730Var;
        this.c = sphVar;
        this.d = n730Var2;
        if (yohVar == null) {
            new icn(new Bundle());
            return;
        }
        iqh iqhVar = yohVar.c;
        final avg0 avg0Var = avg0.H;
        avg0Var.d = yohVar;
        yohVar.a();
        avg0Var.E = iqhVar.g;
        avg0Var.f = sphVar;
        avg0Var.i = n730Var2;
        avg0Var.w.execute(new Runnable() { // from class: xug0
            @Override // java.lang.Runnable
            public final void run() {
                npa npaVar;
                String strA;
                final avg0 avg0Var2 = avg0Var;
                yoh yohVar2 = avg0Var2.d;
                yohVar2.a();
                Context context = yohVar2.a;
                avg0Var2.y = context;
                avg0Var2.D = context.getPackageName();
                avg0Var2.z = bpa.e();
                avg0Var2.A = new o040(avg0Var2.y, new n040(100L, 1L, TimeUnit.MINUTES));
                avg0Var2.B = tt0.a();
                n730<pug0> n730Var3 = avg0Var2.i;
                bpa bpaVar2 = avg0Var2.z;
                bpaVar2.getClass();
                npa npaVar2 = npa.b;
                synchronized (npa.class) {
                    npaVar = npa.b;
                    if (npaVar == null) {
                        npaVar = new npa();
                        npa.b = npaVar;
                    }
                }
                Long l = (Long) bpaVar2.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map<Long, String> map = npa.c;
                if (!map.containsKey(l) || (strA = map.get(l)) == null) {
                    k2z<String> k2zVarD = bpaVar2.d(npaVar);
                    strA = k2zVarD.b() ? k2zVarD.a() : "FIREPERF";
                } else {
                    bpaVar2.c.f("com.google.firebase.perf.LogSourceName", strA);
                }
                avg0Var2.v = new nvh(n730Var3, strA);
                ConcurrentLinkedQueue<wb00> concurrentLinkedQueue = avg0Var2.b;
                tt0 tt0Var = avg0Var2.B;
                WeakReference weakReference = new WeakReference(avg0.H);
                synchronized (tt0Var.f) {
                    tt0Var.f.add(weakReference);
                }
                wu0.b bVarO = wu0.o();
                avg0Var2.C = bVarO;
                yoh yohVar3 = avg0Var2.d;
                yohVar3.a();
                bVarO.l(yohVar3.c.b);
                t20.b bVarK = t20.k();
                bVarK.g(avg0Var2.D);
                bVarK.h();
                Context context2 = avg0Var2.y;
                String str = "";
                try {
                    String str2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                bVarK.i(str);
                bVarO.i(bVarK);
                avg0Var2.c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    final wb00 wb00VarPoll = concurrentLinkedQueue.poll();
                    if (wb00VarPoll != null) {
                        avg0Var2.w.execute(new Runnable() { // from class: yug0
                            @Override // java.lang.Runnable
                            public final void run() {
                                wb00 wb00Var = wb00VarPoll;
                                avg0Var2.d(wb00Var.a, wb00Var.b);
                            }
                        });
                    }
                }
            }
        });
        yohVar.a();
        Context context = yohVar.a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            Log.d("isEnabled", "No perf enable meta data found " + e2.getMessage());
            bundle = null;
        }
        icn icnVar = bundle != null ? new icn(bundle) : new icn();
        remoteConfigManager.setFirebaseRemoteConfigProvider(n730Var);
        bpaVar.b = icnVar;
        bpa.d.b = xrh0.a(context);
        bpaVar.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolG = bpaVar.g();
        p80 p80Var = e;
        if (p80Var.b) {
            if (boolG != null ? boolG.booleanValue() : yoh.c().g()) {
                yohVar.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(qva.a(iqhVar.g, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (p80Var.b) {
                    p80Var.a.getClass();
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
