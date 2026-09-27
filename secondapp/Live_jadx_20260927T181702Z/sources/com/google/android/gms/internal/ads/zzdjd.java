package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdjd implements zzimi {
    private final zzdif zza;

    private zzdjd(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    public static zzdjd zzc(zzdif zzdifVar) {
        return new zzdjd(zzdifVar);
    }

    @Nullable
    public final zzfhh zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzo();
    }
}
