package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgh implements Runnable {
    final /* synthetic */ zzbgl zza;

    public zzbgh(zzbgl zzbglVar) {
        Objects.requireNonNull(zzbglVar);
        this.zza = zzbglVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
