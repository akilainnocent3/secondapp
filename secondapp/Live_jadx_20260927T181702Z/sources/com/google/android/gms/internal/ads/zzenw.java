package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzenw extends zzbwi {
    final /* synthetic */ zzenx zza;
    private final zzelj zzb;

    public /* synthetic */ zzenw(zzenx zzenxVar, zzelj zzeljVar, byte[] bArr) {
        Objects.requireNonNull(zzenxVar);
        this.zza = zzenxVar;
        this.zzb = zzeljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zze(zzbvf zzbvfVar) throws RemoteException {
        this.zza.zzc(zzbvfVar);
        ((zzemv) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzf(String str) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzemv) this.zzb.zzc).zzx(zzeVar);
    }
}
