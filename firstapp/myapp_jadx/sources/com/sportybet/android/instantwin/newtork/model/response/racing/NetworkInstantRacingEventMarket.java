package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jo\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventMarket;", "", "marketId", "", "marketPoolId", "title", "subtitle", "type", "layout", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketLayout;", "bannerTitles", "outcomes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventMarketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketLayout;Ljava/lang/String;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getMarketPoolId", "getTitle", "getSubtitle", "subTitle", "getType", "getLayout", "()Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketLayout;", "getBannerTitles", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingEventMarket {
    public static final int $stable = NetworkInstantRacingMarketLayout.$stable;

    @SerializedName("bannerTitles")
    private final String bannerTitles;

    @SerializedName("layout")
    private final NetworkInstantRacingMarketLayout layout;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketPoolId")
    private final String marketPoolId;

    @SerializedName("outcomes")
    private final List<NetworkInstantRacingEventMarketOutcome> outcomes;

    @SerializedName("subTitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("type")
    private final String type;

    public NetworkInstantRacingEventMarket(String str, String str2, String str3, String str4, String str5, NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout, String str6, List<NetworkInstantRacingEventMarketOutcome> list) {
        this.marketId = str;
        this.marketPoolId = str2;
        this.title = str3;
        this.subtitle = str4;
        this.type = str5;
        this.layout = networkInstantRacingMarketLayout;
        this.bannerTitles = str6;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingEventMarket copy$default(NetworkInstantRacingEventMarket networkInstantRacingEventMarket, String str, String str2, String str3, String str4, String str5, NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingEventMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingEventMarket.marketPoolId;
        }
        if ((i & 4) != 0) {
            str3 = networkInstantRacingEventMarket.title;
        }
        if ((i & 8) != 0) {
            str4 = networkInstantRacingEventMarket.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = networkInstantRacingEventMarket.type;
        }
        if ((i & 32) != 0) {
            networkInstantRacingMarketLayout = networkInstantRacingEventMarket.layout;
        }
        if ((i & 64) != 0) {
            str6 = networkInstantRacingEventMarket.bannerTitles;
        }
        if ((i & 128) != 0) {
            list = networkInstantRacingEventMarket.outcomes;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout2 = networkInstantRacingMarketLayout;
        return networkInstantRacingEventMarket.copy(str, str2, str3, str4, str8, networkInstantRacingMarketLayout2, str7, list2);
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
    public final NetworkInstantRacingMarketLayout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final List<NetworkInstantRacingEventMarketOutcome> component8() {
        return this.outcomes;
    }

    public final NetworkInstantRacingEventMarket copy(String marketId, String marketPoolId, String title, String subtitle, String type, NetworkInstantRacingMarketLayout layout, String bannerTitles, List<NetworkInstantRacingEventMarketOutcome> outcomes) {
        return new NetworkInstantRacingEventMarket(marketId, marketPoolId, title, subtitle, type, layout, bannerTitles, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingEventMarket)) {
            return false;
        }
        NetworkInstantRacingEventMarket networkInstantRacingEventMarket = (NetworkInstantRacingEventMarket) other;
        return Intrinsics.g(this.marketId, networkInstantRacingEventMarket.marketId) && Intrinsics.g(this.marketPoolId, networkInstantRacingEventMarket.marketPoolId) && Intrinsics.g(this.title, networkInstantRacingEventMarket.title) && Intrinsics.g(this.subtitle, networkInstantRacingEventMarket.subtitle) && Intrinsics.g(this.type, networkInstantRacingEventMarket.type) && Intrinsics.g(this.layout, networkInstantRacingEventMarket.layout) && Intrinsics.g(this.bannerTitles, networkInstantRacingEventMarket.bannerTitles) && Intrinsics.g(this.outcomes, networkInstantRacingEventMarket.outcomes);
    }

    public final String getBannerTitles() {
        return this.bannerTitles;
    }

    public final NetworkInstantRacingMarketLayout getLayout() {
        return this.layout;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketPoolId() {
        return this.marketPoolId;
    }

    public final List<NetworkInstantRacingEventMarketOutcome> getOutcomes() {
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
        NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout = this.layout;
        int iHashCode6 = (iHashCode5 + (networkInstantRacingMarketLayout == null ? 0 : networkInstantRacingMarketLayout.hashCode())) * 31;
        String str6 = this.bannerTitles;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<NetworkInstantRacingEventMarketOutcome> list = this.outcomes;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.marketPoolId;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.type;
        NetworkInstantRacingMarketLayout networkInstantRacingMarketLayout = this.layout;
        String str6 = this.bannerTitles;
        List<NetworkInstantRacingEventMarketOutcome> list = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkInstantRacingEventMarket(marketId=", str, ", marketPoolId=", str2, ", title=");
        hxa.c(sbA, str3, ", subtitle=", str4, ", type=");
        sbA.append(str5);
        sbA.append(", layout=");
        sbA.append(networkInstantRacingMarketLayout);
        sbA.append(", bannerTitles=");
        return nve.a(str6, ", outcomes=", ")", sbA, list);
    }
}
