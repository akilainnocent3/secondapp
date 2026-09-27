package com.yandex.div.storage.histogram;

import com.yandex.div.histogram.HistogramFilter;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import k.d;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class HistogramRecorder {

    @m
    private final HistogramNameProvider histogramNameProvider;

    @l
    private final HistogramReporter histogramReporter;

    @l
    private final CopyOnWriteArraySet<String> recordedHistograms = new CopyOnWriteArraySet<>();

    public HistogramRecorder(@l HistogramReporterDelegate histogramReporterDelegate, @m HistogramNameProvider histogramNameProvider) {
        this.histogramNameProvider = histogramNameProvider;
        this.histogramReporter = new HistogramReporter(histogramReporterDelegate);
    }

    private String getHistogramCallType(String str) {
        String hotCallTypeSuffix;
        String coldCallTypeSuffix;
        if (this.recordedHistograms.add(str)) {
            HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
            return (histogramNameProvider == null || (coldCallTypeSuffix = histogramNameProvider.getColdCallTypeSuffix()) == null) ? "Cold" : coldCallTypeSuffix;
        }
        HistogramNameProvider histogramNameProvider2 = this.histogramNameProvider;
        return (histogramNameProvider2 == null || (hotCallTypeSuffix = histogramNameProvider2.getHotCallTypeSuffix()) == null) ? "Warm" : hotCallTypeSuffix;
    }

    public static /* synthetic */ void reportDivDataLoadTime$default(HistogramRecorder histogramRecorder, long j10, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDivDataLoadTime");
        }
        if ((i10 & 2) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramRecorder.reportDivDataLoadTime(j10, histogramFilter);
    }

    private void reportDuration(String str, long j10, HistogramFilter histogramFilter) {
        HistogramReporter histogramReporter = this.histogramReporter;
        HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
        histogramReporter.reportDuration(str, j10, histogramNameProvider != null ? histogramNameProvider.getComponentName() : null, getHistogramCallType(str), histogramFilter);
    }

    public static /* synthetic */ void reportDuration$default(HistogramRecorder histogramRecorder, String str, long j10, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i10 & 4) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramRecorder.reportDuration(str, j10, histogramFilter);
    }

    public static /* synthetic */ void reportTemplateLoadedTime$default(HistogramRecorder histogramRecorder, long j10, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportTemplateLoadedTime");
        }
        if ((i10 & 2) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramRecorder.reportTemplateLoadedTime(j10, histogramFilter);
    }

    @d
    public void reportDivDataLoadTime(long j10, @l HistogramFilter histogramFilter) {
        HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
        if (histogramNameProvider != null) {
            reportDuration(histogramNameProvider.getDivDataLoadReportName(), j10, histogramFilter);
        }
    }

    @d
    public void reportTemplateLoadedTime(long j10, @l HistogramFilter histogramFilter) {
        HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
        if (histogramNameProvider != null) {
            reportDuration(histogramNameProvider.getDivLoadTemplatesReportName(), j10, histogramFilter);
        }
    }

    public void reportTemplatesParseTime(@l Set<String> set, long j10) {
        for (String str : set) {
            HistogramReporter histogramReporter = this.histogramReporter;
            HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
            HistogramReporter.reportDuration$default(histogramReporter, str, j10, histogramNameProvider != null ? histogramNameProvider.getComponentName() : null, null, null, 24, null);
        }
    }
}
