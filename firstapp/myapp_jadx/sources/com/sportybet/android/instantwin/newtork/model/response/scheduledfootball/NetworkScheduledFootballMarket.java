package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003Jw\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0000¨\u0006/"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarket;", "", "marketId", "", "marketPoolId", "title", "subTitle", "type", "guide", "attributes", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketAttributes;", "bannerTitles", "outcomes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketAttributes;Ljava/lang/String;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketPoolId", "getTitle", "getSubTitle", "getType", "getGuide", "getAttributes", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMarketAttributes;", "getBannerTitles", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMarket {
    public static final int $stable = NetworkScheduledFootballMarketAttributes.$stable;

    @SerializedName("attributes")
    private final NetworkScheduledFootballMarketAttributes attributes;

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("guide")
    private final String guide;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketPoolId")
    private final String marketPoolId;

    @SerializedName("outcomes")
    private final List<NetworkScheduledFootballOutcome> outcomes;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final String type;

    public NetworkScheduledFootballMarket(String str, String str2, String str3, String str4, String str5, String str6, NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes, String str7, List<NetworkScheduledFootballOutcome> list) {
        str7.getClass();
        list.getClass();
        this.marketId = str;
        this.marketPoolId = str2;
        this.title = str3;
        this.subTitle = str4;
        this.type = str5;
        this.guide = str6;
        this.attributes = networkScheduledFootballMarketAttributes;
        this.bannerTitles = str7;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballMarket copy$default(NetworkScheduledFootballMarket networkScheduledFootballMarket, String str, String str2, String str3, String str4, String str5, String str6, NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkScheduledFootballMarket.marketPoolId;
        }
        if ((i & 4) != 0) {
            str3 = networkScheduledFootballMarket.title;
        }
        if ((i & 8) != 0) {
            str4 = networkScheduledFootballMarket.subTitle;
        }
        if ((i & 16) != 0) {
            str5 = networkScheduledFootballMarket.type;
        }
        if ((i & 32) != 0) {
            str6 = networkScheduledFootballMarket.guide;
        }
        if ((i & 64) != 0) {
            networkScheduledFootballMarketAttributes = networkScheduledFootballMarket.attributes;
        }
        if ((i & 128) != 0) {
            str7 = networkScheduledFootballMarket.bannerTitles;
        }
        if ((i & 256) != 0) {
            list = networkScheduledFootballMarket.outcomes;
        }
        String str8 = str7;
        List list2 = list;
        String str9 = str6;
        NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes2 = networkScheduledFootballMarketAttributes;
        String str10 = str5;
        String str11 = str3;
        return networkScheduledFootballMarket.copy(str, str2, str11, str4, str10, str9, networkScheduledFootballMarketAttributes2, str8, list2);
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
    public final String getSubTitle() {
        return this.subTitle;
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
    public final NetworkScheduledFootballMarketAttributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final List<NetworkScheduledFootballOutcome> component9() {
        return this.outcomes;
    }

    public final NetworkScheduledFootballMarket copy(String marketId, String marketPoolId, String title, String subTitle, String type, String guide, NetworkScheduledFootballMarketAttributes attributes, String bannerTitles, List<NetworkScheduledFootballOutcome> outcomes) {
        bannerTitles.getClass();
        outcomes.getClass();
        return new NetworkScheduledFootballMarket(marketId, marketPoolId, title, subTitle, type, guide, attributes, bannerTitles, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMarket)) {
            return false;
        }
        NetworkScheduledFootballMarket networkScheduledFootballMarket = (NetworkScheduledFootballMarket) other;
        return Intrinsics.g(this.marketId, networkScheduledFootballMarket.marketId) && Intrinsics.g(this.marketPoolId, networkScheduledFootballMarket.marketPoolId) && Intrinsics.g(this.title, networkScheduledFootballMarket.title) && Intrinsics.g(this.subTitle, networkScheduledFootballMarket.subTitle) && Intrinsics.g(this.type, networkScheduledFootballMarket.type) && Intrinsics.g(this.guide, networkScheduledFootballMarket.guide) && Intrinsics.g(this.attributes, networkScheduledFootballMarket.attributes) && Intrinsics.g(this.bannerTitles, networkScheduledFootballMarket.bannerTitles) && Intrinsics.g(this.outcomes, networkScheduledFootballMarket.outcomes);
    }

    public final NetworkScheduledFootballMarketAttributes getAttributes() {
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

    public final List<NetworkScheduledFootballOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getSubTitle() {
        return this.subTitle;
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
        String str4 = this.subTitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.guide;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes = this.attributes;
        return this.outcomes.hashCode() + gmf0.a((iHashCode6 + (networkScheduledFootballMarketAttributes != null ? networkScheduledFootballMarketAttributes.hashCode() : 0)) * 31, 31, this.bannerTitles);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.marketPoolId;
        String str3 = this.title;
        String str4 = this.subTitle;
        String str5 = this.type;
        String str6 = this.guide;
        NetworkScheduledFootballMarketAttributes networkScheduledFootballMarketAttributes = this.attributes;
        String str7 = this.bannerTitles;
        List<NetworkScheduledFootballOutcome> list = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballMarket(marketId=", str, ", marketPoolId=", str2, ", title=");
        hxa.c(sbA, str3, ", subTitle=", str4, ", type=");
        hxa.c(sbA, str5, ", guide=", str6, ", attributes=");
        sbA.append(networkScheduledFootballMarketAttributes);
        sbA.append(", bannerTitles=");
        sbA.append(str7);
        sbA.append(", outcomes=");
        return ng1.a(sbA, list, ")");
    }
}
