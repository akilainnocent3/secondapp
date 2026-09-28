package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.at6;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u009d\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00105\u001a\u00020\u000eHÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R-\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$Ê\u0001\f\b8\u0012\b\b9\u0012\u0004\b\u0003\u0010\u0000¨\u00067"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "homeTeamName", "homeTeamLogo", "homeTeamBaseColor", "homeTeamSleeveColor", "awayTeamName", "awayTeamLogo", "awayTeamBaseColor", "awayTeamSleeveColor", "marketCount", "", "markets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getHomeTeamName", "getHomeTeamLogo", "getHomeTeamBaseColor", "getHomeTeamSleeveColor", "getAwayTeamName", "getAwayTeamLogo", "getAwayTeamBaseColor", "getAwayTeamSleeveColor", "getMarketCount", "()I", "getMarkets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyEvent {
    public static final int $stable = 8;

    @SerializedName("awayTeamBaseColor")
    private final String awayTeamBaseColor;

    @SerializedName("awayTeamLogo")
    private final String awayTeamLogo;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("awayTeamSleeveColor")
    private final String awayTeamSleeveColor;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamBaseColor")
    private final String homeTeamBaseColor;

    @SerializedName("homeTeamLogo")
    private final String homeTeamLogo;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("homeTeamSleeveColor")
    private final String homeTeamSleeveColor;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("marketCount")
    private final int marketCount;

    @SerializedName("markets")
    private final List<NetworkSportyPenaltyMarket> markets;

    public NetworkSportyPenaltyEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, List<NetworkSportyPenaltyMarket> list) {
        this.eventId = str;
        this.leagueId = str2;
        this.homeTeamName = str3;
        this.homeTeamLogo = str4;
        this.homeTeamBaseColor = str5;
        this.homeTeamSleeveColor = str6;
        this.awayTeamName = str7;
        this.awayTeamLogo = str8;
        this.awayTeamBaseColor = str9;
        this.awayTeamSleeveColor = str10;
        this.marketCount = i;
        this.markets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltyEvent copy$default(NetworkSportyPenaltyEvent networkSportyPenaltyEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkSportyPenaltyEvent.eventId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkSportyPenaltyEvent.leagueId;
        }
        if ((i2 & 4) != 0) {
            str3 = networkSportyPenaltyEvent.homeTeamName;
        }
        if ((i2 & 8) != 0) {
            str4 = networkSportyPenaltyEvent.homeTeamLogo;
        }
        if ((i2 & 16) != 0) {
            str5 = networkSportyPenaltyEvent.homeTeamBaseColor;
        }
        if ((i2 & 32) != 0) {
            str6 = networkSportyPenaltyEvent.homeTeamSleeveColor;
        }
        if ((i2 & 64) != 0) {
            str7 = networkSportyPenaltyEvent.awayTeamName;
        }
        if ((i2 & 128) != 0) {
            str8 = networkSportyPenaltyEvent.awayTeamLogo;
        }
        if ((i2 & 256) != 0) {
            str9 = networkSportyPenaltyEvent.awayTeamBaseColor;
        }
        if ((i2 & 512) != 0) {
            str10 = networkSportyPenaltyEvent.awayTeamSleeveColor;
        }
        if ((i2 & 1024) != 0) {
            i = networkSportyPenaltyEvent.marketCount;
        }
        if ((i2 & 2048) != 0) {
            list = networkSportyPenaltyEvent.markets;
        }
        int i3 = i;
        List list2 = list;
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return networkSportyPenaltyEvent.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAwayTeamSleeveColor() {
        return this.awayTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getMarketCount() {
        return this.marketCount;
    }

    public final List<NetworkSportyPenaltyMarket> component12() {
        return this.markets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamBaseColor() {
        return this.homeTeamBaseColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAwayTeamBaseColor() {
        return this.awayTeamBaseColor;
    }

    public final NetworkSportyPenaltyEvent copy(String eventId, String leagueId, String homeTeamName, String homeTeamLogo, String homeTeamBaseColor, String homeTeamSleeveColor, String awayTeamName, String awayTeamLogo, String awayTeamBaseColor, String awayTeamSleeveColor, int marketCount, List<NetworkSportyPenaltyMarket> markets) {
        return new NetworkSportyPenaltyEvent(eventId, leagueId, homeTeamName, homeTeamLogo, homeTeamBaseColor, homeTeamSleeveColor, awayTeamName, awayTeamLogo, awayTeamBaseColor, awayTeamSleeveColor, marketCount, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyEvent)) {
            return false;
        }
        NetworkSportyPenaltyEvent networkSportyPenaltyEvent = (NetworkSportyPenaltyEvent) other;
        return Intrinsics.g(this.eventId, networkSportyPenaltyEvent.eventId) && Intrinsics.g(this.leagueId, networkSportyPenaltyEvent.leagueId) && Intrinsics.g(this.homeTeamName, networkSportyPenaltyEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogo, networkSportyPenaltyEvent.homeTeamLogo) && Intrinsics.g(this.homeTeamBaseColor, networkSportyPenaltyEvent.homeTeamBaseColor) && Intrinsics.g(this.homeTeamSleeveColor, networkSportyPenaltyEvent.homeTeamSleeveColor) && Intrinsics.g(this.awayTeamName, networkSportyPenaltyEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogo, networkSportyPenaltyEvent.awayTeamLogo) && Intrinsics.g(this.awayTeamBaseColor, networkSportyPenaltyEvent.awayTeamBaseColor) && Intrinsics.g(this.awayTeamSleeveColor, networkSportyPenaltyEvent.awayTeamSleeveColor) && this.marketCount == networkSportyPenaltyEvent.marketCount && Intrinsics.g(this.markets, networkSportyPenaltyEvent.markets);
    }

    public final String getAwayTeamBaseColor() {
        return this.awayTeamBaseColor;
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getAwayTeamSleeveColor() {
        return this.awayTeamSleeveColor;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamBaseColor() {
        return this.homeTeamBaseColor;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final int getMarketCount() {
        return this.marketCount;
    }

    public final List<NetworkSportyPenaltyMarket> getMarkets() {
        return this.markets;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamLogo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.homeTeamBaseColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.homeTeamSleeveColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.awayTeamName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.awayTeamLogo;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.awayTeamBaseColor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.awayTeamSleeveColor;
        int iA = gpp.a(this.marketCount, (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        List<NetworkSportyPenaltyMarket> list = this.markets;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        String str3 = this.homeTeamName;
        String str4 = this.homeTeamLogo;
        String str5 = this.homeTeamBaseColor;
        String str6 = this.homeTeamSleeveColor;
        String str7 = this.awayTeamName;
        String str8 = this.awayTeamLogo;
        String str9 = this.awayTeamBaseColor;
        String str10 = this.awayTeamSleeveColor;
        int i = this.marketCount;
        List<NetworkSportyPenaltyMarket> list = this.markets;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyEvent(eventId=", str, ", leagueId=", str2, ", homeTeamName=");
        hxa.c(sbA, str3, ", homeTeamLogo=", str4, ", homeTeamBaseColor=");
        hxa.c(sbA, str5, ", homeTeamSleeveColor=", str6, ", awayTeamName=");
        hxa.c(sbA, str7, ", awayTeamLogo=", str8, ", awayTeamBaseColor=");
        hxa.c(sbA, str9, ", awayTeamSleeveColor=", str10, ", marketCount=");
        return at6.b(sbA, i, ", markets=", list, ")");
    }
}
