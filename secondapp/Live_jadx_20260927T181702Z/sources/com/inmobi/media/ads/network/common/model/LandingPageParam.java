package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class LandingPageParam {

    @m
    private final InlineParams aParams;

    @l
    private final String openMode = "DEFAULT";
    private final boolean supportLockScreen;

    @m
    public final InlineParams getAParams() {
        return this.aParams;
    }

    @l
    public final String getOpenMode() {
        return this.openMode;
    }

    public final boolean getSupportLockScreen() {
        return this.supportLockScreen;
    }

    public static /* synthetic */ void getOpenMode$annotations() {
    }
}
