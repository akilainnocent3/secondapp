package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbml extends zzbds implements zzbmn {
    public zzbml(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zze(zzbme zzbmeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzbmeVar);
        zzda(1, parcelZza);
    }
}
