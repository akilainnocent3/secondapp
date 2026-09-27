package com.monetization.ads.quality.base.model.configuration;

import gi.j;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.k4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityVerificationAdConfiguration {

    @m
    private final String adContent;

    @m
    private final String adNetworkCreativeId;

    @m
    private final String adNetworkUnitId;

    @l
    private final Object adObject;

    @l
    private final AdQualityVerifierAdType adType;

    @l
    private final String adUnitId;

    @m
    private final Map<String, Object> extraData;

    @m
    private final String mediationId;

    @l
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(@l AdQualityVerifiableNetwork adQualityVerifiableNetwork, @l String str, @l Object obj, @l AdQualityVerifierAdType adQualityVerifierAdType, @m String str2, @m String str3, @m String str4, @m String str5, @m Map<String, ? extends Object> map) {
        this.verifiableAdNetwork = adQualityVerifiableNetwork;
        this.adUnitId = str;
        this.adObject = obj;
        this.adType = adQualityVerifierAdType;
        this.adContent = str2;
        this.adNetworkUnitId = str3;
        this.mediationId = str4;
        this.adNetworkCreativeId = str5;
        this.extraData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQualityVerificationAdConfiguration copy$default(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            adQualityVerifiableNetwork = adQualityVerificationAdConfiguration.verifiableAdNetwork;
        }
        if ((i10 & 2) != 0) {
            str = adQualityVerificationAdConfiguration.adUnitId;
        }
        if ((i10 & 4) != 0) {
            obj = adQualityVerificationAdConfiguration.adObject;
        }
        if ((i10 & 8) != 0) {
            adQualityVerifierAdType = adQualityVerificationAdConfiguration.adType;
        }
        if ((i10 & 16) != 0) {
            str2 = adQualityVerificationAdConfiguration.adContent;
        }
        if ((i10 & 32) != 0) {
            str3 = adQualityVerificationAdConfiguration.adNetworkUnitId;
        }
        if ((i10 & 64) != 0) {
            str4 = adQualityVerificationAdConfiguration.mediationId;
        }
        if ((i10 & 128) != 0) {
            str5 = adQualityVerificationAdConfiguration.adNetworkCreativeId;
        }
        if ((i10 & 256) != 0) {
            map = adQualityVerificationAdConfiguration.extraData;
        }
        String str6 = str5;
        Map map2 = map;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        Object obj3 = obj;
        return adQualityVerificationAdConfiguration.copy(adQualityVerifiableNetwork, str, obj3, adQualityVerifierAdType, str9, str7, str8, str6, map2);
    }

    @l
    public final AdQualityVerifiableNetwork component1() {
        return this.verifiableAdNetwork;
    }

    @l
    public final String component2() {
        return this.adUnitId;
    }

    @l
    public final Object component3() {
        return this.adObject;
    }

    @l
    public final AdQualityVerifierAdType component4() {
        return this.adType;
    }

    @m
    public final String component5() {
        return this.adContent;
    }

    @m
    public final String component6() {
        return this.adNetworkUnitId;
    }

    @m
    public final String component7() {
        return this.mediationId;
    }

    @m
    public final String component8() {
        return this.adNetworkCreativeId;
    }

    @m
    public final Map<String, Object> component9() {
        return this.extraData;
    }

    @l
    public final AdQualityVerificationAdConfiguration copy(@l AdQualityVerifiableNetwork adQualityVerifiableNetwork, @l String str, @l Object obj, @l AdQualityVerifierAdType adQualityVerifierAdType, @m String str2, @m String str3, @m String str4, @m String str5, @m Map<String, ? extends Object> map) {
        return new AdQualityVerificationAdConfiguration(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, str2, str3, str4, str5, map);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) obj;
        return this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && m0.g(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && m0.g(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && m0.g(this.adContent, adQualityVerificationAdConfiguration.adContent) && m0.g(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && m0.g(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && m0.g(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && m0.g(this.extraData, adQualityVerificationAdConfiguration.extraData);
    }

    @m
    public final String getAdContent() {
        return this.adContent;
    }

    @m
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    @m
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    @l
    public final Object getAdObject() {
        return this.adObject;
    }

    @l
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    @l
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @m
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @m
    public final String getMediationId() {
        return this.mediationId;
    }

    @l
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int iHashCode = (this.adType.hashCode() + ((this.adObject.hashCode() + k4.a(this.adUnitId, this.verifiableAdNetwork.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.adContent;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adNetworkUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediationId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adNetworkCreativeId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.extraData;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    @l
    public String toString() {
        return "AdQualityVerificationAdConfiguration(verifiableAdNetwork=" + this.verifiableAdNetwork + ", adUnitId=" + this.adUnitId + ", adObject=" + this.adObject + ", adType=" + this.adType + ", adContent=" + this.adContent + ", adNetworkUnitId=" + this.adNetworkUnitId + ", mediationId=" + this.mediationId + ", adNetworkCreativeId=" + this.adNetworkCreativeId + ", extraData=" + this.extraData + j.f86771d;
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i10, x xVar) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : map);
    }
}
