package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzay extends IInterface {
    int zze() throws RemoteException;

    IObjectWrapper zzf() throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    void zzh(zzao zzaoVar) throws RemoteException;

    void zzi(@Nullable zzba zzbaVar) throws RemoteException;

    void zzj(boolean z10, boolean z11) throws RemoteException;

    void zzk(zzao zzaoVar) throws RemoteException;

    void zzl(zzba zzbaVar) throws RemoteException;

    void zzm(Bundle bundle) throws RemoteException;
}
