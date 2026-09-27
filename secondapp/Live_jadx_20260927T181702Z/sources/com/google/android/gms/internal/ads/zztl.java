package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zztl implements zztb {
    public zztl(zztk zztkVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzgzt.zza(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    public static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iZza = zza(250000, i14, i13);
            int iZza2 = zza(750000, i14, i13);
            String str = zzfk.zza;
            return Math.max(iZza, Math.min(i10 * 4, iZza2));
        }
        if (i12 == 1) {
            return zzgzt.zza((((long) zzc(i11)) * com.airbnb.lottie.z0.Z) / 1000000);
        }
        if (i11 == 5) {
            i16 = 500000;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return zzgzt.zza((((long) i16) * ((long) (i15 != -1 ? zzgzm.zzb(i15, 8, RoundingMode.CEILING) : zzc(i11)))) / 1000000);
    }

    private static int zzc(int i10) {
        int iZzf = zzaft.zzf(i10);
        zzgsw.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
