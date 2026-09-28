package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResultEnvelop;", "", "leagueId", "", "season", "", "matchday", "matchdayStatus", "currentTime", "", "kickoffTime", "results", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResult;", "<init>", "(Ljava/lang/String;IILjava/lang/String;JJLjava/util/List;)V", "getLeagueId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSeason", "()I", "getMatchday", "getMatchdayStatus", "getCurrentTime", "()J", "getKickoffTime", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballEventResultEnvelop {
    public static final int $stable = 8;

    @SerializedName("currentTime")
    private final long currentTime;

    @SerializedName("kickoffTime")
    private final long kickoffTime;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("matchday")
    private final int matchday;

    @SerializedName("matchdayStatus")
    private final String matchdayStatus;

    @SerializedName("results")
    private final List<NetworkScheduledFootballEventResult> results;

    @SerializedName("season")
    private final int season;

    public NetworkScheduledFootballEventResultEnvelop(String str, int i, int i2, String str2, long j, long j2, List<NetworkScheduledFootballEventResult> list) {
        this.leagueId = str;
        this.season = i;
        this.matchday = i2;
        this.matchdayStatus = str2;
        this.currentTime = j;
        this.kickoffTime = j2;
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballEventResultEnvelop copy$default(NetworkScheduledFootballEventResultEnvelop networkScheduledFootballEventResultEnvelop, String str, int i, int i2, String str2, long j, long j2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkScheduledFootballEventResultEnvelop.leagueId;
        }
        if ((i3 & 2) != 0) {
            i = networkScheduledFootballEventResultEnvelop.season;
        }
        if ((i3 & 4) != 0) {
            i2 = networkScheduledFootballEventResultEnvelop.matchday;
        }
        if ((i3 & 8) != 0) {
            str2 = networkScheduledFootballEventResultEnvelop.matchdayStatus;
        }
        if ((i3 & 16) != 0) {
            j = networkScheduledFootballEventResultEnvelop.currentTime;
        }
        if ((i3 & 32) != 0) {
            j2 = networkScheduledFootballEventResultEnvelop.kickoffTime;
        }
        if ((i3 & 64) != 0) {
            list = networkScheduledFootballEventResultEnvelop.results;
        }
        List list2 = list;
        long j3 = j2;
        long j4 = j;
        return networkScheduledFootballEventResultEnvelop.copy(str, i, i2, str2, j4, j3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSeason() {
        return this.season;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMatchday() {
        return this.matchday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMatchdayStatus() {
        return this.matchdayStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    public final List<NetworkScheduledFootballEventResult> component7() {
        return this.results;
    }

    public final NetworkScheduledFootballEventResultEnvelop copy(String leagueId, int season, int matchday, String matchdayStatus, long currentTime, long kickoffTime, List<NetworkScheduledFootballEventResult> results) {
        return new NetworkScheduledFootballEventResultEnvelop(leagueId, season, matchday, matchdayStatus, currentTime, kickoffTime, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballEventResultEnvelop)) {
            return false;
        }
        NetworkScheduledFootballEventResultEnvelop networkScheduledFootballEventResultEnvelop = (NetworkScheduledFootballEventResultEnvelop) other;
        return Intrinsics.g(this.leagueId, networkScheduledFootballEventResultEnvelop.leagueId) && this.season == networkScheduledFootballEventResultEnvelop.season && this.matchday == networkScheduledFootballEventResultEnvelop.matchday && Intrinsics.g(this.matchdayStatus, networkScheduledFootballEventResultEnvelop.matchdayStatus) && this.currentTime == networkScheduledFootballEventResultEnvelop.currentTime && this.kickoffTime == networkScheduledFootballEventResultEnvelop.kickoffTime && Intrinsics.g(this.results, networkScheduledFootballEventResultEnvelop.results);
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final int getMatchday() {
        return this.matchday;
    }

    public final String getMatchdayStatus() {
        return this.matchdayStatus;
    }

    public final List<NetworkScheduledFootballEventResult> getResults() {
        return this.results;
    }

    public final int getSeason() {
        return this.season;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iA = gpp.a(this.matchday, gpp.a(this.season, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.matchdayStatus;
        int iA2 = f87.a(f87.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, this.currentTime, 31), this.kickoffTime, 31);
        List<NetworkScheduledFootballEventResult> list = this.results;
        return iA2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        int i = this.season;
        int i2 = this.matchday;
        String str2 = this.matchdayStatus;
        long j = this.currentTime;
        long j2 = this.kickoffTime;
        List<NetworkScheduledFootballEventResult> list = this.results;
        StringBuilder sbA = ml5.a(i, "NetworkScheduledFootballEventResultEnvelop(leagueId=", str, ", season=", ", matchday=");
        f78.b(i2, ", matchdayStatus=", str2, ", currentTime=", sbA);
        sbA.append(j);
        g41.a(j2, ", kickoffTime=", ", results=", sbA);
        return ng1.a(sbA, list, ")");
    }
}
