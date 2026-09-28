package com.sportybet.plugin.realsports.data;

import defpackage.ai50;
import defpackage.hfb0;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/data/HighlightData;", "", "customEvents", "", "Lcom/sportybet/plugin/realsports/data/Event;", "tournaments", "Lcom/sportybet/plugin/realsports/data/Tournament;", "highlightEvents", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCustomEvents", "()Ljava/util/List;", "getTournaments", "getHighlightEvents", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HighlightData {
    public static final int $stable = 0;
    private final List<Event> customEvents;
    private final List<Event> highlightEvents;
    private final List<Tournament> tournaments;

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightData(List<? extends Event> list, List<? extends Tournament> list2, List<? extends Event> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.customEvents = list;
        this.tournaments = list2;
        this.highlightEvents = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightData copy$default(HighlightData highlightData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = highlightData.customEvents;
        }
        if ((i & 2) != 0) {
            list2 = highlightData.tournaments;
        }
        if ((i & 4) != 0) {
            list3 = highlightData.highlightEvents;
        }
        return highlightData.copy(list, list2, list3);
    }

    public final List<Event> component1() {
        return this.customEvents;
    }

    public final List<Tournament> component2() {
        return this.tournaments;
    }

    public final List<Event> component3() {
        return this.highlightEvents;
    }

    public final HighlightData copy(List<? extends Event> customEvents, List<? extends Tournament> tournaments, List<? extends Event> highlightEvents) {
        customEvents.getClass();
        tournaments.getClass();
        highlightEvents.getClass();
        return new HighlightData(customEvents, tournaments, highlightEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightData)) {
            return false;
        }
        HighlightData highlightData = (HighlightData) other;
        return Intrinsics.g(this.customEvents, highlightData.customEvents) && Intrinsics.g(this.tournaments, highlightData.tournaments) && Intrinsics.g(this.highlightEvents, highlightData.highlightEvents);
    }

    public final List<Event> getCustomEvents() {
        return this.customEvents;
    }

    public final List<Event> getHighlightEvents() {
        return this.highlightEvents;
    }

    public final List<Tournament> getTournaments() {
        return this.tournaments;
    }

    public int hashCode() {
        return this.highlightEvents.hashCode() + ai50.a(this.customEvents.hashCode() * 31, 31, this.tournaments);
    }

    public String toString() {
        List<Event> list = this.customEvents;
        List<Tournament> list2 = this.tournaments;
        return ng1.a(hfb0.a("HighlightData(customEvents=", ", tournaments=", ", highlightEvents=", list, list2), this.highlightEvents, ")");
    }
}
