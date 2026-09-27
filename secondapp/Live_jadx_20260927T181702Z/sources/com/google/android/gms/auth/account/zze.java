package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface zze extends IInterface {
    void zzd(zzb zzbVar, String str) throws RemoteException;

    void zze(zzb zzbVar, Account account) throws RemoteException;

    void zzf(boolean z10) throws RemoteException;
}
