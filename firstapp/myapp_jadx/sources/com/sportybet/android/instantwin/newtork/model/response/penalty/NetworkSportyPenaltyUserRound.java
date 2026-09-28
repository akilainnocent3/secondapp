package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyUserRound;", "", "roundInfo", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyRoundInfo;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyRoundInfo;)V", "getRoundInfo", "()Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyRoundInfo;", "Lcom/google/gson/annotations/SerializedName;", "value", "userRoundVO", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyUserRound {
    public static final int $stable = NetworkSportyPenaltyRoundInfo.$stable;

    @SerializedName("userRoundVO")
    private final NetworkSportyPenaltyRoundInfo roundInfo;

    public NetworkSportyPenaltyUserRound(NetworkSportyPenaltyRoundInfo networkSportyPenaltyRoundInfo) {
        this.roundInfo = networkSportyPenaltyRoundInfo;
    }

    public static /* synthetic */ NetworkSportyPenaltyUserRound copy$default(NetworkSportyPenaltyUserRound networkSportyPenaltyUserRound, NetworkSportyPenaltyRoundInfo networkSportyPenaltyRoundInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            networkSportyPenaltyRoundInfo = networkSportyPenaltyUserRound.roundInfo;
        }
        return networkSportyPenaltyUserRound.copy(networkSportyPenaltyRoundInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NetworkSportyPenaltyRoundInfo getRoundInfo() {
        return this.roundInfo;
    }

    public final NetworkSportyPenaltyUserRound copy(NetworkSportyPenaltyRoundInfo roundInfo) {
        return new NetworkSportyPenaltyUserRound(roundInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkSportyPenaltyUserRound) && Intrinsics.g(this.roundInfo, ((NetworkSportyPenaltyUserRound) other).roundInfo);
    }

    public final NetworkSportyPenaltyRoundInfo getRoundInfo() {
        return this.roundInfo;
    }

    public int hashCode() {
        NetworkSportyPenaltyRoundInfo networkSportyPenaltyRoundInfo = this.roundInfo;
        if (networkSportyPenaltyRoundInfo == null) {
            return 0;
        }
        return networkSportyPenaltyRoundInfo.hashCode();
    }

    public String toString() {
        return "NetworkSportyPenaltyUserRound(roundInfo=" + this.roundInfo + ")";
    }
}
