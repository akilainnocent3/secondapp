package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zznc {
    public static final zznc zza;
    public static final zznc zzb;
    public static final zznc zzc;
    public final long zzd;
    public final long zze;

    static {
        zznc zzncVar = new zznc(0L, 0L);
        zza = zzncVar;
        new zznc(Long.MAX_VALUE, Long.MAX_VALUE);
        zzb = new zznc(Long.MAX_VALUE, 0L);
        new zznc(0L, Long.MAX_VALUE);
        zzc = zzncVar;
    }

    public zznc(long j10, long j11) {
        zzgsw.zza(j10 >= 0);
        zzgsw.zza(j11 >= 0);
        this.zzd = j10;
        this.zze = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznc.class == obj.getClass()) {
            zznc zzncVar = (zznc) obj;
            if (this.zzd == zzncVar.zzd && this.zze == zzncVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzd) * 31) + ((int) this.zze);
    }
}
