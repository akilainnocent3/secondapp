package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbln extends zzbds implements zzblp {
    public zzbln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final IObjectWrapper zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final float zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZza = zzbdu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZza = zzbdu.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzm(zzbmx zzbmxVar) throws RemoteException {
        throw null;
    }
}
