package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class p1l0 {
    public static volatile p1l0 g;
    public final ExecutorService a;
    public final gs0 b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile vvk0 f;

    public p1l0(Context context, Bundle bundle) {
        szk0 szk0Var = new szk0(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), szk0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new gs0(this);
        this.c = new ArrayList();
        try {
            if (ggl0.a(context, g7l0.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, p1l0.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new eyk0(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new o1l0(this));
        }
    }

    public static p1l0 e(Context context, Bundle bundle) {
        hm20.h(context);
        if (g == null) {
            synchronized (p1l0.class) {
                try {
                    if (g == null) {
                        g = new p1l0(context, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final Map a(String str, String str2, boolean z) {
        qvk0 qvk0Var = new qvk0();
        c(new pzk0(this, str, str2, z, qvk0Var));
        Bundle bundleD = qvk0Var.d(5000L);
        if (bundleD == null || bundleD.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleD.size());
        for (String str3 : bundleD.keySet()) {
            Object obj = bundleD.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final int b(String str) {
        qvk0 qvk0Var = new qvk0();
        c(new uzk0(this, str, qvk0Var));
        Integer num = (Integer) qvk0.Z(qvk0Var.d(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void c(h0l0 h0l0Var) {
        this.a.execute(h0l0Var);
    }

    public final void d(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new rzk0(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final List f(String str, String str2) {
        qvk0 qvk0Var = new qvk0();
        c(new sxk0(this, str, str2, qvk0Var));
        List list = (List) qvk0.Z(qvk0Var.d(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
