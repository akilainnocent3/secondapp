package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqy {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    public /* synthetic */ zzqy(zzqx zzqxVar, byte[] bArr) {
        this.zza = zzqxVar.zzi();
        this.zzb = zzqxVar.zzj();
        this.zzc = zzqxVar.zzk();
        this.zze = zzqxVar.zzl();
        this.zzf = zzqxVar.zzm();
        this.zzg = zzqxVar.zzn();
        this.zzh = zzqxVar.zzo();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqy.class == obj.getClass()) {
            zzqy zzqyVar = (zzqy) obj;
            if (this.zza == zzqyVar.zza && this.zzb == zzqyVar.zzb && this.zzc == zzqyVar.zzc && this.zze == zzqyVar.zze && this.zzg == zzqyVar.zzg && this.zzh == zzqyVar.zzh && this.zzf.equals(zzqyVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.zza);
        Integer numValueOf2 = Integer.valueOf(this.zzb);
        Integer numValueOf3 = Integer.valueOf(this.zzc);
        Integer numValueOf4 = Integer.valueOf(this.zze);
        zzd zzdVar = this.zzf;
        Integer numValueOf5 = Integer.valueOf(this.zzg);
        Integer numValueOf6 = Integer.valueOf(this.zzh);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, numValueOf4, zzdVar, numValueOf5, numValueOf6, bool, bool);
    }
}
