package com.sporty.android.core.model.recentcode;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ml5;
import defpackage.nrg0;
import defpackage.pr0;
import defpackage.qn4;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0092\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00105J\u0014\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010:\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016Ê\u0001\u0002\b=¨\u0006<"}, d2 = {"Lcom/sporty/android/core/model/recentcode/RecentShareCodeDetail;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "product", "", "homeTeamName", "awayTeamName", "startTime", "", "marketId", "marketDescription", "outcomeId", "outcomeDescription", "odds", "", "sportId", "tournamentId", "tournamentIcon", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getProduct", "()I", "getHomeTeamName", "getAwayTeamName", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMarketId", "getMarketDescription", "getOutcomeId", "getOutcomeDescription", "getOdds", "()D", "getSportId", "getTournamentId", "getTournamentIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILjava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/recentcode/RecentShareCodeDetail;", "equals", "", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecentShareCodeDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String awayTeamName;
    private final String eventId;
    private final String homeTeamName;
    private final String marketDescription;
    private final int marketId;
    private final double odds;
    private final String outcomeDescription;
    private final int outcomeId;
    private final int product;
    private final String sportId;
    private final Long startTime;
    private final String tournamentIcon;
    private final String tournamentId;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/recentcode/RecentShareCodeDetail$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/core/model/recentcode/RecentShareCodeDetail;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecentShareCodeDetail mock() {
            return new RecentShareCodeDetail("sr:match:24657612", 3, "Team C", "Team D", 1714032000000L, 1, "Win/Loss", 2, "Team D wins", 2.0d, "sr:sport:2", "sr:tournament:2", "");
        }

        private Companion() {
        }
    }

    public RecentShareCodeDetail(String str, int i, String str2, String str3, Long l, int i2, String str4, int i3, String str5, double d, String str6, String str7, String str8) {
        qn4.b(str, str2, str3, str4, str5);
        m.a(str6, str7, str8);
        this.eventId = str;
        this.product = i;
        this.homeTeamName = str2;
        this.awayTeamName = str3;
        this.startTime = l;
        this.marketId = i2;
        this.marketDescription = str4;
        this.outcomeId = i3;
        this.outcomeDescription = str5;
        this.odds = d;
        this.sportId = str6;
        this.tournamentId = str7;
        this.tournamentIcon = str8;
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

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
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

    public final RecentShareCodeDetail copy(String eventId, int product, String homeTeamName, String awayTeamName, Long startTime, int marketId, String marketDescription, int outcomeId, String outcomeDescription, double odds, String sportId, String tournamentId, String tournamentIcon) {
        qn4.b(eventId, homeTeamName, awayTeamName, marketDescription, outcomeDescription);
        sportId.getClass();
        tournamentId.getClass();
        tournamentIcon.getClass();
        return new RecentShareCodeDetail(eventId, product, homeTeamName, awayTeamName, startTime, marketId, marketDescription, outcomeId, outcomeDescription, odds, sportId, tournamentId, tournamentIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentShareCodeDetail)) {
            return false;
        }
        RecentShareCodeDetail recentShareCodeDetail = (RecentShareCodeDetail) other;
        return Intrinsics.g(this.eventId, recentShareCodeDetail.eventId) && this.product == recentShareCodeDetail.product && Intrinsics.g(this.homeTeamName, recentShareCodeDetail.homeTeamName) && Intrinsics.g(this.awayTeamName, recentShareCodeDetail.awayTeamName) && Intrinsics.g(this.startTime, recentShareCodeDetail.startTime) && this.marketId == recentShareCodeDetail.marketId && Intrinsics.g(this.marketDescription, recentShareCodeDetail.marketDescription) && this.outcomeId == recentShareCodeDetail.outcomeId && Intrinsics.g(this.outcomeDescription, recentShareCodeDetail.outcomeDescription) && Double.compare(this.odds, recentShareCodeDetail.odds) == 0 && Intrinsics.g(this.sportId, recentShareCodeDetail.sportId) && Intrinsics.g(this.tournamentId, recentShareCodeDetail.tournamentId) && Intrinsics.g(this.tournamentIcon, recentShareCodeDetail.tournamentIcon);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
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

    public final int getProduct() {
        return this.product;
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

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gpp.a(this.product, this.eventId.hashCode() * 31, 31), 31, this.homeTeamName), 31, this.awayTeamName);
        Long l = this.startTime;
        return this.tournamentIcon.hashCode() + gmf0.a(gmf0.a(nrg0.a(gmf0.a(gpp.a(this.outcomeId, gmf0.a(gpp.a(this.marketId, (iA + (l == null ? 0 : l.hashCode())) * 31, 31), 31, this.marketDescription), 31), 31, this.outcomeDescription), 31, this.odds), 31, this.sportId), 31, this.tournamentId);
    }

    public String toString() {
        String str = this.eventId;
        int i = this.product;
        String str2 = this.homeTeamName;
        String str3 = this.awayTeamName;
        Long l = this.startTime;
        int i2 = this.marketId;
        String str4 = this.marketDescription;
        int i3 = this.outcomeId;
        String str5 = this.outcomeDescription;
        double d = this.odds;
        String str6 = this.sportId;
        String str7 = this.tournamentId;
        String str8 = this.tournamentIcon;
        StringBuilder sbA = ml5.a(i, "RecentShareCodeDetail(eventId=", str, ", product=", ", homeTeamName=");
        hxa.c(sbA, str2, ", awayTeamName=", str3, ", startTime=");
        sbA.append(l);
        sbA.append(OdQr.BFAtydXWBXNLd);
        sbA.append(i2);
        sbA.append(", marketDescription=");
        wxa.b(i3, str4, ", outcomeId=", ", outcomeDescription=", sbA);
        sbA.append(str5);
        sbA.append(", odds=");
        sbA.append(d);
        hxa.c(sbA, ", sportId=", str6, ", tournamentId=", str7);
        return pr0.a(sbA, ", tournamentIcon=", str8, ")");
    }
}
