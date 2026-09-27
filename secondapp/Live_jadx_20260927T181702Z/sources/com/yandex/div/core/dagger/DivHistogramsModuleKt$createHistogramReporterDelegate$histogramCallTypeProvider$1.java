package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends i0 implements ds.a<HistogramColdTypeChecker> {
    public DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, cr.c.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((cr.c) this.receiver).get();
    }
}
