package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaj extends com.google.android.gms.internal.cast.zza implements IInterface {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    public final void zze(IStatusCallback iStatusCallback, String[] strArr, String str, List list) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, iStatusCallback);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeString(str);
        parcelZza.writeTypedList(null);
        zzd(2, parcelZza);
    }

    public final void zzf(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzafVar);
        parcelZza.writeStringArray(strArr);
        zzd(5, parcelZza);
    }

    public final void zzg(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzafVar);
        parcelZza.writeStringArray(strArr);
        zzd(7, parcelZza);
    }

    public final void zzh(zzaf zzafVar, String[] strArr) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.cast.zzc.zze(parcelZza, zzafVar);
        parcelZza.writeStringArray(strArr);
        zzd(6, parcelZza);
    }
}
