package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbq {
    private final String zza;
    private final long zzb;

    public zzgbq() {
        this.zza = null;
        this.zzb = -1L;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzgbq(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }
}
