package com.yandex.div.internal.widget.indicator;

import ds.l;
import kotlin.jvm.internal.o0;
import ms.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3 extends o0 implements l<IndicatorsStripDrawer.Indicator, Boolean> {
    final /* synthetic */ f<Float> $viewPort;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3(f<Float> fVar) {
        super(1);
        this.$viewPort = fVar;
    }

    @Override // ds.l
    @oy.l
    public final Boolean invoke(@oy.l IndicatorsStripDrawer.Indicator indicator) {
        return Boolean.valueOf(!this.$viewPort.a(Float.valueOf(indicator.getCenterOffset())));
    }
}
