package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.sporty.android.core.model.MyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class oti implements Application.ActivityLifecycleCallbacks, gtm {
    public static oti w;
    public a i;
    public final List<Activity> a = Collections.synchronizedList(new ArrayList());
    public final List<Activity> b = Collections.synchronizedList(new ArrayList());
    public boolean c = true;
    public boolean d = true;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public int v = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            oti otiVar = oti.this;
            if (otiVar.c && otiVar.d) {
                otiVar.c = false;
                Iterator it = otiVar.f.iterator();
                while (it.hasNext()) {
                    try {
                        ((qti) it.next()).onBecameBackground();
                    } catch (Exception e) {
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_FOREGROUND);
                        aVar.o(e);
                    }
                }
            }
        }
    }

    public static oti c() {
        if (w == null) {
            w = new oti();
            hp0.A.registerActivityLifecycleCallbacks(w);
        }
        return w;
    }

    @Override // defpackage.gtm
    public final void a(qti qtiVar) {
        this.f.add(qtiVar);
    }

    @Override // defpackage.gtm
    public final int b() {
        return this.v;
    }

    public final Activity d() {
        List<Activity> list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final Activity e() {
        List<Activity> list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FOREGROUND);
        aVar.a("onActivityCreated: %s, bg->fg: %b", activity, Boolean.valueOf(!this.c));
        this.b.add(0, activity);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            try {
                ((qti) it.next()).onActivityCreated(activity);
            } catch (Exception e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_FOREGROUND);
                aVar2.o(e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FOREGROUND);
        aVar.a("onActivityDestroyed: %s, bg->fg: %b", activity, Boolean.valueOf(!this.c));
        this.b.remove(activity);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            try {
                ((qti) it.next()).onActivityDestroyed(activity);
            } catch (Exception e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_FOREGROUND);
                aVar2.o(e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FOREGROUND);
        aVar.a("onActivityPaused: %s", activity);
        this.a.remove(activity);
        this.v--;
        this.d = true;
        a aVar2 = this.i;
        Handler handler = this.e;
        if (aVar2 != null) {
            handler.removeCallbacks(aVar2);
        }
        a aVar3 = new a();
        this.i = aVar3;
        handler.postDelayed(aVar3, 100L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FOREGROUND);
        aVar.a("onActivityResumed: %s, bg->fg: %b", activity, Boolean.valueOf(!this.c));
        this.a.add(0, activity);
        this.v++;
        this.d = false;
        boolean z = this.c;
        this.c = true;
        a aVar2 = this.i;
        if (aVar2 != null) {
            this.e.removeCallbacks(aVar2);
        }
        for (qti qtiVar : this.f) {
            if (!z) {
                try {
                    qtiVar.onBecameForeground();
                } catch (Exception e) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_FOREGROUND);
                    aVar3.o(e);
                }
            }
            qtiVar.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
