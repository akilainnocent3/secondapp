package com.yandex.div.storage.histogram;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface HistogramNameProvider {
    @l
    String getColdCallTypeSuffix();

    @l
    String getComponentName();

    @l
    String getDivDataLoadReportName();

    @l
    String getDivLoadTemplatesReportName();

    @l
    String getDivParsingHistogramName();

    @m
    String getHistogramNameFromCardId(@l String str);

    @l
    String getHotCallTypeSuffix();
}
