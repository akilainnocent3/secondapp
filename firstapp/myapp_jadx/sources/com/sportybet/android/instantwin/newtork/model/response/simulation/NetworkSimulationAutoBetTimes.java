package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetTimes;", "", "limit", "", "<init>", "(Ljava/lang/Integer;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "(Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetTimes;", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationAutoBetTimes {
    public static final int $stable = 0;

    @SerializedName("limit")
    private final Integer limit;

    public NetworkSimulationAutoBetTimes(Integer num) {
        this.limit = num;
    }

    public static /* synthetic */ NetworkSimulationAutoBetTimes copy$default(NetworkSimulationAutoBetTimes networkSimulationAutoBetTimes, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = networkSimulationAutoBetTimes.limit;
        }
        return networkSimulationAutoBetTimes.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final NetworkSimulationAutoBetTimes copy(Integer limit) {
        return new NetworkSimulationAutoBetTimes(limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkSimulationAutoBetTimes) && Intrinsics.g(this.limit, ((NetworkSimulationAutoBetTimes) other).limit);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        Integer num = this.limit;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "NetworkSimulationAutoBetTimes(limit=" + this.limit + ")";
    }
}
