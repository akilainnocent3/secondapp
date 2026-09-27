package d1;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77476a = "ActivityRecreator";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f77477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f77478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f77479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f77480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f77481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f77482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f77483h = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f77484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f77485c;

        public a(d dVar, Object obj) {
            this.f77484b = dVar;
            this.f77485c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f77484b.f77490b = this.f77485c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f77486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f77487c;

        public b(Application application, d dVar) {
            this.f77486b = application;
            this.f77487c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f77486b.unregisterActivityLifecycleCallbacks(this.f77487c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f77488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f77489c;

        public c(Object obj, Object obj2) {
            this.f77488b = obj;
            this.f77489c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = f.f77480e;
                if (method != null) {
                    method.invoke(this.f77488b, this.f77489c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    f.f77481f.invoke(this.f77488b, this.f77489c, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e(f.f77476a, "Exception while invoking performStopActivity", th2);
            }
        }
    }

    static {
        Class<?> clsA = a();
        f77477b = clsA;
        f77478c = b();
        f77479d = f();
        f77480e = d(clsA);
        f77481f = c(clsA);
        f77482g = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f77479d.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f77483h.postAtFrontOfQueue(new c(f77478c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e(f77476a, "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(@NonNull Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f77482g == null) {
            return false;
        }
        if (f77481f == null && f77480e == null) {
            return false;
        }
        try {
            Object obj2 = f77479d.get(activity);
            if (obj2 == null || (obj = f77478c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            f77483h.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f77482g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f77483h.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f77490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Activity f77491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f77492d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f77493e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f77494f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f77495g = false;

        public d(@NonNull Activity activity) {
            this.f77491c = activity;
            this.f77492d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f77491c == activity) {
                this.f77491c = null;
                this.f77494f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f77494f || this.f77495g || this.f77493e || !f.h(this.f77490b, this.f77492d, activity)) {
                return;
            }
            this.f77495g = true;
            this.f77490b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f77491c == activity) {
                this.f77493e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
