package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzak extends IInterface {
    void zzb(int i10, String[] strArr) throws RemoteException;

    void zzc(int i10, String[] strArr) throws RemoteException;

    void zzd(int i10, PendingIntent pendingIntent) throws RemoteException;
}
