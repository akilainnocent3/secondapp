package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeue implements zzfby {
    private final nj.t1 zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzeue(nj.t1 t1Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = t1Var;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final nj.t1 zza() {
        nj.t1 t1Var = this.zza;
        zzeud zzeudVar = zzeud.zza;
        Executor executor = this.zzb;
        nj.t1 t1VarZzj = zzhbi.zzj(t1Var, zzeudVar, executor);
        zzbhv zzbhvVar = zzbie.zznU;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() > 0) {
            t1VarZzj = zzhbi.zzi(t1VarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhbi.zzh(t1VarZzj, Throwable.class, zzeuc.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 6;
    }
}
