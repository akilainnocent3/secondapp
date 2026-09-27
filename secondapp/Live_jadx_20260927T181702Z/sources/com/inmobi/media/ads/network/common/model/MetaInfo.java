package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class MetaInfo {

    @l
    private String creativeType = "unknown";
    private final boolean iasEnabled;

    @m
    private final List<LandingPageParam> landingPageParams;

    @m
    private final OmSdkInfo omsdkInfo;

    @l
    public final String getCreativeType() {
        return this.creativeType;
    }

    public final boolean getIasEnabled() {
        return this.iasEnabled;
    }

    @m
    public final List<LandingPageParam> getLandingPageParams() {
        return this.landingPageParams;
    }

    @m
    public final OmSdkInfo getOmsdkInfo() {
        return this.omsdkInfo;
    }

    public static /* synthetic */ void getCreativeType$annotations() {
    }
}
