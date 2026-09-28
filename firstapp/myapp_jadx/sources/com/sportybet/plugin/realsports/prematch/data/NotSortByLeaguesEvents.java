package com.sportybet.plugin.realsports.prematch.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/NotSortByLeaguesEvents;", "Lcom/sportybet/plugin/realsports/prematch/data/AssociateTournamentData;", "eventList", "", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "lastItemDay", "", "<init>", "(Ljava/util/List;J)V", "getEventList", "()Ljava/util/List;", "getLastItemDay", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NotSortByLeaguesEvents implements AssociateTournamentData {
    public static final int $stable = 8;
    private final List<PreMatchSectionData> eventList;
    private final long lastItemDay;

    /* JADX WARN: Multi-variable type inference failed */
    public NotSortByLeaguesEvents(List<? extends PreMatchSectionData> list, long j) {
        list.getClass();
        this.eventList = list;
        this.lastItemDay = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotSortByLeaguesEvents copy$default(NotSortByLeaguesEvents notSortByLeaguesEvents, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notSortByLeaguesEvents.eventList;
        }
        if ((i & 2) != 0) {
            j = notSortByLeaguesEvents.lastItemDay;
        }
        return notSortByLeaguesEvents.copy(list, j);
    }

    public final List<PreMatchSectionData> component1() {
        return this.eventList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastItemDay() {
        return this.lastItemDay;
    }

    public final NotSortByLeaguesEvents copy(List<? extends PreMatchSectionData> eventList, long lastItemDay) {
        eventList.getClass();
        return new NotSortByLeaguesEvents(eventList, lastItemDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotSortByLeaguesEvents)) {
            return false;
        }
        NotSortByLeaguesEvents notSortByLeaguesEvents = (NotSortByLeaguesEvents) other;
        return Intrinsics.g(this.eventList, notSortByLeaguesEvents.eventList) && this.lastItemDay == notSortByLeaguesEvents.lastItemDay;
    }

    public final List<PreMatchSectionData> getEventList() {
        return this.eventList;
    }

    public final long getLastItemDay() {
        return this.lastItemDay;
    }

    public int hashCode() {
        return Long.hashCode(this.lastItemDay) + (this.eventList.hashCode() * 31);
    }

    public String toString() {
        return "NotSortByLeaguesEvents(eventList=" + this.eventList + ", lastItemDay=" + this.lastItemDay + ")";
    }
}
