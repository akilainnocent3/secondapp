package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzba extends IInterface {
    IObjectWrapper zzb() throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;
}
