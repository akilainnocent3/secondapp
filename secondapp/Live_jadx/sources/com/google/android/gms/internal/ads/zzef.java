package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzef {
    private static final Object zza = new Object();

    @ky.d
    public static void zza(@k.a1(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    @ky.d
    public static void zzb(@k.a1(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    @ky.d
    public static void zzc(@k.a1(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    @ky.d
    public static void zzd(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th2));
        }
    }

    @ky.d
    public static void zze(@k.a1(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    @ky.d
    public static void zzf(@k.a1(max = 23) String str, String str2, @Nullable Throwable th2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th2));
        }
    }

    @ky.d
    public static String zzg(String str, @Nullable Throwable th2) {
        String strReplace;
        if (th2 != null) {
            synchronized (zza) {
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th2).trim().replace("\t", ew.b0.f81731a);
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(strReplace2).length() + 1);
        sb2.append(str);
        sb2.append("\n  ");
        sb2.append(strReplace2);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        return sb2.toString();
    }
}
