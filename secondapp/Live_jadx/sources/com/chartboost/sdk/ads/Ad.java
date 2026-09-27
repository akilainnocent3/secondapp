package com.chartboost.sdk.ads;

import com.chartboost.sdk.Mediation;
import dr.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface Ad {
    void cache();

    void cache(@m String str);

    void clearCache();

    @l
    String getLocation();

    @m
    Mediation getMediation();

    @o(message = "The isCached() API will be removed in a future SDK release. Additional condition checks have been added to cache() and show() calls making this API redundant.")
    boolean isCached();

    void show();
}
