package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdok implements zzimi {
    private final zzdod zza;

    private zzdok(zzdod zzdodVar) {
        this.zza = zzdodVar;
    }

    public static zzdok zza(zzdod zzdodVar) {
        return new zzdok(zzdodVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
