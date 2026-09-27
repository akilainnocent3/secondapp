package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzsb extends zzry implements ScheduledExecutorService, zzrx, AutoCloseable {
    final ScheduledExecutorService zza;

    public zzsb(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.zzrl, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzse zzseVarZzn = zzse.zzn(runnable, null);
        return new zzrz(zzseVarZzn, scheduledExecutorService.schedule(zzseVarZzn, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzsa zzsaVar = new zzsa(runnable);
        return new zzrz(zzsaVar, this.zza.scheduleAtFixedRate(zzsaVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzsa zzsaVar = new zzsa(runnable);
        return new zzrz(zzsaVar, this.zza.scheduleWithFixedDelay(zzsaVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzse zzseVar = new zzse(callable);
        return new zzrz(zzseVar, this.zza.schedule(zzseVar, j10, timeUnit));
    }
}
