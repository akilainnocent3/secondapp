package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.xdp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdaySocketData;", "", "", "leagueId", "", "season", "matchday", AnalyticsParam.EVENT_STATUS, "Lxdp;", "data", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lxdp;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lxdp;", "copy", "(Ljava/lang/String;IILjava/lang/String;Lxdp;)Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdaySocketData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeagueId", "I", "getSeason", "getMatchday", "getStatus", "Lxdp;", "getData", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballMatchdaySocketData {
    public static final int $stable = 8;

    @SerializedName("data")
    private final xdp data;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("matchday")
    private final int matchday;

    @SerializedName("season")
    private final int season;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    public NetworkScheduledFootballMatchdaySocketData(String str, int i, int i2, String str2, xdp xdpVar) {
        this.leagueId = str;
        this.season = i;
        this.matchday = i2;
        this.status = str2;
        this.data = xdpVar;
    }

    public static /* synthetic */ NetworkScheduledFootballMatchdaySocketData copy$default(NetworkScheduledFootballMatchdaySocketData networkScheduledFootballMatchdaySocketData, String str, int i, int i2, String str2, xdp xdpVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = networkScheduledFootballMatchdaySocketData.leagueId;
        }
        if ((i3 & 2) != 0) {
            i = networkScheduledFootballMatchdaySocketData.season;
        }
        if ((i3 & 4) != 0) {
            i2 = networkScheduledFootballMatchdaySocketData.matchday;
        }
        if ((i3 & 8) != 0) {
            str2 = networkScheduledFootballMatchdaySocketData.status;
        }
        if ((i3 & 16) != 0) {
            xdpVar = networkScheduledFootballMatchdaySocketData.data;
        }
        xdp xdpVar2 = xdpVar;
        int i4 = i2;
        return networkScheduledFootballMatchdaySocketData.copy(str, i, i4, str2, xdpVar2);
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final xdp getData() {
        return this.data;
    }

    public final NetworkScheduledFootballMatchdaySocketData copy(String leagueId, int season, int matchday, String status, xdp data) {
        return new NetworkScheduledFootballMatchdaySocketData(leagueId, season, matchday, status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballMatchdaySocketData)) {
            return false;
        }
        NetworkScheduledFootballMatchdaySocketData networkScheduledFootballMatchdaySocketData = (NetworkScheduledFootballMatchdaySocketData) other;
        return Intrinsics.g(this.leagueId, networkScheduledFootballMatchdaySocketData.leagueId) && this.season == networkScheduledFootballMatchdaySocketData.season && this.matchday == networkScheduledFootballMatchdaySocketData.matchday && Intrinsics.g(this.status, networkScheduledFootballMatchdaySocketData.status) && Intrinsics.g(this.data, networkScheduledFootballMatchdaySocketData.data);
    }

    public final xdp getData() {
        return this.data;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final int getMatchday() {
        return this.matchday;
    }

    public final int getSeason() {
        return this.season;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iA = gpp.a(this.matchday, gpp.a(this.season, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.status;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        xdp xdpVar = this.data;
        return iHashCode + (xdpVar != null ? xdpVar.a.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        int i = this.season;
        int i2 = this.matchday;
        String str2 = this.status;
        xdp xdpVar = this.data;
        StringBuilder sbA = ml5.a(i, "NetworkScheduledFootballMatchdaySocketData(leagueId=", str, ", season=", ", matchday=");
        f78.b(i2, ", status=", str2, ", data=", sbA);
        sbA.append(xdpVar);
        sbA.append(")");
        return sbA.toString();
    }
}
