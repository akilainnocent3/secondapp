package com.bykv.vk.openvk.hww.hww.hww;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.tq.hww.vhb;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static int f31561hu = 1;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static vhb f31562hv = null;
    public static boolean hww = false;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static String f31563sd = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static Context f31564tq = null;
    private static boolean vy = false;

    public static int hu() {
        return f31561hu;
    }

    public static boolean hv() {
        return hww;
    }

    public static Context hww() {
        return f31564tq;
    }

    public static boolean sd() {
        return vy;
    }

    public static String tq() {
        if (TextUtils.isEmpty(f31563sd)) {
            try {
                File file = new File(hww().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f31563sd = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f31563sd;
    }

    public static vhb vy() {
        if (f31562hv == null) {
            vhb.hww hwwVar = new vhb.hww("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f31562hv = hwwVar.hww(10000L, timeUnit).tq(10000L, timeUnit).sd(10000L, timeUnit).hww();
        }
        return f31562hv;
    }

    public static void hww(Context context, String str) {
        f31564tq = context;
        f31563sd = str;
    }

    public static void hww(boolean z10) {
        vy = z10;
    }

    public static void hww(vhb vhbVar) {
        f31562hv = vhbVar;
    }

    public static void hww(int i10) {
        f31561hu = i10;
    }
}
