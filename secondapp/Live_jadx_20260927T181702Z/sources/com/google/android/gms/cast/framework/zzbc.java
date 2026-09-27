package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzbc extends IInterface {
    @Nullable
    IObjectWrapper zzb(@Nullable String str) throws RemoteException;

    String zzc() throws RemoteException;

    boolean zzd() throws RemoteException;
}
