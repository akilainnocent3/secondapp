package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ImpressionEvent implements AdEvent {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @l
    private final Ad f38141ad;

    @m
    private final String adID;

    public ImpressionEvent(@m String str, @l Ad ad2) {
        m0.p(ad2, "ad");
        this.adID = str;
        this.f38141ad = ad2;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @l
    public Ad getAd() {
        return this.f38141ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    @m
    public String getAdID() {
        return this.adID;
    }
}
