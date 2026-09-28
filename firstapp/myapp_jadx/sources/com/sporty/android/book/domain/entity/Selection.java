package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.kwi;
import defpackage.oxc;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sporty/android/book/domain/entity/Selection;", "", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sporty/android/book/domain/entity/Event;", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sporty/android/book/domain/entity/Market;", "outcome", "Lcom/sporty/android/book/domain/entity/Outcome;", "<init>", "(Lcom/sporty/android/book/domain/entity/Event;Lcom/sporty/android/book/domain/entity/Market;Lcom/sporty/android/book/domain/entity/Outcome;)V", "getEvent", "()Lcom/sporty/android/book/domain/entity/Event;", "getMarket", "()Lcom/sporty/android/book/domain/entity/Market;", "getOutcome", "()Lcom/sporty/android/book/domain/entity/Outcome;", "displayText", "", "getDisplayText", "()Ljava/lang/String;", "uniqueId", "getUniqueId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Selection {
    private final Event event;
    private final Market market;
    private final Outcome outcome;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (Outcome.$stable | Market.$stable) | Event.$stable;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/book/domain/entity/Selection$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/Selection;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Selection mock() {
            return new Selection(Event.Companion.mock$default(Event.INSTANCE, "e1", null, 2, null), Market.INSTANCE.mock("m1"), Outcome.INSTANCE.mock("o1"));
        }

        private Companion() {
        }
    }

    public Selection(Event event, Market market, Outcome outcome) {
        event.getClass();
        market.getClass();
        outcome.getClass();
        this.event = event;
        this.market = market;
        this.outcome = outcome;
    }

    public static /* synthetic */ Selection copy$default(Selection selection, Event event, Market market, Outcome outcome, int i, Object obj) {
        if ((i & 1) != 0) {
            event = selection.event;
        }
        if ((i & 2) != 0) {
            market = selection.market;
        }
        if ((i & 4) != 0) {
            outcome = selection.outcome;
        }
        return selection.copy(event, market, outcome);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Market getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Outcome getOutcome() {
        return this.outcome;
    }

    public final Selection copy(Event event, Market market, Outcome outcome) {
        event.getClass();
        market.getClass();
        outcome.getClass();
        return new Selection(event, market, outcome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) other;
        return Intrinsics.g(this.event, selection.event) && Intrinsics.g(this.market, selection.market) && Intrinsics.g(this.outcome, selection.outcome);
    }

    public final String getDisplayText() {
        return oxc.a(this.market.getDesc(), " - ", this.outcome.getDesc());
    }

    public final Event getEvent() {
        return this.event;
    }

    public final Market getMarket() {
        return this.market;
    }

    public final Outcome getOutcome() {
        return this.outcome;
    }

    public final String getUniqueId() {
        String specifier = this.market.getSpecifier();
        String strConcat = "";
        if (specifier != null && specifier.length() != 0) {
            strConcat = "?".concat(specifier);
        }
        int product = this.market.getProduct();
        String sportId = this.event.getSportId();
        return kwi.a(uqe0.a(product, "uof:", "/", sportId, "/"), this.market.getId(), "/", this.outcome.getId(), strConcat);
    }

    public int hashCode() {
        return this.outcome.hashCode() + ((this.market.hashCode() + (this.event.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "Selection(event=" + this.event + ", market=" + this.market + ", outcome=" + this.outcome + ")";
    }
}
