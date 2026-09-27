package com.google.android.gms.flags;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zze extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i10) throws RemoteException;

    int getIntFlagValue(String str, int i10, int i11) throws RemoteException;

    long getLongFlagValue(String str, long j10, int i10) throws RemoteException;

    String getStringFlagValue(String str, String str2, int i10) throws RemoteException;

    void init(IObjectWrapper iObjectWrapper) throws RemoteException;
}
