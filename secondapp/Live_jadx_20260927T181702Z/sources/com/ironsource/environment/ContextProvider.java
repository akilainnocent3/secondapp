package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f61692d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f61693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f61694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f61695c = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f61692d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f61692d == null) {
                        f61692d = new ContextProvider();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f61692d;
    }

    public Context getActiveContext() {
        Activity activity = this.f61693a;
        return activity != null ? activity : this.f61694b;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f61694b;
        return (context != null || (activity = this.f61693a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f61693a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f61695c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f61693a = activity;
            Iterator<a> it = this.f61695c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f61693a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f61695c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f61693a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f61694b = context;
        }
    }
}
