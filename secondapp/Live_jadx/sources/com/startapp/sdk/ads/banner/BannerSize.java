package com.startapp.sdk.ads.banner;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public class BannerSize {

    @Keep
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    @Keep
    public BannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @Keep
    public int getHeight() {
        return this.height;
    }

    @Keep
    public int getWidth() {
        return this.width;
    }
}
