package com.sporty.android.core.model.matchalert;

import com.sporty.android.core.model.pageable.Pageable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/matchalert/SubscribedEventsResponse;", "", "isAllNotificationEnabled", "", AnalyticsParam.MINI_GAMES_PAGE, "Lcom/sporty/android/core/model/pageable/Pageable;", "Lcom/sporty/android/core/model/matchalert/SubscribedEventDto;", "<init>", "(Ljava/lang/Boolean;Lcom/sporty/android/core/model/pageable/Pageable;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPage", "()Lcom/sporty/android/core/model/pageable/Pageable;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Lcom/sporty/android/core/model/pageable/Pageable;)Lcom/sporty/android/core/model/matchalert/SubscribedEventsResponse;", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SubscribedEventsResponse {
    private final Boolean isAllNotificationEnabled;
    private final Pageable<SubscribedEventDto> page;

    public SubscribedEventsResponse(Boolean bool, Pageable<SubscribedEventDto> pageable) {
        this.isAllNotificationEnabled = bool;
        this.page = pageable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscribedEventsResponse copy$default(SubscribedEventsResponse subscribedEventsResponse, Boolean bool, Pageable pageable, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = subscribedEventsResponse.isAllNotificationEnabled;
        }
        if ((i & 2) != 0) {
            pageable = subscribedEventsResponse.page;
        }
        return subscribedEventsResponse.copy(bool, pageable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAllNotificationEnabled() {
        return this.isAllNotificationEnabled;
    }

    public final Pageable<SubscribedEventDto> component2() {
        return this.page;
    }

    public final SubscribedEventsResponse copy(Boolean isAllNotificationEnabled, Pageable<SubscribedEventDto> page) {
        return new SubscribedEventsResponse(isAllNotificationEnabled, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribedEventsResponse)) {
            return false;
        }
        SubscribedEventsResponse subscribedEventsResponse = (SubscribedEventsResponse) other;
        return Intrinsics.g(this.isAllNotificationEnabled, subscribedEventsResponse.isAllNotificationEnabled) && Intrinsics.g(this.page, subscribedEventsResponse.page);
    }

    public final Pageable<SubscribedEventDto> getPage() {
        return this.page;
    }

    public int hashCode() {
        Boolean bool = this.isAllNotificationEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Pageable<SubscribedEventDto> pageable = this.page;
        return iHashCode + (pageable != null ? pageable.hashCode() : 0);
    }

    public final Boolean isAllNotificationEnabled() {
        return this.isAllNotificationEnabled;
    }

    public String toString() {
        return "SubscribedEventsResponse(isAllNotificationEnabled=" + this.isAllNotificationEnabled + ", page=" + this.page + ")";
    }
}
