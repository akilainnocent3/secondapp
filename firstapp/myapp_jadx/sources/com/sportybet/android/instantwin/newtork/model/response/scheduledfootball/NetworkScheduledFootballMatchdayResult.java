package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.dy5;
import defpackage.f87;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ka1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R'\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdayResult;", "", "season", "", "matchday", "leagueId", "", "leagueName", "leagueLogoUrl", "kickoffTime", "", "results", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdayResultEvent;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getSeason", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMatchday", "getLeagueId", "()Ljava/lang/String;", "getLeagueName", "getLeagueLogoUrl", "getKickoffTime", "()J", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMatchdayResult {
    public static final int $stable = 8;

    @SerializedName("kickoffTime")
    private final long kickoffTime;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueLogoUrl")
    private final String leagueLogoUrl;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("matchday")
    private final int matchday;

    @SerializedName("results")
    private final List<NetworkScheduledFootballMatchdayResultEvent> results;

    @SerializedName("season")
    private final int season;

    public NetworkScheduledFootballMatchdayResult(int i, int i2, String str, String str2, String str3, long j, List<NetworkScheduledFootballMatchdayResultEvent> list) {
        this.season = i;
        this.matchday = i2;
        this.leagueId = str;
        this.leagueName = str2;
        this.leagueLogoUrl = str3;
        this.kickoffTime = j;
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballMatchdayResult copy$default(NetworkScheduledFootballMatchdayResult networkScheduledFootballMatchdayResult, int i, int i2, String str, String str2, String str3, long j, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkScheduledFootballMatchdayResult.season;
        }
        if ((i3 & 2) != 0) {
            i2 = networkScheduledFootballMatchdayResult.matchday;
        }
        if ((i3 & 4) != 0) {
            str = networkScheduledFootballMatchdayResult.leagueId;
        }
        if ((i3 & 8) != 0) {
            str2 = networkScheduledFootballMatchdayResult.leagueName;
        }
        if ((i3 & 16) != 0) {
            str3 = networkScheduledFootballMatchdayResult.leagueLogoUrl;
        }
        if ((i3 & 32) != 0) {
            j = networkScheduledFootballMatchdayResult.kickoffTime;
        }
        if ((i3 & 64) != 0) {
            list = networkScheduledFootballMatchdayResult.results;
        }
        List list2 = list;
        long j2 = j;
        String str4 = str3;
        String str5 = str;
        return networkScheduledFootballMatchdayResult.copy(i, i2, str5, str2, str4, j2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeason() {
        return this.season;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMatchday() {
        return this.matchday;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    public final List<NetworkScheduledFootballMatchdayResultEvent> component7() {
        return this.results;
    }

    public final NetworkScheduledFootballMatchdayResult copy(int season, int matchday, String leagueId, String leagueName, String leagueLogoUrl, long kickoffTime, List<NetworkScheduledFootballMatchdayResultEvent> results) {
        return new NetworkScheduledFootballMatchdayResult(season, matchday, leagueId, leagueName, leagueLogoUrl, kickoffTime, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMatchdayResult)) {
            return false;
        }
        NetworkScheduledFootballMatchdayResult networkScheduledFootballMatchdayResult = (NetworkScheduledFootballMatchdayResult) other;
        return this.season == networkScheduledFootballMatchdayResult.season && this.matchday == networkScheduledFootballMatchdayResult.matchday && Intrinsics.g(this.leagueId, networkScheduledFootballMatchdayResult.leagueId) && Intrinsics.g(this.leagueName, networkScheduledFootballMatchdayResult.leagueName) && Intrinsics.g(this.leagueLogoUrl, networkScheduledFootballMatchdayResult.leagueLogoUrl) && this.kickoffTime == networkScheduledFootballMatchdayResult.kickoffTime && Intrinsics.g(this.results, networkScheduledFootballMatchdayResult.results);
    }

    public final long getKickoffTime() {
        return this.kickoffTime;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueLogoUrl() {
        return this.leagueLogoUrl;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final int getMatchday() {
        return this.matchday;
    }

    public final List<NetworkScheduledFootballMatchdayResultEvent> getResults() {
        return this.results;
    }

    public final int getSeason() {
        return this.season;
    }

    public int hashCode() {
        int iA = gpp.a(this.matchday, Integer.hashCode(this.season) * 31, 31);
        String str = this.leagueId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.leagueName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leagueLogoUrl;
        int iA2 = f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.kickoffTime, 31);
        List<NetworkScheduledFootballMatchdayResultEvent> list = this.results;
        return iA2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.season;
        int i2 = this.matchday;
        String str = this.leagueId;
        String str2 = this.leagueName;
        String str3 = this.leagueLogoUrl;
        long j = this.kickoffTime;
        List<NetworkScheduledFootballMatchdayResultEvent> list = this.results;
        StringBuilder sbA = dy5.a("NetworkScheduledFootballMatchdayResult(season=", i, i2, ", matchday=", ", leagueId=");
        hxa.c(sbA, str, ", leagueName=", str2, ", leagueLogoUrl=");
        l.a(j, str3, ", kickoffTime=", sbA);
        return ka1.a(sbA, ", results=", list, ")");
    }
}
