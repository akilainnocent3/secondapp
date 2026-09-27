package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.v0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveAdRequest extends v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f44575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f44576e;

    public InneractiveAdRequest(String str) {
        this.f44574c = str;
    }

    public Double getFloorPrice() {
        return this.f44576e;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public s0 getSelectedUnitConfig() {
        return this.f44575d;
    }

    public String getSpotId() {
        return this.f44574c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d10) {
        double dMax = Double.isNaN(d10) ? 0.0d : Math.max(0.0d, Math.min(d10, 400000.0d));
        if (dMax != d10) {
            IAlog.f("Invalid floor price: %.2f — adjusted to %.2f.", Double.valueOf(d10), Double.valueOf(dMax));
        }
        this.f44576e = Double.valueOf(dMax);
    }

    @Deprecated
    public void setMuteVideo(boolean z10) {
        InneractiveAdManager.setMuteVideo(z10);
    }

    public void setSelectedUnitConfig(s0 s0Var) {
        this.f44575d = s0Var;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
