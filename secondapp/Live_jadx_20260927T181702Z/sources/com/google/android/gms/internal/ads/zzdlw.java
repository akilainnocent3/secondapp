package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdlw implements zzimi {
    private final zzdlr zza;

    private zzdlw(zzdlr zzdlrVar) {
        this.zza = zzdlrVar;
    }

    public static zzdlw zzc(zzdlr zzdlrVar) {
        return new zzdlw(zzdlrVar);
    }

    @Nullable
    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
