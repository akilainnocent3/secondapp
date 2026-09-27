package com.yandex.div.histogram.reporter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ void a(HistogramReporterDelegate histogramReporterDelegate, String str, long j10, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDuration");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        histogramReporterDelegate.reportDuration(str, j10, str2);
    }
}
