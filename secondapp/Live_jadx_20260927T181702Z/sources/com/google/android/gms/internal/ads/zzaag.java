package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaag extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaag(int i10, zzbg zzbgVar, int i11, zzaae zzaaeVar, int i12, @Nullable String str, @Nullable String str2) {
        int iZzj;
        super(i10, zzbgVar, i11);
        int i13 = 0;
        this.zzf = l1.c(i12, false);
        int i14 = this.zzd.zze;
        int i15 = zzaaeVar.zzC;
        this.zzg = 1 == (i14 & 1);
        this.zzh = (i14 & 2) != 0;
        zzgvz zzgvzVarZzj = str2 != null ? zzgvz.zzj(str2) : zzaaeVar.zzy.isEmpty() ? zzgvz.zzj("") : zzaaeVar.zzy;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgvzVarZzj.size()) {
                iZzj = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaq.zzj(this.zzd, (String) zzgvzVarZzj.get(i16), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.zzi = i16;
        this.zzj = iZzj;
        int iZzm = zzaaq.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzaaq.zzn(zzvVar, zzaaeVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z10 = iZzj > 0 || (zzaaeVar.zzy.isEmpty() && iZzm > 0) || ((zzaaeVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (l1.c(i12, zzaaeVar.zzV) && z10) {
            i13 = 1;
        }
        this.zze = i13;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaag zzaagVar) {
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(this.zzf, zzaagVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaagVar.zzi), zzgxt.zzb().zza());
        int i10 = this.zzj;
        zzgvm zzgvmVarZzb = zzgvmVarZza.zzb(i10, zzaagVar.zzj);
        int i11 = this.zzk;
        zzgvm zzgvmVarZzb2 = zzgvmVarZzb.zzb(i11, zzaagVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaagVar.zzl), zzgxt.zzb().zza()).zzd(this.zzg, zzaagVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaagVar.zzh), i10 == 0 ? zzgxt.zzb() : zzgxt.zzb().zza()).zzb(this.zzm, zzaagVar.zzm);
        if (i11 == 0) {
            zzgvmVarZzb2 = zzgvmVarZzb2.zzc(this.zzn, zzaagVar.zzn);
        }
        return zzgvmVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        return false;
    }
}
