package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbyb extends zzbmv {
    final /* synthetic */ zzbyc zza;

    public /* synthetic */ zzbyb(zzbyc zzbycVar, byte[] bArr) {
        Objects.requireNonNull(zzbycVar);
        this.zza = zzbycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zze(zzbmj zzbmjVar) {
        zzbyc zzbycVar = this.zza;
        zzbycVar.zzd().onCustomFormatAdLoaded(zzbycVar.zzc(zzbmjVar));
    }
}
