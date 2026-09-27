package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzanx {
    public final String zza;
    public final int zzb;

    @Nullable
    @k.k
    public final Integer zzc;

    @Nullable
    @k.k
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzanx(String str, int i10, @Nullable @k.k Integer num, @Nullable @k.k Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    @Nullable
    public static zzanx zza(String str, zzanv zzanvVar) {
        zzanx zzanxVar;
        boolean z10;
        boolean z11;
        int i10;
        zzgsw.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = zzanvVar.zzk;
        if (length != i11) {
            Object[] objArr = {Integer.valueOf(i11), Integer.valueOf(length), str};
            String str2 = zzfk.zza;
            zzef.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim = strArrSplit[zzanvVar.zza].trim();
            int i12 = zzanvVar.zzb;
            int iZzd = i12 != -1 ? zzd(strArrSplit[i12].trim()) : -1;
            int i13 = zzanvVar.zzc;
            Integer numZzb = i13 != -1 ? zzb(strArrSplit[i13].trim()) : null;
            int i14 = zzanvVar.zzd;
            Integer numZzb2 = i14 != -1 ? zzb(strArrSplit[i14].trim()) : null;
            int i15 = zzanvVar.zze;
            float f10 = -3.4028235E38f;
            if (i15 != -1) {
                zzanxVar = null;
                try {
                    String strTrim2 = strArrSplit[i15].trim();
                    try {
                        f10 = Float.parseFloat(strTrim2);
                    } catch (NumberFormatException e10) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                        sb2.append("Failed to parse font size: '");
                        sb2.append(strTrim2);
                        sb2.append("'");
                        zzef.zzd("SsaStyle", sb2.toString(), e10);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    StringBuilder sb3 = new StringBuilder(str.length() + 36);
                    sb3.append("Skipping malformed 'Style:' line: '");
                    sb3.append(str);
                    sb3.append("'");
                    zzef.zzd("SsaStyle", sb3.toString(), e);
                    return zzanxVar;
                }
            } else {
                zzanxVar = null;
            }
            int i16 = zzanvVar.zzf;
            boolean z12 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzanvVar.zzg;
            boolean z13 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzanvVar.zzh;
            if (i18 == -1 || !zze(strArrSplit[i18].trim())) {
                z10 = false;
                z11 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            int i19 = zzanvVar.zzi;
            if (i19 != -1 && zze(strArrSplit[i19].trim())) {
                z10 = true;
            }
            int i20 = zzanvVar.zzj;
            if (i20 != -1) {
                String strTrim3 = strArrSplit[i20].trim();
                try {
                    int i21 = Integer.parseInt(strTrim3.trim());
                    if (i21 == 1 || i21 == 3) {
                        i10 = i21;
                    } else {
                        zzef.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i10 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i10 = -1;
            }
            new zzanx(strTrim, iZzd, numZzb, numZzb2, f10, z12, z13, z11, z10, i10);
            return r5;
        } catch (RuntimeException e12) {
            e = e12;
            zzanxVar = null;
        }
    }

    @Nullable
    @k.k
    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgsw.zza(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgzt.zza(((j10 >> 24) & 255) ^ 255), zzgzt.zza(j10 & 255), zzgzt.zza((j10 >> 8) & 255), zzgzt.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            zzef.zzd("SsaStyle", sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i10;
                default:
                    zzef.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            zzef.zzd("SsaStyle", sb2.toString(), e10);
            return false;
        }
    }
}
