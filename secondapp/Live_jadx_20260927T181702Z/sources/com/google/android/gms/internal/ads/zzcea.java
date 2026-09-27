package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzcea extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, zzcee zzceeVar, zzcdx zzcdxVar) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException;

    void zzi(zzbzh zzbzhVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbze zzbzeVar) throws RemoteException;

    IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;
}
