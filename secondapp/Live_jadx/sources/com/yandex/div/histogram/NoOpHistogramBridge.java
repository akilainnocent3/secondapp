package com.yandex.div.histogram;

import java.util.concurrent.TimeUnit;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class NoOpHistogramBridge implements HistogramBridge {
    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordBooleanHistogram(@l String str, boolean z10) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordSparseSlowlyHistogram(@l String str, int i10) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordEnumeratedHistogram(@l String str, int i10, int i11) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordCountHistogram(@l String str, int i10, int i11, int i12, int i13) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordLinearCountHistogram(@l String str, int i10, int i11, int i12, int i13) {
    }

    @Override // com.yandex.div.histogram.HistogramBridge
    public void recordTimeHistogram(@l String str, long j10, long j11, long j12, @l TimeUnit timeUnit, int i10) {
    }
}
