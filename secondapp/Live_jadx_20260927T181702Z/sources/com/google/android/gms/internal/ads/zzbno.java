package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbno extends zzbmv {
    final /* synthetic */ zzbnp zza;

    public /* synthetic */ zzbno(zzbnp zzbnpVar, byte[] bArr) {
        Objects.requireNonNull(zzbnpVar);
        this.zza = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zze(zzbmj zzbmjVar) {
        zzbnp zzbnpVar = this.zza;
        zzbnpVar.zzc().zzb(zzbnpVar.zze(zzbmjVar));
    }
}
