package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zzam extends IInterface {
    void zze(boolean z10, int i10) throws RemoteException;

    void zzf(ApplicationMetadata applicationMetadata, @Nullable String str, String str2, boolean z10) throws RemoteException;

    void zzg(int i10) throws RemoteException;

    void zzh(@Nullable Bundle bundle) throws RemoteException;

    void zzi(ConnectionResult connectionResult) throws RemoteException;

    void zzj(int i10) throws RemoteException;
}
