package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmo implements zzimi {
    private final zzdlr zza;

    private zzdmo(zzdlr zzdlrVar) {
        this.zza = zzdlrVar;
    }

    public static zzdmo zza(zzdlr zzdlrVar) {
        return new zzdmo(zzdlrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzc();
    }
}
