package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\nHÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR'\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsTicket;", "", "ticketId", "", "ticketNumber", "type", "totalStake", "", "createTime", "flexibleFitSize", "", "totalOdds", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketBet;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;Ljava/util/List;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getTotalStake", "()J", "getCreateTime", "getFlexibleFitSize", "()I", "getTotalOdds", "getBets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballOpenBetsTicket {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<NetworkScheduledFootballTicketBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("flexibleFitSize")
    private final int flexibleFitSize;

    @SerializedName("ticketId")
    private final String ticketId;

    @SerializedName("ticketNumber")
    private final String ticketNumber;

    @SerializedName("totalOdds")
    private final String totalOdds;

    @SerializedName("totalStake")
    private final long totalStake;

    @SerializedName("type")
    private final String type;

    public NetworkScheduledFootballOpenBetsTicket(String str, String str2, String str3, long j, long j2, int i, String str4, List<NetworkScheduledFootballTicketBet> list) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.totalStake = j;
        this.createTime = j2;
        this.flexibleFitSize = i;
        this.totalOdds = str4;
        this.bets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballOpenBetsTicket copy$default(NetworkScheduledFootballOpenBetsTicket networkScheduledFootballOpenBetsTicket, String str, String str2, String str3, long j, long j2, int i, String str4, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballOpenBetsTicket.ticketId;
        }
        if ((i2 & 2) != 0) {
            str2 = networkScheduledFootballOpenBetsTicket.ticketNumber;
        }
        if ((i2 & 4) != 0) {
            str3 = networkScheduledFootballOpenBetsTicket.type;
        }
        if ((i2 & 8) != 0) {
            j = networkScheduledFootballOpenBetsTicket.totalStake;
        }
        if ((i2 & 16) != 0) {
            j2 = networkScheduledFootballOpenBetsTicket.createTime;
        }
        if ((i2 & 32) != 0) {
            i = networkScheduledFootballOpenBetsTicket.flexibleFitSize;
        }
        if ((i2 & 64) != 0) {
            str4 = networkScheduledFootballOpenBetsTicket.totalOdds;
        }
        if ((i2 & 128) != 0) {
            list = networkScheduledFootballOpenBetsTicket.bets;
        }
        List list2 = list;
        int i3 = i;
        long j3 = j2;
        long j4 = j;
        String str5 = str3;
        return networkScheduledFootballOpenBetsTicket.copy(str, str2, str5, j4, j3, i3, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
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
    public final long getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final List<NetworkScheduledFootballTicketBet> component8() {
        return this.bets;
    }

    public final NetworkScheduledFootballOpenBetsTicket copy(String ticketId, String ticketNumber, String type, long totalStake, long createTime, int flexibleFitSize, String totalOdds, List<NetworkScheduledFootballTicketBet> bets) {
        return new NetworkScheduledFootballOpenBetsTicket(ticketId, ticketNumber, type, totalStake, createTime, flexibleFitSize, totalOdds, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballOpenBetsTicket)) {
            return false;
        }
        NetworkScheduledFootballOpenBetsTicket networkScheduledFootballOpenBetsTicket = (NetworkScheduledFootballOpenBetsTicket) other;
        return Intrinsics.g(this.ticketId, networkScheduledFootballOpenBetsTicket.ticketId) && Intrinsics.g(this.ticketNumber, networkScheduledFootballOpenBetsTicket.ticketNumber) && Intrinsics.g(this.type, networkScheduledFootballOpenBetsTicket.type) && this.totalStake == networkScheduledFootballOpenBetsTicket.totalStake && this.createTime == networkScheduledFootballOpenBetsTicket.createTime && this.flexibleFitSize == networkScheduledFootballOpenBetsTicket.flexibleFitSize && Intrinsics.g(this.totalOdds, networkScheduledFootballOpenBetsTicket.totalOdds) && Intrinsics.g(this.bets, networkScheduledFootballOpenBetsTicket.bets);
    }

    public final List<NetworkScheduledFootballTicketBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    public final String getTotalOdds() {
        return this.totalOdds;
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
        int iA = gpp.a(this.flexibleFitSize, f87.a(f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.totalStake, 31), this.createTime, 31), 31);
        String str4 = this.totalOdds;
        int iHashCode3 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<NetworkScheduledFootballTicketBet> list = this.bets;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        long j = this.totalStake;
        long j2 = this.createTime;
        int i = this.flexibleFitSize;
        String str4 = this.totalOdds;
        List<NetworkScheduledFootballTicketBet> list = this.bets;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballOpenBetsTicket(ticketId=", str, ", ticketNumber=", str2, ", type=");
        l.a(j, str3, ", totalStake=", sbA);
        g41.a(j2, ", createTime=", ", flexibleFitSize=", sbA);
        f78.b(i, ", totalOdds=", str4, ", bets=", sbA);
        return ng1.a(sbA, list, ")");
    }
}
