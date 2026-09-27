package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcxx {
    private final zzfke zza;
    private final zzfjt zzb;
    private final String zzc;

    public zzcxx(zzfke zzfkeVar, zzfjt zzfjtVar, @Nullable String str) {
        this.zza = zzfkeVar;
        this.zzb = zzfjtVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfke zza() {
        return this.zza;
    }

    public final zzfjt zzb() {
        return this.zzb;
    }

    public final zzfjw zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
