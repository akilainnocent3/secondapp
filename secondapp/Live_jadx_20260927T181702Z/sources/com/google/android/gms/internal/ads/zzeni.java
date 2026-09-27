package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzeni extends zzbwf {
    private final zzelj zza;

    public /* synthetic */ zzeni(zzenj zzenjVar, zzelj zzeljVar, byte[] bArr) {
        Objects.requireNonNull(zzenjVar);
        this.zza = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zze() throws RemoteException {
        ((zzemv) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzf(String str) throws RemoteException {
        ((zzemv) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzemv) this.zza.zzc).zzx(zzeVar);
    }
}
