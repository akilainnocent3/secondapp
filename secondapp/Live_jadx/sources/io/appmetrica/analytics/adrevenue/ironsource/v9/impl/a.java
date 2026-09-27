package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends HashMap {
    public a(String str) {
        put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-ironsource-v9");
        put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str == null ? fw.b.f85379f : str);
        put("source", "ironsource");
    }
}
