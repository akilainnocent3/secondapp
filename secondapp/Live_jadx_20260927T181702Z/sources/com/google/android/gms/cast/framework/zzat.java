package com.google.android.gms.cast.framework;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzat extends IInterface {
    int zze(Intent intent, int i10, int i11) throws RemoteException;

    @Nullable
    IBinder zzf(Intent intent) throws RemoteException;

    void zzg() throws RemoteException;

    void zzh() throws RemoteException;
}
