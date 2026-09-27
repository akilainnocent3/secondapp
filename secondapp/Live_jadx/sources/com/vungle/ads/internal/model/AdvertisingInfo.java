package com.vungle.ads.internal.model;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvertisingInfo {

    @m
    private String advertisingId;
    private boolean limitAdTracking;

    @m
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final boolean getLimitAdTracking() {
        return this.limitAdTracking;
    }

    public final void setAdvertisingId(@m String str) {
        this.advertisingId = str;
    }

    public final void setLimitAdTracking(boolean z10) {
        this.limitAdTracking = z10;
    }
}
