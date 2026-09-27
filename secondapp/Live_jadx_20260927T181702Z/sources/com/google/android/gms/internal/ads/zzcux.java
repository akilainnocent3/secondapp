package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcux implements zzimi {
    private final zzcuw zza;

    private zzcux(zzcuw zzcuwVar) {
        this.zza = zzcuwVar;
    }

    public static zzcux zzc(zzcuw zzcuwVar) {
        return new zzcux(zzcuwVar);
    }

    @Nullable
    public final ViewGroup zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
