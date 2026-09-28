package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.response.simulation.detail.NetworkSimulationTicket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationBetHistory;", "", "total", "", "data", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicket;", "<init>", "(ILjava/util/List;)V", "getTotal", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationBetHistory {
    public static final int $stable = 8;

    @SerializedName("data")
    private final List<NetworkSimulationTicket> data;

    @SerializedName("total")
    private final int total;

    public NetworkSimulationBetHistory(int i, List<NetworkSimulationTicket> list) {
        this.total = i;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationBetHistory copy$default(NetworkSimulationBetHistory networkSimulationBetHistory, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkSimulationBetHistory.total;
        }
        if ((i2 & 2) != 0) {
            list = networkSimulationBetHistory.data;
        }
        return networkSimulationBetHistory.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<NetworkSimulationTicket> component2() {
        return this.data;
    }

    public final NetworkSimulationBetHistory copy(int total, List<NetworkSimulationTicket> data) {
        return new NetworkSimulationBetHistory(total, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationBetHistory)) {
            return false;
        }
        NetworkSimulationBetHistory networkSimulationBetHistory = (NetworkSimulationBetHistory) other;
        return this.total == networkSimulationBetHistory.total && Intrinsics.g(this.data, networkSimulationBetHistory.data);
    }

    public final List<NetworkSimulationTicket> getData() {
        return this.data;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.total) * 31;
        List<NetworkSimulationTicket> list = this.data;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "NetworkSimulationBetHistory(total=" + this.total + ", data=" + this.data + ")";
    }
}
