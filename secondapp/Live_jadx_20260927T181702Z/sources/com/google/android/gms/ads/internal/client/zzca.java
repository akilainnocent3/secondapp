package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzca extends zzbdt implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzfp zzfpVar = (zzfp) zzbdu.zzb(parcel, zzfp.CREATOR);
            zzbdu.zzh(parcel);
            zze(zzfpVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) zzbdu.zzb(parcel, zzfp.CREATOR);
            zzbdu.zzh(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
