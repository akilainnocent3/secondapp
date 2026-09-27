package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Metric {

    @m
    private String meta;

    @l
    private Sdk.SDKMetric.SDKMetricType metricType;

    public Metric(@l Sdk.SDKMetric.SDKMetricType metricType) {
        m0.p(metricType, "metricType");
        this.metricType = metricType;
    }

    @m
    public final String getMeta() {
        return this.meta;
    }

    @l
    public final Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(@m String str) {
        this.meta = str;
    }

    public final void setMetricType(@l Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        m0.p(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }
}
