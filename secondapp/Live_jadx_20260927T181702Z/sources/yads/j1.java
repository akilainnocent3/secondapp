package yads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f150899a = new j1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k1 f150900b;

    public static final void a(Context context) {
        synchronized (f150899a) {
            try {
                if (f150900b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        k1 k1Var = new k1(new o1(activity));
                        f150900b = k1Var;
                        application.registerActivityLifecycleCallbacks(k1Var);
                    }
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity a() {
        Activity activityA;
        synchronized (f150899a) {
            k1 k1Var = f150900b;
            activityA = k1Var != null ? k1Var.a() : null;
        }
        return activityA;
    }
}
