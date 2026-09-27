package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zzbls extends IInterface {
    IObjectWrapper zzb() throws RemoteException;

    Uri zzc() throws RemoteException;

    double zzd() throws RemoteException;

    int zze() throws RemoteException;

    int zzf() throws RemoteException;

    @Nullable
    Map zzg() throws RemoteException;
}
