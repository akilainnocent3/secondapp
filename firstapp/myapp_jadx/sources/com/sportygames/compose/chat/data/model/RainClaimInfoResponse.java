package com.sportygames.compose.chat.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/sportygames/compose/chat/data/model/RainClaimInfoResponse;", "", "claimCount", "", "claimCountLimit", "claimLimitDuration", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getClaimCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClaimCountLimit", "getClaimLimitDuration", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportygames/compose/chat/data/model/RainClaimInfoResponse;", "equals", "", "other", "hashCode", "toString", "", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RainClaimInfoResponse {
    public static final int $stable = 0;
    private final Integer claimCount;
    private final Integer claimCountLimit;
    private final Integer claimLimitDuration;

    public RainClaimInfoResponse(Integer num, Integer num2, Integer num3) {
        this.claimCount = num;
        this.claimCountLimit = num2;
        this.claimLimitDuration = num3;
    }

    public static /* synthetic */ RainClaimInfoResponse copy$default(RainClaimInfoResponse rainClaimInfoResponse, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rainClaimInfoResponse.claimCount;
        }
        if ((i & 2) != 0) {
            num2 = rainClaimInfoResponse.claimCountLimit;
        }
        if ((i & 4) != 0) {
            num3 = rainClaimInfoResponse.claimLimitDuration;
        }
        return rainClaimInfoResponse.copy(num, num2, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getClaimCount() {
        return this.claimCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClaimCountLimit() {
        return this.claimCountLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getClaimLimitDuration() {
        return this.claimLimitDuration;
    }

    public final RainClaimInfoResponse copy(Integer claimCount, Integer claimCountLimit, Integer claimLimitDuration) {
        return new RainClaimInfoResponse(claimCount, claimCountLimit, claimLimitDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainClaimInfoResponse)) {
            return false;
        }
        RainClaimInfoResponse rainClaimInfoResponse = (RainClaimInfoResponse) other;
        return Intrinsics.g(this.claimCount, rainClaimInfoResponse.claimCount) && Intrinsics.g(this.claimCountLimit, rainClaimInfoResponse.claimCountLimit) && Intrinsics.g(this.claimLimitDuration, rainClaimInfoResponse.claimLimitDuration);
    }

    public final Integer getClaimCount() {
        return this.claimCount;
    }

    public final Integer getClaimCountLimit() {
        return this.claimCountLimit;
    }

    public final Integer getClaimLimitDuration() {
        return this.claimLimitDuration;
    }

    public int hashCode() {
        Integer num = this.claimCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.claimCountLimit;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.claimLimitDuration;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "RainClaimInfoResponse(claimCount=" + this.claimCount + ", claimCountLimit=" + this.claimCountLimit + ", claimLimitDuration=" + this.claimLimitDuration + ')';
    }
}
