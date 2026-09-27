package com.google.android.gms.internal.fido;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzg extends IInterface {
    void zzb(List list) throws RemoteException;

    void zzc(Status status) throws RemoteException;
}
