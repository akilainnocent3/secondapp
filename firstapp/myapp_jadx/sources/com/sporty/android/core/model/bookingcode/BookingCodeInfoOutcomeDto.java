package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ry4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¶\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020>HÖ\u0081\u0004J\n\u0010?\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R)\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016Ê\u0001\u0002\bA¨\u0006@"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoOutcomeDto;", "", "awayTeamName", "", "endTime", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "homeTeamName", "marketDescription", "marketId", "odds", "", "outcomeDescription", "outcomeId", "sportId", "startTime", "tournamentIcon", "homeTeamIcon", "awayTeamIcon", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAwayTeamName", "()Ljava/lang/String;", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEventId", "getHomeTeamName", "getMarketDescription", "getMarketId", "getOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOutcomeDescription", "getOutcomeId", "getSportId", "getStartTime", "getTournamentIcon", "getHomeTeamIcon", "getAwayTeamIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/bookingcode/BookingCodeInfoOutcomeDto;", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BookingCodeInfoOutcomeDto {
    private final String awayTeamIcon;
    private final String awayTeamName;

    @SerializedName("endTime")
    private final Long endTime;
    private final String eventId;
    private final String homeTeamIcon;
    private final String homeTeamName;
    private final String marketDescription;
    private final String marketId;
    private final Double odds;
    private final String outcomeDescription;
    private final String outcomeId;
    private final String sportId;

    @SerializedName("startTime")
    private final Long startTime;
    private final String tournamentIcon;

    public /* synthetic */ BookingCodeInfoOutcomeDto(String str, Long l, String str2, String str3, String str4, String str5, Double d, String str6, String str7, String str8, Long l2, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2, str3, str4, str5, d, str6, str7, str8, l2, str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketDescription() {
        return this.marketDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final BookingCodeInfoOutcomeDto copy(String awayTeamName, Long endTime, String eventId, String homeTeamName, String marketDescription, String marketId, Double odds, String outcomeDescription, String outcomeId, String sportId, Long startTime, String tournamentIcon, String homeTeamIcon, String awayTeamIcon) {
        return new BookingCodeInfoOutcomeDto(awayTeamName, endTime, eventId, homeTeamName, marketDescription, marketId, odds, outcomeDescription, outcomeId, sportId, startTime, tournamentIcon, homeTeamIcon, awayTeamIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookingCodeInfoOutcomeDto)) {
            return false;
        }
        BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto = (BookingCodeInfoOutcomeDto) other;
        return Intrinsics.g(this.awayTeamName, bookingCodeInfoOutcomeDto.awayTeamName) && Intrinsics.g(this.endTime, bookingCodeInfoOutcomeDto.endTime) && Intrinsics.g(this.eventId, bookingCodeInfoOutcomeDto.eventId) && Intrinsics.g(this.homeTeamName, bookingCodeInfoOutcomeDto.homeTeamName) && Intrinsics.g(this.marketDescription, bookingCodeInfoOutcomeDto.marketDescription) && Intrinsics.g(this.marketId, bookingCodeInfoOutcomeDto.marketId) && Intrinsics.g(this.odds, bookingCodeInfoOutcomeDto.odds) && Intrinsics.g(this.outcomeDescription, bookingCodeInfoOutcomeDto.outcomeDescription) && Intrinsics.g(this.outcomeId, bookingCodeInfoOutcomeDto.outcomeId) && Intrinsics.g(this.sportId, bookingCodeInfoOutcomeDto.sportId) && Intrinsics.g(this.startTime, bookingCodeInfoOutcomeDto.startTime) && Intrinsics.g(this.tournamentIcon, bookingCodeInfoOutcomeDto.tournamentIcon) && Intrinsics.g(this.homeTeamIcon, bookingCodeInfoOutcomeDto.homeTeamIcon) && Intrinsics.g(this.awayTeamIcon, bookingCodeInfoOutcomeDto.awayTeamIcon);
    }

    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
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

    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getMarketDescription() {
        return this.marketDescription;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final Double getOdds() {
        return this.odds;
    }

    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final String getOutcomeId() {
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

    public int hashCode() {
        String str = this.awayTeamName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.endTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.eventId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketDescription;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d = this.odds;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str6 = this.outcomeDescription;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.outcomeId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sportId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l2 = this.startTime;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str9 = this.tournamentIcon;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.homeTeamIcon;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.awayTeamIcon;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.awayTeamName;
        Long l = this.endTime;
        String str2 = this.eventId;
        String str3 = this.homeTeamName;
        String str4 = this.marketDescription;
        String str5 = this.marketId;
        Double d = this.odds;
        String str6 = this.outcomeDescription;
        String str7 = this.outcomeId;
        String str8 = this.sportId;
        Long l2 = this.startTime;
        String str9 = this.tournamentIcon;
        String str10 = this.homeTeamIcon;
        String str11 = this.awayTeamIcon;
        StringBuilder sb = new StringBuilder("BookingCodeInfoOutcomeDto(awayTeamName=");
        sb.append(str);
        sb.append(", endTime=");
        sb.append(l);
        sb.append(", eventId=");
        hxa.c(sb, str2, ", homeTeamName=", str3, ", marketDescription=");
        hxa.c(sb, str4, ", marketId=", str5, ", odds=");
        ry4.a(d, ", outcomeDescription=", str6, ", outcomeId=", sb);
        hxa.c(sb, str7, ", sportId=", str8, ", startTime=");
        sb.append(l2);
        sb.append(", tournamentIcon=");
        sb.append(str9);
        sb.append(", homeTeamIcon=");
        return kwi.a(sb, str10, ", awayTeamIcon=", str11, ")");
    }

    public BookingCodeInfoOutcomeDto(String str, Long l, String str2, String str3, String str4, String str5, Double d, String str6, String str7, String str8, Long l2, String str9, String str10, String str11) {
        this.awayTeamName = str;
        this.endTime = l;
        this.eventId = str2;
        this.homeTeamName = str3;
        this.marketDescription = str4;
        this.marketId = str5;
        this.odds = d;
        this.outcomeDescription = str6;
        this.outcomeId = str7;
        this.sportId = str8;
        this.startTime = l2;
        this.tournamentIcon = str9;
        this.homeTeamIcon = str10;
        this.awayTeamIcon = str11;
    }
}
