package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.d5d;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kwi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010$\u001a\u00020\nHÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R%\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006%"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsPreviousMeeting;", "", "matches", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsMatchRecord;", "homeTeamWins", "", "awayTeamWins", "draws", "homeTeamHighestWinScore", "", "awayTeamHighestWinScore", "<init>", "(Ljava/util/List;IIILjava/lang/String;Ljava/lang/String;)V", "getMatches", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHomeTeamWins", "()I", "getAwayTeamWins", "getDraws", "getHomeTeamHighestWinScore", "()Ljava/lang/String;", "getAwayTeamHighestWinScore", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballHeadToHeadStatsPreviousMeeting {
    public static final int $stable = 8;

    @SerializedName("awayTeamHighestWinScore")
    private final String awayTeamHighestWinScore;

    @SerializedName("awayTeamWins")
    private final int awayTeamWins;

    @SerializedName("draws")
    private final int draws;

    @SerializedName("homeTeamHighestWinScore")
    private final String homeTeamHighestWinScore;

    @SerializedName("homeTeamWins")
    private final int homeTeamWins;

    @SerializedName("matches")
    private final List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> matches;

    public NetworkScheduledFootballHeadToHeadStatsPreviousMeeting(List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> list, int i, int i2, int i3, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.matches = list;
        this.homeTeamWins = i;
        this.awayTeamWins = i2;
        this.draws = i3;
        this.homeTeamHighestWinScore = str;
        this.awayTeamHighestWinScore = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballHeadToHeadStatsPreviousMeeting copy$default(NetworkScheduledFootballHeadToHeadStatsPreviousMeeting networkScheduledFootballHeadToHeadStatsPreviousMeeting, List list, int i, int i2, int i3, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = networkScheduledFootballHeadToHeadStatsPreviousMeeting.matches;
        }
        if ((i4 & 2) != 0) {
            i = networkScheduledFootballHeadToHeadStatsPreviousMeeting.homeTeamWins;
        }
        if ((i4 & 4) != 0) {
            i2 = networkScheduledFootballHeadToHeadStatsPreviousMeeting.awayTeamWins;
        }
        if ((i4 & 8) != 0) {
            i3 = networkScheduledFootballHeadToHeadStatsPreviousMeeting.draws;
        }
        if ((i4 & 16) != 0) {
            str = networkScheduledFootballHeadToHeadStatsPreviousMeeting.homeTeamHighestWinScore;
        }
        if ((i4 & 32) != 0) {
            str2 = networkScheduledFootballHeadToHeadStatsPreviousMeeting.awayTeamHighestWinScore;
        }
        String str3 = str;
        String str4 = str2;
        return networkScheduledFootballHeadToHeadStatsPreviousMeeting.copy(list, i, i2, i3, str3, str4);
    }

    public final List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> component1() {
        return this.matches;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHomeTeamWins() {
        return this.homeTeamWins;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAwayTeamWins() {
        return this.awayTeamWins;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamHighestWinScore() {
        return this.homeTeamHighestWinScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamHighestWinScore() {
        return this.awayTeamHighestWinScore;
    }

    public final NetworkScheduledFootballHeadToHeadStatsPreviousMeeting copy(List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> matches, int homeTeamWins, int awayTeamWins, int draws, String homeTeamHighestWinScore, String awayTeamHighestWinScore) {
        homeTeamHighestWinScore.getClass();
        awayTeamHighestWinScore.getClass();
        return new NetworkScheduledFootballHeadToHeadStatsPreviousMeeting(matches, homeTeamWins, awayTeamWins, draws, homeTeamHighestWinScore, awayTeamHighestWinScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballHeadToHeadStatsPreviousMeeting)) {
            return false;
        }
        NetworkScheduledFootballHeadToHeadStatsPreviousMeeting networkScheduledFootballHeadToHeadStatsPreviousMeeting = (NetworkScheduledFootballHeadToHeadStatsPreviousMeeting) other;
        return Intrinsics.g(this.matches, networkScheduledFootballHeadToHeadStatsPreviousMeeting.matches) && this.homeTeamWins == networkScheduledFootballHeadToHeadStatsPreviousMeeting.homeTeamWins && this.awayTeamWins == networkScheduledFootballHeadToHeadStatsPreviousMeeting.awayTeamWins && this.draws == networkScheduledFootballHeadToHeadStatsPreviousMeeting.draws && Intrinsics.g(this.homeTeamHighestWinScore, networkScheduledFootballHeadToHeadStatsPreviousMeeting.homeTeamHighestWinScore) && Intrinsics.g(this.awayTeamHighestWinScore, networkScheduledFootballHeadToHeadStatsPreviousMeeting.awayTeamHighestWinScore);
    }

    public final String getAwayTeamHighestWinScore() {
        return this.awayTeamHighestWinScore;
    }

    public final int getAwayTeamWins() {
        return this.awayTeamWins;
    }

    public final int getDraws() {
        return this.draws;
    }

    public final String getHomeTeamHighestWinScore() {
        return this.homeTeamHighestWinScore;
    }

    public final int getHomeTeamWins() {
        return this.homeTeamWins;
    }

    public final List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> getMatches() {
        return this.matches;
    }

    public int hashCode() {
        List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> list = this.matches;
        return this.awayTeamHighestWinScore.hashCode() + gmf0.a(gpp.a(this.draws, gpp.a(this.awayTeamWins, gpp.a(this.homeTeamWins, (list == null ? 0 : list.hashCode()) * 31, 31), 31), 31), 31, this.homeTeamHighestWinScore);
    }

    public String toString() {
        List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> list = this.matches;
        int i = this.homeTeamWins;
        int i2 = this.awayTeamWins;
        int i3 = this.draws;
        String str = this.homeTeamHighestWinScore;
        String str2 = this.awayTeamHighestWinScore;
        StringBuilder sb = new StringBuilder("NetworkScheduledFootballHeadToHeadStatsPreviousMeeting(matches=");
        sb.append(list);
        sb.append(", homeTeamWins=");
        sb.append(i);
        sb.append(", awayTeamWins=");
        d5d.a(sb, i2, ", draws=", i3, ", homeTeamHighestWinScore=");
        return kwi.a(sb, str, ", awayTeamHighestWinScore=", str2, ")");
    }
}
