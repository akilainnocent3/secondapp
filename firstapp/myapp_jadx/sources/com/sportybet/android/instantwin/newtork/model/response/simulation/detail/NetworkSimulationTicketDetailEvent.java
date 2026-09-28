package com.sportybet.android.instantwin.newtork.model.response.simulation.detail;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d5d;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J³\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0014\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010;\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R-\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(Ê\u0001\f\b>\u0012\b\b?\u0012\u0004\b\u0003\u0010\u0000¨\u0006="}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailEvent;", "", "leagueId", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "homeTeamName", "homeTeamLogo", "homeTeamBaseColor", "homeTeamSleeveColor", "awayTeamName", "awayTeamLogo", "awayTeamBaseColor", "awayTeamSleeveColor", "homeTeamScore", "", "awayTeamScore", "resultSequence", "markets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailMarket;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/util/List;)V", "getLeagueId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEventId", "getHomeTeamName", "getHomeTeamLogo", "getHomeTeamBaseColor", "getHomeTeamSleeveColor", "getAwayTeamName", "getAwayTeamLogo", "getAwayTeamBaseColor", "getAwayTeamSleeveColor", "getHomeTeamScore", "()I", "getAwayTeamScore", "getResultSequence", "getMarkets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketDetailEvent {
    public static final int $stable = 8;

    @SerializedName("awayTeamBaseColor")
    private final String awayTeamBaseColor;

    @SerializedName("awayTeamLogo")
    private final String awayTeamLogo;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("awayTeamScore")
    private final int awayTeamScore;

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

    @SerializedName("homeTeamScore")
    private final int homeTeamScore;

    @SerializedName("homeTeamSleeveColor")
    private final String homeTeamSleeveColor;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("markets")
    private final List<NetworkSimulationTicketDetailMarket> markets;

    @SerializedName("resultSequence")
    private final String resultSequence;

    public NetworkSimulationTicketDetailEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11, List<NetworkSimulationTicketDetailMarket> list) {
        this.leagueId = str;
        this.eventId = str2;
        this.homeTeamName = str3;
        this.homeTeamLogo = str4;
        this.homeTeamBaseColor = str5;
        this.homeTeamSleeveColor = str6;
        this.awayTeamName = str7;
        this.awayTeamLogo = str8;
        this.awayTeamBaseColor = str9;
        this.awayTeamSleeveColor = str10;
        this.homeTeamScore = i;
        this.awayTeamScore = i2;
        this.resultSequence = str11;
        this.markets = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAwayTeamSleeveColor() {
        return this.awayTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getHomeTeamScore() {
        return this.homeTeamScore;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getAwayTeamScore() {
        return this.awayTeamScore;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    public final List<NetworkSimulationTicketDetailMarket> component14() {
        return this.markets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
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

    public final NetworkSimulationTicketDetailEvent copy(String leagueId, String eventId, String homeTeamName, String homeTeamLogo, String homeTeamBaseColor, String homeTeamSleeveColor, String awayTeamName, String awayTeamLogo, String awayTeamBaseColor, String awayTeamSleeveColor, int homeTeamScore, int awayTeamScore, String resultSequence, List<NetworkSimulationTicketDetailMarket> markets) {
        return new NetworkSimulationTicketDetailEvent(leagueId, eventId, homeTeamName, homeTeamLogo, homeTeamBaseColor, homeTeamSleeveColor, awayTeamName, awayTeamLogo, awayTeamBaseColor, awayTeamSleeveColor, homeTeamScore, awayTeamScore, resultSequence, markets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketDetailEvent)) {
            return false;
        }
        NetworkSimulationTicketDetailEvent networkSimulationTicketDetailEvent = (NetworkSimulationTicketDetailEvent) other;
        return Intrinsics.g(this.leagueId, networkSimulationTicketDetailEvent.leagueId) && Intrinsics.g(this.eventId, networkSimulationTicketDetailEvent.eventId) && Intrinsics.g(this.homeTeamName, networkSimulationTicketDetailEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogo, networkSimulationTicketDetailEvent.homeTeamLogo) && Intrinsics.g(this.homeTeamBaseColor, networkSimulationTicketDetailEvent.homeTeamBaseColor) && Intrinsics.g(this.homeTeamSleeveColor, networkSimulationTicketDetailEvent.homeTeamSleeveColor) && Intrinsics.g(this.awayTeamName, networkSimulationTicketDetailEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogo, networkSimulationTicketDetailEvent.awayTeamLogo) && Intrinsics.g(this.awayTeamBaseColor, networkSimulationTicketDetailEvent.awayTeamBaseColor) && Intrinsics.g(this.awayTeamSleeveColor, networkSimulationTicketDetailEvent.awayTeamSleeveColor) && this.homeTeamScore == networkSimulationTicketDetailEvent.homeTeamScore && this.awayTeamScore == networkSimulationTicketDetailEvent.awayTeamScore && Intrinsics.g(this.resultSequence, networkSimulationTicketDetailEvent.resultSequence) && Intrinsics.g(this.markets, networkSimulationTicketDetailEvent.markets);
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

    public final int getAwayTeamScore() {
        return this.awayTeamScore;
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

    public final int getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final List<NetworkSimulationTicketDetailMarket> getMarkets() {
        return this.markets;
    }

    public final String getResultSequence() {
        return this.resultSequence;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventId;
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
        int iA = gpp.a(this.awayTeamScore, gpp.a(this.homeTeamScore, (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31, 31), 31);
        String str11 = this.resultSequence;
        int iHashCode10 = (iA + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<NetworkSimulationTicketDetailMarket> list = this.markets;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.eventId;
        String str3 = this.homeTeamName;
        String str4 = this.homeTeamLogo;
        String str5 = this.homeTeamBaseColor;
        String str6 = this.homeTeamSleeveColor;
        String str7 = this.awayTeamName;
        String str8 = this.awayTeamLogo;
        String str9 = this.awayTeamBaseColor;
        String str10 = this.awayTeamSleeveColor;
        int i = this.homeTeamScore;
        int i2 = this.awayTeamScore;
        String str11 = this.resultSequence;
        List<NetworkSimulationTicketDetailMarket> list = this.markets;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketDetailEvent(leagueId=", str, ", eventId=", str2, ", homeTeamName=");
        hxa.c(sbA, str3, ", homeTeamLogo=", str4, ", homeTeamBaseColor=");
        hxa.c(sbA, str5, ", homeTeamSleeveColor=", str6, ", awayTeamName=");
        hxa.c(sbA, str7, ", awayTeamLogo=", str8, ", awayTeamBaseColor=");
        hxa.c(sbA, str9, ", awayTeamSleeveColor=", str10, ", homeTeamScore=");
        d5d.a(sbA, i, ", awayTeamScore=", i2, ", resultSequence=");
        return nve.a(str11, ", markets=", ")", sbA, list);
    }
}
