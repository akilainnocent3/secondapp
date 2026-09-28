package com.sportybet.android.instantwin.newtork.model.response.simulation.detail;

import com.google.gson.annotations.SerializedName;
import defpackage.em5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010.JÂ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010@J\u0014\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010D\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010E\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R%\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R-\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R%\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R)\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0016¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.Ê\u0001\f\bG\u0012\b\bH\u0012\u0004\b\u0003\u0010\u0002¨\u0006F"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicket;", "", "ticketId", "", "ticketNumber", "type", "sportId", "totalStake", "", "totalReturn", "createTime", "roundId", "giftId", "giftAmount", "", "giftKind", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailBet;", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicketDetailEvent;", "wht", "flexibleMinWinnings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;JLjava/lang/Integer;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getSportId", "getTotalStake", "()J", "getTotalReturn", "getCreateTime", "getRoundId", "getGiftId", "getGiftAmount", "()I", "getGiftKind", "getBets", "()Ljava/util/List;", "getEvents", "getWht", "getFlexibleMinWinnings", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;JLjava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/response/simulation/detail/NetworkSimulationTicket;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicket {
    public static final int $stable = 0;

    @SerializedName("bets")
    private final List<NetworkSimulationTicketDetailBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("events")
    private final List<NetworkSimulationTicketDetailEvent> events;

    @SerializedName("flexibleMinWinnings")
    private final Integer flexibleMinWinnings;

    @SerializedName("giftAmount")
    private final int giftAmount;

    @SerializedName("giftId")
    private final String giftId;

    @SerializedName("giftKind")
    private final int giftKind;

    @SerializedName("roundId")
    private final String roundId;

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

    @SerializedName("wht")
    private final long wht;

    public NetworkSimulationTicket(String str, String str2, String str3, String str4, long j, long j2, long j3, String str5, String str6, int i, int i2, List<NetworkSimulationTicketDetailBet> list, List<NetworkSimulationTicketDetailEvent> list2, long j4, Integer num) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.sportId = str4;
        this.totalStake = j;
        this.totalReturn = j2;
        this.createTime = j3;
        this.roundId = str5;
        this.giftId = str6;
        this.giftAmount = i;
        this.giftKind = i2;
        this.bets = list;
        this.events = list2;
        this.wht = j4;
        this.flexibleMinWinnings = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    public final List<NetworkSimulationTicketDetailBet> component12() {
        return this.bets;
    }

    public final List<NetworkSimulationTicketDetailEvent> component13() {
        return this.events;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getFlexibleMinWinnings() {
        return this.flexibleMinWinnings;
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
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    public final NetworkSimulationTicket copy(String ticketId, String ticketNumber, String type, String sportId, long totalStake, long totalReturn, long createTime, String roundId, String giftId, int giftAmount, int giftKind, List<NetworkSimulationTicketDetailBet> bets, List<NetworkSimulationTicketDetailEvent> events, long wht, Integer flexibleMinWinnings) {
        return new NetworkSimulationTicket(ticketId, ticketNumber, type, sportId, totalStake, totalReturn, createTime, roundId, giftId, giftAmount, giftKind, bets, events, wht, flexibleMinWinnings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicket)) {
            return false;
        }
        NetworkSimulationTicket networkSimulationTicket = (NetworkSimulationTicket) other;
        return Intrinsics.g(this.ticketId, networkSimulationTicket.ticketId) && Intrinsics.g(this.ticketNumber, networkSimulationTicket.ticketNumber) && Intrinsics.g(this.type, networkSimulationTicket.type) && Intrinsics.g(this.sportId, networkSimulationTicket.sportId) && this.totalStake == networkSimulationTicket.totalStake && this.totalReturn == networkSimulationTicket.totalReturn && this.createTime == networkSimulationTicket.createTime && Intrinsics.g(this.roundId, networkSimulationTicket.roundId) && Intrinsics.g(this.giftId, networkSimulationTicket.giftId) && this.giftAmount == networkSimulationTicket.giftAmount && this.giftKind == networkSimulationTicket.giftKind && Intrinsics.g(this.bets, networkSimulationTicket.bets) && Intrinsics.g(this.events, networkSimulationTicket.events) && this.wht == networkSimulationTicket.wht && Intrinsics.g(this.flexibleMinWinnings, networkSimulationTicket.flexibleMinWinnings);
    }

    public final List<NetworkSimulationTicketDetailBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkSimulationTicketDetailEvent> getEvents() {
        return this.events;
    }

    public final Integer getFlexibleMinWinnings() {
        return this.flexibleMinWinnings;
    }

    public final int getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
    }

    public final String getRoundId() {
        return this.roundId;
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

    public final long getWht() {
        return this.wht;
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
        String str5 = this.roundId;
        int iHashCode4 = (iA + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.giftId;
        int iA2 = gpp.a(this.giftKind, gpp.a(this.giftAmount, (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31);
        List<NetworkSimulationTicketDetailBet> list = this.bets;
        int iHashCode5 = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkSimulationTicketDetailEvent> list2 = this.events;
        int iA3 = f87.a((iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31, this.wht, 31);
        Integer num = this.flexibleMinWinnings;
        return iA3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        String str4 = this.sportId;
        long j = this.totalStake;
        long j2 = this.totalReturn;
        long j3 = this.createTime;
        String str5 = this.roundId;
        String str6 = this.giftId;
        int i = this.giftAmount;
        int i2 = this.giftKind;
        List<NetworkSimulationTicketDetailBet> list = this.bets;
        List<NetworkSimulationTicketDetailEvent> list2 = this.events;
        long j4 = this.wht;
        Integer num = this.flexibleMinWinnings;
        StringBuilder sbA = ux5.a("NetworkSimulationTicket(ticketId=", str, ", ticketNumber=", str2, ", type=");
        hxa.c(sbA, str3, ", sportId=", str4, ", totalStake=");
        sbA.append(j);
        g41.a(j2, ", totalReturn=", ", createTime=", sbA);
        em5.a(j3, ", roundId=", str5, sbA);
        sbA.append(", giftId=");
        sbA.append(str6);
        sbA.append(", giftAmount=");
        sbA.append(i);
        sbA.append(", giftKind=");
        sbA.append(i2);
        sbA.append(", bets=");
        sbA.append(list);
        sbA.append(", events=");
        sbA.append(list2);
        sbA.append(", wht=");
        sbA.append(j4);
        sbA.append(", flexibleMinWinnings=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }
}
