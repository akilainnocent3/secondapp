package com.sportybet.plugin.realsports.prematch.data;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent;", "", "PreMatchNavigation", "LiveNavigation", "MatchEndedNavigation", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$LiveNavigation;", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$MatchEndedNavigation;", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$PreMatchNavigation;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface NavigationUiEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$MatchEndedNavigation;", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MatchEndedNavigation implements NavigationUiEvent {
        public static final int $stable = 0;
        public static final MatchEndedNavigation INSTANCE = new MatchEndedNavigation();

        private MatchEndedNavigation() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MatchEndedNavigation);
        }

        public int hashCode() {
            return -244423998;
        }

        public String toString() {
            return "MatchEndedNavigation";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$PreMatchNavigation;", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "Lcom/sportybet/plugin/realsports/data/Event;", "eventDetailsNavigation", "Lcom/sportybet/plugin/realsports/prematch/data/EventDetailsNavigation;", "<init>", "(Lcom/sportybet/plugin/realsports/data/Event;Lcom/sportybet/plugin/realsports/prematch/data/EventDetailsNavigation;)V", "getEvent", "()Lcom/sportybet/plugin/realsports/data/Event;", "getEventDetailsNavigation", "()Lcom/sportybet/plugin/realsports/prematch/data/EventDetailsNavigation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PreMatchNavigation implements NavigationUiEvent {
        public static final int $stable = 8;
        private final Event event;
        private final EventDetailsNavigation eventDetailsNavigation;

        public PreMatchNavigation(Event event, EventDetailsNavigation eventDetailsNavigation) {
            event.getClass();
            eventDetailsNavigation.getClass();
            this.event = event;
            this.eventDetailsNavigation = eventDetailsNavigation;
        }

        public static /* synthetic */ PreMatchNavigation copy$default(PreMatchNavigation preMatchNavigation, Event event, EventDetailsNavigation eventDetailsNavigation, int i, Object obj) {
            if ((i & 1) != 0) {
                event = preMatchNavigation.event;
            }
            if ((i & 2) != 0) {
                eventDetailsNavigation = preMatchNavigation.eventDetailsNavigation;
            }
            return preMatchNavigation.copy(event, eventDetailsNavigation);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Event getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EventDetailsNavigation getEventDetailsNavigation() {
            return this.eventDetailsNavigation;
        }

        public final PreMatchNavigation copy(Event event, EventDetailsNavigation eventDetailsNavigation) {
            event.getClass();
            eventDetailsNavigation.getClass();
            return new PreMatchNavigation(event, eventDetailsNavigation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreMatchNavigation)) {
                return false;
            }
            PreMatchNavigation preMatchNavigation = (PreMatchNavigation) other;
            return Intrinsics.g(this.event, preMatchNavigation.event) && this.eventDetailsNavigation == preMatchNavigation.eventDetailsNavigation;
        }

        public final Event getEvent() {
            return this.event;
        }

        public final EventDetailsNavigation getEventDetailsNavigation() {
            return this.eventDetailsNavigation;
        }

        public int hashCode() {
            return this.eventDetailsNavigation.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return "PreMatchNavigation(event=" + this.event + ", eventDetailsNavigation=" + this.eventDetailsNavigation + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent$LiveNavigation;", "Lcom/sportybet/plugin/realsports/prematch/data/NavigationUiEvent;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "finishCurrentActivity", "", "<init>", "(Ljava/lang/String;Z)V", "getEventId", "()Ljava/lang/String;", "getFinishCurrentActivity", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LiveNavigation implements NavigationUiEvent {
        public static final int $stable = 0;
        private final String eventId;
        private final boolean finishCurrentActivity;

        public LiveNavigation(String str, boolean z) {
            str.getClass();
            this.eventId = str;
            this.finishCurrentActivity = z;
        }

        public static /* synthetic */ LiveNavigation copy$default(LiveNavigation liveNavigation, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = liveNavigation.eventId;
            }
            if ((i & 2) != 0) {
                z = liveNavigation.finishCurrentActivity;
            }
            return liveNavigation.copy(str, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getFinishCurrentActivity() {
            return this.finishCurrentActivity;
        }

        public final LiveNavigation copy(String eventId, boolean finishCurrentActivity) {
            eventId.getClass();
            return new LiveNavigation(eventId, finishCurrentActivity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveNavigation)) {
                return false;
            }
            LiveNavigation liveNavigation = (LiveNavigation) other;
            return Intrinsics.g(this.eventId, liveNavigation.eventId) && this.finishCurrentActivity == liveNavigation.finishCurrentActivity;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final boolean getFinishCurrentActivity() {
            return this.finishCurrentActivity;
        }

        public int hashCode() {
            return Boolean.hashCode(this.finishCurrentActivity) + (this.eventId.hashCode() * 31);
        }

        public String toString() {
            return tzx.a("LiveNavigation(eventId=", this.eventId, ", finishCurrentActivity=", ")", this.finishCurrentActivity);
        }

        public /* synthetic */ LiveNavigation(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }
    }
}
