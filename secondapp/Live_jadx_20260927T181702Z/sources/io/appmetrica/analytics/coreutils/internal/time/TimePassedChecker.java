package io.appmetrica.analytics.coreutils.internal.time;

import k.h1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class TimePassedChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeProvider f95369a;

    @h1
    public TimePassedChecker(@l TimeProvider timeProvider) {
        this.f95369a = timeProvider;
    }

    public final boolean didTimePassMillis(long j10, long j11, @l String str) {
        long jCurrentTimeMillis = this.f95369a.currentTimeMillis();
        return jCurrentTimeMillis < j10 || jCurrentTimeMillis - j10 >= j11;
    }

    public final boolean didTimePassSeconds(long j10, long j11, @l String str) {
        long jCurrentTimeSeconds = this.f95369a.currentTimeSeconds();
        return jCurrentTimeSeconds < j10 || jCurrentTimeSeconds - j10 >= j11;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
