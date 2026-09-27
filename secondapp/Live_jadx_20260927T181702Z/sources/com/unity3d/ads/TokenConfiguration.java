package com.unity3d.ads;

import cs.k;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TokenConfiguration {

    @m
    private BannerSize _bannerSize;
    private boolean _isNewApi;

    @m
    private String _mediationAdUnitId;

    @m
    private MediationInfo _mediationInfo;

    @m
    private String _placementId;

    @l
    private final AdFormat adFormat;

    @l
    private final Map<String, String> extras;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @UnityAdsExperimental
    public static final class Builder {

        @l
        private final AdFormat adFormat;

        @m
        private BannerSize bannerSize;

        @l
        private Map<String, String> extras;

        @m
        private String mediationAdUnitId;

        @m
        private MediationInfo mediationInfo;

        @m
        private String placementId;

        public Builder(@l AdFormat adFormat) {
            m0.p(adFormat, "adFormat");
            this.adFormat = adFormat;
            this.extras = n1.z();
        }

        @l
        public final TokenConfiguration build() {
            return new TokenConfiguration(this.adFormat, this.mediationInfo, this.placementId, this.bannerSize, this.mediationAdUnitId, this.extras, true, null);
        }

        @l
        public final Builder withBannerSize(@m BannerSize bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        @l
        public final Builder withExtras(@l Map<String, String> extras) {
            m0.p(extras, "extras");
            this.extras = extras;
            return this;
        }

        @l
        public final Builder withMediationAdUnitId(@m String str) {
            this.mediationAdUnitId = str;
            return this;
        }

        @l
        public final Builder withMediationInfo(@m MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        @l
        public final Builder withPlacementId(@m String str) {
            this.placementId = str;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public TokenConfiguration(@l AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        m0.p(adFormat, "adFormat");
    }

    @l
    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    @m
    public final BannerSize getBannerSize() {
        return this._bannerSize;
    }

    @l
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @m
    public final String getMediationAdUnitId() {
        return this._mediationAdUnitId;
    }

    @m
    public final MediationInfo getMediationInfo() {
        return this._mediationInfo;
    }

    @m
    public final String getPlacementId() {
        return this._placementId;
    }

    public final boolean isNewApi() {
        return this._isNewApi;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z10, x xVar) {
        this(adFormat, mediationInfo, str, bannerSize, str2, map, z10);
    }

    @k
    public TokenConfiguration(@l AdFormat adFormat, @l Map<String, String> extras) {
        m0.p(adFormat, "adFormat");
        m0.p(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i10, x xVar) {
        this(adFormat, (i10 & 2) != 0 ? n1.z() : map);
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z10, int i10, x xVar) {
        this(adFormat, (i10 & 2) != 0 ? null : mediationInfo, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : bannerSize, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? n1.z() : map, (i10 & 64) != 0 ? false : z10);
    }

    @UnityAdsExperimental
    private TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map<String, String> map, boolean z10) {
        this(adFormat, map);
        this._mediationInfo = mediationInfo;
        this._placementId = str;
        this._bannerSize = bannerSize;
        this._mediationAdUnitId = str2;
        this._isNewApi = z10;
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getBannerSize$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getMediationInfo$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_bannerSize$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_mediationInfo$annotations() {
    }
}
