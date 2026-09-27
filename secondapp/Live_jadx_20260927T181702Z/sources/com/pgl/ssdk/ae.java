package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f71974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f71975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f71976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f71977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f71978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f71979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f71980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f71981h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f71979f = (int) displayMetrics.density;
            f71978e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f71980g = (int) displayMetrics.xdpi;
            f71981h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f71974a = displayMetrics.widthPixels;
            f71975b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f71976c = mode.getPhysicalWidth();
            f71977d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i10 = -1;
        if (context != null) {
            try {
                i10 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i10);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        return f71978e + "[<!>]" + f71974a + "," + f71975b + "[<!>]" + f71976c + "x" + f71977d + "[<!>]";
    }
}
