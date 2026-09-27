package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@zq.j
public final class zzest implements zzdew {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfgz.zza(this.zza, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }
}
