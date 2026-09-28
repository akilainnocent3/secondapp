package com.sportybet.plugin.realsports.data;

import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0016\"\u0004\b\u0017\u0010\u0018Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/sportybet/plugin/realsports/data/UpcomingVirtualLeague;", "", "leagueId", "", "leagueName", "events", "", "Lcom/sportybet/plugin/realsports/data/UpcomingVirtualEvent;", "isExpanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getLeagueId", "()Ljava/lang/String;", "setLeagueId", "(Ljava/lang/String;)V", "getLeagueName", "setLeagueName", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UpcomingVirtualLeague {
    public static final int $stable = 8;
    private List<UpcomingVirtualEvent> events;
    private boolean isExpanded;
    private String leagueId;
    private String leagueName;

    public /* synthetic */ UpcomingVirtualLeague(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? true : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcomingVirtualLeague copy$default(UpcomingVirtualLeague upcomingVirtualLeague, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upcomingVirtualLeague.leagueId;
        }
        if ((i & 2) != 0) {
            str2 = upcomingVirtualLeague.leagueName;
        }
        if ((i & 4) != 0) {
            list = upcomingVirtualLeague.events;
        }
        if ((i & 8) != 0) {
            z = upcomingVirtualLeague.isExpanded;
        }
        return upcomingVirtualLeague.copy(str, str2, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    public final List<UpcomingVirtualEvent> component3() {
        return this.events;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final UpcomingVirtualLeague copy(String leagueId, String leagueName, List<UpcomingVirtualEvent> events, boolean isExpanded) {
        return new UpcomingVirtualLeague(leagueId, leagueName, events, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcomingVirtualLeague)) {
            return false;
        }
        UpcomingVirtualLeague upcomingVirtualLeague = (UpcomingVirtualLeague) other;
        return Intrinsics.g(this.leagueId, upcomingVirtualLeague.leagueId) && Intrinsics.g(this.leagueName, upcomingVirtualLeague.leagueName) && Intrinsics.g(this.events, upcomingVirtualLeague.events) && this.isExpanded == upcomingVirtualLeague.isExpanded;
    }

    public final List<UpcomingVirtualEvent> getEvents() {
        return this.events;
    }

    public final String getLeagueId() {
        return this.leagueId;
    }

    public final String getLeagueName() {
        return this.leagueName;
    }

    public int hashCode() {
        String str = this.leagueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leagueName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UpcomingVirtualEvent> list = this.events;
        return Boolean.hashCode(this.isExpanded) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setEvents(List<UpcomingVirtualEvent> list) {
        this.events = list;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final void setLeagueId(String str) {
        this.leagueId = str;
    }

    public final void setLeagueName(String str) {
        this.leagueName = str;
    }

    public String toString() {
        String str = this.leagueId;
        String str2 = this.leagueName;
        List<UpcomingVirtualEvent> list = this.events;
        boolean z = this.isExpanded;
        StringBuilder sbA = ux5.a("UpcomingVirtualLeague(leagueId=", str, ", leagueName=", str2, ", events=");
        sbA.append(list);
        sbA.append(", isExpanded=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    public UpcomingVirtualLeague(String str, String str2, List<UpcomingVirtualEvent> list, boolean z) {
        this.leagueId = str;
        this.leagueName = str2;
        this.events = list;
        this.isExpanded = z;
    }

    public UpcomingVirtualLeague() {
        this(null, null, null, false, 15, null);
    }
}
