package com.vungle.ads.internal.omsdk;

import com.iab.omid.library.vungle.Omid;
import k.h1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class OMTestUtils {

    @l
    public static final OMTestUtils INSTANCE = new OMTestUtils();

    private OMTestUtils() {
    }

    @h1
    public final boolean isOmidActive() {
        return Omid.isActive();
    }
}
