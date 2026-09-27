package com.vungle.ads.internal.downloader;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import fw.b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DownloadRequest {

    @l
    private final AdAsset asset;

    @l
    private final AtomicBoolean cancelled;

    @m
    private TimeIntervalMetric downloadTemplateDuration;

    @m
    private final LogEntry logEntry;

    @m
    private TimeIntervalMetric partialDownloadDurationMetric;

    @l
    private final Priority priority;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i10) {
            this.priority = i10;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadRequest(@l Priority priority, @l AdAsset asset, @m LogEntry logEntry) {
        m0.p(priority, "priority");
        m0.p(asset, "asset");
        this.priority = priority;
        this.asset = asset;
        this.logEntry = logEntry;
        this.cancelled = new AtomicBoolean(false);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    @l
    public final AdAsset getAsset() {
        return this.asset;
    }

    @m
    public final LogEntry getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    @l
    /* JADX INFO: renamed from: getPriority, reason: collision with other method in class */
    public final Priority m3185getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final void startPartialDownloadRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.partialDownloadDurationMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void startTemplateRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadTemplateDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopPartialDownloadRecord() throws Throwable {
        TimeIntervalMetric timeIntervalMetric = this.partialDownloadDurationMetric;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, "percentage=" + this.asset.getPercentage() + " url=" + this.asset.getServerPath());
        }
    }

    public final void stopTemplateRecord() throws Throwable {
        TimeIntervalMetric timeIntervalMetric = this.downloadTemplateDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, this.logEntry, this.asset.getServerPath());
        }
    }

    @l
    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url='" + this.asset.getServerPath() + "', path='" + this.asset.getLocalPath() + "', cancelled=" + this.cancelled + ", logEntry=" + this.logEntry + b.f85383j;
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    public /* synthetic */ DownloadRequest(Priority priority, AdAsset adAsset, LogEntry logEntry, int i10, x xVar) {
        this(priority, adAsset, (i10 & 4) != 0 ? null : logEntry);
    }
}
