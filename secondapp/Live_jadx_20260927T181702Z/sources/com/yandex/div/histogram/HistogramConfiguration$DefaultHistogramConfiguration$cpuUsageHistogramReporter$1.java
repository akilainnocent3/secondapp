package com.yandex.div.histogram;

import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1 extends o0 implements ds.a<CpuUsageHistogramReporter> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$cpuUsageHistogramReporter$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final CpuUsageHistogramReporter invoke() {
        return new CpuUsageHistogramReporter.NoOp();
    }
}
