package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationSettleRound;", "", "roundId", "", "bizCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getRoundId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getBizCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationSettleRound;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationSettleRound {
    public static final int $stable = 0;

    @SerializedName("bizCode")
    private final Integer bizCode;

    @SerializedName("roundId")
    private final String roundId;

    public NetworkSimulationSettleRound(String str, Integer num) {
        this.roundId = str;
        this.bizCode = num;
    }

    public static /* synthetic */ NetworkSimulationSettleRound copy$default(NetworkSimulationSettleRound networkSimulationSettleRound, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationSettleRound.roundId;
        }
        if ((i & 2) != 0) {
            num = networkSimulationSettleRound.bizCode;
        }
        return networkSimulationSettleRound.copy(str, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final NetworkSimulationSettleRound copy(String roundId, Integer bizCode) {
        return new NetworkSimulationSettleRound(roundId, bizCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationSettleRound)) {
            return false;
        }
        NetworkSimulationSettleRound networkSimulationSettleRound = (NetworkSimulationSettleRound) other;
        return Intrinsics.g(this.roundId, networkSimulationSettleRound.roundId) && Intrinsics.g(this.bizCode, networkSimulationSettleRound.bizCode);
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        String str = this.roundId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.bizCode;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSimulationSettleRound(roundId=" + this.roundId + ", bizCode=" + this.bizCode + ")";
    }
}
