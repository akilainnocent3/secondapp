package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/book/domain/entity/RelatedBet;", "", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sporty/android/book/domain/entity/Event;", "isLoading", "", "<init>", "(Lcom/sporty/android/book/domain/entity/Event;Z)V", "getEvent", "()Lcom/sporty/android/book/domain/entity/Event;", "()Z", "uniqueId", "", "getUniqueId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RelatedBet {
    public static final int $stable = Event.$stable;
    private final Event event;
    private final boolean isLoading;

    public RelatedBet(Event event, boolean z) {
        event.getClass();
        this.event = event;
        this.isLoading = z;
    }

    public static /* synthetic */ RelatedBet copy$default(RelatedBet relatedBet, Event event, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            event = relatedBet.event;
        }
        if ((i & 2) != 0) {
            z = relatedBet.isLoading;
        }
        return relatedBet.copy(event, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final RelatedBet copy(Event event, boolean isLoading) {
        event.getClass();
        return new RelatedBet(event, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedBet)) {
            return false;
        }
        RelatedBet relatedBet = (RelatedBet) other;
        return Intrinsics.g(this.event, relatedBet.event) && this.isLoading == relatedBet.isLoading;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final String getUniqueId() {
        String eventId = this.event.getEventId();
        Market primaryMarket = this.event.getPrimaryMarket();
        String id = primaryMarket != null ? primaryMarket.getId() : null;
        Outcome primaryOutcome = this.event.getPrimaryOutcome();
        return eventId + "-" + id + "-" + (primaryOutcome != null ? primaryOutcome.getId() : null);
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLoading) + (this.event.hashCode() * 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "RelatedBet(event=" + this.event + ", isLoading=" + this.isLoading + ")";
    }

    public /* synthetic */ RelatedBet(Event event, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, (i & 2) != 0 ? false : z);
    }
}
