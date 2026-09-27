package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgp {
    private final boolean zza;

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    private zzgp(zzgs zzgsVar, zzgr zzgrVar) throws zzgq {
        int i10 = zzgrVar.zza;
        boolean z10 = false;
        zzgsw.zza(i10 == 6 || i10 == 3);
        int iMin = Math.min(4, zzgrVar.zzb.remaining());
        byte[] bArr = new byte[iMin];
        zzgrVar.zzb.asReadOnlyBuffer().get(bArr);
        zzer zzerVar = new zzer(bArr, iMin);
        zzgt.zzb(zzgsVar.zza);
        if (!zzerVar.zzi()) {
            int iZzj = zzerVar.zzj(2);
            boolean zZzi = zzerVar.zzi();
            zzgt.zzb(zzgsVar.zzb);
            if (zZzi) {
                boolean zZzi2 = (iZzj == 3 || iZzj == 0) ? true : zzerVar.zzi();
                zzerVar.zzg();
                zzgt.zzb(!zzgsVar.zzd);
                if (zzerVar.zzi()) {
                    zzgt.zzb(!zzgsVar.zze);
                    zzerVar.zzg();
                }
                zzgt.zzb(zzgsVar.zzc);
                if (iZzj != 3) {
                    zzerVar.zzg();
                }
                zzerVar.zzh(zzgsVar.zzf);
                if (iZzj != 2 && iZzj != 0 && !zZzi2) {
                    zzerVar.zzh(3);
                }
                if (iZzj == 3 || iZzj == 0 || zzerVar.zzj(8) != 0) {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
        }
        this.zza = z10;
    }

    @Nullable
    public static zzgp zzb(zzgs zzgsVar, zzgr zzgrVar) {
        try {
            return new zzgp(zzgsVar, zzgrVar);
        } catch (zzgq unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
