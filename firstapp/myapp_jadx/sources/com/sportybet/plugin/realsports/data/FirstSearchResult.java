package com.sportybet.plugin.realsports.data;

import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fÊ\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/sportybet/plugin/realsports/data/FirstSearchResult;", "", "sportsLiveEventNum", "", "Lcom/sportybet/plugin/realsports/data/SportsEventNum;", "sportsPreEventNum", "live", "Lcom/sportybet/plugin/realsports/data/Event;", "preMatch", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSportsLiveEventNum", "()Ljava/util/List;", "getSportsPreEventNum", "getLive", "getPreMatch", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FirstSearchResult {
    public static final int $stable = 0;
    private final List<Event> live;
    private final List<Event> preMatch;
    private final List<SportsEventNum> sportsLiveEventNum;
    private final List<SportsEventNum> sportsPreEventNum;

    public FirstSearchResult(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list, (i & 2) != 0 ? m2g.a : list2, (i & 4) != 0 ? m2g.a : list3, (i & 8) != 0 ? m2g.a : list4);
    }

    public final List<Event> getLive() {
        return this.live;
    }

    public final List<Event> getPreMatch() {
        return this.preMatch;
    }

    public final List<SportsEventNum> getSportsLiveEventNum() {
        return this.sportsLiveEventNum;
    }

    public final List<SportsEventNum> getSportsPreEventNum() {
        return this.sportsPreEventNum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FirstSearchResult(List<SportsEventNum> list, List<SportsEventNum> list2, List<? extends Event> list3, List<? extends Event> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.sportsLiveEventNum = list;
        this.sportsPreEventNum = list2;
        this.live = list3;
        this.preMatch = list4;
    }

    public FirstSearchResult() {
        this(null, null, null, null, 15, null);
    }
}
