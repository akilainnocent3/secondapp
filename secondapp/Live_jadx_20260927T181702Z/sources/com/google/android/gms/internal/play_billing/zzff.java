package com.google.android.gms.internal.play_billing;

import com.ironsource.C4235d4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzff extends zzee {

    @zq.a
    private zzeu zzc;

    @zq.a
    private ScheduledFuture zzd;

    private zzff(zzeu zzeuVar) {
        this.zzc = zzeuVar;
    }

    public static zzeu zzs(zzeu zzeuVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzffVar = new zzff(zzeuVar);
        zzfc zzfcVar = new zzfc(zzffVar);
        zzffVar.zzd = scheduledExecutorService.schedule(zzfcVar, 28500L, timeUnit);
        zzeuVar.zzb(zzfcVar, zzed.INSTANCE);
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    @zq.a
    public final String zzg() {
        zzeu zzeuVar = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeuVar == null) {
            return null;
        }
        String str = "inputFuture=[" + zzeuVar.toString() + C4235d4.j.f61462e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    public final void zzm() {
        zzeu zzeuVar = this.zzc;
        if ((zzeuVar != null) & isCancelled()) {
            zzeuVar.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
