package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.mtg0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Je\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0014\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R%\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R%\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R%\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR-\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketBet;", "", "betId", "", "betGroupId", "stake", "", "potWin", "wht", "bonus", "hit", "", "betDetails", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketBetDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJZLjava/util/List;)V", "getBetId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getBetGroupId", "getStake", "()J", "getPotWin", "getWht", "getBonus", "getHit", "()Z", "getBetDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingTicketBet {
    public static final int $stable = 8;

    @SerializedName("betDetails")
    private final List<NetworkInstantRacingTicketBetDetail> betDetails;

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

    @SerializedName("wht")
    private final long wht;

    public NetworkInstantRacingTicketBet(String str, String str2, long j, long j2, long j3, long j4, boolean z, List<NetworkInstantRacingTicketBetDetail> list) {
        this.betId = str;
        this.betGroupId = str2;
        this.stake = j;
        this.potWin = j2;
        this.wht = j3;
        this.bonus = j4;
        this.hit = z;
        this.betDetails = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingTicketBet copy$default(NetworkInstantRacingTicketBet networkInstantRacingTicketBet, String str, String str2, long j, long j2, long j3, long j4, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingTicketBet.betId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingTicketBet.betGroupId;
        }
        if ((i & 4) != 0) {
            j = networkInstantRacingTicketBet.stake;
        }
        if ((i & 8) != 0) {
            j2 = networkInstantRacingTicketBet.potWin;
        }
        if ((i & 16) != 0) {
            j3 = networkInstantRacingTicketBet.wht;
        }
        if ((i & 32) != 0) {
            j4 = networkInstantRacingTicketBet.bonus;
        }
        if ((i & 64) != 0) {
            z = networkInstantRacingTicketBet.hit;
        }
        if ((i & 128) != 0) {
            list = networkInstantRacingTicketBet.betDetails;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        long j8 = j;
        return networkInstantRacingTicketBet.copy(str, str2, j8, j7, j6, j5, z, list);
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
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBonus() {
        return this.bonus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    public final List<NetworkInstantRacingTicketBetDetail> component8() {
        return this.betDetails;
    }

    public final NetworkInstantRacingTicketBet copy(String betId, String betGroupId, long stake, long potWin, long wht, long bonus, boolean hit, List<NetworkInstantRacingTicketBetDetail> betDetails) {
        return new NetworkInstantRacingTicketBet(betId, betGroupId, stake, potWin, wht, bonus, hit, betDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingTicketBet)) {
            return false;
        }
        NetworkInstantRacingTicketBet networkInstantRacingTicketBet = (NetworkInstantRacingTicketBet) other;
        return Intrinsics.g(this.betId, networkInstantRacingTicketBet.betId) && Intrinsics.g(this.betGroupId, networkInstantRacingTicketBet.betGroupId) && this.stake == networkInstantRacingTicketBet.stake && this.potWin == networkInstantRacingTicketBet.potWin && this.wht == networkInstantRacingTicketBet.wht && this.bonus == networkInstantRacingTicketBet.bonus && this.hit == networkInstantRacingTicketBet.hit && Intrinsics.g(this.betDetails, networkInstantRacingTicketBet.betDetails);
    }

    public final List<NetworkInstantRacingTicketBetDetail> getBetDetails() {
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

    public final long getWht() {
        return this.wht;
    }

    public int hashCode() {
        String str = this.betId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.betGroupId;
        int iA = mtg0.a(f87.a(f87.a(f87.a(f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.stake, 31), this.potWin, 31), this.wht, 31), this.bonus, 31), 31, this.hit);
        List<NetworkInstantRacingTicketBetDetail> list = this.betDetails;
        return iA + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.betGroupId;
        long j = this.stake;
        long j2 = this.potWin;
        long j3 = this.wht;
        long j4 = this.bonus;
        boolean z = this.hit;
        List<NetworkInstantRacingTicketBetDetail> list = this.betDetails;
        StringBuilder sbA = ux5.a("NetworkInstantRacingTicketBet(betId=", str, ", betGroupId=", str2, ", stake=");
        sbA.append(j);
        g41.a(j2, ", potWin=", ", wht=", sbA);
        sbA.append(j3);
        g41.a(j4, ", bonus=", ", hit=", sbA);
        sbA.append(z);
        sbA.append(", betDetails=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
