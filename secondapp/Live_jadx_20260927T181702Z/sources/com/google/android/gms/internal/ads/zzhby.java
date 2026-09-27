package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhby extends zzhbu implements zzhbt, AutoCloseable {
    final ScheduledExecutorService zza;

    public zzhby(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhae, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzhbr schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhch zzhchVarZze = zzhch.zze(runnable, null);
        return new zzhbw(zzhchVarZze, scheduledExecutorService.schedule(zzhchVarZze, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhbr schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzhch zzhchVar = new zzhch(callable);
        return new zzhbw(zzhchVar, this.zza.schedule(zzhchVar, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzhbr scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleAtFixedRate(zzhbxVar, j10, j11, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhbt, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhbr scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhbx zzhbxVar = new zzhbx(runnable);
        return new zzhbw(zzhbxVar, this.zza.scheduleWithFixedDelay(zzhbxVar, j10, j11, timeUnit));
    }
}
