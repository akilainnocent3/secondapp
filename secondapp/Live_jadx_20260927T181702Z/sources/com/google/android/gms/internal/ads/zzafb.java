package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class zzafb {
    protected final zzaev zza;
    protected final zzafa zzb;

    @Nullable
    protected zzaex zzc;
    private final int zzd;

    public zzafb(zzaey zzaeyVar, zzafa zzafaVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzafaVar;
        this.zzd = i10;
        this.zza = new zzaev(zzaeyVar, j10, 0L, j12, j13, j14, j15);
    }

    public static final int zzf(zzafq zzafqVar, long j10, zzagp zzagpVar) {
        if (j10 == zzafqVar.zzn()) {
            return 0;
        }
        zzagpVar.zza = j10;
        return 1;
    }

    public static final boolean zzg(zzafq zzafqVar, long j10) throws IOException {
        long jZzn = j10 - zzafqVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzafqVar.zzf((int) jZzn);
        return true;
    }

    public final zzags zza() {
        return this.zza;
    }

    public final void zzb(long j10) {
        zzaex zzaexVar = this.zzc;
        if (zzaexVar == null || zzaexVar.zze() != j10) {
            zzaev zzaevVar = this.zza;
            this.zzc = new zzaex(j10, zzaevVar.zzd(j10), 0L, zzaevVar.zze(), zzaevVar.zzf(), zzaevVar.zzg(), zzaevVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException {
        while (true) {
            zzaex zzaexVar = this.zzc;
            zzaexVar.getClass();
            long jZzb = zzaexVar.zzb();
            long jZzc = zzaexVar.zzc();
            long jZzh = zzaexVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzafqVar, jZzb, zzagpVar);
            }
            if (!zzg(zzafqVar, jZzh)) {
                return zzf(zzafqVar, jZzh, zzagpVar);
            }
            zzafqVar.zzl();
            zzaez zzaezVarZza = this.zzb.zza(zzafqVar, zzaexVar.zzd());
            int iZzd = zzaezVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzafqVar, jZzh, zzagpVar);
            }
            if (iZzd == -2) {
                zzaexVar.zzf(zzaezVarZza.zze(), zzaezVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzafqVar, zzaezVarZza.zzf());
                    zze(true, zzaezVarZza.zzf());
                    return zzf(zzafqVar, zzaezVarZza.zzf(), zzagpVar);
                }
                zzaexVar.zzg(zzaezVarZza.zze(), zzaezVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
