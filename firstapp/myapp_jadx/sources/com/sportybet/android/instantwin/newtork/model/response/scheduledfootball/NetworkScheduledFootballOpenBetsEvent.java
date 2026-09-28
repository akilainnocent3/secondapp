package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.hxa;
import defpackage.to10;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J}\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R%\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0002¨\u00060"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsEvent;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "leagueId", "leagueUrl", "leagueName", "homeTeamName", "homeTeamLogo", "awayTeamName", "awayTeamLogo", "kickOffTime", "", "matchday", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueId", "getLeagueUrl", "getLeagueName", "getHomeTeamName", "getHomeTeamLogo", "getAwayTeamName", "getAwayTeamLogo", "getKickOffTime", "()J", "getMatchday", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballOpenBetsEvent {
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

    @SerializedName("kickOffTime")
    private final long kickOffTime;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("leagueUrl")
    private final String leagueUrl;

    @SerializedName("matchday")
    private final int matchday;

    public NetworkScheduledFootballOpenBetsEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i) {
        this.eventId = str;
        this.leagueId = str2;
        this.leagueUrl = str3;
        this.leagueName = str4;
        this.homeTeamName = str5;
        this.homeTeamLogo = str6;
        this.awayTeamName = str7;
        this.awayTeamLogo = str8;
        this.kickOffTime = j;
        this.matchday = i;
    }

    public static /* synthetic */ NetworkScheduledFootballOpenBetsEvent copy$default(NetworkScheduledFootballOpenBetsEvent networkScheduledFootballOpenBetsEvent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballOpenBetsEvent.eventId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkScheduledFootballOpenBetsEvent.leagueId;
        }
        if ((i2 & 4) != 0) {
            str3 = networkScheduledFootballOpenBetsEvent.leagueUrl;
        }
        if ((i2 & 8) != 0) {
            str4 = networkScheduledFootballOpenBetsEvent.leagueName;
        }
        if ((i2 & 16) != 0) {
            str5 = networkScheduledFootballOpenBetsEvent.homeTeamName;
        }
        if ((i2 & 32) != 0) {
            str6 = networkScheduledFootballOpenBetsEvent.homeTeamLogo;
        }
        if ((i2 & 64) != 0) {
            str7 = networkScheduledFootballOpenBetsEvent.awayTeamName;
        }
        if ((i2 & 128) != 0) {
            str8 = networkScheduledFootballOpenBetsEvent.awayTeamLogo;
        }
        if ((i2 & 256) != 0) {
            j = networkScheduledFootballOpenBetsEvent.kickOffTime;
        }
        if ((i2 & 512) != 0) {
            i = networkScheduledFootballOpenBetsEvent.matchday;
        }
        int i3 = i;
        long j2 = j;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return networkScheduledFootballOpenBetsEvent.copy(str, str2, str3, str4, str11, str12, str9, str10, j2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMatchday() {
        return this.matchday;
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
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getKickOffTime() {
        return this.kickOffTime;
    }

    public final NetworkScheduledFootballOpenBetsEvent copy(String eventId, String leagueId, String leagueUrl, String leagueName, String homeTeamName, String homeTeamLogo, String awayTeamName, String awayTeamLogo, long kickOffTime, int matchday) {
        return new NetworkScheduledFootballOpenBetsEvent(eventId, leagueId, leagueUrl, leagueName, homeTeamName, homeTeamLogo, awayTeamName, awayTeamLogo, kickOffTime, matchday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballOpenBetsEvent)) {
            return false;
        }
        NetworkScheduledFootballOpenBetsEvent networkScheduledFootballOpenBetsEvent = (NetworkScheduledFootballOpenBetsEvent) other;
        return Intrinsics.g(this.eventId, networkScheduledFootballOpenBetsEvent.eventId) && Intrinsics.g(this.leagueId, networkScheduledFootballOpenBetsEvent.leagueId) && Intrinsics.g(this.leagueUrl, networkScheduledFootballOpenBetsEvent.leagueUrl) && Intrinsics.g(this.leagueName, networkScheduledFootballOpenBetsEvent.leagueName) && Intrinsics.g(this.homeTeamName, networkScheduledFootballOpenBetsEvent.homeTeamName) && Intrinsics.g(this.homeTeamLogo, networkScheduledFootballOpenBetsEvent.homeTeamLogo) && Intrinsics.g(this.awayTeamName, networkScheduledFootballOpenBetsEvent.awayTeamName) && Intrinsics.g(this.awayTeamLogo, networkScheduledFootballOpenBetsEvent.awayTeamLogo) && this.kickOffTime == networkScheduledFootballOpenBetsEvent.kickOffTime && this.matchday == networkScheduledFootballOpenBetsEvent.matchday;
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

    public final long getKickOffTime() {
        return this.kickOffTime;
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

    public final int getMatchday() {
        return this.matchday;
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
        String str7 = this.awayTeamName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.awayTeamLogo;
        return Integer.hashCode(this.matchday) + f87.a((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31, this.kickOffTime, 31);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.leagueId;
        String str3 = this.leagueUrl;
        String str4 = this.leagueName;
        String str5 = this.homeTeamName;
        String str6 = this.homeTeamLogo;
        String str7 = this.awayTeamName;
        String str8 = this.awayTeamLogo;
        long j = this.kickOffTime;
        int i = this.matchday;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballOpenBetsEvent(eventId=", str, ", leagueId=", str2, ", leagueUrl=");
        hxa.c(sbA, str3, ", leagueName=", str4, ", homeTeamName=");
        hxa.c(sbA, str5, ", homeTeamLogo=", str6, ", awayTeamName=");
        hxa.c(sbA, str7, ", awayTeamLogo=", str8, ", kickOffTime=");
        to10.a(sbA, j, ", matchday=", i);
        sbA.append(")");
        return sbA.toString();
    }
}
