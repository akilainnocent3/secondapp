package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaca implements zzacb {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzds zzb;

    public zzaca(Executor executor, zzds zzdsVar) {
        this.zza = executor;
        this.zzb = zzdsVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
