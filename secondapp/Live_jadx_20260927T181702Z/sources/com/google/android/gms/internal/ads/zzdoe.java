package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdoe implements zzimi {
    private final zzimr zza;

    private zzdoe(zzdod zzdodVar, zzimr zzimrVar) {
        this.zza = zzimrVar;
    }

    public static zzdoe zza(zzdod zzdodVar, zzimr zzimrVar) {
        return new zzdoe(zzdodVar, zzimrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdog) this.zza).zzb().zza();
    }
}
