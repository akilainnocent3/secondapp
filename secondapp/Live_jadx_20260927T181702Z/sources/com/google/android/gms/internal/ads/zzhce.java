package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhce extends zzhaz {
    private nj.t1 zza;
    private ScheduledFuture zzb;

    private zzhce(nj.t1 t1Var) {
        t1Var.getClass();
        this.zza = t1Var;
    }

    public static nj.t1 zze(nj.t1 t1Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhce zzhceVar = new zzhce(t1Var);
        zzhcc zzhccVar = new zzhcc(zzhceVar);
        zzhceVar.zzb = scheduledExecutorService.schedule(zzhccVar, j10, timeUnit);
        t1Var.addListener(zzhccVar, zzhax.INSTANCE);
        return zzhceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhab
    public final String zzd() {
        nj.t1 t1Var = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (t1Var == null) {
            return null;
        }
        String string = t1Var.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 14);
        sb2.append("inputFuture=[");
        sb2.append(string);
        sb2.append(C4235d4.j.f61462e);
        String string2 = sb2.toString();
        if (scheduledFuture == null) {
            return string2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string2;
        }
        StringBuilder sb3 = new StringBuilder(string2.length() + 19 + String.valueOf(delay).length() + 4);
        sb3.append(string2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    public final /* synthetic */ nj.t1 zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
