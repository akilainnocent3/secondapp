package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzbfx extends IInterface {
    com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbge zzbgeVar) throws RemoteException;

    @Nullable
    com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException;

    void zzh(boolean z10) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    @Nullable
    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j10) throws RemoteException;
}
