package com.inmobi.adquality.models;

import androidx.annotation.Keep;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class AdQualityResult {

    @l
    private final String beaconUrl;

    @m
    private String extras;

    @l
    private String imageLocation;

    @m
    private String sdkModelResult;

    public AdQualityResult(@l String imageLocation, @m String str, @l String beaconUrl, @m String str2) {
        m0.p(imageLocation, "imageLocation");
        m0.p(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    @l
    public final String component1() {
        return this.imageLocation;
    }

    @m
    public final String component2() {
        return this.sdkModelResult;
    }

    @l
    public final String component3() {
        return this.beaconUrl;
    }

    @m
    public final String component4() {
        return this.extras;
    }

    @l
    public final AdQualityResult copy(@l String imageLocation, @m String str, @l String beaconUrl, @m String str2) {
        m0.p(imageLocation, "imageLocation");
        m0.p(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, str, beaconUrl, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        return m0.g(this.imageLocation, adQualityResult.imageLocation) && m0.g(this.sdkModelResult, adQualityResult.sdkModelResult) && m0.g(this.beaconUrl, adQualityResult.beaconUrl) && m0.g(this.extras, adQualityResult.extras);
    }

    @l
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    @m
    public final String getExtras() {
        return this.extras;
    }

    @l
    public final String getImageLocation() {
        return this.imageLocation;
    }

    @m
    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int iHashCode = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int iHashCode2 = (this.beaconUrl.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.extras;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setExtras(@m String str) {
        this.extras = str;
    }

    public final void setImageLocation(@l String str) {
        m0.p(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(@m String str) {
        this.sdkModelResult = str;
    }

    @l
    public String toString() {
        return "AdQualityResult(imageLocation=" + this.imageLocation + ", sdkModelResult=" + this.sdkModelResult + ", beaconUrl=" + this.beaconUrl + ", extras=" + this.extras + j.f86771d;
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, x xVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
