package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmo extends zzbds implements zzbmq {
    public zzbmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zze(zzbmg zzbmgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, zzbmgVar);
        zzda(1, parcelZza);
    }
}
