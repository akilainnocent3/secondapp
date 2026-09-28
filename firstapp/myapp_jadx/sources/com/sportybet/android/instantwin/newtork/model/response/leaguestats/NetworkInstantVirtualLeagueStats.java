package com.sportybet.android.instantwin.newtork.model.response.leaguestats;

import com.twilio.voice.EventKeys;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/leaguestats/NetworkInstantVirtualLeagueStats;", "", "leagueId", "", "leagueName", EventKeys.VALUES_KEY, "", "Lcom/sportybet/android/instantwin/newtork/model/response/leaguestats/NetworkInstantVirtualLeagueStatsTeamValue;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLeagueId", "()Ljava/lang/String;", "getLeagueName", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantVirtualLeagueStats {
    public static final int $stable = 8;
    private final String leagueId;
    private final String leagueName;
    private final List<NetworkInstantVirtualLeagueStatsTeamValue> values;

    public /* synthetic */ NetworkInstantVirtualLeagueStats(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantVirtualLeagueStats copy$default(NetworkInstantVirtualLeagueStats networkInstantVirtualLeagueStats, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantVirtualLeagueStats.leagueId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantVirtualLeagueStats.leagueName;
        }
        if ((i & 4) != 0) {
            list = networkInstantVirtualLeagueStats.values;
        }
        return networkInstantVirtualLeagueStats.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    public final List<NetworkInstantVirtualLeagueStatsTeamValue> component3() {
        return this.values;
    }

    public final NetworkInstantVirtualLeagueStats copy(String leagueId, String leagueName, List<NetworkInstantVirtualLeagueStatsTeamValue> values) {
        return new NetworkInstantVirtualLeagueStats(leagueId, leagueName, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantVirtualLeagueStats)) {
            return false;
        }
        NetworkInstantVirtualLeagueStats networkInstantVirtualLeagueStats = (NetworkInstantVirtualLeagueStats) other;
        return Intrinsics.g(this.leagueId, networkInstantVirtualLeagueStats.leagueId) && Intrinsics.g(this.leagueName, networkInstantVirtualLeagueStats.leagueName) && Intrinsics.g(this.values, networkInstantVirtualLeagueStats.values);
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public final List<NetworkInstantVirtualLeagueStatsTeamValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NetworkInstantVirtualLeagueStatsTeamValue> list = this.values;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.leagueName;
        return ng1.a(ux5.a("NetworkInstantVirtualLeagueStats(leagueId=", str, ", leagueName=", str2, ", values="), this.values, ")");
    }

    public NetworkInstantVirtualLeagueStats(String str, String str2, List<NetworkInstantVirtualLeagueStatsTeamValue> list) {
        this.leagueId = str;
        this.leagueName = str2;
        this.values = list;
    }

    public NetworkInstantVirtualLeagueStats() {
        this(null, null, null, 7, null);
    }
}
