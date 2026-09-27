package com.yandex.mobile.ads.instream;

import cs.o;
import k.j0;
import oy.l;
import yads.ma1;
import yads.na1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public final class MobileInstreamAds {

    @l
    public static final MobileInstreamAds INSTANCE = new MobileInstreamAds();

    private MobileInstreamAds() {
    }

    @o
    public static final void setAdGroupPreloading(boolean z10) {
        Object obj = na1.f152959e;
        ma1.a().f152963c = z10;
    }
}
