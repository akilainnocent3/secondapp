package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J{\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0000¨\u00060"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarket;", "", "marketId", "", "marketPoolId", "title", "subtitle", "type", "guide", "attributes", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarketAttributes;", "bannerTitles", "outcomes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarketAttributes;Ljava/lang/String;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketPoolId", "getTitle", "getSubtitle", "subTitle", "getType", "getGuide", "getAttributes", "()Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarketAttributes;", "getBannerTitles", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyMarket {
    public static final int $stable = NetworkSportyPenaltyMarketAttributes.$stable;

    @SerializedName("attributes")
    private final NetworkSportyPenaltyMarketAttributes attributes;

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("guide")
    private final String guide;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketPoolId")
    private final String marketPoolId;

    @SerializedName("outcomes")
    private final List<NetworkSportyPenaltyMarketOutcome> outcomes;

    @SerializedName("subTitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final String type;

    public NetworkSportyPenaltyMarket(String str, String str2, String str3, String str4, String str5, String str6, NetworkSportyPenaltyMarketAttributes networkSportyPenaltyMarketAttributes, String str7, List<NetworkSportyPenaltyMarketOutcome> list) {
        this.marketId = str;
        this.marketPoolId = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = str5;
        this.guide = str6;
        this.attributes = networkSportyPenaltyMarketAttributes;
        this.bannerTitles = str7;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltyMarket copy$default(NetworkSportyPenaltyMarket networkSportyPenaltyMarket, String str, String str2, String str3, String str4, String str5, String str6, NetworkSportyPenaltyMarketAttributes networkSportyPenaltyMarketAttributes, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSportyPenaltyMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkSportyPenaltyMarket.marketPoolId;
        }
        if ((i & 4) != 0) {
            str3 = networkSportyPenaltyMarket.title;
        }
        if ((i & 8) != 0) {
            str4 = networkSportyPenaltyMarket.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = networkSportyPenaltyMarket.type;
        }
        if ((i & 32) != 0) {
            str6 = networkSportyPenaltyMarket.guide;
        }
        if ((i & 64) != 0) {
            networkSportyPenaltyMarketAttributes = networkSportyPenaltyMarket.attributes;
        }
        if ((i & 128) != 0) {
            str7 = networkSportyPenaltyMarket.bannerTitles;
        }
        if ((i & 256) != 0) {
            list = networkSportyPenaltyMarket.outcomes;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str6;
        NetworkSportyPenaltyMarketAttributes networkSportyPenaltyMarketAttributes2 = networkSportyPenaltyMarketAttributes;
        String str10 = str5;
        String str11 = str3;
        return networkSportyPenaltyMarket.copy(str, str2, str11, str4, str10, str9, networkSportyPenaltyMarketAttributes2, str8, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketPoolId() {
        return this.marketPoolId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGuide() {
        return this.guide;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final NetworkSportyPenaltyMarketAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final List<NetworkSportyPenaltyMarketOutcome> component9() {
        return this.outcomes;
    }

    public final NetworkSportyPenaltyMarket copy(String marketId, String marketPoolId, String title, String subtitle, String type, String guide, NetworkSportyPenaltyMarketAttributes attributes, String bannerTitles, List<NetworkSportyPenaltyMarketOutcome> outcomes) {
        return new NetworkSportyPenaltyMarket(marketId, marketPoolId, title, subtitle, type, guide, attributes, bannerTitles, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyMarket)) {
            return false;
        }
        NetworkSportyPenaltyMarket networkSportyPenaltyMarket = (NetworkSportyPenaltyMarket) other;
        return Intrinsics.g(this.marketId, networkSportyPenaltyMarket.marketId) && Intrinsics.g(this.marketPoolId, networkSportyPenaltyMarket.marketPoolId) && Intrinsics.g(this.title, networkSportyPenaltyMarket.title) && Intrinsics.g(this.subtitle, networkSportyPenaltyMarket.subtitle) && Intrinsics.g(this.type, networkSportyPenaltyMarket.type) && Intrinsics.g(this.guide, networkSportyPenaltyMarket.guide) && Intrinsics.g(this.attributes, networkSportyPenaltyMarket.attributes) && Intrinsics.g(this.bannerTitles, networkSportyPenaltyMarket.bannerTitles) && Intrinsics.g(this.outcomes, networkSportyPenaltyMarket.outcomes);
    }

    public final NetworkSportyPenaltyMarketAttributes getAttributes() {
        return this.attributes;
    }

    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final String getGuide() {
        return this.guide;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketPoolId() {
        return this.marketPoolId;
    }

    public final List<NetworkSportyPenaltyMarketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketPoolId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.guide;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        NetworkSportyPenaltyMarketAttributes networkSportyPenaltyMarketAttributes = this.attributes;
        int iHashCode7 = (iHashCode6 + (networkSportyPenaltyMarketAttributes == null ? 0 : networkSportyPenaltyMarketAttributes.hashCode())) * 31;
        String str7 = this.bannerTitles;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<NetworkSportyPenaltyMarketOutcome> list = this.outcomes;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.marketPoolId;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.type;
        String str6 = this.guide;
        NetworkSportyPenaltyMarketAttributes networkSportyPenaltyMarketAttributes = this.attributes;
        String str7 = this.bannerTitles;
        List<NetworkSportyPenaltyMarketOutcome> list = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyMarket(marketId=", str, ", marketPoolId=", str2, ", title=");
        hxa.c(sbA, str3, ", subtitle=", str4, ", type=");
        hxa.c(sbA, str5, ", guide=", str6, ", attributes=");
        sbA.append(networkSportyPenaltyMarketAttributes);
        sbA.append(", bannerTitles=");
        sbA.append(str7);
        sbA.append(", outcomes=");
        return ng1.a(sbA, list, ")");
    }
}
