package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzam extends IInterface {
    @Nullable
    Bundle zzb(String str) throws RemoteException;

    String zzc() throws RemoteException;

    void zzd(Bundle bundle, int i10) throws RemoteException;

    void zze(Bundle bundle, zzao zzaoVar) throws RemoteException;

    void zzf() throws RemoteException;

    void zzg(Bundle bundle) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi(String str) throws RemoteException;

    void zzj(int i10) throws RemoteException;

    boolean zzk() throws RemoteException;

    boolean zzl() throws RemoteException;

    boolean zzm(Bundle bundle, int i10) throws RemoteException;
}
