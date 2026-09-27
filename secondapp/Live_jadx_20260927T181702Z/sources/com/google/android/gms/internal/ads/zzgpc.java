package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgpc extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgpe zza;

    public zzgpc(zzgpe zzgpeVar) {
        Objects.requireNonNull(zzgpeVar);
        this.zza = zzgpeVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgpe zzgpeVar = this.zza;
        synchronized (zzgpeVar) {
            zzgpeVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgpe zzgpeVar = this.zza;
        synchronized (zzgpeVar) {
            zzgpeVar.zzf(null);
        }
    }
}
