package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Event;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/EventsForTournament;", "", "liveEvents", "", "Lcom/sportybet/plugin/realsports/data/Event;", "preMatchEvents", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLiveEvents", "()Ljava/util/List;", "getPreMatchEvents", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventsForTournament {
    public static final int $stable = 0;
    private final List<Event> liveEvents;
    private final List<Event> preMatchEvents;

    /* JADX WARN: Multi-variable type inference failed */
    public EventsForTournament(List<? extends Event> list, List<? extends Event> list2) {
        list.getClass();
        list2.getClass();
        this.liveEvents = list;
        this.preMatchEvents = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsForTournament copy$default(EventsForTournament eventsForTournament, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eventsForTournament.liveEvents;
        }
        if ((i & 2) != 0) {
            list2 = eventsForTournament.preMatchEvents;
        }
        return eventsForTournament.copy(list, list2);
    }

    public final List<Event> component1() {
        return this.liveEvents;
    }

    public final List<Event> component2() {
        return this.preMatchEvents;
    }

    public final EventsForTournament copy(List<? extends Event> liveEvents, List<? extends Event> preMatchEvents) {
        liveEvents.getClass();
        preMatchEvents.getClass();
        return new EventsForTournament(liveEvents, preMatchEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsForTournament)) {
            return false;
        }
        EventsForTournament eventsForTournament = (EventsForTournament) other;
        return Intrinsics.g(this.liveEvents, eventsForTournament.liveEvents) && Intrinsics.g(this.preMatchEvents, eventsForTournament.preMatchEvents);
    }

    public final List<Event> getLiveEvents() {
        return this.liveEvents;
    }

    public final List<Event> getPreMatchEvents() {
        return this.preMatchEvents;
    }

    public int hashCode() {
        return this.preMatchEvents.hashCode() + (this.liveEvents.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("EventsForTournament(liveEvents=", ", preMatchEvents=", ")", this.liveEvents, this.preMatchEvents);
    }
}
