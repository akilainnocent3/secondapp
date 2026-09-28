package com.sportybet.android.social.data.remote.entity;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.k800;
import defpackage.kwi;
import defpackage.oie;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0014\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\nHÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R)\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R)\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b$\u0010!R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R)\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R'\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R'\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017Ê\u0001\u0002\bCÊ\u0001\f\bD\u0012\b\bE\u0012\u0004\b\u0003\u0010\u0002¨\u0006B"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeDetail;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "startTime", "", "endTime", "homeTeamName", "awayTeamName", "marketId", "", "marketDescription", "outcomeId", "outcomeDescription", "odds", "", "sportId", "tournamentId", "tournamentIcon", "tournamentName", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getHomeTeamName", "getAwayTeamName", "getMarketId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarketDescription", "getOutcomeId", "getOutcomeDescription", "getOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSportId", "getTournamentId", "getTournamentIcon", "getTournamentName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeDetail;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialSuggestedCodeDetail {
    public static final int $stable = 0;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("endTime")
    private final Long endTime;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("marketDescription")
    private final String marketDescription;

    @SerializedName("marketId")
    private final Integer marketId;

    @SerializedName("odds")
    private final Double odds;

    @SerializedName("outcomeDescription")
    private final String outcomeDescription;

    @SerializedName("outcomeId")
    private final Integer outcomeId;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("startTime")
    private final Long startTime;

    @SerializedName("tournamentIcon")
    private final String tournamentIcon;

    @SerializedName("tournamentId")
    private final String tournamentId;

    @SerializedName("tournamentName")
    private final String tournamentName;

    public /* synthetic */ SocialSuggestedCodeDetail(String str, Long l, Long l2, String str2, String str3, Integer num, String str4, Integer num2, String str5, Double d, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : d, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketDescription() {
        return this.marketDescription;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final SocialSuggestedCodeDetail copy(String eventId, Long startTime, Long endTime, String homeTeamName, String awayTeamName, Integer marketId, String marketDescription, Integer outcomeId, String outcomeDescription, Double odds, String sportId, String tournamentId, String tournamentIcon, String tournamentName) {
        return new SocialSuggestedCodeDetail(eventId, startTime, endTime, homeTeamName, awayTeamName, marketId, marketDescription, outcomeId, outcomeDescription, odds, sportId, tournamentId, tournamentIcon, tournamentName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSuggestedCodeDetail)) {
            return false;
        }
        SocialSuggestedCodeDetail socialSuggestedCodeDetail = (SocialSuggestedCodeDetail) other;
        return Intrinsics.g(this.eventId, socialSuggestedCodeDetail.eventId) && Intrinsics.g(this.startTime, socialSuggestedCodeDetail.startTime) && Intrinsics.g(this.endTime, socialSuggestedCodeDetail.endTime) && Intrinsics.g(this.homeTeamName, socialSuggestedCodeDetail.homeTeamName) && Intrinsics.g(this.awayTeamName, socialSuggestedCodeDetail.awayTeamName) && Intrinsics.g(this.marketId, socialSuggestedCodeDetail.marketId) && Intrinsics.g(this.marketDescription, socialSuggestedCodeDetail.marketDescription) && Intrinsics.g(this.outcomeId, socialSuggestedCodeDetail.outcomeId) && Intrinsics.g(this.outcomeDescription, socialSuggestedCodeDetail.outcomeDescription) && Intrinsics.g(this.odds, socialSuggestedCodeDetail.odds) && Intrinsics.g(this.sportId, socialSuggestedCodeDetail.sportId) && Intrinsics.g(this.tournamentId, socialSuggestedCodeDetail.tournamentId) && Intrinsics.g(this.tournamentIcon, socialSuggestedCodeDetail.tournamentIcon) && Intrinsics.g(this.tournamentName, socialSuggestedCodeDetail.tournamentName);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getMarketDescription() {
        return this.marketDescription;
    }

    public final Integer getMarketId() {
        return this.marketId;
    }

    public final Double getOdds() {
        return this.odds;
    }

    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final Integer getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getTournamentIcon() {
        return this.tournamentIcon;
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
        Long l = this.startTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.homeTeamName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awayTeamName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.marketId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.marketDescription;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.outcomeId;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.outcomeDescription;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.odds;
        int iHashCode10 = (iHashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        String str6 = this.sportId;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tournamentId;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tournamentIcon;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tournamentName;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        Long l = this.startTime;
        Long l2 = this.endTime;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamName;
        Integer num = this.marketId;
        String str4 = this.marketDescription;
        Integer num2 = this.outcomeId;
        String str5 = this.outcomeDescription;
        Double d = this.odds;
        String str6 = this.sportId;
        String str7 = this.tournamentId;
        String str8 = this.tournamentIcon;
        String str9 = this.tournamentName;
        StringBuilder sb = new StringBuilder("SocialSuggestedCodeDetail(eventId=");
        sb.append(str);
        sb.append(", startTime=");
        sb.append(l);
        sb.append(", endTime=");
        sb.append(l2);
        sb.append(", homeTeamName=");
        sb.append(str2);
        sb.append(", awayTeamName=");
        oie.a(num, str3, ", marketId=", ", marketDescription=", sb);
        oie.a(num2, str4, ", outcomeId=", ", outcomeDescription=", sb);
        k800.a(d, str5, ", odds=", ", sportId=", sb);
        hxa.c(sb, str6, ", tournamentId=", str7, ", tournamentIcon=");
        return kwi.a(sb, str8, ", tournamentName=", str9, ")");
    }

    public SocialSuggestedCodeDetail(String str, Long l, Long l2, String str2, String str3, Integer num, String str4, Integer num2, String str5, Double d, String str6, String str7, String str8, String str9) {
        this.eventId = str;
        this.startTime = l;
        this.endTime = l2;
        this.homeTeamName = str2;
        this.awayTeamName = str3;
        this.marketId = num;
        this.marketDescription = str4;
        this.outcomeId = num2;
        this.outcomeDescription = str5;
        this.odds = d;
        this.sportId = str6;
        this.tournamentId = str7;
        this.tournamentIcon = str8;
        this.tournamentName = str9;
    }

    public SocialSuggestedCodeDetail() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
