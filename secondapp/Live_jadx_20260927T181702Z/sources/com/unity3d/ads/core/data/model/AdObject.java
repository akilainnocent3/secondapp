package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import ev.h;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import nv.b1;
import nv.k0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdObject {

    @m
    private WeakReference<Activity> activity;

    @m
    private final AdPlayer adPlayer;

    @l
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;

    @m
    private LoadConfiguration loadConfiguration;

    @l
    private final UnityAdsLoadOptions loadOptions;

    @m
    private String offerwallPlacementName;

    @l
    private final ByteString opportunityId;

    @l
    private final String placementId;

    @m
    private String playerServerId;

    @m
    private String scarAdString;

    @m
    private String scarAdUnitId;

    @m
    private String scarQueryId;

    @m
    private ShowConfiguration showConfiguration;

    @l
    private k0<AdObjectState> state;

    @l
    private ByteString trackingToken;

    @l
    private k0<h> ttl;

    public AdObject(@l ByteString opportunityId, @l String placementId, @l ByteString trackingToken, boolean z10, @m String str, @m String str2, @m String str3, boolean z11, @m String str4, @m AdPlayer adPlayer, @m String str5, @l UnityAdsLoadOptions loadOptions, boolean z12, @l DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @l k0<h> ttl, @l k0<AdObjectState> state, @m LoadConfiguration loadConfiguration, @m ShowConfiguration showConfiguration, @m WeakReference<Activity> weakReference) {
        m0.p(opportunityId, "opportunityId");
        m0.p(placementId, "placementId");
        m0.p(trackingToken, "trackingToken");
        m0.p(loadOptions, "loadOptions");
        m0.p(adType, "adType");
        m0.p(ttl, "ttl");
        m0.p(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z10;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z12;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdObject copy$default(AdObject adObject, ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, k0 k0Var, k0 k0Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, int i10, Object obj) {
        WeakReference weakReference2;
        ShowConfiguration showConfiguration2;
        ByteString byteString3 = (i10 & 1) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i10 & 2) != 0 ? adObject.placementId : str;
        ByteString byteString4 = (i10 & 4) != 0 ? adObject.trackingToken : byteString2;
        boolean z13 = (i10 & 8) != 0 ? adObject.isScarAd : z10;
        String str8 = (i10 & 16) != 0 ? adObject.scarQueryId : str2;
        String str9 = (i10 & 32) != 0 ? adObject.scarAdUnitId : str3;
        String str10 = (i10 & 64) != 0 ? adObject.scarAdString : str4;
        boolean z14 = (i10 & 128) != 0 ? adObject.isOfferwallAd : z11;
        String str11 = (i10 & 256) != 0 ? adObject.offerwallPlacementName : str5;
        AdPlayer adPlayer2 = (i10 & 512) != 0 ? adObject.adPlayer : adPlayer;
        String str12 = (i10 & 1024) != 0 ? adObject.playerServerId : str6;
        UnityAdsLoadOptions unityAdsLoadOptions2 = (i10 & 2048) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z15 = (i10 & 4096) != 0 ? adObject.isHeaderBidding : z12;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = (i10 & 8192) != 0 ? adObject.adType : diagnosticAdType;
        ByteString byteString5 = byteString3;
        k0 k0Var3 = (i10 & 16384) != 0 ? adObject.ttl : k0Var;
        k0 k0Var4 = (i10 & 32768) != 0 ? adObject.state : k0Var2;
        LoadConfiguration loadConfiguration2 = (i10 & 65536) != 0 ? adObject.loadConfiguration : loadConfiguration;
        ShowConfiguration showConfiguration3 = (i10 & 131072) != 0 ? adObject.showConfiguration : showConfiguration;
        if ((i10 & 262144) != 0) {
            showConfiguration2 = showConfiguration3;
            weakReference2 = adObject.activity;
        } else {
            weakReference2 = weakReference;
            showConfiguration2 = showConfiguration3;
        }
        return adObject.copy(byteString5, str7, byteString4, z13, str8, str9, str10, z14, str11, adPlayer2, str12, unityAdsLoadOptions2, z15, diagnosticAdType2, k0Var3, k0Var4, loadConfiguration2, showConfiguration2, weakReference2);
    }

    @l
    public final ByteString component1() {
        return this.opportunityId;
    }

    @m
    public final AdPlayer component10() {
        return this.adPlayer;
    }

    @m
    public final String component11() {
        return this.playerServerId;
    }

    @l
    public final UnityAdsLoadOptions component12() {
        return this.loadOptions;
    }

    public final boolean component13() {
        return this.isHeaderBidding;
    }

    @l
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component14() {
        return this.adType;
    }

    @l
    public final k0<h> component15() {
        return this.ttl;
    }

    @l
    public final k0<AdObjectState> component16() {
        return this.state;
    }

    @m
    public final LoadConfiguration component17() {
        return this.loadConfiguration;
    }

    @m
    public final ShowConfiguration component18() {
        return this.showConfiguration;
    }

    @m
    public final WeakReference<Activity> component19() {
        return this.activity;
    }

    @l
    public final String component2() {
        return this.placementId;
    }

    @l
    public final ByteString component3() {
        return this.trackingToken;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    @m
    public final String component5() {
        return this.scarQueryId;
    }

    @m
    public final String component6() {
        return this.scarAdUnitId;
    }

    @m
    public final String component7() {
        return this.scarAdString;
    }

    public final boolean component8() {
        return this.isOfferwallAd;
    }

    @m
    public final String component9() {
        return this.offerwallPlacementName;
    }

    @l
    public final AdObject copy(@l ByteString opportunityId, @l String placementId, @l ByteString trackingToken, boolean z10, @m String str, @m String str2, @m String str3, boolean z11, @m String str4, @m AdPlayer adPlayer, @m String str5, @l UnityAdsLoadOptions loadOptions, boolean z12, @l DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @l k0<h> ttl, @l k0<AdObjectState> state, @m LoadConfiguration loadConfiguration, @m ShowConfiguration showConfiguration, @m WeakReference<Activity> weakReference) {
        m0.p(opportunityId, "opportunityId");
        m0.p(placementId, "placementId");
        m0.p(trackingToken, "trackingToken");
        m0.p(loadOptions, "loadOptions");
        m0.p(adType, "adType");
        m0.p(ttl, "ttl");
        m0.p(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, z10, str, str2, str3, z11, str4, adPlayer, str5, loadOptions, z12, adType, ttl, state, loadConfiguration, showConfiguration, weakReference);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return m0.g(this.opportunityId, adObject.opportunityId) && m0.g(this.placementId, adObject.placementId) && m0.g(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && m0.g(this.scarQueryId, adObject.scarQueryId) && m0.g(this.scarAdUnitId, adObject.scarAdUnitId) && m0.g(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && m0.g(this.offerwallPlacementName, adObject.offerwallPlacementName) && m0.g(this.adPlayer, adObject.adPlayer) && m0.g(this.playerServerId, adObject.playerServerId) && m0.g(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && m0.g(this.ttl, adObject.ttl) && m0.g(this.state, adObject.state) && m0.g(this.loadConfiguration, adObject.loadConfiguration) && m0.g(this.showConfiguration, adObject.showConfiguration) && m0.g(this.activity, adObject.activity);
    }

    @m
    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    @m
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @l
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @m
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @l
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @m
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @l
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @l
    public final String getPlacementId() {
        return this.placementId;
    }

    @m
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @m
    public final String getScarAdString() {
        return this.scarAdString;
    }

    @m
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    @m
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    @m
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @l
    public final k0<AdObjectState> getState() {
        return this.state;
    }

    @l
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @l
    public final k0<h> getTtl() {
        return this.ttl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z10 = this.isScarAd;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        String str = this.scarQueryId;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode4 + r11) * 31;
        String str4 = this.offerwallPlacementName;
        int iHashCode5 = (i11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int iHashCode6 = (iHashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z12 = this.isHeaderBidding;
        int iHashCode8 = (((((((iHashCode7 + (z12 ? 1 : z12)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode()) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int iHashCode9 = (iHashCode8 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int iHashCode10 = (iHashCode9 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        return iHashCode10 + (weakReference != null ? weakReference.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setActivity(@m WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(@m LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z10) {
        this.isOfferwallAd = z10;
    }

    public final void setOfferwallPlacementName(@m String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@m String str) {
        this.playerServerId = str;
    }

    public final void setScarAd(boolean z10) {
        this.isScarAd = z10;
    }

    public final void setScarAdString(@m String str) {
        this.scarAdString = str;
    }

    public final void setScarAdUnitId(@m String str) {
        this.scarAdUnitId = str;
    }

    public final void setScarQueryId(@m String str) {
        this.scarQueryId = str;
    }

    public final void setShowConfiguration(@m ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(@l k0<AdObjectState> k0Var) {
        m0.p(k0Var, "<set-?>");
        this.state = k0Var;
    }

    public final void setTrackingToken(@l ByteString byteString) {
        m0.p(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final void setTtl(@l k0<h> k0Var) {
        m0.p(k0Var, "<set-?>");
        this.ttl = k0Var;
    }

    @l
    public String toString() {
        return "AdObject(opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isScarAd=" + this.isScarAd + ", scarQueryId=" + this.scarQueryId + ", scarAdUnitId=" + this.scarAdUnitId + ", scarAdString=" + this.scarAdString + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ')';
    }

    public /* synthetic */ AdObject(ByteString byteString, String str, ByteString byteString2, boolean z10, String str2, String str3, String str4, boolean z11, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z12, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, k0 k0Var, k0 k0Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, int i10, x xVar) {
        this(byteString, str, byteString2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : adPlayer, (i10 & 1024) != 0 ? null : str6, unityAdsLoadOptions, z12, diagnosticAdType, (i10 & 16384) != 0 ? b1.a(null) : k0Var, (32768 & i10) != 0 ? b1.a(AdObjectState.INIT) : k0Var2, (65536 & i10) != 0 ? null : loadConfiguration, (131072 & i10) != 0 ? null : showConfiguration, (i10 & 262144) != 0 ? null : weakReference);
    }
}
