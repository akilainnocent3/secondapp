package com.sporty.android.core.model.watchdog;

import defpackage.f87;
import defpackage.g41;
import defpackage.q6a0;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/watchdog/HangWatchdogConfigData;", "", "thresholdMs", "", "pollIntervalMs", "startupGracePeriodMs", "maxStackTraceLines", "", "<init>", "(JJJI)V", "getThresholdMs", "()J", "getPollIntervalMs", "getStartupGracePeriodMs", "getMaxStackTraceLines", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HangWatchdogConfigData {
    private static final long MAX_GRACE_MS = 30000;
    private static final long MAX_POLL_MS = 1000;
    private static final int MAX_STACK_LINES = 100;
    private static final long MAX_THRESHOLD_MS = 10000;
    private static final long MIN_POLL_MS = 10;
    private final int maxStackTraceLines;
    private final long pollIntervalMs;
    private final long startupGracePeriodMs;
    private final long thresholdMs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long MIN_GRACE_MS = 3000;
    private static final HangWatchdogConfigData DEFAULT = new HangWatchdogConfigData(500, 50, MIN_GRACE_MS, 20);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0010\u001a\u00020\u0005*\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/watchdog/HangWatchdogConfigData$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/sporty/android/core/model/watchdog/HangWatchdogConfigData;", "getDEFAULT", "()Lcom/sporty/android/core/model/watchdog/HangWatchdogConfigData;", "MAX_THRESHOLD_MS", "", "MIN_POLL_MS", "MAX_POLL_MS", "MIN_GRACE_MS", "MAX_GRACE_MS", "MAX_STACK_LINES", "", "sanitized", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HangWatchdogConfigData getDEFAULT() {
            return HangWatchdogConfigData.DEFAULT;
        }

        public final HangWatchdogConfigData sanitized(HangWatchdogConfigData hangWatchdogConfigData) {
            hangWatchdogConfigData.getClass();
            long jG = f.g(hangWatchdogConfigData.getPollIntervalMs(), HangWatchdogConfigData.MIN_POLL_MS, HangWatchdogConfigData.MAX_POLL_MS);
            return new HangWatchdogConfigData(f.g(hangWatchdogConfigData.getThresholdMs(), jG, 10000L), jG, f.g(hangWatchdogConfigData.getStartupGracePeriodMs(), HangWatchdogConfigData.MIN_GRACE_MS, HangWatchdogConfigData.MAX_GRACE_MS), f.e(hangWatchdogConfigData.getMaxStackTraceLines(), 1, 100));
        }

        private Companion() {
        }
    }

    public HangWatchdogConfigData(long j, long j2, long j3, int i) {
        this.thresholdMs = j;
        this.pollIntervalMs = j2;
        this.startupGracePeriodMs = j3;
        this.maxStackTraceLines = i;
    }

    public static /* synthetic */ HangWatchdogConfigData copy$default(HangWatchdogConfigData hangWatchdogConfigData, long j, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hangWatchdogConfigData.thresholdMs;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            j2 = hangWatchdogConfigData.pollIntervalMs;
        }
        long j5 = j2;
        if ((i2 & 4) != 0) {
            j3 = hangWatchdogConfigData.startupGracePeriodMs;
        }
        long j6 = j3;
        if ((i2 & 8) != 0) {
            i = hangWatchdogConfigData.maxStackTraceLines;
        }
        return hangWatchdogConfigData.copy(j4, j5, j6, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getThresholdMs() {
        return this.thresholdMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPollIntervalMs() {
        return this.pollIntervalMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartupGracePeriodMs() {
        return this.startupGracePeriodMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxStackTraceLines() {
        return this.maxStackTraceLines;
    }

    public final HangWatchdogConfigData copy(long thresholdMs, long pollIntervalMs, long startupGracePeriodMs, int maxStackTraceLines) {
        return new HangWatchdogConfigData(thresholdMs, pollIntervalMs, startupGracePeriodMs, maxStackTraceLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HangWatchdogConfigData)) {
            return false;
        }
        HangWatchdogConfigData hangWatchdogConfigData = (HangWatchdogConfigData) other;
        return this.thresholdMs == hangWatchdogConfigData.thresholdMs && this.pollIntervalMs == hangWatchdogConfigData.pollIntervalMs && this.startupGracePeriodMs == hangWatchdogConfigData.startupGracePeriodMs && this.maxStackTraceLines == hangWatchdogConfigData.maxStackTraceLines;
    }

    public final int getMaxStackTraceLines() {
        return this.maxStackTraceLines;
    }

    public final long getPollIntervalMs() {
        return this.pollIntervalMs;
    }

    public final long getStartupGracePeriodMs() {
        return this.startupGracePeriodMs;
    }

    public final long getThresholdMs() {
        return this.thresholdMs;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxStackTraceLines) + f87.a(f87.a(Long.hashCode(this.thresholdMs) * 31, this.pollIntervalMs, 31), this.startupGracePeriodMs, 31);
    }

    public String toString() {
        long j = this.thresholdMs;
        long j2 = this.pollIntervalMs;
        long j3 = this.startupGracePeriodMs;
        int i = this.maxStackTraceLines;
        StringBuilder sbA = q6a0.a(j, "HangWatchdogConfigData(thresholdMs=", ", pollIntervalMs=");
        sbA.append(j2);
        g41.a(j3, ", startupGracePeriodMs=", ", maxStackTraceLines=", sbA);
        return zk1.a(i, ")", sbA);
    }
}
