package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.fwv;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.pr0;
import defpackage.qn4;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010=\u001a\u00020\nHÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017Ê\u0001\u0002\b@Ê\u0001\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0002¨\u0006?"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocShareCodeDetail;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "startTime", "", "endTime", "homeTeamName", "awayTeamName", "marketId", "", "marketDescription", "outcomeId", "outcomeDescription", "odds", "", "sportId", "tournamentId", "tournamentIcon", "tournamentName", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getStartTime", "()J", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHomeTeamName", "getAwayTeamName", "getMarketId", "()I", "getMarketDescription", "getOutcomeId", "getOutcomeDescription", "getOdds", "()D", "getSportId", "getTournamentId", "getTournamentIcon", "getTournamentName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/android/social/data/remote/entity/SocShareCodeDetail;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocShareCodeDetail {
    public static final int $stable = 0;
    private final String awayTeamName;
    private final Long endTime;
    private final String eventId;
    private final String homeTeamName;
    private final String marketDescription;
    private final int marketId;
    private final double odds;
    private final String outcomeDescription;
    private final int outcomeId;
    private final String sportId;
    private final long startTime;
    private final String tournamentIcon;
    private final String tournamentId;
    private final String tournamentName;

    public /* synthetic */ SocShareCodeDetail(String str, long j, Long l, String str2, String str3, int i, String str4, int i2, String str5, double d, String str6, String str7, String str8, String str9, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i3 & 4) != 0 ? null : l, str2, str3, i, str4, i2, str5, d, str6, str7, (i3 & 4096) != 0 ? null : str8, (i3 & 8192) != 0 ? "" : str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getOdds() {
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
    public final long getStartTime() {
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
    public final int getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketDescription() {
        return this.marketDescription;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final SocShareCodeDetail copy(String eventId, long startTime, Long endTime, String homeTeamName, String awayTeamName, int marketId, String marketDescription, int outcomeId, String outcomeDescription, double odds, String sportId, String tournamentId, String tournamentIcon, String tournamentName) {
        qn4.b(eventId, homeTeamName, awayTeamName, marketDescription, outcomeDescription);
        sportId.getClass();
        return new SocShareCodeDetail(eventId, startTime, endTime, homeTeamName, awayTeamName, marketId, marketDescription, outcomeId, outcomeDescription, odds, sportId, tournamentId, tournamentIcon, tournamentName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocShareCodeDetail)) {
            return false;
        }
        SocShareCodeDetail socShareCodeDetail = (SocShareCodeDetail) other;
        return Intrinsics.g(this.eventId, socShareCodeDetail.eventId) && this.startTime == socShareCodeDetail.startTime && Intrinsics.g(this.endTime, socShareCodeDetail.endTime) && Intrinsics.g(this.homeTeamName, socShareCodeDetail.homeTeamName) && Intrinsics.g(this.awayTeamName, socShareCodeDetail.awayTeamName) && this.marketId == socShareCodeDetail.marketId && Intrinsics.g(this.marketDescription, socShareCodeDetail.marketDescription) && this.outcomeId == socShareCodeDetail.outcomeId && Intrinsics.g(this.outcomeDescription, socShareCodeDetail.outcomeDescription) && Double.compare(this.odds, socShareCodeDetail.odds) == 0 && Intrinsics.g(this.sportId, socShareCodeDetail.sportId) && Intrinsics.g(this.tournamentId, socShareCodeDetail.tournamentId) && Intrinsics.g(this.tournamentIcon, socShareCodeDetail.tournamentIcon) && Intrinsics.g(this.tournamentName, socShareCodeDetail.tournamentName);
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

    public final int getMarketId() {
        return this.marketId;
    }

    public final double getOdds() {
        return this.odds;
    }

    public final String getOutcomeDescription() {
        return this.outcomeDescription;
    }

    public final int getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final long getStartTime() {
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
        int iA = f87.a(this.eventId.hashCode() * 31, this.startTime, 31);
        Long l = this.endTime;
        int iA2 = gmf0.a(nrg0.a(gmf0.a(gpp.a(this.outcomeId, gmf0.a(gpp.a(this.marketId, gmf0.a(gmf0.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.homeTeamName), 31, this.awayTeamName), 31), 31, this.marketDescription), 31), 31, this.outcomeDescription), 31, this.odds), 31, this.sportId);
        String str = this.tournamentId;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tournamentIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tournamentName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        long j = this.startTime;
        Long l = this.endTime;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamName;
        int i = this.marketId;
        String str4 = this.marketDescription;
        int i2 = this.outcomeId;
        String str5 = this.outcomeDescription;
        double d = this.odds;
        String str6 = this.sportId;
        String str7 = this.tournamentId;
        String str8 = this.tournamentIcon;
        String str9 = this.tournamentName;
        StringBuilder sbA = x.a(j, "SocShareCodeDetail(eventId=", str, ", startTime=");
        sbA.append(", endTime=");
        sbA.append(l);
        sbA.append(", homeTeamName=");
        sbA.append(str2);
        sbA.append(", awayTeamName=");
        sbA.append(str3);
        sbA.append(", marketId=");
        sbA.append(i);
        sbA.append(", marketDescription=");
        sbA.append(str4);
        sbA.append(", outcomeId=");
        sbA.append(i2);
        u4.a(sbA, ", outcomeDescription=", str5, ", odds=");
        fwv.a(d, ", sportId=", str6, sbA);
        hxa.c(sbA, ", tournamentId=", str7, ", tournamentIcon=", str8);
        return pr0.a(sbA, ", tournamentName=", str9, ")");
    }

    public SocShareCodeDetail(String str, long j, Long l, String str2, String str3, int i, String str4, int i2, String str5, double d, String str6, String str7, String str8, String str9) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.eventId = str;
        this.startTime = j;
        this.endTime = l;
        this.homeTeamName = str2;
        this.awayTeamName = str3;
        this.marketId = i;
        this.marketDescription = str4;
        this.outcomeId = i2;
        this.outcomeDescription = str5;
        this.odds = d;
        this.sportId = str6;
        this.tournamentId = str7;
        this.tournamentIcon = str8;
        this.tournamentName = str9;
    }
}
