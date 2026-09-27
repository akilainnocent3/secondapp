package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzant {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzant(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static zzant zza(String str) {
        zzgsw.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzant(i11, i12, i13, i14, i15, length);
            }
            String strZza = zzgsf.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (strZza.equals("end")) {
                        i13 = i10;
                    }
                    break;
                case 3556653:
                    if (strZza.equals("text")) {
                        i15 = i10;
                    }
                    break;
                case 102749521:
                    if (strZza.equals(AdRevenueConstants.LAYER_KEY)) {
                        i11 = i10;
                    }
                    break;
                case 109757538:
                    if (strZza.equals("start")) {
                        i12 = i10;
                    }
                    break;
                case 109780401:
                    if (strZza.equals("style")) {
                        i14 = i10;
                    }
                    break;
            }
            i10++;
        }
    }
}
