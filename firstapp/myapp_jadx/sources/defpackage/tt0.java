package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.fragment.app.e;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class tt0 implements Application.ActivityLifecycleCallbacks {
    public static final p80 F = p80.d();
    public static volatile tt0 G;
    public Timer A;
    public Timer B;
    public zu0 C;
    public boolean D;
    public boolean E;
    public final WeakHashMap<Activity, Boolean> a;
    public final WeakHashMap<Activity, jzi> b;
    public final WeakHashMap<Activity, fyi> c;
    public final WeakHashMap<Activity, Trace> d;
    public final HashMap e;
    public final HashSet f;
    public final HashSet i;
    public final AtomicInteger v;
    public final avg0 w;
    public final bpa y;
    public final ts7 z;

    public interface a {
        void a();
    }

    public interface b {
        void onUpdateAppState(zu0 zu0Var);
    }

    public tt0(avg0 avg0Var, ts7 ts7Var) {
        bpa bpaVarE = bpa.e();
        p80 p80Var = jzi.e;
        this.a = new WeakHashMap<>();
        this.b = new WeakHashMap<>();
        this.c = new WeakHashMap<>();
        this.d = new WeakHashMap<>();
        this.e = new HashMap();
        this.f = new HashSet();
        this.i = new HashSet();
        this.v = new AtomicInteger(0);
        this.C = zu0.BACKGROUND;
        this.D = false;
        this.E = true;
        this.w = avg0Var;
        this.z = ts7Var;
        this.y = bpaVarE;
    }

    public static tt0 a() {
        if (G == null) {
            synchronized (tt0.class) {
                try {
                    if (G == null) {
                        G = new tt0(avg0.H, new ts7());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return G;
    }

    public final void b(String str) {
        synchronized (this.e) {
            try {
                Long l = (Long) this.e.get(str);
                HashMap map = this.e;
                if (l == null) {
                    map.put(str, 1L);
                } else {
                    map.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Activity activity) {
        k2z<izi> k2zVar;
        WeakHashMap<Activity, Trace> weakHashMap = this.d;
        Trace trace = weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        jzi jziVar = this.b.get(activity);
        hzi hziVar = jziVar.b;
        HashMap map = jziVar.c;
        p80 p80Var = jzi.e;
        if (jziVar.d) {
            if (!map.isEmpty()) {
                p80Var.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            k2z<izi> k2zVarA = jziVar.a();
            try {
                hziVar.a(jziVar.a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                p80Var.g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                k2zVarA = new k2z<>();
            }
            hzi.a aVar = hziVar.a;
            SparseIntArray[] sparseIntArrayArr = aVar.a;
            aVar.a = new SparseIntArray[9];
            jziVar.d = false;
            k2zVar = k2zVarA;
        } else {
            p80Var.a("Cannot stop because no recording was started");
            k2zVar = new k2z<>();
        }
        if (k2zVar.b()) {
            so70.a(trace, k2zVar.a());
            trace.stop();
        } else {
            F.g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void d(String str, Timer timer, Timer timer2) {
        if (this.y.o()) {
            xig0.b bVarW = xig0.w();
            bVarW.q(str);
            bVarW.o(timer.a);
            bVarW.p(timer.e(timer2));
            bVarW.i(SessionManager.getInstance().perfSession().a());
            int andSet = this.v.getAndSet(0);
            synchronized (this.e) {
                try {
                    bVarW.k(this.e);
                    if (andSet != 0) {
                        bVarW.m(andSet, "_tsns");
                    }
                    this.e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w.c(bVarW.build(), zu0.FOREGROUND_BACKGROUND);
        }
    }

    public final void e(Activity activity) {
        if (this.y.o()) {
            jzi jziVar = new jzi(activity);
            this.b.put(activity, jziVar);
            if (activity instanceof e) {
                fyi fyiVar = new fyi(this.z, this.w, this, jziVar);
                this.c.put(activity, fyiVar);
                ((e) activity).getSupportFragmentManager().e0(fyiVar, true);
            }
        }
    }

    public final void f(zu0 zu0Var) {
        this.C = zu0Var;
        synchronized (this.f) {
            try {
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.C);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.remove(activity);
        WeakHashMap<Activity, fyi> weakHashMap = this.c;
        if (weakHashMap.containsKey(activity)) {
            ((e) activity).getSupportFragmentManager().t0(weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        if (this.a.isEmpty()) {
            this.A = new Timer();
            this.a.put(activity, Boolean.TRUE);
            if (this.E) {
                f(zu0.FOREGROUND);
                synchronized (this.i) {
                    try {
                        for (a aVar : this.i) {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.E = false;
            } else {
                d("_bs", this.B, this.A);
                f(zu0.FOREGROUND);
            }
        } else {
            this.a.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.y.o()) {
                if (!this.b.containsKey(activity)) {
                    e(activity);
                }
                this.b.get(activity).b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.w, this.z, this);
                trace.start();
                this.d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        c(activity);
        if (this.a.containsKey(activity)) {
            this.a.remove(activity);
            if (this.a.isEmpty()) {
                Timer timer = new Timer();
                this.B = timer;
                d("_fs", this.A, timer);
                f(zu0.BACKGROUND);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
