package com.yandex.div.histogram;

import com.yandex.div.histogram.metrics.RenderMetrics;
import kotlin.jvm.internal.i0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class Div2ViewHistogramReporter$renderMetrics$2 extends i0 implements ds.a<RenderMetrics> {
    public static final Div2ViewHistogramReporter$renderMetrics$2 INSTANCE = new Div2ViewHistogramReporter$renderMetrics$2();

    public Div2ViewHistogramReporter$renderMetrics$2() {
        super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final RenderMetrics invoke() {
        return new RenderMetrics();
    }
}
