package com.ironsource.adapters.admob.nativead;

import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class zr extends AdapterNativeAdData {
    private NativeAd zz;

    public zr(NativeAd nativeAd) {
        this.zz = nativeAd;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        IronLog.ADAPTER_CALLBACK.verbose("advertiser = " + this.zz.getAdvertiser());
        return this.zz.getAdvertiser();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        IronLog.ADAPTER_CALLBACK.verbose("body = " + this.zz.getBody());
        return this.zz.getBody();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        IronLog.ADAPTER_CALLBACK.verbose("cta = " + this.zz.getCallToAction());
        return this.zz.getCallToAction();
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        NativeAd.Image icon = this.zz.getIcon();
        if (icon == null) {
            return null;
        }
        IronLog.ADAPTER_CALLBACK.verbose("icon uri = " + icon.getUri());
        return new NativeAdDataInterface.Image(icon.getDrawable(), icon.getUri());
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        IronLog.ADAPTER_CALLBACK.verbose("headline = " + this.zz.getHeadline());
        return this.zz.getHeadline();
    }
}
