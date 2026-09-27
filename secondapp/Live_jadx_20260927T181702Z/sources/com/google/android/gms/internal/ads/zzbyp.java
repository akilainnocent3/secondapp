package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzbyp extends IInterface {
    void zzH(int i10, String[] strArr, int[] iArr) throws RemoteException;

    void zze() throws RemoteException;

    void zzf() throws RemoteException;

    boolean zzg() throws RemoteException;

    void zzh(@Nullable Bundle bundle) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj() throws RemoteException;

    void zzk() throws RemoteException;

    void zzl() throws RemoteException;

    void zzm(int i10, int i11, Intent intent) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzo(Bundle bundle) throws RemoteException;

    void zzp() throws RemoteException;

    void zzq() throws RemoteException;

    void zzs() throws RemoteException;
}
