package com.sporty.android.core.model.remixbet;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.rg2;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$Jª\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u000208HÖ\u0081\u0004J\n\u00109\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$Ê\u0001\u0002\b;¨\u0006:"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixBetSelectionRequest;", "", AnalyticsParam.EVENT_PARAM_ID, "", "jointId", "gameId", "outcomeId", "odds", "marketDesc", "outcomeDesc", "home", "away", "categoryId", "tournamentId", "startTime", "", "bgEvent", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getJointId", "getGameId", "getOutcomeId", "getOdds", "getMarketDesc", "getOutcomeDesc", "getHome", "getAway", "getCategoryId", "getTournamentId", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBgEvent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/remixbet/RemixBetSelectionRequest;", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBetSelectionRequest {
    private final String away;
    private final Boolean bgEvent;
    private final String categoryId;
    private final String gameId;
    private final String home;
    private final String id;
    private final String jointId;
    private final String marketDesc;
    private final String odds;
    private final String outcomeDesc;
    private final String outcomeId;
    private final Long startTime;
    private final String tournamentId;

    public RemixBetSelectionRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Boolean bool) {
        this.id = str;
        this.jointId = str2;
        this.gameId = str3;
        this.outcomeId = str4;
        this.odds = str5;
        this.marketDesc = str6;
        this.outcomeDesc = str7;
        this.home = str8;
        this.away = str9;
        this.categoryId = str10;
        this.tournamentId = str11;
        this.startTime = l;
        this.bgEvent = bool;
    }

    public static /* synthetic */ RemixBetSelectionRequest copy$default(RemixBetSelectionRequest remixBetSelectionRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remixBetSelectionRequest.id;
        }
        return remixBetSelectionRequest.copy(str, (i & 2) != 0 ? remixBetSelectionRequest.jointId : str2, (i & 4) != 0 ? remixBetSelectionRequest.gameId : str3, (i & 8) != 0 ? remixBetSelectionRequest.outcomeId : str4, (i & 16) != 0 ? remixBetSelectionRequest.odds : str5, (i & 32) != 0 ? remixBetSelectionRequest.marketDesc : str6, (i & 64) != 0 ? remixBetSelectionRequest.outcomeDesc : str7, (i & 128) != 0 ? remixBetSelectionRequest.home : str8, (i & 256) != 0 ? remixBetSelectionRequest.away : str9, (i & 512) != 0 ? remixBetSelectionRequest.categoryId : str10, (i & 1024) != 0 ? remixBetSelectionRequest.tournamentId : str11, (i & 2048) != 0 ? remixBetSelectionRequest.startTime : l, (i & 4096) != 0 ? remixBetSelectionRequest.bgEvent : bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getBgEvent() {
        return this.bgEvent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJointId() {
        return this.jointId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketDesc() {
        return this.marketDesc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAway() {
        return this.away;
    }

    public final RemixBetSelectionRequest copy(String id, String jointId, String gameId, String outcomeId, String odds, String marketDesc, String outcomeDesc, String home, String away, String categoryId, String tournamentId, Long startTime, Boolean bgEvent) {
        return new RemixBetSelectionRequest(id, jointId, gameId, outcomeId, odds, marketDesc, outcomeDesc, home, away, categoryId, tournamentId, startTime, bgEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixBetSelectionRequest)) {
            return false;
        }
        RemixBetSelectionRequest remixBetSelectionRequest = (RemixBetSelectionRequest) other;
        return Intrinsics.g(this.id, remixBetSelectionRequest.id) && Intrinsics.g(this.jointId, remixBetSelectionRequest.jointId) && Intrinsics.g(this.gameId, remixBetSelectionRequest.gameId) && Intrinsics.g(this.outcomeId, remixBetSelectionRequest.outcomeId) && Intrinsics.g(this.odds, remixBetSelectionRequest.odds) && Intrinsics.g(this.marketDesc, remixBetSelectionRequest.marketDesc) && Intrinsics.g(this.outcomeDesc, remixBetSelectionRequest.outcomeDesc) && Intrinsics.g(this.home, remixBetSelectionRequest.home) && Intrinsics.g(this.away, remixBetSelectionRequest.away) && Intrinsics.g(this.categoryId, remixBetSelectionRequest.categoryId) && Intrinsics.g(this.tournamentId, remixBetSelectionRequest.tournamentId) && Intrinsics.g(this.startTime, remixBetSelectionRequest.startTime) && Intrinsics.g(this.bgEvent, remixBetSelectionRequest.bgEvent);
    }

    public final String getAway() {
        return this.away;
    }

    public final Boolean getBgEvent() {
        return this.bgEvent;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJointId() {
        return this.jointId;
    }

    public final String getMarketDesc() {
        return this.marketDesc;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jointId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gameId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.outcomeId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.odds;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.marketDesc;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.outcomeDesc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.home;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.away;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.categoryId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tournamentId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.bgEvent;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.jointId;
        String str3 = this.gameId;
        String str4 = this.outcomeId;
        String str5 = this.odds;
        String str6 = this.marketDesc;
        String str7 = this.outcomeDesc;
        String str8 = this.home;
        String str9 = this.away;
        String str10 = this.categoryId;
        String str11 = this.tournamentId;
        Long l = this.startTime;
        Boolean bool = this.bgEvent;
        StringBuilder sbA = ux5.a("RemixBetSelectionRequest(id=", str, ", jointId=", str2, ", gameId=");
        hxa.c(sbA, str3, ", outcomeId=", str4, ", odds=");
        hxa.c(sbA, str5, ", marketDesc=", str6, ", outcomeDesc=");
        hxa.c(sbA, str7, ", home=", str8, ", away=");
        hxa.c(sbA, str9, ", categoryId=", str10, ", tournamentId=");
        sbA.append(str11);
        sbA.append(", startTime=");
        sbA.append(l);
        sbA.append(", bgEvent=");
        return rg2.a(sbA, bool, ")");
    }
}
