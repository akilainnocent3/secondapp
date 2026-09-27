package com.google.android.gms.internal.cast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsc {
    public static zzrx zza(ExecutorService executorService) {
        if (executorService instanceof zzrx) {
            return (zzrx) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzsb((ScheduledExecutorService) executorService) : new zzry(executorService);
    }
}
