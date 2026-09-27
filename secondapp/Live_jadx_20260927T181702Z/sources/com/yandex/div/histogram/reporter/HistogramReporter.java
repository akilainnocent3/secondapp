package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.HistogramFilter;
import k.d;
import kj.e;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@d
public class HistogramReporter {

    @l
    private final HistogramReporterDelegate histogramReporterDelegate;

    public HistogramReporter(@l HistogramReporterDelegate histogramReporterDelegate) {
        this.histogramReporterDelegate = histogramReporterDelegate;
    }

    public static /* synthetic */ void reportDuration$default(HistogramReporter histogramReporter, String str, long j10, String str2, String str3, HistogramFilter histogramFilter, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramReporter.reportDuration(str, j10, str2, str3, histogramFilter);
    }

    public static /* synthetic */ void reportSize$default(HistogramReporter histogramReporter, String str, int i10, String str2, HistogramFilter histogramFilter, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportSize");
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            histogramFilter = HistogramFilter.Companion.getON();
        }
        histogramReporter.reportSize(str, i10, str2, histogramFilter);
    }

    public void reportDuration(@l String str, long j10, @m String str2, @HistogramCallType @m String str3, @l HistogramFilter histogramFilter) {
        if (histogramFilter.report(null)) {
            this.histogramReporterDelegate.reportDuration(str, j10, str3);
        }
        if (str2 != null) {
            String str4 = str2 + e.f102543c + str;
            if (histogramFilter.report(str2)) {
                this.histogramReporterDelegate.reportDuration(str4, j10, str3);
            }
        }
    }

    public void reportSize(@l String str, int i10, @m String str2, @l HistogramFilter histogramFilter) {
        if (histogramFilter.report(null)) {
            this.histogramReporterDelegate.reportSize(str, i10);
        }
        if (str2 != null) {
            String str3 = str2 + e.f102543c + str;
            if (histogramFilter.report(str2)) {
                this.histogramReporterDelegate.reportSize(str3, i10);
            }
        }
    }
}
