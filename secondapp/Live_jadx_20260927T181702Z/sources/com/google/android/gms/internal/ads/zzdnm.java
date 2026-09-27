package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdnm implements zzimi {
    private final zzdnl zza;

    private zzdnm(zzdnl zzdnlVar) {
        this.zza = zzdnlVar;
    }

    public static zzdnm zzc(zzdnl zzdnlVar) {
        return new zzdnm(zzdnlVar);
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbh zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
