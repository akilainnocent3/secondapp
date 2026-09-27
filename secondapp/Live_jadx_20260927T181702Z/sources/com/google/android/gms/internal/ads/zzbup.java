package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbup extends zzbdt implements zzbuq {
    public zzbup() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbuq zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbuq ? (zzbuq) iInterfaceQueryLocalInterface : new zzbuo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            zzbdu.zzh(parcel);
            zzbut zzbutVarZzb = zzb(string);
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zzbutVarZzb);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            zzbdu.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            zzbdu.zzh(parcel);
            zzbwp zzbwpVarZze = zze(string3);
            parcel2.writeNoException();
            zzbdu.zze(parcel2, zzbwpVarZze);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzbdu.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
