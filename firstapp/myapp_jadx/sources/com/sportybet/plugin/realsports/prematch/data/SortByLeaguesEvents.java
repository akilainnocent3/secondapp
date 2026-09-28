package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/SortByLeaguesEvents;", "Lcom/sportybet/plugin/realsports/prematch/data/AssociateTournamentData;", "eventCountMap", "", "Lcom/sportybet/plugin/realsports/data/Tournament;", "", "eventList", "", "Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getEventCountMap", "()Ljava/util/Map;", "getEventList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SortByLeaguesEvents implements AssociateTournamentData {
    public static final int $stable = 0;
    private final Map<Tournament, Integer> eventCountMap;
    private final List<PreMatchSectionData> eventList;

    /* JADX WARN: Multi-variable type inference failed */
    public SortByLeaguesEvents(Map<Tournament, Integer> map, List<? extends PreMatchSectionData> list) {
        map.getClass();
        list.getClass();
        this.eventCountMap = map;
        this.eventList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SortByLeaguesEvents copy$default(SortByLeaguesEvents sortByLeaguesEvents, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = sortByLeaguesEvents.eventCountMap;
        }
        if ((i & 2) != 0) {
            list = sortByLeaguesEvents.eventList;
        }
        return sortByLeaguesEvents.copy(map, list);
    }

    public final Map<Tournament, Integer> component1() {
        return this.eventCountMap;
    }

    public final List<PreMatchSectionData> component2() {
        return this.eventList;
    }

    public final SortByLeaguesEvents copy(Map<Tournament, Integer> eventCountMap, List<? extends PreMatchSectionData> eventList) {
        eventCountMap.getClass();
        eventList.getClass();
        return new SortByLeaguesEvents(eventCountMap, eventList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SortByLeaguesEvents)) {
            return false;
        }
        SortByLeaguesEvents sortByLeaguesEvents = (SortByLeaguesEvents) other;
        return Intrinsics.g(this.eventCountMap, sortByLeaguesEvents.eventCountMap) && Intrinsics.g(this.eventList, sortByLeaguesEvents.eventList);
    }

    public final Map<Tournament, Integer> getEventCountMap() {
        return this.eventCountMap;
    }

    public final List<PreMatchSectionData> getEventList() {
        return this.eventList;
    }

    public int hashCode() {
        return this.eventList.hashCode() + (this.eventCountMap.hashCode() * 31);
    }

    public String toString() {
        return "SortByLeaguesEvents(eventCountMap=" + this.eventCountMap + ", eventList=" + this.eventList + ")";
    }
}
