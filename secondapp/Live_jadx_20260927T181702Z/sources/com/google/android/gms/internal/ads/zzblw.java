package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzblw extends IInterface {
    void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzc(String str) throws RemoteException;

    void zzd(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdE(@Nullable zzblp zzblpVar) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, int i10) throws RemoteException;
}
