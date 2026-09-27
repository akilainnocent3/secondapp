package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbyj extends zzbds implements zzbyl {
    public zzbyj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyl
    public final zzbyi zze(IObjectWrapper iObjectWrapper, zzbuq zzbuqVar, int i10) throws RemoteException {
        zzbyi zzbygVar;
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzbdu.zze(parcelZza, zzbuqVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbygVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbygVar = iInterfaceQueryLocalInterface instanceof zzbyi ? (zzbyi) iInterfaceQueryLocalInterface : new zzbyg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbygVar;
    }
}
