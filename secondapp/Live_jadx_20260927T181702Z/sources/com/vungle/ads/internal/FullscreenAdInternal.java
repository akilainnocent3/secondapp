package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class FullscreenAdInternal extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(@l Context context) {
        super(context);
        m0.p(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    @m
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(@m VungleAdSize vungleAdSize) {
        return true;
    }
}
