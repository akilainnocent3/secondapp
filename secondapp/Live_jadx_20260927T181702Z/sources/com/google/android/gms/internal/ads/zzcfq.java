package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfq implements zzhbf {
    final /* synthetic */ zzcfo zza;
    final /* synthetic */ zzcfm zzb;

    public zzcfq(zzcfr zzcfrVar, zzcfo zzcfoVar, zzcfm zzcfmVar) {
        this.zza = zzcfoVar;
        this.zzb = zzcfmVar;
        Objects.requireNonNull(zzcfrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zza(Throwable th2) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
