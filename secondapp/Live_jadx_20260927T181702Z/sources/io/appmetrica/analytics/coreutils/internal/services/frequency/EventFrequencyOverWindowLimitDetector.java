package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f95358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f95359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f95360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f95361d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j10, int i10, @l EventFrequencyStorage eventFrequencyStorage) {
        this.f95358a = j10;
        this.f95359b = i10;
        this.f95360c = eventFrequencyStorage;
    }

    public final boolean detect(@l String str) {
        long jLongValue;
        long jUptimeMillis = this.f95361d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f95360c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, jUptimeMillis);
            jLongValue = jUptimeMillis;
        } else {
            jLongValue = windowStart.longValue();
        }
        long j10 = jUptimeMillis - jLongValue;
        if (j10 < 0 || j10 > this.f95358a) {
            this.f95360c.putWindowStart(str, jUptimeMillis);
            this.f95360c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f95360c.getWindowOccurrencesCount(str);
        int iIntValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f95360c.putWindowOccurrencesCount(str, iIntValue);
        return iIntValue > this.f95359b;
    }

    public final synchronized void updateParameters(long j10, int i10) {
        this.f95358a = j10;
        this.f95359b = i10;
    }
}
