package com.sportygames.pocketrocket.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d020;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse;", "", "ongoingRound", "Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse$WaitingRound;", "waitingRound", "<init>", "(Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse$WaitingRound;Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse$WaitingRound;)V", "getOngoingRound", "()Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse$WaitingRound;", "getWaitingRound", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WaitingRound", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentWaitingResponse {
    public static final int $stable = 0;
    private final WaitingRound ongoingRound;
    private final WaitingRound waitingRound;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse$WaitingRound;", "", AnalyticsParam.EVENT_PARAM_ID, "", "<init>", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingRound {
        public static final int $stable = 0;
        private final long id;

        public WaitingRound(long j) {
            this.id = j;
        }

        public static /* synthetic */ WaitingRound copy$default(WaitingRound waitingRound, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = waitingRound.id;
            }
            return waitingRound.copy(j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        public final WaitingRound copy(long id) {
            return new WaitingRound(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WaitingRound) && this.id == ((WaitingRound) other).id;
        }

        public final long getId() {
            return this.id;
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        public String toString() {
            return d020.a(this.id, "WaitingRound(id=", ")");
        }
    }

    public CurrentWaitingResponse(WaitingRound waitingRound, WaitingRound waitingRound2) {
        waitingRound.getClass();
        waitingRound2.getClass();
        this.ongoingRound = waitingRound;
        this.waitingRound = waitingRound2;
    }

    public static /* synthetic */ CurrentWaitingResponse copy$default(CurrentWaitingResponse currentWaitingResponse, WaitingRound waitingRound, WaitingRound waitingRound2, int i, Object obj) {
        if ((i & 1) != 0) {
            waitingRound = currentWaitingResponse.ongoingRound;
        }
        if ((i & 2) != 0) {
            waitingRound2 = currentWaitingResponse.waitingRound;
        }
        return currentWaitingResponse.copy(waitingRound, waitingRound2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WaitingRound getOngoingRound() {
        return this.ongoingRound;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WaitingRound getWaitingRound() {
        return this.waitingRound;
    }

    public final CurrentWaitingResponse copy(WaitingRound ongoingRound, WaitingRound waitingRound) {
        ongoingRound.getClass();
        waitingRound.getClass();
        return new CurrentWaitingResponse(ongoingRound, waitingRound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentWaitingResponse)) {
            return false;
        }
        CurrentWaitingResponse currentWaitingResponse = (CurrentWaitingResponse) other;
        return Intrinsics.g(this.ongoingRound, currentWaitingResponse.ongoingRound) && Intrinsics.g(this.waitingRound, currentWaitingResponse.waitingRound);
    }

    public final WaitingRound getOngoingRound() {
        return this.ongoingRound;
    }

    public final WaitingRound getWaitingRound() {
        return this.waitingRound;
    }

    public int hashCode() {
        return this.waitingRound.hashCode() + (this.ongoingRound.hashCode() * 31);
    }

    public String toString() {
        return "CurrentWaitingResponse(ongoingRound=" + this.ongoingRound + ", waitingRound=" + this.waitingRound + ")";
    }
}
