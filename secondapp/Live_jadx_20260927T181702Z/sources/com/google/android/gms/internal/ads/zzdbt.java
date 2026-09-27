package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbt implements zzimi {
    private final zzdbp zza;

    private zzdbt(zzdbp zzdbpVar) {
        this.zza = zzdbpVar;
    }

    public static zzdbt zzc(zzdbp zzdbpVar) {
        return new zzdbt(zzdbpVar);
    }

    @Nullable
    public final zzdbi zza() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}
