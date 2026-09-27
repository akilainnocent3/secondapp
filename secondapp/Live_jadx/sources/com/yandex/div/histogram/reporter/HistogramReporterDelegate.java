package com.yandex.div.histogram.reporter;

import com.yandex.div.histogram.HistogramCallType;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface HistogramReporterDelegate {
    void reportDuration(@l String str, long j10, @HistogramCallType @m String str2);

    void reportSize(@l String str, int i10);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NoOp implements HistogramReporterDelegate {

        @l
        public static final NoOp INSTANCE = new NoOp();

        private NoOp() {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportSize(@l String str, int i10) {
        }

        @Override // com.yandex.div.histogram.reporter.HistogramReporterDelegate
        public void reportDuration(@l String str, long j10, @HistogramCallType @m String str2) {
        }
    }
}
