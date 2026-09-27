package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzlw {
    public final zzxa zza;
    public final Object zzb;
    public final zzyu[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlx zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmw[] zzj;
    private final zzaaz zzk;
    private final zzml zzl;

    @Nullable
    private zzlw zzm;
    private zzzf zzn;
    private zzaba zzo;
    private long zzp;

    public zzlw(zzmw[] zzmwVarArr, long j10, zzaaz zzaazVar, zzabd zzabdVar, zzml zzmlVar, zzlx zzlxVar, zzaba zzabaVar, long j11) {
        this.zzj = zzmwVarArr;
        this.zzp = j10;
        this.zzk = zzaazVar;
        this.zzl = zzmlVar;
        zzxc zzxcVar = zzlxVar.zza;
        this.zzb = zzxcVar.zza;
        this.zzg = zzlxVar;
        this.zzn = zzzf.zza;
        this.zzo = zzabaVar;
        this.zzc = new zzyu[2];
        this.zzi = new boolean[2];
        long j12 = zzlxVar.zzb;
        long j13 = zzlxVar.zze;
        zzxa zzxaVarZze = zzmlVar.zze(zzxcVar, zzabdVar, j12);
        this.zza = j13 != -9223372036854775807L ? new zzwg(zzxaVarZze, true, 0L, j13) : zzxaVarZze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzaba zzabaVar = this.zzo;
            if (i10 >= zzabaVar.zza) {
                return;
            }
            zzabaVar.zza(i10);
            zzaas zzaasVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i10 = 0;
        while (true) {
            zzaba zzabaVar = this.zzo;
            if (i10 >= zzabaVar.zza) {
                return;
            }
            zzabaVar.zza(i10);
            zzaas zzaasVar = this.zzo.zzc[i10];
            i10++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j10) {
        this.zzp = j10;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return jZzi == Long.MIN_VALUE ? this.zzg.zzf : jZzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z10) throws zzje {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaba zzabaVarZzk = zzk(f10, zzbfVar, z10);
        zzlx zzlxVar = this.zzg;
        long jMax = zzlxVar.zzb;
        long j10 = zzlxVar.zzf;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jZzl = zzl(zzabaVarZzk, jMax, false);
        long j11 = this.zzp;
        zzlx zzlxVar2 = this.zzg;
        this.zzp = j11 + (zzlxVar2.zzb - jZzl);
        this.zzg = zzlxVar2.zza(jZzl, zzlxVar2.zzc);
    }

    public final void zzi(long j10) {
        zzgsw.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j10 - this.zzp);
        }
    }

    public final void zzj(zzlu zzluVar) {
        zzgsw.zzi(zzw());
        this.zza.zzm(zzluVar);
    }

    public final zzaba zzk(float f10, zzbf zzbfVar, boolean z10) throws zzje {
        zzzf zzzfVar = this.zzn;
        zzxc zzxcVar = this.zzg.zza;
        zzaaz zzaazVar = this.zzk;
        zzmw[] zzmwVarArr = this.zzj;
        zzaba zzabaVarZzr = zzaazVar.zzr(zzmwVarArr, zzzfVar, zzxcVar, zzbfVar);
        for (int i10 = 0; i10 < zzabaVarZzr.zza; i10++) {
            boolean z11 = true;
            if (zzabaVarZzr.zza(i10)) {
                if (zzabaVarZzr.zzc[i10] == null) {
                    zzmwVarArr[i10].zza();
                    z11 = false;
                }
                zzgsw.zzi(z11);
            } else {
                zzgsw.zzi(zzabaVarZzr.zzc[i10] == null);
            }
        }
        for (zzaas zzaasVar : zzabaVarZzr.zzc) {
        }
        return zzabaVarZzr;
    }

    public final long zzl(zzaba zzabaVar, long j10, boolean z10) {
        return zzm(zzabaVar, j10, false, new boolean[2]);
    }

    public final long zzm(zzaba zzabaVar, long j10, boolean z10, boolean[] zArr) {
        zzmw[] zzmwVarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= zzabaVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z10 || !zzabaVar.zzb(this.zzo, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzmwVarArr = this.zzj;
            if (i11 >= 2) {
                break;
            }
            zzmwVarArr[i11].zza();
            i11++;
        }
        zzv();
        this.zzo = zzabaVar;
        zzu();
        zzxa zzxaVar = this.zza;
        zzaas[] zzaasVarArr = zzabaVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyu[] zzyuVarArr = this.zzc;
        long jZze = zzxaVar.zze(zzaasVarArr, zArr3, zzyuVarArr, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            zzmwVarArr[i12].zza();
        }
        this.zzf = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (zzyuVarArr[i13] != null) {
                zzgsw.zzi(zzabaVar.zza(i13));
                zzmwVarArr[i13].zza();
                this.zzf = true;
            } else {
                zzgsw.zzi(zzaasVarArr[i13] == null);
            }
        }
        return jZze;
    }

    public final void zzn() {
        zzv();
        zzxa zzxaVar = this.zza;
        try {
            boolean z10 = zzxaVar instanceof zzwg;
            zzml zzmlVar = this.zzl;
            if (z10) {
                zzmlVar.zzf(((zzwg) zzxaVar).zza);
            } else {
                zzmlVar.zzf(zzxaVar);
            }
        } catch (RuntimeException e10) {
            zzef.zzf("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final void zzo(@Nullable zzlw zzlwVar) {
        if (zzlwVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlwVar;
        zzu();
    }

    @Nullable
    public final zzlw zzp() {
        return this.zzm;
    }

    public final zzzf zzq() {
        return this.zzn;
    }

    public final zzaba zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzxa zzxaVar = this.zza;
        if (zzxaVar instanceof zzwg) {
            long j10 = this.zzg.zze;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((zzwg) zzxaVar).zza(0L, j10);
        }
    }

    public final void zzt(zzwz zzwzVar, long j10) {
        this.zzd = true;
        this.zza.zzb(zzwzVar, j10);
    }
}
