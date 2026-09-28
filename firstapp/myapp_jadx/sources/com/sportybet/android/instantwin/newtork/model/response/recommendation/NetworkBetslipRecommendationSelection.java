package com.sportybet.android.instantwin.newtork.model.response.recommendation;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u000204HÖ\u0081\u0004J\n\u00105\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013Ê\u0001\f\b7\u0012\b\b8\u0012\u0004\b\u0003\u0010\u0002¨\u00066"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/recommendation/NetworkBetslipRecommendationSelection;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "homeTeamName", "homeTeamLogo", "awayTeamName", "awayTeamLogo", "marketId", "marketTitle", "outcomeId", "outcomeDesc", "odds", "probability", "outcomeContext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getHomeTeamName", "getHomeTeamLogo", "getAwayTeamName", "getAwayTeamLogo", "getMarketId", "getMarketTitle", "getOutcomeId", "getOutcomeDesc", "getOdds", "getProbability", "getOutcomeContext", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkBetslipRecommendationSelection {
    public static final int $stable = 0;

    @SerializedName("awayTeamLogo")
    private final String awayTeamLogo;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamLogo")
    private final String homeTeamLogo;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("marketTitle")
    private final String marketTitle;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("outcomeContext")
    private final String outcomeContext;

    @SerializedName("outcomeDesc")
    private final String outcomeDesc;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("probability")
    private final String probability;

    public NetworkBetslipRecommendationSelection(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.eventId = str;
        this.leagueId = str2;
        this.homeTeamName = str3;
        this.homeTeamLogo = str4;
        this.awayTeamName = str5;
        this.awayTeamLogo = str6;
        this.marketId = str7;
        this.marketTitle = str8;
        this.outcomeId = str9;
        this.outcomeDesc = str10;
        this.odds = str11;
        this.probability = str12;
        this.outcomeContext = str13;
    }

    public static /* synthetic */ NetworkBetslipRecommendationSelection copy$default(NetworkBetslipRecommendationSelection networkBetslipRecommendationSelection, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkBetslipRecommendationSelection.eventId;
        }
        return networkBetslipRecommendationSelection.copy(str, (i & 2) != 0 ? networkBetslipRecommendationSelection.leagueId : str2, (i & 4) != 0 ? networkBetslipRecommendationSelection.homeTeamName : str3, (i & 8) != 0 ? networkBetslipRecommendationSelection.homeTeamLogo : str4, (i & 16) != 0 ? networkBetslipRecommendationSelection.awayTeamName : str5, (i & 32) != 0 ? networkBetslipRecommendationSelection.awayTeamLogo : str6, (i & 64) != 0 ? networkBetslipRecommendationSelection.marketId : str7, (i & 128) != 0 ? networkBetslipRecommendationSelection.marketTitle : str8, (i & 256) != 0 ? networkBetslipRecommendationSelection.outcomeId : str9, (i & 512) != 0 ? networkBetslipRecommendationSelection.outcomeDesc : str10, (i & 1024) != 0 ? networkBetslipRecommendationSelection.odds : str11, (i & 2048) != 0 ? networkBetslipRecommendationSelection.probability : str12, (i & 4096) != 0 ? networkBetslipRecommendationSelection.outcomeContext : str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOutcomeContext() {
        return this.outcomeContext;
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
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarketTitle() {
        return this.marketTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final NetworkBetslipRecommendationSelection copy(String eventId, String leagueId, String homeTeamName, String homeTeamLogo, String awayTeamName, String awayTeamLogo, String marketId, String marketTitle, String outcomeId, String outcomeDesc, String odds, String probability, String outcomeContext) {
        return new NetworkBetslipRecommendationSelection(eventId, leagueId, homeTeamName, homeTeamLogo, awayTeamName, awayTeamLogo, marketId, marketTitle, outcomeId, outcomeDesc, odds, probability, outcomeContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkBetslipRecommendationSelection)) {
            return false;
        }
        NetworkBetslipRecommendationSelection networkBetslipRecommendationSelection = (NetworkBetslipRecommendationSelection) other;
        return Intrinsics.g(this.eventId, networkBetslipRecommendationSelection.eventId) && Intrinsics.g(this.leagueId, networkBetslipRecommendationSelection.leagueId) && Intrinsics.g(this.homeTeamName, networkBetslipRecommendationSelection.homeTeamName) && Intrinsics.g(this.homeTeamLogo, networkBetslipRecommendationSelection.homeTeamLogo) && Intrinsics.g(this.awayTeamName, networkBetslipRecommendationSelection.awayTeamName) && Intrinsics.g(this.awayTeamLogo, networkBetslipRecommendationSelection.awayTeamLogo) && Intrinsics.g(this.marketId, networkBetslipRecommendationSelection.marketId) && Intrinsics.g(this.marketTitle, networkBetslipRecommendationSelection.marketTitle) && Intrinsics.g(this.outcomeId, networkBetslipRecommendationSelection.outcomeId) && Intrinsics.g(this.outcomeDesc, networkBetslipRecommendationSelection.outcomeDesc) && Intrinsics.g(this.odds, networkBetslipRecommendationSelection.odds) && Intrinsics.g(this.probability, networkBetslipRecommendationSelection.probability) && Intrinsics.g(this.outcomeContext, networkBetslipRecommendationSelection.outcomeContext);
    }

    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketTitle() {
        return this.marketTitle;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeContext() {
        return this.outcomeContext;
    }

    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getProbability() {
        return this.probability;
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
        String str5 = this.awayTeamName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awayTeamLogo;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.marketId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.marketTitle;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.outcomeId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.outcomeDesc;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.odds;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.probability;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.outcomeContext;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        String str3 = this.homeTeamName;
        String str4 = this.homeTeamLogo;
        String str5 = this.awayTeamName;
        String str6 = this.awayTeamLogo;
        String str7 = this.marketId;
        String str8 = this.marketTitle;
        String str9 = this.outcomeId;
        String str10 = this.outcomeDesc;
        String str11 = this.odds;
        String str12 = this.probability;
        String str13 = this.outcomeContext;
        StringBuilder sbA = ux5.a("NetworkBetslipRecommendationSelection(eventId=", str, ", leagueId=", str2, ", homeTeamName=");
        hxa.c(sbA, str3, ", homeTeamLogo=", str4, ", awayTeamName=");
        hxa.c(sbA, str5, ", awayTeamLogo=", str6, ", marketId=");
        hxa.c(sbA, str7, ", marketTitle=", str8, ", outcomeId=");
        hxa.c(sbA, str9, ", outcomeDesc=", str10, ", odds=");
        hxa.c(sbA, str11, ", probability=", str12, ", outcomeContext=");
        return uf80.a(sbA, str13, ")");
    }
}
