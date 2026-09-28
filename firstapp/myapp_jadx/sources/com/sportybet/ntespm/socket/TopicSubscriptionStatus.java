package com.sportybet.ntespm.socket;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.twilio.voice.EventKeys;
import defpackage.f87;
import defpackage.gpp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sportybet/ntespm/socket/TopicSubscriptionStatus;", "", "state", "Lcom/sportybet/ntespm/socket/TopicSubscriptionState;", "requestId", "", EventKeys.TIMESTAMP, "", "previousState", "<init>", "(Lcom/sportybet/ntespm/socket/TopicSubscriptionState;IJLcom/sportybet/ntespm/socket/TopicSubscriptionState;)V", "getState", "()Lcom/sportybet/ntespm/socket/TopicSubscriptionState;", "getRequestId", "()I", "getTimestamp", "()J", "getPreviousState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopicSubscriptionStatus {
    public static final int $stable = 0;
    private final TopicSubscriptionState previousState;
    private final int requestId;
    private final TopicSubscriptionState state;
    private final long timestamp;

    public /* synthetic */ TopicSubscriptionStatus(TopicSubscriptionState topicSubscriptionState, int i, long j, TopicSubscriptionState topicSubscriptionState2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? TopicSubscriptionState.NOT_SUBSCRIBED : topicSubscriptionState, i, j, (i2 & 8) != 0 ? TopicSubscriptionState.NOT_SUBSCRIBED : topicSubscriptionState2);
    }

    public static /* synthetic */ TopicSubscriptionStatus copy$default(TopicSubscriptionStatus topicSubscriptionStatus, TopicSubscriptionState topicSubscriptionState, int i, long j, TopicSubscriptionState topicSubscriptionState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            topicSubscriptionState = topicSubscriptionStatus.state;
        }
        if ((i2 & 2) != 0) {
            i = topicSubscriptionStatus.requestId;
        }
        if ((i2 & 4) != 0) {
            j = topicSubscriptionStatus.timestamp;
        }
        if ((i2 & 8) != 0) {
            topicSubscriptionState2 = topicSubscriptionStatus.previousState;
        }
        TopicSubscriptionState topicSubscriptionState3 = topicSubscriptionState2;
        return topicSubscriptionStatus.copy(topicSubscriptionState, i, j, topicSubscriptionState3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TopicSubscriptionState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TopicSubscriptionState getPreviousState() {
        return this.previousState;
    }

    public final TopicSubscriptionStatus copy(TopicSubscriptionState state, int requestId, long timestamp, TopicSubscriptionState previousState) {
        state.getClass();
        previousState.getClass();
        return new TopicSubscriptionStatus(state, requestId, timestamp, previousState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicSubscriptionStatus)) {
            return false;
        }
        TopicSubscriptionStatus topicSubscriptionStatus = (TopicSubscriptionStatus) other;
        return this.state == topicSubscriptionStatus.state && this.requestId == topicSubscriptionStatus.requestId && this.timestamp == topicSubscriptionStatus.timestamp && this.previousState == topicSubscriptionStatus.previousState;
    }

    public final TopicSubscriptionState getPreviousState() {
        return this.previousState;
    }

    public final int getRequestId() {
        return this.requestId;
    }

    public final TopicSubscriptionState getState() {
        return this.state;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.previousState.hashCode() + f87.a(gpp.a(this.requestId, this.state.hashCode() * 31, 31), this.timestamp, 31);
    }

    public String toString() {
        return "TopicSubscriptionStatus(state=" + this.state + ", requestId=" + this.requestId + llGRV.VdNRfbcebO + this.timestamp + ", previousState=" + this.previousState + ")";
    }

    public TopicSubscriptionStatus(TopicSubscriptionState topicSubscriptionState, int i, long j, TopicSubscriptionState topicSubscriptionState2) {
        topicSubscriptionState.getClass();
        topicSubscriptionState2.getClass();
        this.state = topicSubscriptionState;
        this.requestId = i;
        this.timestamp = j;
        this.previousState = topicSubscriptionState2;
    }
}
