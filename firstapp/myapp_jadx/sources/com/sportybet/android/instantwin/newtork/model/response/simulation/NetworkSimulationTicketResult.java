package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.hxa;
import defpackage.qjk;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003J\u008c\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00100J\u0014\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u00020\fHÖ\u0081\u0004J\n\u00105\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R-\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#Ê\u0001\f\b7\u0012\b\b8\u0012\u0004\b\u0003\u0010\u0002¨\u00066"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketResult;", "", "ticketId", "", "ticketNumber", "type", "sportId", "totalStake", "", "totalReturn", "createTime", "flexibleMinWinnings", "", "events", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketEvent;", "bets", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketBet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getSportId", "getTotalStake", "()J", "getTotalReturn", "getCreateTime", "getFlexibleMinWinnings", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEvents", "()Ljava/util/List;", "getBets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketResult;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketResult {
    public static final int $stable = 0;

    @SerializedName("bets")
    private final List<NetworkSimulationTicketBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("events")
    private final List<NetworkSimulationTicketEvent> events;

    @SerializedName("flexibleMinWinnings")
    private final Integer flexibleMinWinnings;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("ticketId")
    private final String ticketId;

    @SerializedName("ticketNumber")
    private final String ticketNumber;

    @SerializedName("totalReturn")
    private final long totalReturn;

    @SerializedName("totalStake")
    private final long totalStake;

    @SerializedName("type")
    private final String type;

    public NetworkSimulationTicketResult(String str, String str2, String str3, String str4, long j, long j2, long j3, Integer num, List<NetworkSimulationTicketEvent> list, List<NetworkSimulationTicketBet> list2) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.sportId = str4;
        this.totalStake = j;
        this.totalReturn = j2;
        this.createTime = j3;
        this.flexibleMinWinnings = num;
        this.events = list;
        this.bets = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationTicketResult copy$default(NetworkSimulationTicketResult networkSimulationTicketResult, String str, String str2, String str3, String str4, long j, long j2, long j3, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketResult.ticketId;
        }
        return networkSimulationTicketResult.copy(str, (i & 2) != 0 ? networkSimulationTicketResult.ticketNumber : str2, (i & 4) != 0 ? networkSimulationTicketResult.type : str3, (i & 8) != 0 ? networkSimulationTicketResult.sportId : str4, (i & 16) != 0 ? networkSimulationTicketResult.totalStake : j, (i & 32) != 0 ? networkSimulationTicketResult.totalReturn : j2, (i & 64) != 0 ? networkSimulationTicketResult.createTime : j3, (i & 128) != 0 ? networkSimulationTicketResult.flexibleMinWinnings : num, (i & 256) != 0 ? networkSimulationTicketResult.events : list, (i & 512) != 0 ? networkSimulationTicketResult.bets : list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    public final List<NetworkSimulationTicketBet> component10() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getFlexibleMinWinnings() {
        return this.flexibleMinWinnings;
    }

    public final List<NetworkSimulationTicketEvent> component9() {
        return this.events;
    }

    public final NetworkSimulationTicketResult copy(String ticketId, String ticketNumber, String type, String sportId, long totalStake, long totalReturn, long createTime, Integer flexibleMinWinnings, List<NetworkSimulationTicketEvent> events, List<NetworkSimulationTicketBet> bets) {
        return new NetworkSimulationTicketResult(ticketId, ticketNumber, type, sportId, totalStake, totalReturn, createTime, flexibleMinWinnings, events, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketResult)) {
            return false;
        }
        NetworkSimulationTicketResult networkSimulationTicketResult = (NetworkSimulationTicketResult) other;
        return Intrinsics.g(this.ticketId, networkSimulationTicketResult.ticketId) && Intrinsics.g(this.ticketNumber, networkSimulationTicketResult.ticketNumber) && Intrinsics.g(this.type, networkSimulationTicketResult.type) && Intrinsics.g(this.sportId, networkSimulationTicketResult.sportId) && this.totalStake == networkSimulationTicketResult.totalStake && this.totalReturn == networkSimulationTicketResult.totalReturn && this.createTime == networkSimulationTicketResult.createTime && Intrinsics.g(this.flexibleMinWinnings, networkSimulationTicketResult.flexibleMinWinnings) && Intrinsics.g(this.events, networkSimulationTicketResult.events) && Intrinsics.g(this.bets, networkSimulationTicketResult.bets);
    }

    public final List<NetworkSimulationTicketBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkSimulationTicketEvent> getEvents() {
        return this.events;
    }

    public final Integer getFlexibleMinWinnings() {
        return this.flexibleMinWinnings;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    public final long getTotalReturn() {
        return this.totalReturn;
    }

    public final long getTotalStake() {
        return this.totalStake;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.ticketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ticketNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sportId;
        int iA = f87.a(f87.a(f87.a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, this.totalStake, 31), this.totalReturn, 31), this.createTime, 31);
        Integer num = this.flexibleMinWinnings;
        int iHashCode4 = (iA + (num == null ? 0 : num.hashCode())) * 31;
        List<NetworkSimulationTicketEvent> list = this.events;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkSimulationTicketBet> list2 = this.bets;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        String str4 = this.sportId;
        long j = this.totalStake;
        long j2 = this.totalReturn;
        long j3 = this.createTime;
        Integer num = this.flexibleMinWinnings;
        List<NetworkSimulationTicketEvent> list = this.events;
        List<NetworkSimulationTicketBet> list2 = this.bets;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketResult(ticketId=", str, ", ticketNumber=", str2, ", type=");
        hxa.c(sbA, str3, ", sportId=", str4, ", totalStake=");
        sbA.append(j);
        g41.a(j2, ", totalReturn=", ", createTime=", sbA);
        sbA.append(j3);
        sbA.append(", flexibleMinWinnings=");
        sbA.append(num);
        qjk.a(", events=", ", bets=", sbA, list, list2);
        sbA.append(")");
        return sbA.toString();
    }
}
