package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;
import k.h1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SystemTimeOffsetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f95368a;

    @h1
    public SystemTimeOffsetProvider(@l SystemTimeProvider systemTimeProvider) {
        this.f95368a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j10, @l TimeUnit timeUnit) {
        return this.f95368a.elapsedRealtime() - timeUnit.toMillis(j10);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j10, @l TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j10, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j10, @l TimeUnit timeUnit) {
        if (j10 == 0) {
            return 0L;
        }
        return this.f95368a.currentTimeSeconds() - timeUnit.toSeconds(j10);
    }

    public final long systemNanoTimeOffsetInNanos(long j10, @l TimeUnit timeUnit) {
        return this.f95368a.systemNanoTime() - timeUnit.toNanos(j10);
    }

    public final long systemNanoTimeOffsetInSeconds(long j10, @l TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j10, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
