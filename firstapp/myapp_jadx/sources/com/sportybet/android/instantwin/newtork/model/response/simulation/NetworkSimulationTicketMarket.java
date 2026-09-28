package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketMarket;", "", "marketId", "", "title", "outcomes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMarketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getOutcomes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketMarket {
    public static final int $stable = 8;

    @SerializedName("marketId")
    private final String marketId;

    @SerializedName("outcomes")
    private final List<NetworkSimulationTicketOutcome> outcomes;

    @SerializedName("title")
    private final String title;

    public NetworkSimulationTicketMarket(String str, String str2, List<NetworkSimulationTicketOutcome> list) {
        this.marketId = str;
        this.title = str2;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationTicketMarket copy$default(NetworkSimulationTicketMarket networkSimulationTicketMarket, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketMarket.marketId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketMarket.title;
        }
        if ((i & 4) != 0) {
            list = networkSimulationTicketMarket.outcomes;
        }
        return networkSimulationTicketMarket.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<NetworkSimulationTicketOutcome> component3() {
        return this.outcomes;
    }

    public final NetworkSimulationTicketMarket copy(String marketId, String title, List<NetworkSimulationTicketOutcome> outcomes) {
        return new NetworkSimulationTicketMarket(marketId, title, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketMarket)) {
            return false;
        }
        NetworkSimulationTicketMarket networkSimulationTicketMarket = (NetworkSimulationTicketMarket) other;
        return Intrinsics.g(this.marketId, networkSimulationTicketMarket.marketId) && Intrinsics.g(this.title, networkSimulationTicketMarket.title) && Intrinsics.g(this.outcomes, networkSimulationTicketMarket.outcomes);
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final List<NetworkSimulationTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<NetworkSimulationTicketOutcome> list = this.outcomes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.title;
        return ng1.a(ux5.a("NetworkSimulationTicketMarket(marketId=", str, ", title=", str2, ", outcomes="), this.outcomes, ")");
    }
}
