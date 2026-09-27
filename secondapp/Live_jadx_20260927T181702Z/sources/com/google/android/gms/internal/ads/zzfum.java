package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfum implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfun zzb;

    public zzfum(zzfun zzfunVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzfunVar);
        this.zzb = zzfunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
