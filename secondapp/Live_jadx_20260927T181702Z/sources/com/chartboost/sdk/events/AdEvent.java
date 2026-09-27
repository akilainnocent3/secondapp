package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface AdEvent {
    @l
    Ad getAd();

    @m
    String getAdID();
}
