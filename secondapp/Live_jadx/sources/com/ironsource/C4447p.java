package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4447p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Boolean f63242a;

    public C4447p(@oy.l JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.m0.p(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f63242a = adFormatAuctionSettings.has(C4464q.f63338a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(C4464q.f63338a)) : null;
    }

    @oy.m
    public final Boolean a() {
        return this.f63242a;
    }
}
