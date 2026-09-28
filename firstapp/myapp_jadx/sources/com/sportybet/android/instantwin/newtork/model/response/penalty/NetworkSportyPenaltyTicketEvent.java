package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020:HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015Ê\u0001\f\b=\u0012\b\b>\u0012\u0004\b\u0003\u0010\u0002¨\u0006<"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyTicketEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "leagueUrl", "leagueName", "homeTeamName", "homeTeamLogo", "homeTeamBaseColor", "homeTeamSleeveColor", "awayTeamName", "awayTeamLogo", "awayTeamBaseColor", "awayTeamSleeveColor", "homeTeamScore", "awayTeamScore", "resultSequence", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getLeagueUrl", "getLeagueName", "getHomeTeamName", "getHomeTeamLogo", "getHomeTeamBaseColor", "getHomeTeamSleeveColor", "getAwayTeamName", "getAwayTeamLogo", "getAwayTeamBaseColor", "getAwayTeamSleeveColor", "getHomeTeamScore", "getAwayTeamScore", "getResultSequence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyTicketEvent {
    public static final int $stable = 0;

    @SerializedName("awayTeamBaseColor")
    private final String awayTeamBaseColor;

    @SerializedName("awayTeamLogo")
    private final String awayTeamLogo;

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("awayTeamScore")
    private final String awayTeamScore;

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
    private final String homeTeamScore;

    @SerializedName("homeTeamSleeveColor")
    private final String homeTeamSleeveColor;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("leagueUrl")
    private final String leagueUrl;

    @SerializedName("resultSequence")
    private final String resultSequence;

    public NetworkSportyPenaltyTicketEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.eventId = str;
        this.leagueId = str2;
        this.leagueUrl = str3;
        this.leagueName = str4;
        this.homeTeamName = str5;
        this.homeTeamLogo = str6;
        this.homeTeamBaseColor = str7;
        this.homeTeamSleeveColor = str8;
        this.awayTeamName = str9;
        this.awayTeamLogo = str10;
        this.awayTeamBaseColor = str11;
        this.awayTeamSleeveColor = str12;
        this.homeTeamScore = str13;
        this.awayTeamScore = str14;
        this.resultSequence = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAwayTeamBaseColor() {
        return this.awayTeamBaseColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAwayTeamSleeveColor() {
        return this.awayTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAwayTeamScore() {
        return this.awayTeamScore;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeagueUrl() {
        return this.leagueUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHomeTeamBaseColor() {
        return this.homeTeamBaseColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final NetworkSportyPenaltyTicketEvent copy(String eventId, String leagueId, String leagueUrl, String leagueName, String homeTeamName, String homeTeamLogo, String homeTeamBaseColor, String homeTeamSleeveColor, String awayTeamName, String awayTeamLogo, String awayTeamBaseColor, String awayTeamSleeveColor, String homeTeamScore, String awayTeamScore, String resultSequence) {
        return new NetworkSportyPenaltyTicketEvent(eventId, leagueId, leagueUrl, leagueName, homeTeamName, homeTeamLogo, homeTeamBaseColor, homeTeamSleeveColor, awayTeamName, awayTeamLogo, awayTeamBaseColor, awayTeamSleeveColor, homeTeamScore, awayTeamScore, resultSequence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltyTicketEvent)) {
            return false;
        }
        NetworkSportyPenaltyTicketEvent networkSportyPenaltyTicketEvent = (NetworkSportyPenaltyTicketEvent) other;
        return Intrinsics.g(this.eventId, networkSportyPenaltyTicketEvent.eventId) && Intrinsics.g(this.leagueId, networkSportyPenaltyTicketEvent.leagueId) && Intrinsics.g(this.leagueUrl, networkSportyPenaltyTicketEvent.leagueUrl) && Intrinsics.g(this.leagueName, networkSportyPenaltyTicketEvent.leagueName) && Intrinsics.g(this.homeTeamName, networkSportyPenaltyTicketEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogo, networkSportyPenaltyTicketEvent.homeTeamLogo) && Intrinsics.g(this.homeTeamBaseColor, networkSportyPenaltyTicketEvent.homeTeamBaseColor) && Intrinsics.g(this.homeTeamSleeveColor, networkSportyPenaltyTicketEvent.homeTeamSleeveColor) && Intrinsics.g(this.awayTeamName, networkSportyPenaltyTicketEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogo, networkSportyPenaltyTicketEvent.awayTeamLogo) && Intrinsics.g(this.awayTeamBaseColor, networkSportyPenaltyTicketEvent.awayTeamBaseColor) && Intrinsics.g(this.awayTeamSleeveColor, networkSportyPenaltyTicketEvent.awayTeamSleeveColor) && Intrinsics.g(this.homeTeamScore, networkSportyPenaltyTicketEvent.homeTeamScore) && Intrinsics.g(this.awayTeamScore, networkSportyPenaltyTicketEvent.awayTeamScore) && Intrinsics.g(this.resultSequence, networkSportyPenaltyTicketEvent.resultSequence);
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

    public final String getAwayTeamScore() {
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

    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final String getLeagueUrl() {
        return this.leagueUrl;
    }

    public final String getResultSequence() {
        return this.resultSequence;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leagueUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leagueName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.homeTeamName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.homeTeamLogo;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.homeTeamBaseColor;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.homeTeamSleeveColor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.awayTeamName;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.awayTeamLogo;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.awayTeamBaseColor;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.awayTeamSleeveColor;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.homeTeamScore;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.awayTeamScore;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.resultSequence;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        String str3 = this.leagueUrl;
        String str4 = this.leagueName;
        String str5 = this.homeTeamName;
        String str6 = this.homeTeamLogo;
        String str7 = this.homeTeamBaseColor;
        String str8 = this.homeTeamSleeveColor;
        String str9 = this.awayTeamName;
        String str10 = this.awayTeamLogo;
        String str11 = this.awayTeamBaseColor;
        String str12 = this.awayTeamSleeveColor;
        String str13 = this.homeTeamScore;
        String str14 = this.awayTeamScore;
        String str15 = this.resultSequence;
        StringBuilder sbA = ux5.a("NetworkSportyPenaltyTicketEvent(eventId=", str, ", leagueId=", str2, ", leagueUrl=");
        hxa.c(sbA, str3, ", leagueName=", str4, ", homeTeamName=");
        hxa.c(sbA, str5, ", homeTeamLogo=", str6, ", homeTeamBaseColor=");
        hxa.c(sbA, str7, ", homeTeamSleeveColor=", str8, ", awayTeamName=");
        hxa.c(sbA, str9, ", awayTeamLogo=", str10, ", awayTeamBaseColor=");
        hxa.c(sbA, str11, ", awayTeamSleeveColor=", str12, ", homeTeamScore=");
        hxa.c(sbA, str13, ", awayTeamScore=", str14, ", resultSequence=");
        return uf80.a(sbA, str15, ")");
    }
}
