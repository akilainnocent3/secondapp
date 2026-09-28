package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStats;", "", "homeTeam", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsTeamInfo;", "awayTeam", "headToHead", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsPreviousMeeting;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsTeamInfo;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsTeamInfo;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsPreviousMeeting;)V", "getHomeTeam", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsTeamInfo;", "Lcom/google/gson/annotations/SerializedName;", "value", "getAwayTeam", "getHeadToHead", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStatsPreviousMeeting;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballHeadToHeadStats {
    public static final int $stable;

    @SerializedName("awayTeam")
    private final NetworkScheduledFootballHeadToHeadStatsTeamInfo awayTeam;

    @SerializedName("headToHead")
    private final NetworkScheduledFootballHeadToHeadStatsPreviousMeeting headToHead;

    @SerializedName("homeTeam")
    private final NetworkScheduledFootballHeadToHeadStatsTeamInfo homeTeam;

    static {
        int i = NetworkScheduledFootballHeadToHeadStatsPreviousMeeting.$stable;
        int i2 = NetworkScheduledFootballHeadToHeadStatsTeamInfo.$stable;
        $stable = i | i2 | i2;
    }

    public NetworkScheduledFootballHeadToHeadStats(NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo, NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo2, NetworkScheduledFootballHeadToHeadStatsPreviousMeeting networkScheduledFootballHeadToHeadStatsPreviousMeeting) {
        this.homeTeam = networkScheduledFootballHeadToHeadStatsTeamInfo;
        this.awayTeam = networkScheduledFootballHeadToHeadStatsTeamInfo2;
        this.headToHead = networkScheduledFootballHeadToHeadStatsPreviousMeeting;
    }

    public static /* synthetic */ NetworkScheduledFootballHeadToHeadStats copy$default(NetworkScheduledFootballHeadToHeadStats networkScheduledFootballHeadToHeadStats, NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo, NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo2, NetworkScheduledFootballHeadToHeadStatsPreviousMeeting networkScheduledFootballHeadToHeadStatsPreviousMeeting, int i, Object obj) {
        if ((i & 1) != 0) {
            networkScheduledFootballHeadToHeadStatsTeamInfo = networkScheduledFootballHeadToHeadStats.homeTeam;
        }
        if ((i & 2) != 0) {
            networkScheduledFootballHeadToHeadStatsTeamInfo2 = networkScheduledFootballHeadToHeadStats.awayTeam;
        }
        if ((i & 4) != 0) {
            networkScheduledFootballHeadToHeadStatsPreviousMeeting = networkScheduledFootballHeadToHeadStats.headToHead;
        }
        return networkScheduledFootballHeadToHeadStats.copy(networkScheduledFootballHeadToHeadStatsTeamInfo, networkScheduledFootballHeadToHeadStatsTeamInfo2, networkScheduledFootballHeadToHeadStatsPreviousMeeting);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkScheduledFootballHeadToHeadStatsTeamInfo getHomeTeam() {
        return this.homeTeam;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkScheduledFootballHeadToHeadStatsTeamInfo getAwayTeam() {
        return this.awayTeam;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NetworkScheduledFootballHeadToHeadStatsPreviousMeeting getHeadToHead() {
        return this.headToHead;
    }

    public final NetworkScheduledFootballHeadToHeadStats copy(NetworkScheduledFootballHeadToHeadStatsTeamInfo homeTeam, NetworkScheduledFootballHeadToHeadStatsTeamInfo awayTeam, NetworkScheduledFootballHeadToHeadStatsPreviousMeeting headToHead) {
        return new NetworkScheduledFootballHeadToHeadStats(homeTeam, awayTeam, headToHead);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballHeadToHeadStats)) {
            return false;
        }
        NetworkScheduledFootballHeadToHeadStats networkScheduledFootballHeadToHeadStats = (NetworkScheduledFootballHeadToHeadStats) other;
        return Intrinsics.g(this.homeTeam, networkScheduledFootballHeadToHeadStats.homeTeam) && Intrinsics.g(this.awayTeam, networkScheduledFootballHeadToHeadStats.awayTeam) && Intrinsics.g(this.headToHead, networkScheduledFootballHeadToHeadStats.headToHead);
    }

    public final NetworkScheduledFootballHeadToHeadStatsTeamInfo getAwayTeam() {
        return this.awayTeam;
    }

    public final NetworkScheduledFootballHeadToHeadStatsPreviousMeeting getHeadToHead() {
        return this.headToHead;
    }

    public final NetworkScheduledFootballHeadToHeadStatsTeamInfo getHomeTeam() {
        return this.homeTeam;
    }

    public int hashCode() {
        NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo = this.homeTeam;
        int iHashCode = (networkScheduledFootballHeadToHeadStatsTeamInfo == null ? 0 : networkScheduledFootballHeadToHeadStatsTeamInfo.hashCode()) * 31;
        NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo2 = this.awayTeam;
        int iHashCode2 = (iHashCode + (networkScheduledFootballHeadToHeadStatsTeamInfo2 == null ? 0 : networkScheduledFootballHeadToHeadStatsTeamInfo2.hashCode())) * 31;
        NetworkScheduledFootballHeadToHeadStatsPreviousMeeting networkScheduledFootballHeadToHeadStatsPreviousMeeting = this.headToHead;
        return iHashCode2 + (networkScheduledFootballHeadToHeadStatsPreviousMeeting != null ? networkScheduledFootballHeadToHeadStatsPreviousMeeting.hashCode() : 0);
    }

    public String toString() {
        return "NetworkScheduledFootballHeadToHeadStats(homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", headToHead=" + this.headToHead + ")";
    }
}
