package com.google.ads.mediation.unity;

import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerView f48235a;

    public f(BannerView bannerView) {
        this.f48235a = bannerView;
    }

    public BannerView a() {
        return this.f48235a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f48235a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.f48235a.setListener(iListener);
    }
}
