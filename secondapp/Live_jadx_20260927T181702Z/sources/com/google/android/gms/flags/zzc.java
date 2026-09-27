package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.internal.flags.zza implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // com.google.android.gms.flags.zze
    public final boolean getBooleanFlagValue(String str, boolean z10, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.flags.zzc.zza(parcelZza, z10);
        parcelZza.writeInt(i10);
        Parcel parcelZzb = zzb(2, parcelZza);
        boolean zZzc = com.google.android.gms.internal.flags.zzc.zzc(parcelZzb);
        parcelZzb.recycle();
        return zZzc;
    }

    @Override // com.google.android.gms.flags.zze
    public final int getIntFlagValue(String str, int i10, int i11) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        Parcel parcelZzb = zzb(3, parcelZza);
        int i12 = parcelZzb.readInt();
        parcelZzb.recycle();
        return i12;
    }

    @Override // com.google.android.gms.flags.zze
    public final long getLongFlagValue(String str, long j10, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        parcelZza.writeInt(i10);
        Parcel parcelZzb = zzb(4, parcelZza);
        long j11 = parcelZzb.readLong();
        parcelZzb.recycle();
        return j11;
    }

    @Override // com.google.android.gms.flags.zze
    public final String getStringFlagValue(String str, String str2, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i10);
        Parcel parcelZzb = zzb(5, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.flags.zze
    public final void init(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.flags.zzc.zzb(parcelZza, iObjectWrapper);
        zzc(1, parcelZza);
    }
}
