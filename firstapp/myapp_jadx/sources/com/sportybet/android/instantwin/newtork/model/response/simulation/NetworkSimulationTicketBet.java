package com.sportybet.android.instantwin.newtork.model.response.simulation;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.ka1;
import defpackage.mtg0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0014\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R%\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketBet;", "", "betId", "", "betGroupId", "stake", "", "potWin", "bonus", "hit", "", "betDetails", "", "Lcom/sportybet/android/instantwin/newtork/model/response/simulation/NetworkSimulationTicketBetDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJZLjava/util/List;)V", "getBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getBetGroupId", "getStake", "()J", "getPotWin", "getBonus", "getHit", "()Z", "getBetDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSimulationTicketBet {
    public static final int $stable = 8;

    @SerializedName("betDetails")
    private final List<NetworkSimulationTicketBetDetail> betDetails;

    @SerializedName("betGroupId")
    private final String betGroupId;

    @SerializedName("betId")
    private final String betId;

    @SerializedName("bonus")
    private final long bonus;

    @SerializedName("hit")
    private final boolean hit;

    @SerializedName("potWin")
    private final long potWin;

    @SerializedName("stake")
    private final long stake;

    public NetworkSimulationTicketBet(String str, String str2, long j, long j2, long j3, boolean z, List<NetworkSimulationTicketBetDetail> list) {
        this.betId = str;
        this.betGroupId = str2;
        this.stake = j;
        this.potWin = j2;
        this.bonus = j3;
        this.hit = z;
        this.betDetails = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSimulationTicketBet copy$default(NetworkSimulationTicketBet networkSimulationTicketBet, String str, String str2, long j, long j2, long j3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkSimulationTicketBet.betId;
        }
        if ((i & 2) != 0) {
            str2 = networkSimulationTicketBet.betGroupId;
        }
        if ((i & 4) != 0) {
            j = networkSimulationTicketBet.stake;
        }
        if ((i & 8) != 0) {
            j2 = networkSimulationTicketBet.potWin;
        }
        if ((i & 16) != 0) {
            j3 = networkSimulationTicketBet.bonus;
        }
        if ((i & 32) != 0) {
            z = networkSimulationTicketBet.hit;
        }
        if ((i & 64) != 0) {
            list = networkSimulationTicketBet.betDetails;
        }
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        return networkSimulationTicketBet.copy(str, str2, j6, j5, j4, z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetGroupId() {
        return this.betGroupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStake() {
        return this.stake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPotWin() {
        return this.potWin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    public final List<NetworkSimulationTicketBetDetail> component7() {
        return this.betDetails;
    }

    public final NetworkSimulationTicketBet copy(String betId, String betGroupId, long stake, long potWin, long bonus, boolean hit, List<NetworkSimulationTicketBetDetail> betDetails) {
        return new NetworkSimulationTicketBet(betId, betGroupId, stake, potWin, bonus, hit, betDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSimulationTicketBet)) {
            return false;
        }
        NetworkSimulationTicketBet networkSimulationTicketBet = (NetworkSimulationTicketBet) other;
        return Intrinsics.g(this.betId, networkSimulationTicketBet.betId) && Intrinsics.g(this.betGroupId, networkSimulationTicketBet.betGroupId) && this.stake == networkSimulationTicketBet.stake && this.potWin == networkSimulationTicketBet.potWin && this.bonus == networkSimulationTicketBet.bonus && this.hit == networkSimulationTicketBet.hit && Intrinsics.g(this.betDetails, networkSimulationTicketBet.betDetails);
    }

    public final List<NetworkSimulationTicketBetDetail> getBetDetails() {
        return this.betDetails;
    }

    public final String getBetGroupId() {
        return this.betGroupId;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final long getBonus() {
        return this.bonus;
    }

    public final boolean getHit() {
        return this.hit;
    }

    public final long getPotWin() {
        return this.potWin;
    }

    public final long getStake() {
        return this.stake;
    }

    public int hashCode() {
        String str = this.betId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.betGroupId;
        int iA = mtg0.a(f87.a(f87.a(f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.stake, 31), this.potWin, 31), this.bonus, 31), 31, this.hit);
        List<NetworkSimulationTicketBetDetail> list = this.betDetails;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.betGroupId;
        long j = this.stake;
        long j2 = this.potWin;
        long j3 = this.bonus;
        boolean z = this.hit;
        List<NetworkSimulationTicketBetDetail> list = this.betDetails;
        StringBuilder sbA = ux5.a("NetworkSimulationTicketBet(betId=", str, ", betGroupId=", str2, ", stake=");
        sbA.append(j);
        g41.a(j2, ", potWin=", ", bonus=", sbA);
        sbA.append(j3);
        sbA.append(", hit=");
        sbA.append(z);
        return ka1.a(sbA, ", betDetails=", list, ")");
    }
}
