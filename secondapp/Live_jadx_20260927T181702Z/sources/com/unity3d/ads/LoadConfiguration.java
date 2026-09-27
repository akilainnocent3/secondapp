package com.unity3d.ads;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public final class LoadConfiguration {

    @m
    private final String adMarkup;

    @l
    private final Map<String, String> extras;

    @m
    private final String mediationAdUnitId;

    @m
    private final MediationInfo mediationInfo;

    @l
    private final String placementId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        @m
        private String adMarkup;

        @l
        private Map<String, String> extras;

        @m
        private String mediationAdUnitId;

        @m
        private MediationInfo mediationInfo;

        @l
        private final String placementId;

        public Builder(@l String placementId) {
            m0.p(placementId, "placementId");
            this.placementId = placementId;
            this.extras = n1.z();
        }

        @l
        public final LoadConfiguration build() {
            return new LoadConfiguration(this.placementId, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, this.extras, null);
        }

        @l
        public final String getPlacementId() {
            return this.placementId;
        }

        @l
        public final Builder withAdMarkup(@l String adMarkup) {
            m0.p(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        @l
        public final Builder withExtras(@l Map<String, String> extras) {
            m0.p(extras, "extras");
            this.extras = extras;
            return this;
        }

        @l
        public final Builder withMediationAdUnitId(@l String mediationAdUnitId) {
            m0.p(mediationAdUnitId, "mediationAdUnitId");
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        @l
        public final Builder withMediationInfo(@l MediationInfo mediationInfo) {
            m0.p(mediationInfo, "mediationInfo");
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public /* synthetic */ LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map map, x xVar) {
        this(str, str2, mediationInfo, str3, map);
    }

    @m
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    @l
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    @m
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    @m
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    @l
    public final String getPlacementId() {
        return this.placementId;
    }

    private LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map<String, String> map) {
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
        this.extras = map;
    }
}
