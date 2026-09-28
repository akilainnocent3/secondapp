package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.bpa;
import defpackage.hbs;
import defpackage.hoy;
import defpackage.hth;
import defpackage.ia20;
import defpackage.ith;
import defpackage.ix20;
import defpackage.owd0;
import defpackage.p80;
import defpackage.s9s;
import defpackage.ts7;
import defpackage.xig0;
import defpackage.yk10;
import defpackage.yoh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, hbs {
    public static final Timer K = new Timer();
    public static final long L = 60000000;
    public static volatile AppStartTrace M;
    public static ThreadPoolExecutor N;
    public PerfSession F;
    public final avg0 b;
    public final bpa c;
    public final xig0.b d;
    public Application e;
    public final Timer i;
    public final Timer v;
    public boolean a = false;
    public boolean f = false;
    public Timer w = null;
    public Timer y = null;
    public Timer z = null;
    public Timer A = null;
    public Timer B = null;
    public Timer C = null;
    public Timer D = null;
    public Timer E = null;
    public boolean G = false;
    public int H = 0;
    public final a I = new a();
    public boolean J = false;

    public final class a implements ViewTreeObserver.OnDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            AppStartTrace.this.H++;
        }
    }

    public static class b implements Runnable {
        public final AppStartTrace a;

        public b(AppStartTrace appStartTrace) {
            this.a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppStartTrace appStartTrace = this.a;
            if (appStartTrace.w == null) {
                appStartTrace.G = true;
            }
        }
    }

    public AppStartTrace(avg0 avg0Var, ts7 ts7Var, bpa bpaVar, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.b = avg0Var;
        this.c = bpaVar;
        N = threadPoolExecutor;
        xig0.b bVarW = xig0.w();
        bVarW.q("_experiment_app_start_ttid");
        this.d = bVarW;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.i = new Timer((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        owd0 owd0Var = (owd0) yoh.c().b(owd0.class);
        if (owd0Var != null) {
            long micros2 = timeUnit.toMicros(owd0Var.a());
            timer = new Timer((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.v = timer;
    }

    public static boolean c(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strA = yk10.a(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strA))) {
                return true;
            }
        }
        return false;
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer a() {
        Timer timer = this.v;
        return timer != null ? timer : K;
    }

    public final Timer b() {
        Timer timer = this.i;
        return timer != null ? timer : a();
    }

    public final void d(final xig0.b bVar) {
        if (this.C == null || this.D == null || this.E == null) {
            return;
        }
        N.execute(new Runnable() { // from class: st0
            @Override // java.lang.Runnable
            public final void run() {
                Timer timer = AppStartTrace.K;
                this.a.b.c(bVar.build(), zu0.e);
            }
        });
        e();
    }

    public final synchronized void e() {
        if (this.a) {
            ix20.w.f.d(this);
            this.e.unregisterActivityLifecycleCallbacks(this);
            this.a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.G && this.w == null) {
                this.J = this.J || c(this.e);
                new WeakReference(activity);
                this.w = new Timer();
                if (b().e(this.w) > L) {
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.G || this.f || !this.c.f() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.I);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ot0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [pt0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [qt0] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.G && !this.f) {
                boolean zF = this.c.f();
                if (zF && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.I);
                    ith ithVar = new ith(viewFindViewById, new Runnable() { // from class: ot0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Timer timer = AppStartTrace.K;
                            AppStartTrace appStartTrace = this.a;
                            xig0.b bVar = appStartTrace.d;
                            if (appStartTrace.E != null) {
                                return;
                            }
                            appStartTrace.E = new Timer();
                            xig0.b bVarW = xig0.w();
                            bVarW.q("_experiment_onDrawFoQ");
                            bVarW.o(appStartTrace.b().a);
                            bVarW.p(appStartTrace.b().e(appStartTrace.E));
                            bVar.j(bVarW.build());
                            if (appStartTrace.i != null) {
                                xig0.b bVarW2 = xig0.w();
                                bVarW2.q("_experiment_procStart_to_classLoad");
                                bVarW2.o(appStartTrace.b().a);
                                bVarW2.p(appStartTrace.b().e(appStartTrace.a()));
                                bVar.j(bVarW2.build());
                            }
                            bVar.n(appStartTrace.J ? "true" : "false");
                            bVar.m(appStartTrace.H, "onDrawCount");
                            bVar.i(appStartTrace.F.a());
                            appStartTrace.d(bVar);
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(ithVar);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new hth(ithVar));
                    }
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ia20(viewFindViewById, new Runnable() { // from class: pt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Timer timer = AppStartTrace.K;
                            AppStartTrace appStartTrace = this.a;
                            xig0.b bVar = appStartTrace.d;
                            if (appStartTrace.C != null) {
                                return;
                            }
                            appStartTrace.C = new Timer();
                            bVar.o(appStartTrace.b().a);
                            bVar.p(appStartTrace.b().e(appStartTrace.C));
                            appStartTrace.d(bVar);
                        }
                    }, new Runnable() { // from class: qt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Timer timer = AppStartTrace.K;
                            AppStartTrace appStartTrace = this.a;
                            xig0.b bVar = appStartTrace.d;
                            if (appStartTrace.D != null) {
                                return;
                            }
                            appStartTrace.D = new Timer();
                            xig0.b bVarW = xig0.w();
                            bVarW.q("_experiment_preDrawFoQ");
                            bVarW.o(appStartTrace.b().a);
                            bVarW.p(appStartTrace.b().e(appStartTrace.D));
                            bVar.j(bVarW.build());
                            appStartTrace.d(bVar);
                        }
                    }));
                }
                if (this.z != null) {
                    return;
                }
                new WeakReference(activity);
                this.z = new Timer();
                this.F = SessionManager.getInstance().perfSession();
                p80.d().a("onResume(): " + activity.getClass().getName() + ": " + a().e(this.z) + " microseconds");
                N.execute(new Runnable() { // from class: rt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Timer timer = AppStartTrace.K;
                        xig0.b bVarW = xig0.w();
                        bVarW.q("_as");
                        AppStartTrace appStartTrace = this.a;
                        bVarW.o(appStartTrace.a().a);
                        bVarW.p(appStartTrace.a().e(appStartTrace.z));
                        ArrayList arrayList = new ArrayList(3);
                        xig0.b bVarW2 = xig0.w();
                        bVarW2.q("_astui");
                        bVarW2.o(appStartTrace.a().a);
                        bVarW2.p(appStartTrace.a().e(appStartTrace.w));
                        arrayList.add(bVarW2.build());
                        if (appStartTrace.y != null) {
                            xig0.b bVarW3 = xig0.w();
                            bVarW3.q("_astfd");
                            bVarW3.o(appStartTrace.w.a);
                            bVarW3.p(appStartTrace.w.e(appStartTrace.y));
                            arrayList.add(bVarW3.build());
                            xig0.b bVarW4 = xig0.w();
                            bVarW4.q("_asti");
                            bVarW4.o(appStartTrace.y.a);
                            bVarW4.p(appStartTrace.y.e(appStartTrace.z));
                            arrayList.add(bVarW4.build());
                        }
                        bVarW.h(arrayList);
                        bVarW.i(appStartTrace.F.a());
                        appStartTrace.b.c(bVarW.build(), zu0.e);
                    }
                });
                if (!zF) {
                    e();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.G && this.y == null && !this.f) {
            this.y = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @hoy(s9s.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.G || this.f || this.B != null) {
            return;
        }
        this.B = new Timer();
        xig0.b bVarW = xig0.w();
        bVarW.q("_experiment_firstBackgrounding");
        bVarW.o(b().a);
        bVarW.p(b().e(this.B));
        this.d.j(bVarW.build());
    }

    @hoy(s9s.a.ON_START)
    public void onAppEnteredForeground() {
        if (this.G || this.f || this.A != null) {
            return;
        }
        this.A = new Timer();
        xig0.b bVarW = xig0.w();
        bVarW.q("_experiment_firstForegrounding");
        bVarW.o(b().a);
        bVarW.p(b().e(this.A));
        this.d.j(bVarW.build());
    }
}
