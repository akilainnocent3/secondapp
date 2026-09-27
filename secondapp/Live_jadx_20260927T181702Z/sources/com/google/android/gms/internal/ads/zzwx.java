package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwx extends zzzh {
    private final boolean zzb;
    private final zzbe zzc;
    private final zzbd zzd;
    private zzwv zze;

    @Nullable
    private zzwu zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzwx(zzxe zzxeVar, boolean z10) {
        boolean z11;
        super(zzxeVar);
        if (z10) {
            zzxeVar.zzI();
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzb = z11;
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        zzxeVar.zzH();
        this.zze = zzwv.zzp(zzxeVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzs() == null || !obj.equals(zzwv.zzc)) ? obj : this.zze.zzs();
    }

    @ux.m({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j10) {
        zzwu zzwuVar = this.zzf;
        int iZze = this.zze.zze(zzwuVar.zza.zza);
        if (iZze == -1) {
            return false;
        }
        zzwv zzwvVar = this.zze;
        zzbd zzbdVar = this.zzd;
        zzwvVar.zzd(iZze, zzbdVar, false);
        long j11 = zzbdVar.zzd;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        zzwuVar.zzo(j10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzwb, com.google.android.gms.internal.ads.zzxe
    public final void zzA(zzak zzakVar) {
        if (this.zzi) {
            zzwv zzwvVar = this.zze;
            this.zze = zzwvVar.zzr(zzzd.zzp(zzwvVar.zzb, zzakVar));
        } else {
            this.zze = zzwv.zzp(zzakVar);
        }
        ((zzzh) this).zza.zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final void zzB() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzv(null, ((zzzh) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzzh, com.google.android.gms.internal.ads.zzxe
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final zzwu zzG(zzxc zzxcVar, zzabd zzabdVar, long j10) {
        zzwu zzwuVar = new zzwu(zzxcVar, zzabdVar, j10);
        zzwuVar.zzr(((zzzh) this).zza);
        if (this.zzh) {
            zzwuVar.zzt(zzxcVar.zza(zzK(zzxcVar.zza)));
            return zzwuVar;
        }
        this.zzf = zzwuVar;
        if (!this.zzg) {
            this.zzg = true;
            zzv(null, ((zzzh) this).zza);
        }
        return zzwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzh, com.google.android.gms.internal.ads.zzxe
    public final void zzD(zzxa zzxaVar) {
        ((zzwu) zzxaVar).zzu();
        if (zzxaVar == this.zzf) {
            this.zzf = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzzh
    public final void zzE(zzbf zzbfVar) {
        long jZza;
        zzxc zzxcVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzr(zzbfVar);
            zzwu zzwuVar = this.zzf;
            if (zzwuVar != null) {
                zzL(zzwuVar.zzq());
            }
        } else if (zzbfVar.zzg()) {
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwv.zzq(zzbfVar, zzbe.zza, zzwv.zzc);
        } else {
            zzbe zzbeVar = this.zzc;
            zzbfVar.zzb(0, zzbeVar, 0L);
            Object obj = zzbeVar.zzb;
            zzwu zzwuVar2 = this.zzf;
            if (zzwuVar2 != null) {
                jZza = zzwuVar2.zza();
                this.zze.zzo(zzwuVar2.zza.zza, this.zzd);
                this.zze.zzb(0, zzbeVar, 0L);
                if (jZza == 0) {
                    jZza = 0;
                }
            } else {
                jZza = 0;
            }
            Pair pairZzm = zzbfVar.zzm(zzbeVar, this.zzd, 0, jZza);
            Object obj2 = pairZzm.first;
            long jLongValue = ((Long) pairZzm.second).longValue();
            this.zze = this.zzi ? this.zze.zzr(zzbfVar) : zzwv.zzq(zzbfVar, obj, obj2);
            zzwu zzwuVar3 = this.zzf;
            if (zzwuVar3 != null && zzL(jLongValue)) {
                zzxc zzxcVar = zzwuVar3.zza;
                zzxcVarZza = zzxcVar.zza(zzK(zzxcVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zze(this.zze);
        if (zzxcVarZza != null) {
            zzwu zzwuVar4 = this.zzf;
            zzwuVar4.getClass();
            zzwuVar4.zzt(zzxcVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    @Nullable
    public final zzxc zzF(zzxc zzxcVar) {
        Object objZzs = this.zze.zzs();
        Object obj = zzxcVar.zza;
        if (objZzs != null && this.zze.zzs().equals(obj)) {
            obj = zzwv.zzc;
        }
        return zzxcVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwk, com.google.android.gms.internal.ads.zzwb
    public final void zzd() {
        this.zzh = false;
        this.zzg = false;
        super.zzd();
    }

    public final zzbf zzz() {
        return this.zze;
    }
}
