package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfy extends zzbds implements zzbga {
    public zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzb(zzbfx zzbfxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzbfxVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzc(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
