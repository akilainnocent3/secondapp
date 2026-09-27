package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqm {
    public static final zzqm zza = new zzql().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzqm(zzql zzqlVar, byte[] bArr) {
        this.zzb = zzqlVar.zze();
        this.zzc = zzqlVar.zzf();
        this.zzd = zzqlVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqm.class == obj.getClass()) {
            zzqm zzqmVar = (zzqm) obj;
            if (this.zzb == zzqmVar.zzb && this.zzc == zzqmVar.zzc && this.zzd == zzqmVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return ((z10 ? 1 : 0) << 2) + (z11 ? 1 : 0) + (z11 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
