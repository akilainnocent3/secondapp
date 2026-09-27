package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpu {
    private final zzgeq zza;
    private final zzgbx zzb;

    public zzgpu(zzgbx zzgbxVar, zzgeq zzgeqVar) {
        this.zza = zzgeqVar;
        this.zzb = zzgbxVar;
    }

    public final zzgps zza(int i10) {
        return new zzgps(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th2) {
        this.zza.zzb(i10 - 1, -1L, th2, null);
    }

    public final nj.t1 zze(int i10, nj.t1 t1Var) {
        zzgps zzgpsVarZza = zza(i10);
        zzgpsVarZza.zza();
        zzhbi.zzr(t1Var, new zzgpt(this, zzgpsVarZza), zzhbz.zza());
        return t1Var;
    }

    public final void zzf(int i10, Runnable runnable) {
        zzgps zzgpsVarZza = zza(i10);
        try {
            zzgpsVarZza.zza();
            runnable.run();
            zzgpsVarZza.zzc();
        } catch (Throwable th2) {
            try {
                zzgpsVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgpsVarZza.zzc();
                throw th3;
            }
        }
    }
}
