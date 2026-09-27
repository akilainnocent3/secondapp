package com.vungle.ads;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface Ad {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad2, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i10 & 1) != 0) {
                str = null;
            }
            ad2.load(str);
        }
    }

    @m
    Boolean canPlayAd();

    void load(@m String str);
}
