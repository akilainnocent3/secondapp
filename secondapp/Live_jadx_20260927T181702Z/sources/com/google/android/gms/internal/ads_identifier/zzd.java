package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.tiktok.appevents.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, e0.d.f76070c);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() throws RemoteException {
        Parcel parcelZzb = zzb(1, zza());
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws RemoteException {
        Parcel parcelZzb = zzb(6, zza());
        boolean zZzb = zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zza(parcelZza, true);
        Parcel parcelZzb = zzb(2, parcelZza);
        boolean zZzb = zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }
}
