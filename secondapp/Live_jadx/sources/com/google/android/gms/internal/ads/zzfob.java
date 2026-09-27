package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfob {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfoc zzd;

    public zzfob(zzfoc zzfocVar, Runnable runnable, long j10) {
        Objects.requireNonNull(zzfocVar);
        this.zzd = zzfocVar;
        this.zza = runnable;
        this.zzb = j10;
    }
}
