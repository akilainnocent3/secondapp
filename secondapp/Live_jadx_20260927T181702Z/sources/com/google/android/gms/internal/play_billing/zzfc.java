package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzfc implements Runnable {

    @zq.a
    zzff zza;

    public zzfc(zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeu zzeuVar;
        zzff zzffVar = this.zza;
        if (zzffVar == null || (zzeuVar = zzffVar.zzc) == null) {
            return;
        }
        this.zza = null;
        if (zzeuVar.isDone()) {
            zzffVar.zzp(zzeuVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzffVar.zzd;
            zzffVar.zzd = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    zzffVar.zzo(new zzfd(str, null));
                    throw th2;
                }
            }
            zzffVar.zzo(new zzfd(str + ": " + zzeuVar.toString(), null));
            zzeuVar.cancel(true);
        } catch (Throwable th3) {
            zzeuVar.cancel(true);
            throw th3;
        }
    }
}
