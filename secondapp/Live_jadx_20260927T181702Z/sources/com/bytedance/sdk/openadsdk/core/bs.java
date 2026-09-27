package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class bs {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context hww = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static int f36023sd = -1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile kv<com.bytedance.sdk.openadsdk.vy.hww> f36024tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application hww;

        static {
            try {
                Object objTq = tq();
                hww = (Application) objTq.getClass().getMethod("getApplication", null).invoke(objTq, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.hww("MyApplication", "application get failed", th2);
            }
        }

        @Nullable
        public static Application hww() {
            return hww;
        }

        private static Object tq() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.hww("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.wgt.sd.sd hv() {
        return !com.bytedance.sdk.openadsdk.core.settings.vgm.hww() ? com.bytedance.sdk.openadsdk.wgt.sd.vy.hww() : com.bytedance.sdk.openadsdk.vy.hww.tq.hww();
    }

    public static Context hww() {
        if (hww == null) {
            tq(null);
        }
        return hww;
    }

    public static kv<com.bytedance.sdk.openadsdk.vy.hww> sd() {
        if (f36024tq == null) {
            synchronized (bs.class) {
                try {
                    if (f36024tq == null) {
                        f36024tq = new kub(hww);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36024tq;
    }

    public static void tq(Context context) {
        if (hww == null) {
            synchronized (bs.class) {
                try {
                    if (hww == null) {
                        if (context != null) {
                            hww = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                hww = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application applicationHww = hww.hww();
                            if (applicationHww != null) {
                                hww = applicationHww;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.vhb vy() {
        return com.bytedance.sdk.openadsdk.core.settings.vhb.sd();
    }

    public static Context hww(Context context) {
        if (context == null) {
            context = hww();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int tq() {
        Context contextHww;
        if (f36023sd < 0 && (contextHww = hww()) != null) {
            f36023sd = ViewConfiguration.get(contextHww).getScaledTouchSlop();
        }
        return f36023sd;
    }
}
