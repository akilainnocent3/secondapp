package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@g1
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface AdSizeApi {

    @Deprecated
    public static final int BANNER_320_50 = 4;
    public static final int BANNER_HEIGHT_50 = 5;
    public static final int BANNER_HEIGHT_90 = 6;
    public static final int INTERSTITIAL = 100;
    public static final int RECTANGLE_HEIGHT_250 = 7;

    int getHeight();

    int getWidth();
}
