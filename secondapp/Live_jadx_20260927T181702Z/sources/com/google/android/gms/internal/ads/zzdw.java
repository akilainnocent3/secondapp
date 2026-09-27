package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdw {
    public static boolean zza(Context context) throws zzdv {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && (com.google.android.material.internal.n.f51099b.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzf("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws zzdv {
        return zzf("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i10) throws zzdv {
        if (i10 == 6) {
            return zzd();
        }
        if (i10 == 7) {
            return zzf(x4.x.f144490l);
        }
        return true;
    }

    public static boolean zzd() throws zzdv {
        return Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze(boolean z10, String str) throws zzdv {
        if (!z10) {
            throw new zzdv(str, zzgvz.zzi());
        }
    }

    private static boolean zzf(String str) throws zzdv {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        zze(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zze(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new zzdv("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))), zzgvz.zzj(Integer.valueOf(iEglGetError)));
    }
}
