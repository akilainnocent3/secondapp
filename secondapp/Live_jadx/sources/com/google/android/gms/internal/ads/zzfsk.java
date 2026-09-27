package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfsk {
    private final zzfrz zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private volatile ScheduledFuture zzc;

    public zzfsk(final zzfrz zzfrzVar, ScheduledExecutorService scheduledExecutorService, long j10) {
        this.zza = zzfrzVar;
        if (j10 > 0) {
            this.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(zzfrzVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        if (this.zzb.compareAndSet(false, true)) {
            if (this.zzc != null) {
                this.zzc.cancel(false);
            }
            this.zza.zzc();
        }
    }

    public final /* synthetic */ void zzb(zzfrz zzfrzVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzfrzVar.zzc();
        }
    }
}
