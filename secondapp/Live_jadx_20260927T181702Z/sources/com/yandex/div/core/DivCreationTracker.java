package com.yandex.div.core;

import android.os.SystemClock;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramNamesKt;
import com.yandex.div.histogram.reporter.HistogramReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCreationTracker {
    private static final long INVALID_TIME = -1;

    @oy.l
    private final String contextCreateCallType;
    private long contextCreatedTime = -1;

    @oy.l
    private final AtomicBoolean contextCreationReported = new AtomicBoolean(false);
    private final long contextCreationStarted;

    @oy.l
    private final AtomicBoolean isFirstViewCreate;

    @oy.l
    public static final Companion Companion = new Companion(null);

    @oy.l
    private static final AtomicBoolean isColdContextCreate = new AtomicBoolean(true);

    @oy.l
    private static final AtomicBoolean isColdViewCreate = new AtomicBoolean(true);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final long getCurrentUptimeMillis() {
            return SystemClock.uptimeMillis();
        }

        @h1
        public final void resetColdCreation() {
            DivCreationTracker.isColdContextCreate.set(true);
            DivCreationTracker.isColdViewCreate.set(true);
        }

        private Companion() {
        }
    }

    public DivCreationTracker(long j10) {
        this.contextCreationStarted = j10;
        this.contextCreateCallType = isColdContextCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        this.isFirstViewCreate = new AtomicBoolean(true);
    }

    private final void sendContextCreationHistogram(HistogramReporter histogramReporter) {
        long j10 = this.contextCreatedTime;
        if (j10 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_CONTEXT_CREATE_HISTOGRAM, j10 - this.contextCreationStarted, null, this.contextCreateCallType, null, 20, null);
        this.contextCreatedTime = -1L;
    }

    @HistogramCallType
    @oy.l
    public final String getViewCreateCallType() {
        if (this.isFirstViewCreate.compareAndSet(true, false)) {
            return isColdViewCreate.compareAndSet(true, false) ? "Cold" : "Cool";
        }
        return "Warm";
    }

    public final void onContextCreationFinished() {
        if (this.contextCreatedTime >= 0) {
            return;
        }
        this.contextCreatedTime = Companion.getCurrentUptimeMillis();
    }

    public final void sendHistograms(long j10, long j11, @oy.l HistogramReporter histogramReporter, @HistogramCallType @oy.l String str) {
        if (j11 < 0) {
            return;
        }
        HistogramReporter.reportDuration$default(histogramReporter, HistogramNamesKt.DIV_VIEW_CREATE_HISTOGRAM, j11 - j10, null, str, null, 20, null);
        if (this.contextCreationReported.compareAndSet(false, true)) {
            sendContextCreationHistogram(histogramReporter);
        }
    }

    @HistogramCallType
    private static /* synthetic */ void getContextCreateCallType$annotations() {
    }
}
