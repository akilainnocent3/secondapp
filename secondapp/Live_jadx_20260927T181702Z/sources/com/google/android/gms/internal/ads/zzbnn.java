package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbnn extends zzbms {
    final /* synthetic */ zzbnp zza;

    public /* synthetic */ zzbnn(zzbnp zzbnpVar, byte[] bArr) {
        Objects.requireNonNull(zzbnpVar);
        this.zza = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zze(zzbmj zzbmjVar, String str) {
        zzbnp zzbnpVar = this.zza;
        if (zzbnpVar.zzd() == null) {
            return;
        }
        zzbnpVar.zzd().zzc(zzbnpVar.zze(zzbmjVar), str);
    }
}
