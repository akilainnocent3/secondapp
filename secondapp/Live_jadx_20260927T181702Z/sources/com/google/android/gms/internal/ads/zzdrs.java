package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdrs implements zzimi {
    private final zzdrl zza;

    private zzdrs(zzdrl zzdrlVar) {
        this.zza = zzdrlVar;
    }

    public static zzdrs zzc(zzdrl zzdrlVar) {
        return new zzdrs(zzdrlVar);
    }

    @Nullable
    public final zzbvf zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
