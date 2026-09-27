package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f72106a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f72107b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f72108c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f72109d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f72110e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f72111f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile boolean f72112g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f72113h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f72114i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f72115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f72116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f72117c;

        public a(String str, Context context, int i10) {
            this.f72115a = str;
            this.f72116b = context;
            this.f72117c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.f72112g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f72115a);
            }
            InputManager inputManagerB = y.b(this.f72116b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f72117c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i10 = f72108c;
        f72108c = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = f72111f;
        f72111f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d() {
        int i10 = f72106a;
        f72106a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f72109d;
        f72109d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f72107b;
        f72107b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g() {
        int i10 = f72110e;
        f72110e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f72113h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f72111f = sharedPreferencesA.getInt("nihc", 0);
                f72110e = sharedPreferencesA.getInt("eihc", 0);
                f72109d = sharedPreferencesA.getInt("vihc", 0);
                f72113h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.getClass();
        switch (str) {
            case "eic":
                return f72107b;
            case "nic":
                return f72108c;
            case "vic":
                return f72106a;
            case "eihc":
                return f72110e;
            case "nihc":
                return f72111f;
            case "vihc":
                return f72109d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public static void a(MotionEvent motionEvent, Context context) {
        String string;
        if (motionEvent == null || context == null) {
            return;
        }
        if (f72112g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    string = Arrays.toString(new Exception().getStackTrace());
                    if (string.contains("android.view.InputEventReceiver") || string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") || string.contains("android.view.ViewRootImpl$InputStage")) {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        ar.b(new a(string, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f72114i == null) {
            f72114i = (InputManager) context.getSystemService("input");
        }
        return f72114i;
    }
}
