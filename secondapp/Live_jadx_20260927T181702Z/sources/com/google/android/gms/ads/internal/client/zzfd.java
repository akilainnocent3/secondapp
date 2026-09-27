package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzfd implements Runnable {
    final /* synthetic */ zzfe zza;

    public zzfd(zzfe zzfeVar) {
        Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.zza.zza;
        if (zzffVar.zzc() != null) {
            try {
                zzffVar.zzc().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
