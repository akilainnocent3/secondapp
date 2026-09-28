package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeague;", "", "leagueId", "", "leagueName", "leagueLogo", "matchdays", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchday;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLeagueId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagueName", "getLeagueLogo", "getMatchdays", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballLeague {
    public static final int $stable = 8;

    @SerializedName("leagueId")
    private final String leagueId;

    @SerializedName("leagueLogo")
    private final String leagueLogo;

    @SerializedName("leagueName")
    private final String leagueName;

    @SerializedName("matchdays")
    private final List<NetworkScheduledFootballMatchday> matchdays;

    public NetworkScheduledFootballLeague(String str, String str2, String str3, List<NetworkScheduledFootballMatchday> list) {
        this.leagueId = str;
        this.leagueName = str2;
        this.leagueLogo = str3;
        this.matchdays = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballLeague copy$default(NetworkScheduledFootballLeague networkScheduledFootballLeague, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkScheduledFootballLeague.leagueId;
        }
        if ((i & 2) != 0) {
            str2 = networkScheduledFootballLeague.leagueName;
        }
        if ((i & 4) != 0) {
            str3 = networkScheduledFootballLeague.leagueLogo;
        }
        if ((i & 8) != 0) {
            list = networkScheduledFootballLeague.matchdays;
        }
        return networkScheduledFootballLeague.copy(str, str2, str3, list);
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
    public final String getLeagueLogo() {
        return this.leagueLogo;
    }

    public final List<NetworkScheduledFootballMatchday> component4() {
        return this.matchdays;
    }

    public final NetworkScheduledFootballLeague copy(String leagueId, String leagueName, String leagueLogo, List<NetworkScheduledFootballMatchday> matchdays) {
        return new NetworkScheduledFootballLeague(leagueId, leagueName, leagueLogo, matchdays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballLeague)) {
            return false;
        }
        NetworkScheduledFootballLeague networkScheduledFootballLeague = (NetworkScheduledFootballLeague) other;
        return Intrinsics.g(this.leagueId, networkScheduledFootballLeague.leagueId) && Intrinsics.g(this.leagueName, networkScheduledFootballLeague.leagueName) && Intrinsics.g(this.leagueLogo, networkScheduledFootballLeague.leagueLogo) && Intrinsics.g(this.matchdays, networkScheduledFootballLeague.matchdays);
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueLogo() {
        return this.leagueLogo;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final List<NetworkScheduledFootballMatchday> getMatchdays() {
        return this.matchdays;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leagueLogo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<NetworkScheduledFootballMatchday> list = this.matchdays;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.leagueName;
        return nve.a(this.leagueLogo, ", matchdays=", ")", ux5.a("NetworkScheduledFootballLeague(leagueId=", str, ", leagueName=", str2, ", leagueLogo="), this.matchdays);
    }
}
