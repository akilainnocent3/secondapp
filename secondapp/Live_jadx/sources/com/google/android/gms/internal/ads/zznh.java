package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zznh {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;

    @Nullable
    public final zzxc zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;

    @Nullable
    public final zzxc zzh;
    public final long zzi;
    public final long zzj;

    public zznh(long j10, zzbf zzbfVar, int i10, @Nullable zzxc zzxcVar, long j11, zzbf zzbfVar2, int i11, @Nullable zzxc zzxcVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzbfVar;
        this.zzc = i10;
        this.zzd = zzxcVar;
        this.zze = j11;
        this.zzf = zzbfVar2;
        this.zzg = i11;
        this.zzh = zzxcVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznh.class == obj.getClass()) {
            zznh zznhVar = (zznh) obj;
            if (this.zza == zznhVar.zza && this.zzc == zznhVar.zzc && this.zze == zznhVar.zze && this.zzg == zznhVar.zzg && this.zzi == zznhVar.zzi && this.zzj == zznhVar.zzj && Objects.equals(this.zzb, zznhVar.zzb) && Objects.equals(this.zzd, zznhVar.zzd) && Objects.equals(this.zzf, zznhVar.zzf) && Objects.equals(this.zzh, zznhVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
