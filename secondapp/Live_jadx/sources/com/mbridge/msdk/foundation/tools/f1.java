package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f67404a = new AtomicInteger(1);

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void b(Window window) {
        if (window != null) {
            try {
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void c(Window window) {
        if (window != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i10 >= 30) {
                        attributes.layoutInDisplayCutoutMode = 3;
                    } else {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void d(Window window) {
        if (window != null) {
            try {
                window.requestFeature(1);
                window.setFlags(1024, 1024);
                window.addFlags(512);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void a(Window window) {
        if (window != null) {
            try {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }
}
