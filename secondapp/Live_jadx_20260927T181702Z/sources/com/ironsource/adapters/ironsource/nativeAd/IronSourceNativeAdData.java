package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.G8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class IronSourceNativeAdData extends AdapterNativeAdData {

    @m
    private final String advertiser;

    @m
    private final String body;

    @m
    private final String callToAction;

    @m
    private final NativeAdDataInterface.Image icon;

    @m
    private final String title;

    public IronSourceNativeAdData(@l G8 nativeAdData) {
        m0.p(nativeAdData, "nativeAdData");
        this.title = nativeAdData.n();
        this.advertiser = nativeAdData.h();
        this.body = nativeAdData.i();
        this.callToAction = nativeAdData.j();
        this.icon = new NativeAdDataInterface.Image(nativeAdData.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @m
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @m
    public String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @m
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @m
    public NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @m
    public String getTitle() {
        return this.title;
    }
}
