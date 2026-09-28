package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetConfig;", "", "isEnable", "", "times", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetTimes;", "<init>", "(ZLcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetTimes;)V", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "enable", "getTimes", "()Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationAutoBetTimes;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationAutoBetConfig {
    public static final int $stable = NetworkSimulationAutoBetTimes.$stable;

    @SerializedName("enable")
    private final boolean isEnable;

    @SerializedName("times")
    private final NetworkSimulationAutoBetTimes times;

    public NetworkSimulationAutoBetConfig(boolean z, NetworkSimulationAutoBetTimes networkSimulationAutoBetTimes) {
        this.isEnable = z;
        this.times = networkSimulationAutoBetTimes;
    }

    public static /* synthetic */ NetworkSimulationAutoBetConfig copy$default(NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig, boolean z, NetworkSimulationAutoBetTimes networkSimulationAutoBetTimes, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkSimulationAutoBetConfig.isEnable;
        }
        if ((i & 2) != 0) {
            networkSimulationAutoBetTimes = networkSimulationAutoBetConfig.times;
        }
        return networkSimulationAutoBetConfig.copy(z, networkSimulationAutoBetTimes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NetworkSimulationAutoBetTimes getTimes() {
        return this.times;
    }

    public final NetworkSimulationAutoBetConfig copy(boolean isEnable, NetworkSimulationAutoBetTimes times) {
        return new NetworkSimulationAutoBetConfig(isEnable, times);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationAutoBetConfig)) {
            return false;
        }
        NetworkSimulationAutoBetConfig networkSimulationAutoBetConfig = (NetworkSimulationAutoBetConfig) other;
        return this.isEnable == networkSimulationAutoBetConfig.isEnable && Intrinsics.g(this.times, networkSimulationAutoBetConfig.times);
    }

    public final NetworkSimulationAutoBetTimes getTimes() {
        return this.times;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnable) * 31;
        NetworkSimulationAutoBetTimes networkSimulationAutoBetTimes = this.times;
        return iHashCode + (networkSimulationAutoBetTimes == null ? 0 : networkSimulationAutoBetTimes.hashCode());
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public String toString() {
        return "NetworkSimulationAutoBetConfig(isEnable=" + this.isEnable + ", times=" + this.times + ")";
    }
}
