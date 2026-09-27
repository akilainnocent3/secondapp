package com.bytedance.sdk.openadsdk.hnv;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public static int f37215hu = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected static long f37216hv = 15360;
    protected static String hww = "images";
    public static int nod = 8;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    public static int f37217ny = 32;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    public static int f37218ok = 2;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    public static int f37219rs = 4;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected static int f37220sd = 1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected static String f37221tq = null;
    public static int vgm = 1;
    public static int vhb = 16;
    protected static int vy = 30;

    public static boolean hww(Context context, String str) {
        return false;
    }

    public static boolean tq(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Bitmap hww(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static float tq(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static boolean hww(Context context, int i10) {
        boolean zHww;
        boolean zHww2;
        if (f37215hu == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zHww = hww(context, "android.permission.READ_MEDIA_IMAGES");
                zHww2 = true;
            } else {
                zHww = hww(context, "android.permission.READ_EXTERNAL_STORAGE");
                zHww2 = hww(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zHww3 = hww(context, "android.permission.CAMERA");
            boolean zHww4 = hww(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zHww && zHww2) {
                f37215hu |= vgm;
            }
            if (zHww3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                f37215hu |= f37218ok;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                f37215hu |= f37219rs;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                f37215hu |= nod;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                f37215hu |= vhb;
            }
            if (zHww4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                f37215hu |= f37217ny;
            }
        }
        return (f37215hu & i10) != 0;
    }

    public static boolean hww(Context context) {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z10 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z11 = false;
            }
            return !z11 && z10;
        }
        z11 = true;
        if (z11) {
        }
    }
}
