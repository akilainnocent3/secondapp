package com.sportybet.plugin.realsports.searchv2.data.model;

import com.sportybet.plugin.realsports.data.Event;
import defpackage.m2g;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchMatchesDto;", "", "live", "", "Lcom/sportybet/plugin/realsports/data/Event;", "upcoming", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getLive", "()Ljava/util/List;", "getUpcoming", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchMatchesDto {
    public static final int $stable = 0;
    private final List<Event> live;
    private final List<Event> upcoming;

    public SearchMatchesDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list, (i & 2) != 0 ? m2g.a : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMatchesDto copy$default(SearchMatchesDto searchMatchesDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchMatchesDto.live;
        }
        if ((i & 2) != 0) {
            list2 = searchMatchesDto.upcoming;
        }
        return searchMatchesDto.copy(list, list2);
    }

    public final List<Event> component1() {
        return this.live;
    }

    public final List<Event> component2() {
        return this.upcoming;
    }

    public final SearchMatchesDto copy(List<? extends Event> live, List<? extends Event> upcoming) {
        live.getClass();
        upcoming.getClass();
        return new SearchMatchesDto(live, upcoming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMatchesDto)) {
            return false;
        }
        SearchMatchesDto searchMatchesDto = (SearchMatchesDto) other;
        return Intrinsics.g(this.live, searchMatchesDto.live) && Intrinsics.g(this.upcoming, searchMatchesDto.upcoming);
    }

    public final List<Event> getLive() {
        return this.live;
    }

    public final List<Event> getUpcoming() {
        return this.upcoming;
    }

    public int hashCode() {
        return this.upcoming.hashCode() + (this.live.hashCode() * 31);
    }

    public String toString() {
        return w9d.a("SearchMatchesDto(live=", ", upcoming=", ")", this.live, this.upcoming);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchMatchesDto(List<? extends Event> list, List<? extends Event> list2) {
        list.getClass();
        list2.getClass();
        this.live = list;
        this.upcoming = list2;
    }

    public SearchMatchesDto() {
        this(null, null, 3, null);
    }
}
