package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import defpackage.at6;
import defpackage.gpp;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeagueStats;", "", "leagueId", "", "leagueName", "season", "", EventKeys.VALUES_KEY, "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeagueStatsTeamInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getLeagueId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueName", "getSeason", "()I", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballLeagueStats {
    public static final int $stable = 8;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("season")
    private final int season;

    @SerializedName(EventKeys.VALUES_KEY)
    private final List<NetworkScheduledFootballLeagueStatsTeamInfo> values;

    public NetworkScheduledFootballLeagueStats(String str, String str2, int i, List<NetworkScheduledFootballLeagueStatsTeamInfo> list) {
        this.leagueId = str;
        this.leagueName = str2;
        this.season = i;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballLeagueStats copy$default(NetworkScheduledFootballLeagueStats networkScheduledFootballLeagueStats, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballLeagueStats.leagueId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkScheduledFootballLeagueStats.leagueName;
        }
        if ((i2 & 4) != 0) {
            i = networkScheduledFootballLeagueStats.season;
        }
        if ((i2 & 8) != 0) {
            list = networkScheduledFootballLeagueStats.values;
        }
        return networkScheduledFootballLeagueStats.copy(str, str2, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSeason() {
        return this.season;
    }

    public final List<NetworkScheduledFootballLeagueStatsTeamInfo> component4() {
        return this.values;
    }

    public final NetworkScheduledFootballLeagueStats copy(String leagueId, String leagueName, int season, List<NetworkScheduledFootballLeagueStatsTeamInfo> values) {
        return new NetworkScheduledFootballLeagueStats(leagueId, leagueName, season, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballLeagueStats)) {
            return false;
        }
        NetworkScheduledFootballLeagueStats networkScheduledFootballLeagueStats = (NetworkScheduledFootballLeagueStats) other;
        return Intrinsics.g(this.leagueId, networkScheduledFootballLeagueStats.leagueId) && Intrinsics.g(this.leagueName, networkScheduledFootballLeagueStats.leagueName) && this.season == networkScheduledFootballLeagueStats.season && Intrinsics.g(this.values, networkScheduledFootballLeagueStats.values);
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final int getSeason() {
        return this.season;
    }

    public final List<NetworkScheduledFootballLeagueStatsTeamInfo> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueName;
        int iA = gpp.a(this.season, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<NetworkScheduledFootballLeagueStatsTeamInfo> list = this.values;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.leagueName;
        return at6.b(ux5.a("NetworkScheduledFootballLeagueStats(leagueId=", str, ", leagueName=", str2, ", season="), this.season, ", values=", this.values, ")");
    }
}
