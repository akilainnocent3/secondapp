package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import defpackage.ao8;
import defpackage.arh;
import defpackage.avg0;
import defpackage.bb30;
import defpackage.bpa;
import defpackage.brh;
import defpackage.d650;
import defpackage.do8;
import defpackage.hze;
import defpackage.ix20;
import defpackage.kn8;
import defpackage.kqh;
import defpackage.oqh;
import defpackage.owd0;
import defpackage.pug0;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.rqh;
import defpackage.sph;
import defpackage.sqh;
import defpackage.tqh;
import defpackage.ts7;
import defpackage.tt0;
import defpackage.uqh;
import defpackage.vqh;
import defpackage.wch0;
import defpackage.wqh;
import defpackage.xqh;
import defpackage.xrh0;
import defpackage.yoh;
import defpackage.yqh;
import defpackage.zqh;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static kqh lambda$getComponents$0(bb30 bb30Var, ao8 ao8Var) {
        AppStartTrace appStartTrace;
        yoh yohVar = (yoh) ao8Var.a(yoh.class);
        owd0 owd0Var = (owd0) ao8Var.f(owd0.class).get();
        Executor executor = (Executor) ao8Var.d(bb30Var);
        kqh kqhVar = new kqh();
        yohVar.a();
        Context context = yohVar.a;
        bpa bpaVarE = bpa.e();
        bpaVarE.getClass();
        bpa.d.b = xrh0.a(context);
        bpaVarE.c.c(context);
        tt0 tt0VarA = tt0.a();
        synchronized (tt0VarA) {
            if (!tt0VarA.D) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(tt0VarA);
                    tt0VarA.D = true;
                }
            }
        }
        sqh sqhVar = new sqh();
        synchronized (tt0VarA.i) {
            tt0VarA.i.add(sqhVar);
        }
        if (owd0Var != null) {
            if (AppStartTrace.M != null) {
                appStartTrace = AppStartTrace.M;
            } else {
                avg0 avg0Var = avg0.H;
                ts7 ts7Var = new ts7();
                if (AppStartTrace.M == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.M == null) {
                                AppStartTrace.M = new AppStartTrace(avg0Var, ts7Var, bpa.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.M;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.a) {
                    ix20.w.f.a(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.J = appStartTrace.J || AppStartTrace.c((Application) applicationContext2);
                        appStartTrace.a = true;
                        appStartTrace.e = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new AppStartTrace.b(appStartTrace));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return kqhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static rqh providesFirebasePerformance(ao8 ao8Var) {
        ao8Var.a(kqh.class);
        tqh tqhVar = new tqh((yoh) ao8Var.a(yoh.class), (sph) ao8Var.a(sph.class), ao8Var.f(d650.class), ao8Var.f(pug0.class));
        return (rqh) hze.b(new brh(new vqh(tqhVar), new xqh(tqhVar), new wqh(tqhVar), new arh(tqhVar), new yqh(), new uqh(), new zqh())).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        final bb30 bb30Var = new bb30(wch0.class, Executor.class);
        kn8.a aVarB = kn8.b(rqh.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(rmd.c(yoh.class));
        aVarB.a(new rmd(1, 1, d650.class));
        aVarB.a(rmd.c(sph.class));
        aVarB.a(new rmd(1, 1, pug0.class));
        aVarB.a(rmd.c(kqh.class));
        aVarB.f = new oqh();
        kn8 kn8VarB = aVarB.b();
        kn8.a aVarB2 = kn8.b(kqh.class);
        aVarB2.a = EARLY_LIBRARY_NAME;
        aVarB2.a(rmd.c(yoh.class));
        aVarB2.a(rmd.a(owd0.class));
        aVarB2.a(new rmd((bb30<?>) bb30Var, 1, 0));
        aVarB2.c(2);
        aVarB2.f = new do8() { // from class: pqh
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) {
                return FirebasePerfRegistrar.lambda$getComponents$0(bb30Var, hi50Var);
            }
        };
        return Arrays.asList(kn8VarB, aVarB2.b(), q9s.a(LIBRARY_NAME, "22.0.1"));
    }
}
