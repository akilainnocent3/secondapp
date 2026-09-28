package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.em5;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.pr0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009d\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020\rHÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR%\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR%\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R%\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR%\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R%\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR-\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R%\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R'\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017Ê\u0001\f\b=\u0012\b\b>\u0012\u0004\b\u0003\u0010\u0000¨\u0006<"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSettleRoundTicket;", "", "ticketId", "", "ticketNumber", "type", "totalStake", "", "totalReturn", "wht", "giftId", "giftAmount", "giftKind", "", "createTime", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketBet;", "flexibleFitSize", "totalOdds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;JIJLjava/util/List;ILjava/lang/String;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getTotalStake", "()J", "getTotalReturn", "getWht", "getGiftId", "getGiftAmount", "getGiftKind", "()I", "getCreateTime", "getBets", "()Ljava/util/List;", "getFlexibleFitSize", "getTotalOdds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingSettleRoundTicket {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<NetworkInstantRacingTicketBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("flexibleFitSize")
    private final int flexibleFitSize;

    @SerializedName("giftAmount")
    private final long giftAmount;

    @SerializedName("giftId")
    private final String giftId;

    @SerializedName("giftKind")
    private final int giftKind;

    @SerializedName("ticketId")
    private final String ticketId;

    @SerializedName("ticketNumber")
    private final String ticketNumber;

    @SerializedName("totalOdds")
    private final String totalOdds;

    @SerializedName("totalReturn")
    private final long totalReturn;

    @SerializedName("totalStake")
    private final long totalStake;

    @SerializedName("type")
    private final String type;

    @SerializedName("wht")
    private final long wht;

    public NetworkInstantRacingSettleRoundTicket(String str, String str2, String str3, long j, long j2, long j3, String str4, long j4, int i, long j5, List<NetworkInstantRacingTicketBet> list, int i2, String str5) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.totalStake = j;
        this.totalReturn = j2;
        this.wht = j3;
        this.giftId = str4;
        this.giftAmount = j4;
        this.giftKind = i;
        this.createTime = j5;
        this.bets = list;
        this.flexibleFitSize = i2;
        this.totalOdds = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingSettleRoundTicket copy$default(NetworkInstantRacingSettleRoundTicket networkInstantRacingSettleRoundTicket, String str, String str2, String str3, long j, long j2, long j3, String str4, long j4, int i, long j5, List list, int i2, String str5, int i3, Object obj) {
        String str6 = (i3 & 1) != 0 ? networkInstantRacingSettleRoundTicket.ticketId : str;
        String str7 = (i3 & 2) != 0 ? networkInstantRacingSettleRoundTicket.ticketNumber : str2;
        return networkInstantRacingSettleRoundTicket.copy(str6, str7, (i3 & 4) != 0 ? networkInstantRacingSettleRoundTicket.type : str3, (i3 & 8) != 0 ? networkInstantRacingSettleRoundTicket.totalStake : j, (i3 & 16) != 0 ? networkInstantRacingSettleRoundTicket.totalReturn : j2, (i3 & 32) != 0 ? networkInstantRacingSettleRoundTicket.wht : j3, (i3 & 64) != 0 ? networkInstantRacingSettleRoundTicket.giftId : str4, (i3 & 128) != 0 ? networkInstantRacingSettleRoundTicket.giftAmount : j4, (i3 & 256) != 0 ? networkInstantRacingSettleRoundTicket.giftKind : i, (i3 & 512) != 0 ? networkInstantRacingSettleRoundTicket.createTime : j5, (i3 & 1024) != 0 ? networkInstantRacingSettleRoundTicket.bets : list, (i3 & 2048) != 0 ? networkInstantRacingSettleRoundTicket.flexibleFitSize : i2, (i3 & 4096) != 0 ? networkInstantRacingSettleRoundTicket.totalOdds : str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkInstantRacingTicketBet> component11() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
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
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    public final NetworkInstantRacingSettleRoundTicket copy(String ticketId, String ticketNumber, String type, long totalStake, long totalReturn, long wht, String giftId, long giftAmount, int giftKind, long createTime, List<NetworkInstantRacingTicketBet> bets, int flexibleFitSize, String totalOdds) {
        return new NetworkInstantRacingSettleRoundTicket(ticketId, ticketNumber, type, totalStake, totalReturn, wht, giftId, giftAmount, giftKind, createTime, bets, flexibleFitSize, totalOdds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingSettleRoundTicket)) {
            return false;
        }
        NetworkInstantRacingSettleRoundTicket networkInstantRacingSettleRoundTicket = (NetworkInstantRacingSettleRoundTicket) other;
        return Intrinsics.g(this.ticketId, networkInstantRacingSettleRoundTicket.ticketId) && Intrinsics.g(this.ticketNumber, networkInstantRacingSettleRoundTicket.ticketNumber) && Intrinsics.g(this.type, networkInstantRacingSettleRoundTicket.type) && this.totalStake == networkInstantRacingSettleRoundTicket.totalStake && this.totalReturn == networkInstantRacingSettleRoundTicket.totalReturn && this.wht == networkInstantRacingSettleRoundTicket.wht && Intrinsics.g(this.giftId, networkInstantRacingSettleRoundTicket.giftId) && this.giftAmount == networkInstantRacingSettleRoundTicket.giftAmount && this.giftKind == networkInstantRacingSettleRoundTicket.giftKind && this.createTime == networkInstantRacingSettleRoundTicket.createTime && Intrinsics.g(this.bets, networkInstantRacingSettleRoundTicket.bets) && this.flexibleFitSize == networkInstantRacingSettleRoundTicket.flexibleFitSize && Intrinsics.g(this.totalOdds, networkInstantRacingSettleRoundTicket.totalOdds);
    }

    public final List<NetworkInstantRacingTicketBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    public final long getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
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
        int iA = f87.a(f87.a(f87.a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.totalStake, 31), this.totalReturn, 31), this.wht, 31);
        String str4 = this.giftId;
        int iA2 = f87.a(gpp.a(this.giftKind, f87.a((iA + (str4 == null ? 0 : str4.hashCode())) * 31, this.giftAmount, 31), 31), this.createTime, 31);
        List<NetworkInstantRacingTicketBet> list = this.bets;
        int iA3 = gpp.a(this.flexibleFitSize, (iA2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str5 = this.totalOdds;
        return iA3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        long j = this.totalStake;
        long j2 = this.totalReturn;
        long j3 = this.wht;
        String str4 = this.giftId;
        long j4 = this.giftAmount;
        int i = this.giftKind;
        long j5 = this.createTime;
        List<NetworkInstantRacingTicketBet> list = this.bets;
        int i2 = this.flexibleFitSize;
        String str5 = this.totalOdds;
        StringBuilder sbA = ux5.a("NetworkInstantRacingSettleRoundTicket(ticketId=", str, ", ticketNumber=", str2, ", type=");
        l.a(j, str3, ", totalStake=", sbA);
        g41.a(j2, ", totalReturn=", ", wht=", sbA);
        em5.a(j3, ", giftId=", str4, sbA);
        g41.a(j4, ", giftAmount=", ", giftKind=", sbA);
        sbA.append(i);
        sbA.append(", createTime=");
        sbA.append(j5);
        sbA.append(", bets=");
        sbA.append(list);
        sbA.append(", flexibleFitSize=");
        sbA.append(i2);
        return pr0.a(sbA, ", totalOdds=", str5, ")");
    }
}
