package com.yandex.div.histogram;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {

    @l
    private final ds.a<HistogramColdTypeChecker> histogramColdTypeChecker;

    public HistogramCallTypeProvider(@l ds.a<HistogramColdTypeChecker> aVar) {
        this.histogramColdTypeChecker = aVar;
    }

    @HistogramCallType
    @l
    public final String getHistogramCallType(@l String str) {
        if (!this.histogramColdTypeChecker.invoke().addReported(str)) {
            return addReported(str) ? "Cool" : "Warm";
        }
        addReported(str);
        return "Cold";
    }
}
