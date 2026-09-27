package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class E1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f54545a;

    public static void a(boolean z10) {
        LinkedHashSet linkedHashSet;
        if (Ji.f54934a == null || (linkedHashSet = f54545a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((Sk) it.next()).getClass();
                Sk.a(z10);
            } catch (Exception e10) {
                kotlin.jvm.internal.m0.o("E1", "TAG");
                e10.getMessage();
            }
        }
    }

    public static void b(Context context) {
        Sk listener = Yk.f55850c;
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(listener, "listener");
        if (f54545a == null) {
            f54545a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new D1(context));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f54545a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService(androidx.appcompat.widget.c.f6970r);
            kotlin.jvm.internal.m0.n(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e10) {
            kotlin.jvm.internal.m0.o("E1", "TAG");
            e10.getMessage();
            return false;
        }
    }
}
