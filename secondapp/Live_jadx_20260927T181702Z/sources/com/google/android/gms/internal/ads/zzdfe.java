package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzdfe implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdfg zzdfgVar = (zzdfg) this.zza.get();
        if (zzdfgVar != null) {
            zzdfgVar.zzs(zzdfd.zza);
        }
    }
}
