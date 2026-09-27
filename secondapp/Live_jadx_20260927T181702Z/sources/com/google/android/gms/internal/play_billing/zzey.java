package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzey extends zzeh implements ScheduledFuture, zzeu {
    private final ScheduledFuture zza;

    public zzey(zzeu zzeuVar, ScheduledFuture scheduledFuture) {
        super(zzeuVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = zzc().cancel(z10);
        if (zCancel) {
            this.zza.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
