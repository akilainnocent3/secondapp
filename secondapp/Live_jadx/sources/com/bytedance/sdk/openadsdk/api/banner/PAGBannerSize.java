package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class PAGBannerSize {
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f35471sd = 1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f35472tq;
    private int vy;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.hww = i10;
        this.f35472tq = i11;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i10) {
        int iHww = sd.hww(context, i10, 0);
        if (iHww == sd.hww) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, iHww);
        pAGBannerSize.f35471sd = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i10) {
        int iHww = sd.hww(context, 0);
        if (iHww == sd.hww) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.vy = iHww;
        pAGBannerSize.f35471sd = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i10, int i11) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i10, 0);
        pAGBannerSize.vy = i11;
        pAGBannerSize.f35471sd = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f35472tq;
    }

    public int getMaxHeight() {
        return this.vy;
    }

    public int getType() {
        return this.f35471sd;
    }

    public int getWidth() {
        return this.hww;
    }
}
