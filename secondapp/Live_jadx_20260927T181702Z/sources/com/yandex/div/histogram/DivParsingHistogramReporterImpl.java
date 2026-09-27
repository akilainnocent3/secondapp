package com.yandex.div.histogram;

import android.os.SystemClock;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.histogram.util.HistogramUtils;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivParsingHistogramReporterImpl implements DivParsingHistogramReporter {

    @l
    private final ds.a<Executor> calculateSizeExecutor;

    @l
    private final ds.a<HistogramReporter> histogramReporter;

    /* JADX WARN: Multi-variable type inference failed */
    public DivParsingHistogramReporterImpl(@l ds.a<? extends HistogramReporter> aVar, @l ds.a<? extends Executor> aVar2) {
        this.histogramReporter = aVar;
        this.calculateSizeExecutor = aVar2;
    }

    private final <D> D doMeasure(String str, JSONObject jSONObject, String str2, ds.a<? extends D> aVar) {
        long currentUptime = getCurrentUptime();
        try {
            return aVar.invoke();
        } finally {
            j0.d(1);
            reportHistogram(str, getCurrentUptime() - currentUptime, str2, jSONObject);
            j0.c(1);
        }
    }

    private final long getCurrentUptime() {
        return SystemClock.uptimeMillis();
    }

    private final void reportHistogram(final String str, long j10, final String str2, final JSONObject jSONObject) {
        HistogramReporter.reportDuration$default(this.histogramReporter.invoke(), str, j10, str2, null, null, 24, null);
        if (jSONObject == null) {
            return;
        }
        this.calculateSizeExecutor.invoke().execute(new Runnable() { // from class: com.yandex.div.histogram.c
            @Override // java.lang.Runnable
            public final void run() {
                DivParsingHistogramReporterImpl.reportHistogram$lambda$0(jSONObject, this, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportHistogram$lambda$0(JSONObject jSONObject, DivParsingHistogramReporterImpl divParsingHistogramReporterImpl, String str, String str2) {
        HistogramReporter.reportSize$default(divParsingHistogramReporterImpl.histogramReporter.invoke(), str, HistogramUtils.INSTANCE.calculateUtf8JsonByteSize(jSONObject), str2, null, 8, null);
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <D> D measureDataParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends D> aVar) {
        long currentUptime = getCurrentUptime();
        try {
            return aVar.invoke();
        } finally {
            reportHistogram(HistogramNamesKt.DIV_PARSING_DATA, getCurrentUptime() - currentUptime, str, jSONObject);
        }
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    @l
    public JSONObject measureJsonParsing(@m String str, @l ds.a<? extends JSONObject> aVar) {
        long currentUptime = getCurrentUptime();
        try {
            return aVar.invoke();
        } finally {
            reportHistogram(HistogramNamesKt.DIV_PARSING_JSON, getCurrentUptime() - currentUptime, str, null);
        }
    }

    @Override // com.yandex.div.histogram.DivParsingHistogramReporter
    public <T> T measureTemplatesParsing(@l JSONObject jSONObject, @m String str, @l ds.a<? extends T> aVar) {
        long currentUptime = getCurrentUptime();
        try {
            return aVar.invoke();
        } finally {
            reportHistogram(HistogramNamesKt.DIV_PARSING_TEMPLATES, getCurrentUptime() - currentUptime, str, jSONObject);
        }
    }
}
