package io.appmetrica.analytics.coreutils.internal.time;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SystemTimeProvider implements TimeProvider {
    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long currentTimeSeconds() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long systemNanoTime() {
        return System.nanoTime();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.time.TimeProvider
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
