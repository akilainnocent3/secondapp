package com.ironsource.adapters.facebook.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.ads.NativeAd;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zr extends AdapterNativeAdData {

    /* JADX INFO: renamed from: zr, reason: collision with root package name */
    private final NativeAd f60767zr;
    private Drawable zz;

    public zr(NativeAd nativeAd, Drawable drawable) {
        this.f60767zr = nativeAd;
        this.zz = drawable;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        IronLog.ADAPTER_CALLBACK.verbose("advertiser = " + this.f60767zr.getAdvertiserName());
        return this.f60767zr.getAdvertiserName();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        IronLog.ADAPTER_CALLBACK.verbose("body = " + this.f60767zr.getAdBodyText());
        return this.f60767zr.getAdBodyText();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        IronLog.ADAPTER_CALLBACK.verbose("cta = " + this.f60767zr.getAdCallToAction());
        return this.f60767zr.getAdCallToAction();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        Uri uri = this.f60767zr.getAdIcon() != null ? Uri.parse(this.f60767zr.getAdIcon().getUrl()) : null;
        IronLog.ADAPTER_CALLBACK.verbose("icon uri = " + uri);
        if (this.f60767zr.getPreloadedIconViewDrawable() != null) {
            this.zz = this.f60767zr.getPreloadedIconViewDrawable();
        }
        return new NativeAdDataInterface.Image(this.zz, uri);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        IronLog.ADAPTER_CALLBACK.verbose("headline = " + this.f60767zr.getAdHeadline());
        return this.f60767zr.getAdHeadline();
    }
}
