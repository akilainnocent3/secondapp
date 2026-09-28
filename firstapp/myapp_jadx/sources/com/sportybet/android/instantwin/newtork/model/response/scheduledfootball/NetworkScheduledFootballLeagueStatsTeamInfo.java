package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.d5d;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ju\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R%\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R%\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R'\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015Ê\u0001\f\b/\u0012\b\b0\u0012\u0004\b\u0003\u0010\u0002¨\u0006."}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeagueStatsTeamInfo;", "", "pop", "", "teamId", "", "teamName", "teamLogo", "played", "won", "draw", "lose", "pts", "trend", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;)V", "getPop", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getTeamId", "()Ljava/lang/String;", "getTeamName", "getTeamLogo", "getPlayed", "getWon", "getDraw", "getLose", "getPts", "getTrend", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballLeagueStatsTeamInfo {
    public static final int $stable = 0;

    @SerializedName("draw")
    private final int draw;

    @SerializedName("lose")
    private final int lose;

    @SerializedName("played")
    private final int played;

    @SerializedName("pop")
    private final int pop;

    @SerializedName("pts")
    private final int pts;

    @SerializedName("teamId")
    private final String teamId;

    @SerializedName("teamLogo")
    private final String teamLogo;

    @SerializedName("teamName")
    private final String teamName;

    @SerializedName("trend")
    private final String trend;

    @SerializedName("won")
    private final int won;

    public NetworkScheduledFootballLeagueStatsTeamInfo(int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, String str4) {
        this.pop = i;
        this.teamId = str;
        this.teamName = str2;
        this.teamLogo = str3;
        this.played = i2;
        this.won = i3;
        this.draw = i4;
        this.lose = i5;
        this.pts = i6;
        this.trend = str4;
    }

    public static /* synthetic */ NetworkScheduledFootballLeagueStatsTeamInfo copy$default(NetworkScheduledFootballLeagueStatsTeamInfo networkScheduledFootballLeagueStatsTeamInfo, int i, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = networkScheduledFootballLeagueStatsTeamInfo.pop;
        }
        if ((i7 & 2) != 0) {
            str = networkScheduledFootballLeagueStatsTeamInfo.teamId;
        }
        if ((i7 & 4) != 0) {
            str2 = networkScheduledFootballLeagueStatsTeamInfo.teamName;
        }
        if ((i7 & 8) != 0) {
            str3 = networkScheduledFootballLeagueStatsTeamInfo.teamLogo;
        }
        if ((i7 & 16) != 0) {
            i2 = networkScheduledFootballLeagueStatsTeamInfo.played;
        }
        if ((i7 & 32) != 0) {
            i3 = networkScheduledFootballLeagueStatsTeamInfo.won;
        }
        if ((i7 & 64) != 0) {
            i4 = networkScheduledFootballLeagueStatsTeamInfo.draw;
        }
        if ((i7 & 128) != 0) {
            i5 = networkScheduledFootballLeagueStatsTeamInfo.lose;
        }
        if ((i7 & 256) != 0) {
            i6 = networkScheduledFootballLeagueStatsTeamInfo.pts;
        }
        if ((i7 & 512) != 0) {
            str4 = networkScheduledFootballLeagueStatsTeamInfo.trend;
        }
        int i8 = i6;
        String str5 = str4;
        int i9 = i4;
        int i10 = i5;
        int i11 = i2;
        int i12 = i3;
        return networkScheduledFootballLeagueStatsTeamInfo.copy(i, str, str2, str3, i11, i12, i9, i10, i8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPop() {
        return this.pop;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTeamId() {
        return this.teamId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTeamLogo() {
        return this.teamLogo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPlayed() {
        return this.played;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWon() {
        return this.won;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDraw() {
        return this.draw;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getLose() {
        return this.lose;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPts() {
        return this.pts;
    }

    public final NetworkScheduledFootballLeagueStatsTeamInfo copy(int pop, String teamId, String teamName, String teamLogo, int played, int won, int draw, int lose, int pts, String trend) {
        return new NetworkScheduledFootballLeagueStatsTeamInfo(pop, teamId, teamName, teamLogo, played, won, draw, lose, pts, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballLeagueStatsTeamInfo)) {
            return false;
        }
        NetworkScheduledFootballLeagueStatsTeamInfo networkScheduledFootballLeagueStatsTeamInfo = (NetworkScheduledFootballLeagueStatsTeamInfo) other;
        return this.pop == networkScheduledFootballLeagueStatsTeamInfo.pop && Intrinsics.g(this.teamId, networkScheduledFootballLeagueStatsTeamInfo.teamId) && Intrinsics.g(this.teamName, networkScheduledFootballLeagueStatsTeamInfo.teamName) && Intrinsics.g(this.teamLogo, networkScheduledFootballLeagueStatsTeamInfo.teamLogo) && this.played == networkScheduledFootballLeagueStatsTeamInfo.played && this.won == networkScheduledFootballLeagueStatsTeamInfo.won && this.draw == networkScheduledFootballLeagueStatsTeamInfo.draw && this.lose == networkScheduledFootballLeagueStatsTeamInfo.lose && this.pts == networkScheduledFootballLeagueStatsTeamInfo.pts && Intrinsics.g(this.trend, networkScheduledFootballLeagueStatsTeamInfo.trend);
    }

    public final int getDraw() {
        return this.draw;
    }

    public final int getLose() {
        return this.lose;
    }

    public final int getPlayed() {
        return this.played;
    }

    public final int getPop() {
        return this.pop;
    }

    public final int getPts() {
        return this.pts;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamLogo() {
        return this.teamLogo;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final String getTrend() {
        return this.trend;
    }

    public final int getWon() {
        return this.won;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.pop) * 31;
        String str = this.teamId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.teamName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.teamLogo;
        int iA = gpp.a(this.pts, gpp.a(this.lose, gpp.a(this.draw, gpp.a(this.won, gpp.a(this.played, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str4 = this.trend;
        return iA + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.pop;
        String str = this.teamId;
        String str2 = this.teamName;
        String str3 = this.teamLogo;
        int i2 = this.played;
        int i3 = this.won;
        int i4 = this.draw;
        int i5 = this.lose;
        int i6 = this.pts;
        String str4 = this.trend;
        StringBuilder sbA = uqe0.a(i, "NetworkScheduledFootballLeagueStatsTeamInfo(pop=", ", teamId=", str, ", teamName=");
        hxa.c(sbA, str2, ", teamLogo=", str3, ", played=");
        d5d.a(sbA, i2, ", won=", i3, ", draw=");
        d5d.a(sbA, i4, ", lose=", i5, ", pts=");
        sbA.append(i6);
        sbA.append(", trend=");
        sbA.append(str4);
        sbA.append(")");
        return sbA.toString();
    }
}
