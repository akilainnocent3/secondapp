package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcac extends zzbds implements zzcae {
    public zzcac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zze(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzcarVar);
        zzbdu.zze(parcelZza, zzcaiVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzf(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzcarVar);
        zzbdu.zze(parcelZza, zzcaiVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzg(zzcar zzcarVar, zzcai zzcaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, zzcarVar);
        zzbdu.zze(parcelZza, zzcaiVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzh(String str, zzcai zzcaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbdu.zze(parcelZza, zzcaiVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcae
    public final void zzj(zzcaa zzcaaVar, zzcaj zzcajVar) throws RemoteException {
        throw null;
    }
}
