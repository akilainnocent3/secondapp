package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OneShotSingleValueMetric extends SingleValueMetric {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotSingleValueMetric(@l Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        m0.p(metricType, "metricType");
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }
}
