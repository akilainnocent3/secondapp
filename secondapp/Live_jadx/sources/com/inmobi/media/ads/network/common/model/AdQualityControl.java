package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class AdQualityControl {

    @m
    private String beacon;
    private boolean enableSdkAdQuality;
    private float screenshotDelayInSeconds;
    private boolean takeScreenshot;

    @m
    public final String getBeacon() {
        return this.beacon;
    }

    public final boolean getEnableSdkAdQuality() {
        return this.enableSdkAdQuality;
    }

    public final float getScreenshotDelayInSeconds() {
        return this.screenshotDelayInSeconds;
    }

    public final boolean getTakeScreenshot() {
        return this.takeScreenshot;
    }

    public final void setBeacon(@m String str) {
        this.beacon = str;
    }

    public final void setEnableSdkAdQuality(boolean z10) {
        this.enableSdkAdQuality = z10;
    }

    public final void setScreenshotDelayInSeconds(float f10) {
        this.screenshotDelayInSeconds = f10;
    }

    public final void setTakeScreenshot(boolean z10) {
        this.takeScreenshot = z10;
    }
}
