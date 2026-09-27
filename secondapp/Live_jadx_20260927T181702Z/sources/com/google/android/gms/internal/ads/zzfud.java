package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfud extends TimerTask {
    final /* synthetic */ zzfuf zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfug zzc;

    public zzfud(zzfug zzfugVar, zzfuf zzfufVar, Timer timer) {
        this.zza = zzfufVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfugVar);
        this.zzc = zzfugVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
