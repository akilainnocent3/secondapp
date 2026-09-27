package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DualValueMetric extends Metric {

    @m
    private Long valueFirst;

    @m
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DualValueMetric(@l Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        m0.p(metricType, "metricType");
    }

    @m
    public final Long getValueFirst() {
        return this.valueFirst;
    }

    @m
    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(@m Long l10) {
        this.valueFirst = l10;
    }

    public final void setValueSecond(@m Long l10) {
        this.valueSecond = l10;
    }
}
