package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzanv {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzanv(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = i16;
        this.zzh = i17;
        this.zzi = i18;
        this.zzj = i19;
        this.zzk = i20;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static zzanv zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i11 != -1) {
                    return new zzanv(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, length);
                }
                return null;
            }
            String strZza = zzgsf.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case -1178781136:
                    if (strZza.equals("italic")) {
                        i17 = i10;
                    }
                    break;
                case -1026963764:
                    if (strZza.equals("underline")) {
                        i18 = i10;
                    }
                    break;
                case -192095652:
                    if (strZza.equals("strikeout")) {
                        i19 = i10;
                    }
                    break;
                case -70925746:
                    if (strZza.equals("primarycolour")) {
                        i13 = i10;
                    }
                    break;
                case 3029637:
                    if (strZza.equals("bold")) {
                        i16 = i10;
                    }
                    break;
                case 3373707:
                    if (strZza.equals("name")) {
                        i11 = i10;
                    }
                    break;
                case 366554320:
                    if (strZza.equals("fontsize")) {
                        i15 = i10;
                    }
                    break;
                case 767321349:
                    if (strZza.equals("borderstyle")) {
                        i20 = i10;
                    }
                    break;
                case 1767875043:
                    if (strZza.equals("alignment")) {
                        i12 = i10;
                    }
                    break;
                case 1988365454:
                    if (strZza.equals("outlinecolour")) {
                        i14 = i10;
                    }
                    break;
            }
            i10++;
        }
    }
}
