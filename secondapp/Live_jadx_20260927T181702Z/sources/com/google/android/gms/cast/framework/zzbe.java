package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzbe extends IInterface {
    long zzb() throws RemoteException;

    IObjectWrapper zzc() throws RemoteException;

    void zzd(boolean z10) throws RemoteException;

    void zze(@Nullable Bundle bundle) throws RemoteException;

    void zzf(@Nullable Bundle bundle) throws RemoteException;

    void zzg(@Nullable Bundle bundle) throws RemoteException;

    void zzh(@Nullable Bundle bundle) throws RemoteException;

    void zzi(@Nullable Bundle bundle) throws RemoteException;
}
