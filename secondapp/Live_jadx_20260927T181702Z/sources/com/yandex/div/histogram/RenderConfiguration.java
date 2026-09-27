package com.yandex.div.histogram;

import com.yandex.div.core.annotations.PublicApi;
import cs.k;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public final class RenderConfiguration {

    @l
    private final HistogramFilter drawFilter;

    @l
    private final HistogramFilter layoutFilter;

    @l
    private final HistogramFilter measureFilter;

    @l
    private final HistogramFilter totalFilter;

    @k
    public RenderConfiguration() {
        this(null, null, null, null, 15, null);
    }

    @l
    public final HistogramFilter getDrawFilter() {
        return this.drawFilter;
    }

    @l
    public final HistogramFilter getLayoutFilter() {
        return this.layoutFilter;
    }

    @l
    public final HistogramFilter getMeasureFilter() {
        return this.measureFilter;
    }

    @l
    public final HistogramFilter getTotalFilter() {
        return this.totalFilter;
    }

    @k
    public RenderConfiguration(@l HistogramFilter histogramFilter) {
        this(histogramFilter, null, null, null, 14, null);
    }

    @k
    public RenderConfiguration(@l HistogramFilter histogramFilter, @l HistogramFilter histogramFilter2) {
        this(histogramFilter, histogramFilter2, null, null, 12, null);
    }

    @k
    public RenderConfiguration(@l HistogramFilter histogramFilter, @l HistogramFilter histogramFilter2, @l HistogramFilter histogramFilter3) {
        this(histogramFilter, histogramFilter2, histogramFilter3, null, 8, null);
    }

    @k
    public RenderConfiguration(@l HistogramFilter histogramFilter, @l HistogramFilter histogramFilter2, @l HistogramFilter histogramFilter3, @l HistogramFilter histogramFilter4) {
        this.measureFilter = histogramFilter;
        this.layoutFilter = histogramFilter2;
        this.drawFilter = histogramFilter3;
        this.totalFilter = histogramFilter4;
    }

    public /* synthetic */ RenderConfiguration(HistogramFilter histogramFilter, HistogramFilter histogramFilter2, HistogramFilter histogramFilter3, HistogramFilter histogramFilter4, int i10, x xVar) {
        this((i10 & 1) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter, (i10 & 2) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter2, (i10 & 4) != 0 ? HistogramFilter.Companion.getOFF() : histogramFilter3, (i10 & 8) != 0 ? HistogramFilter.Companion.getON() : histogramFilter4);
    }
}
