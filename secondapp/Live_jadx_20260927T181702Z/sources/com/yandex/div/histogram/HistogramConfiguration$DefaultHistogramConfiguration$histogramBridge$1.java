package com.yandex.div.histogram;

import kotlin.jvm.internal.i0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 extends i0 implements ds.a<NoOpHistogramBridge> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1() {
        super(0, NoOpHistogramBridge.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final NoOpHistogramBridge invoke() {
        return new NoOpHistogramBridge();
    }
}
