package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdTheme;
import yads.f9;
import yads.g9;
import yads.gp2;
import yads.ip2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip2 f76953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9 f76954b;

    public e(ip2 ip2Var, f9 f9Var) {
        this.f76953a = ip2Var;
        this.f76954b = f9Var;
    }

    public final g9 a(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        gp2 gp2VarA;
        AdTheme preferredTheme = nativeAdRequestConfiguration.getPreferredTheme();
        if (preferredTheme != null) {
            this.f76953a.getClass();
            gp2VarA = ip2.a(preferredTheme);
        } else {
            gp2VarA = null;
        }
        gp2 gp2Var = gp2VarA;
        this.f76954b.getClass();
        return new g9(nativeAdRequestConfiguration.getAdUnitId(), nativeAdRequestConfiguration.getAge(), nativeAdRequestConfiguration.getGender(), nativeAdRequestConfiguration.getContextQuery(), nativeAdRequestConfiguration.getContextTags(), nativeAdRequestConfiguration.getLocation(), nativeAdRequestConfiguration.getParameters(), nativeAdRequestConfiguration.getBiddingData(), null, gp2Var, nativeAdRequestConfiguration.getShouldLoadImagesAutomatically(), null);
    }

    public /* synthetic */ e() {
        this(new ip2(), new f9());
    }
}
