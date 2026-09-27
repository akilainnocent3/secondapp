package com.unity3d.ads.core.data.model;

import com.unity3d.ads.MediationInfo;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadConfigurationInternal {

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

    public LoadConfigurationInternal(@l String placementId, @m String str, @m String str2, @m MediationInfo mediationInfo, @l Map<String, String> extras) {
        m0.p(placementId, "placementId");
        m0.p(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.mediationAdUnitId = str2;
        this.mediationInfo = mediationInfo;
        this.extras = extras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i10 & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        if ((i10 & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        if ((i10 & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        if ((i10 & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        Map map2 = map;
        String str4 = str3;
        return loadConfigurationInternal.copy(str, str2, str4, mediationInfo, map2);
    }

    @l
    public final String component1() {
        return this.placementId;
    }

    @m
    public final String component2() {
        return this.adMarkup;
    }

    @m
    public final String component3() {
        return this.mediationAdUnitId;
    }

    @m
    public final MediationInfo component4() {
        return this.mediationInfo;
    }

    @l
    public final Map<String, String> component5() {
        return this.extras;
    }

    @l
    public final LoadConfigurationInternal copy(@l String placementId, @m String str, @m String str2, @m MediationInfo mediationInfo, @l Map<String, String> extras) {
        m0.p(placementId, "placementId");
        m0.p(extras, "extras");
        return new LoadConfigurationInternal(placementId, str, str2, mediationInfo, extras);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) obj;
        return m0.g(this.placementId, loadConfigurationInternal.placementId) && m0.g(this.adMarkup, loadConfigurationInternal.adMarkup) && m0.g(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && m0.g(this.mediationInfo, loadConfigurationInternal.mediationInfo) && m0.g(this.extras, loadConfigurationInternal.extras);
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

    public int hashCode() {
        int iHashCode = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediationAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return ((iHashCode3 + (mediationInfo != null ? mediationInfo.hashCode() : 0)) * 31) + this.extras.hashCode();
    }

    @l
    public String toString() {
        return "LoadConfigurationInternal(placementId=" + this.placementId + ", adMarkup=" + this.adMarkup + ", mediationAdUnitId=" + this.mediationAdUnitId + ", mediationInfo=" + this.mediationInfo + ", extras=" + this.extras + ')';
    }

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i10, x xVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : mediationInfo, (i10 & 16) != 0 ? n1.z() : map);
    }
}
