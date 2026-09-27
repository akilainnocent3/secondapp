package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzec extends zzbdt implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            zzf();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            zzh();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zZza = zzbdu.zza(parcel);
            zzbdu.zzh(parcel);
            zzi(zZza);
        }
        parcel2.writeNoException();
        return true;
    }
}
