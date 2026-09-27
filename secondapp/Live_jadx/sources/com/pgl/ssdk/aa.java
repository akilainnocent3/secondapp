package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f71962a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f71963b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f71964c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f71965d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f71966e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile boolean f71967f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f71968g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f71969h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            aa.b(i10, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            aa.b(i10, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            aa.b(i10, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f71963b) {
            return;
        }
        if (f71962a == null) {
            f71962a = new a();
        }
        if (f71969h == null) {
            f71969h = (DisplayManager) context.getSystemService("display");
        }
        if (f71969h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f71969h.registerDisplayListener(f71962a, handlerB);
            f71963b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    private static String a(int i10) {
        Display display = f71969h.getDisplay(i10);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        try {
            String strA = a(i10);
            if (i11 == 1) {
                if (strA.equals(f71964c)) {
                    return;
                }
                f71964c = strA;
            } else {
                if (i11 != 2) {
                    if (i11 != 3 || strA.equals(f71966e)) {
                        return;
                    }
                    f71966e = strA;
                    return;
                }
                if (strA.equals(f71965d)) {
                    return;
                }
                f71965d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f71963b && (f71964c != null || f71965d != null || f71966e != null)) {
            return true;
        }
        if (f71963b && f71967f) {
            return f71968g;
        }
        if (context == null) {
            return false;
        }
        if (f71969h == null) {
            f71969h = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f71969h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    f71968g = true;
                    break;
                }
            }
        }
        f71967f = true;
        return f71968g;
    }
}
