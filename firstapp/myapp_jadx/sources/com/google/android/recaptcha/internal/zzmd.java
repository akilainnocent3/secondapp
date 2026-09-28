package com.google.android.recaptcha.internal;

import defpackage.d580;
import defpackage.hb5;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmd {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        d580.a();
    }

    public static void zzb(boolean z, Object obj) {
        if (z) {
            return;
        }
        hb5.a((String) obj);
    }

    public static void zzc(boolean z, String str, char c) {
        if (z) {
            return;
        }
        hb5.a(zzmg.zza(str, Character.valueOf(c)));
    }

    public static void zzd(int i, int i2, int i3) {
        String strZzf;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzf = zzf(i, i3, "start index");
            } else {
                strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
            return;
        }
        ib5.a((String) obj);
    }

    private static String zzf(int i, int i2, String str) {
        return i < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
