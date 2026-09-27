package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.provider.Settings;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.list3d.List3DView;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f75355a = 0;

    static {
        "startapp.".concat(p0.class.getSimpleName());
    }

    public static void a(List3DView list3DView) {
        list3DView.animate().alpha(1.0f).setDuration(1500L).setListener(null);
    }

    public static boolean b(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) != 0;
        } catch (Throwable unused) {
        }
    }

    public static boolean c(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) > 0;
    }

    public static void a(WebView webView) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    public static int a(Activity activity, int i10, boolean z10) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i11 = 1;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = (z10 || rotation == 0 || rotation == 1) ? 0 : 8;
            }
        } else if (!z10 && (rotation == 1 || rotation == 2)) {
            i11 = 9;
        }
        try {
            activity.setRequestedOrientation(i11);
        } catch (Throwable unused) {
        }
        return i11;
    }

    public static Long a(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    public static boolean a(BannerBase bannerBase, boolean z10) {
        if (1 != bannerBase.getLayerType() && z10) {
            return bannerBase.isHardwareAccelerated();
        }
        return false;
    }

    public static long a(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            if (file.isDirectory()) {
                return file.getFreeSpace();
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return context.checkSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a(int i10, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionCode >= i10;
        } catch (Exception unused) {
        }
    }
}
