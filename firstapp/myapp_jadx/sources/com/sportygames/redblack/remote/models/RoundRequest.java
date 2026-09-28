package com.sportygames.redblack.remote.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/sportygames/redblack/remote/models/RoundRequest;", "", "roundId", "", "<init>", "(Ljava/lang/Long;)V", "getRoundId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/sportygames/redblack/remote/models/RoundRequest;", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundRequest {
    public static final int $stable = 0;
    private final Long roundId;

    public RoundRequest(Long l) {
        this.roundId = l;
    }

    public static /* synthetic */ RoundRequest copy$default(RoundRequest roundRequest, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = roundRequest.roundId;
        }
        return roundRequest.copy(l);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRoundId() {
        return this.roundId;
    }

    public final RoundRequest copy(Long roundId) {
        return new RoundRequest(roundId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RoundRequest) && Intrinsics.g(this.roundId, ((RoundRequest) other).roundId);
    }

    public final Long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        Long l = this.roundId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "RoundRequest(roundId=" + this.roundId + ")";
    }
}
