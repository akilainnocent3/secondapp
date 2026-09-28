package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jª\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00108J\u0014\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)Ê\u0001\u0002\b?¨\u0006>"}, d2 = {"Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendation;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "estimateStartTime", "", AnalyticsParam.EVENT_STATUS, "", "matchStatus", "homeTeamName", "homeTeamId", "awayTeamName", "awayTeamId", "sportId", "categoryId", "tournamentId", "tournamentName", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEstimateStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatchStatus", "getHomeTeamName", "getHomeTeamId", "getAwayTeamName", "getAwayTeamId", "getSportId", "getCategoryId", "getTournamentId", "getTournamentName", "getMarket", "()Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;)Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendation;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SingleBetCashoutRecommendation {

    @SerializedName("awayTeamId")
    private final String awayTeamId;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("categoryId")
    private final String categoryId;

    @SerializedName("estimateStartTime")
    private final Long estimateStartTime;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamId")
    private final String homeTeamId;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName(AnalyticsParam.MARKET_PARAM_MARKET)
    private final SingleBetCashoutRecommendationMarket market;

    @SerializedName("matchStatus")
    private final String matchStatus;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    @SerializedName("tournamentId")
    private final String tournamentId;

    @SerializedName("tournamentName")
    private final String tournamentName;

    public SingleBetCashoutRecommendation(String str, Long l, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket) {
        this.eventId = str;
        this.estimateStartTime = l;
        this.status = num;
        this.matchStatus = str2;
        this.homeTeamName = str3;
        this.homeTeamId = str4;
        this.awayTeamName = str5;
        this.awayTeamId = str6;
        this.sportId = str7;
        this.categoryId = str8;
        this.tournamentId = str9;
        this.tournamentName = str10;
        this.market = singleBetCashoutRecommendationMarket;
    }

    public static /* synthetic */ SingleBetCashoutRecommendation copy$default(SingleBetCashoutRecommendation singleBetCashoutRecommendation, String str, Long l, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleBetCashoutRecommendation.eventId;
        }
        return singleBetCashoutRecommendation.copy(str, (i & 2) != 0 ? singleBetCashoutRecommendation.estimateStartTime : l, (i & 4) != 0 ? singleBetCashoutRecommendation.status : num, (i & 8) != 0 ? singleBetCashoutRecommendation.matchStatus : str2, (i & 16) != 0 ? singleBetCashoutRecommendation.homeTeamName : str3, (i & 32) != 0 ? singleBetCashoutRecommendation.homeTeamId : str4, (i & 64) != 0 ? singleBetCashoutRecommendation.awayTeamName : str5, (i & 128) != 0 ? singleBetCashoutRecommendation.awayTeamId : str6, (i & 256) != 0 ? singleBetCashoutRecommendation.sportId : str7, (i & 512) != 0 ? singleBetCashoutRecommendation.categoryId : str8, (i & 1024) != 0 ? singleBetCashoutRecommendation.tournamentId : str9, (i & 2048) != 0 ? singleBetCashoutRecommendation.tournamentName : str10, (i & 4096) != 0 ? singleBetCashoutRecommendation.market : singleBetCashoutRecommendationMarket);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SingleBetCashoutRecommendationMarket getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMatchStatus() {
        return this.matchStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final SingleBetCashoutRecommendation copy(String eventId, Long estimateStartTime, Integer status, String matchStatus, String homeTeamName, String homeTeamId, String awayTeamName, String awayTeamId, String sportId, String categoryId, String tournamentId, String tournamentName, SingleBetCashoutRecommendationMarket market) {
        return new SingleBetCashoutRecommendation(eventId, estimateStartTime, status, matchStatus, homeTeamName, homeTeamId, awayTeamName, awayTeamId, sportId, categoryId, tournamentId, tournamentName, market);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleBetCashoutRecommendation)) {
            return false;
        }
        SingleBetCashoutRecommendation singleBetCashoutRecommendation = (SingleBetCashoutRecommendation) other;
        return Intrinsics.g(this.eventId, singleBetCashoutRecommendation.eventId) && Intrinsics.g(this.estimateStartTime, singleBetCashoutRecommendation.estimateStartTime) && Intrinsics.g(this.status, singleBetCashoutRecommendation.status) && Intrinsics.g(this.matchStatus, singleBetCashoutRecommendation.matchStatus) && Intrinsics.g(this.homeTeamName, singleBetCashoutRecommendation.homeTeamName) && Intrinsics.g(this.homeTeamId, singleBetCashoutRecommendation.homeTeamId) && Intrinsics.g(this.awayTeamName, singleBetCashoutRecommendation.awayTeamName) && Intrinsics.g(this.awayTeamId, singleBetCashoutRecommendation.awayTeamId) && Intrinsics.g(this.sportId, singleBetCashoutRecommendation.sportId) && Intrinsics.g(this.categoryId, singleBetCashoutRecommendation.categoryId) && Intrinsics.g(this.tournamentId, singleBetCashoutRecommendation.tournamentId) && Intrinsics.g(this.tournamentName, singleBetCashoutRecommendation.tournamentName) && Intrinsics.g(this.market, singleBetCashoutRecommendation.market);
    }

    public final String getAwayTeamId() {
        return this.awayTeamId;
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamId() {
        return this.homeTeamId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final SingleBetCashoutRecommendationMarket getMarket() {
        return this.market;
    }

    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.estimateStartTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.matchStatus;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awayTeamName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awayTeamId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sportId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.categoryId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tournamentId;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tournamentName;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket = this.market;
        return iHashCode12 + (singleBetCashoutRecommendationMarket != null ? singleBetCashoutRecommendationMarket.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        Long l = this.estimateStartTime;
        Integer num = this.status;
        String str2 = this.matchStatus;
        String str3 = this.homeTeamName;
        String str4 = this.homeTeamId;
        String str5 = this.awayTeamName;
        String str6 = this.awayTeamId;
        String str7 = this.sportId;
        String str8 = this.categoryId;
        String str9 = this.tournamentId;
        String str10 = this.tournamentName;
        SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket = this.market;
        StringBuilder sb = new StringBuilder("SingleBetCashoutRecommendation(eventId=");
        sb.append(str);
        sb.append(", estimateStartTime=");
        sb.append(l);
        sb.append(", status=");
        w03.a(num, ", matchStatus=", str2, ", homeTeamName=", sb);
        hxa.c(sb, str3, ", homeTeamId=", str4, ", awayTeamName=");
        hxa.c(sb, str5, ", awayTeamId=", str6, ", sportId=");
        hxa.c(sb, str7, ", categoryId=", str8, ", tournamentId=");
        hxa.c(sb, str9, ", tournamentName=", str10, ", market=");
        sb.append(singleBetCashoutRecommendationMarket);
        sb.append(")");
        return sb.toString();
    }
}
