package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbs implements zzimi {
    private final zzdbp zza;

    private zzdbs(zzdbp zzdbpVar) {
        this.zza = zzdbpVar;
    }

    public static zzdbs zzc(zzdbp zzdbpVar) {
        return new zzdbs(zzdbpVar);
    }

    @Nullable
    public final Bundle zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
