package com.sportybet.feature.recap.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013Ê\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapData;", "", "hasRecap", "", "playedSports", "", "Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapPlayedSports;", "ticketStats", "Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapTicketStats;", "topMarkets", "Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapTopMarkets;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHasRecap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "getPlayedSports", "()Ljava/util/List;", "amount1a", "getTicketStats", "amount1b", "getTopMarkets", "topN", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapData;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkRecapData {

    @SerializedName("hasRecap")
    private final Boolean hasRecap;

    @SerializedName("amount1a")
    private final List<NetworkRecapPlayedSports> playedSports;

    @SerializedName("amount1b")
    private final List<NetworkRecapTicketStats> ticketStats;

    @SerializedName("topN")
    private final List<NetworkRecapTopMarkets> topMarkets;

    public NetworkRecapData(Boolean bool, List<NetworkRecapPlayedSports> list, List<NetworkRecapTicketStats> list2, List<NetworkRecapTopMarkets> list3) {
        this.hasRecap = bool;
        this.playedSports = list;
        this.ticketStats = list2;
        this.topMarkets = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRecapData copy$default(NetworkRecapData networkRecapData, Boolean bool, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = networkRecapData.hasRecap;
        }
        if ((i & 2) != 0) {
            list = networkRecapData.playedSports;
        }
        if ((i & 4) != 0) {
            list2 = networkRecapData.ticketStats;
        }
        if ((i & 8) != 0) {
            list3 = networkRecapData.topMarkets;
        }
        return networkRecapData.copy(bool, list, list2, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getHasRecap() {
        return this.hasRecap;
    }

    public final List<NetworkRecapPlayedSports> component2() {
        return this.playedSports;
    }

    public final List<NetworkRecapTicketStats> component3() {
        return this.ticketStats;
    }

    public final List<NetworkRecapTopMarkets> component4() {
        return this.topMarkets;
    }

    public final NetworkRecapData copy(Boolean hasRecap, List<NetworkRecapPlayedSports> playedSports, List<NetworkRecapTicketStats> ticketStats, List<NetworkRecapTopMarkets> topMarkets) {
        return new NetworkRecapData(hasRecap, playedSports, ticketStats, topMarkets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRecapData)) {
            return false;
        }
        NetworkRecapData networkRecapData = (NetworkRecapData) other;
        return Intrinsics.g(this.hasRecap, networkRecapData.hasRecap) && Intrinsics.g(this.playedSports, networkRecapData.playedSports) && Intrinsics.g(this.ticketStats, networkRecapData.ticketStats) && Intrinsics.g(this.topMarkets, networkRecapData.topMarkets);
    }

    public final Boolean getHasRecap() {
        return this.hasRecap;
    }

    public final List<NetworkRecapPlayedSports> getPlayedSports() {
        return this.playedSports;
    }

    public final List<NetworkRecapTicketStats> getTicketStats() {
        return this.ticketStats;
    }

    public final List<NetworkRecapTopMarkets> getTopMarkets() {
        return this.topMarkets;
    }

    public int hashCode() {
        Boolean bool = this.hasRecap;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<NetworkRecapPlayedSports> list = this.playedSports;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkRecapTicketStats> list2 = this.ticketStats;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkRecapTopMarkets> list3 = this.topMarkets;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.hasRecap;
        List<NetworkRecapPlayedSports> list = this.playedSports;
        List<NetworkRecapTicketStats> list2 = this.ticketStats;
        List<NetworkRecapTopMarkets> list3 = this.topMarkets;
        StringBuilder sb = new StringBuilder("NetworkRecapData(hasRecap=");
        sb.append(bool);
        sb.append(", playedSports=");
        sb.append(list);
        sb.append(", ticketStats=");
        return v9d.a(", topMarkets=", ")", sb, list2, list3);
    }
}
