package com.sportygames.redblack.remote.models;

import com.appsflyer.internal.b0;
import defpackage.ai50;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.lsv;
import defpackage.mtg0;
import defpackage.nrg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\"JÐ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00142\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\rHÖ\u0001J\t\u0010L\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b2\u0010\"R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b3\u0010\"R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b4\u0010\"R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b5\u0010\"¨\u0006M"}, d2 = {"Lcom/sportygames/redblack/remote/models/PlaceBetResponse;", "", "betId", "", "currency", "", "maxPayoutMessage", "payoutAmount", "", "roundId", "totalRoundPayouts", "totalRoundWinnings", "turnId", "", "updatedWalletBalance", "userCard", "Lcom/sportygames/redblack/remote/models/UserCard;", "userHistory", "", "userWinStatusHistory", "", "winStatus", "actualCreditedAmt", "stakeAmount", "actualDebitedAmt", "giftAmount", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;JDDIDLcom/sportygames/redblack/remote/models/UserCard;Ljava/util/List;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBetId", "()J", "getCurrency", "()Ljava/lang/String;", "getMaxPayoutMessage", "getPayoutAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRoundId", "getTotalRoundPayouts", "()D", "getTotalRoundWinnings", "getTurnId", "()I", "getUpdatedWalletBalance", "getUserCard", "()Lcom/sportygames/redblack/remote/models/UserCard;", "getUserHistory", "()Ljava/util/List;", "getUserWinStatusHistory", "getWinStatus", "()Z", "getActualCreditedAmt", "getStakeAmount", "getActualDebitedAmt", "getGiftAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;JDDIDLcom/sportygames/redblack/remote/models/UserCard;Ljava/util/List;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/redblack/remote/models/PlaceBetResponse;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetResponse {
    public static final int $stable = 8;
    private final Double actualCreditedAmt;
    private final Double actualDebitedAmt;
    private final long betId;
    private final String currency;
    private final Double giftAmount;
    private final String maxPayoutMessage;
    private final Double payoutAmount;
    private final long roundId;
    private final Double stakeAmount;
    private final double totalRoundPayouts;
    private final double totalRoundWinnings;
    private final int turnId;
    private final double updatedWalletBalance;
    private final UserCard userCard;
    private final List<UserCard> userHistory;
    private final List<Boolean> userWinStatusHistory;
    private final boolean winStatus;

    public PlaceBetResponse(long j, String str, String str2, Double d, long j2, double d2, double d3, int i, double d4, UserCard userCard, List<UserCard> list, List<Boolean> list2, boolean z, Double d5, Double d6, Double d7, Double d8) {
        str.getClass();
        userCard.getClass();
        list.getClass();
        list2.getClass();
        this.betId = j;
        this.currency = str;
        this.maxPayoutMessage = str2;
        this.payoutAmount = d;
        this.roundId = j2;
        this.totalRoundPayouts = d2;
        this.totalRoundWinnings = d3;
        this.turnId = i;
        this.updatedWalletBalance = d4;
        this.userCard = userCard;
        this.userHistory = list;
        this.userWinStatusHistory = list2;
        this.winStatus = z;
        this.actualCreditedAmt = d5;
        this.stakeAmount = d6;
        this.actualDebitedAmt = d7;
        this.giftAmount = d8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceBetResponse copy$default(PlaceBetResponse placeBetResponse, long j, String str, String str2, Double d, long j2, double d2, double d3, int i, double d4, UserCard userCard, List list, List list2, boolean z, Double d5, Double d6, Double d7, Double d8, int i2, Object obj) {
        Double d9;
        Double d10;
        long j3 = (i2 & 1) != 0 ? placeBetResponse.betId : j;
        String str3 = (i2 & 2) != 0 ? placeBetResponse.currency : str;
        String str4 = (i2 & 4) != 0 ? placeBetResponse.maxPayoutMessage : str2;
        Double d11 = (i2 & 8) != 0 ? placeBetResponse.payoutAmount : d;
        long j4 = (i2 & 16) != 0 ? placeBetResponse.roundId : j2;
        double d12 = (i2 & 32) != 0 ? placeBetResponse.totalRoundPayouts : d2;
        double d13 = (i2 & 64) != 0 ? placeBetResponse.totalRoundWinnings : d3;
        int i3 = (i2 & 128) != 0 ? placeBetResponse.turnId : i;
        double d14 = (i2 & 256) != 0 ? placeBetResponse.updatedWalletBalance : d4;
        long j5 = j3;
        UserCard userCard2 = (i2 & 512) != 0 ? placeBetResponse.userCard : userCard;
        List list3 = (i2 & 1024) != 0 ? placeBetResponse.userHistory : list;
        UserCard userCard3 = userCard2;
        List list4 = (i2 & 2048) != 0 ? placeBetResponse.userWinStatusHistory : list2;
        boolean z2 = (i2 & 4096) != 0 ? placeBetResponse.winStatus : z;
        Double d15 = (i2 & 8192) != 0 ? placeBetResponse.actualCreditedAmt : d5;
        Double d16 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? placeBetResponse.stakeAmount : d6;
        Double d17 = (i2 & 32768) != 0 ? placeBetResponse.actualDebitedAmt : d7;
        if ((i2 & 65536) != 0) {
            d10 = d17;
            d9 = placeBetResponse.giftAmount;
        } else {
            d9 = d8;
            d10 = d17;
        }
        return placeBetResponse.copy(j5, str3, str4, d11, j4, d12, d13, i3, d14, userCard3, list3, list4, z2, d15, d16, d10, d9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final UserCard getUserCard() {
        return this.userCard;
    }

    public final List<UserCard> component11() {
        return this.userHistory;
    }

    public final List<Boolean> component12() {
        return this.userWinStatusHistory;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getWinStatus() {
        return this.winStatus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxPayoutMessage() {
        return this.maxPayoutMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getTotalRoundPayouts() {
        return this.totalRoundPayouts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getTotalRoundWinnings() {
        return this.totalRoundWinnings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getUpdatedWalletBalance() {
        return this.updatedWalletBalance;
    }

    public final PlaceBetResponse copy(long betId, String currency, String maxPayoutMessage, Double payoutAmount, long roundId, double totalRoundPayouts, double totalRoundWinnings, int turnId, double updatedWalletBalance, UserCard userCard, List<UserCard> userHistory, List<Boolean> userWinStatusHistory, boolean winStatus, Double actualCreditedAmt, Double stakeAmount, Double actualDebitedAmt, Double giftAmount) {
        currency.getClass();
        userCard.getClass();
        userHistory.getClass();
        userWinStatusHistory.getClass();
        return new PlaceBetResponse(betId, currency, maxPayoutMessage, payoutAmount, roundId, totalRoundPayouts, totalRoundWinnings, turnId, updatedWalletBalance, userCard, userHistory, userWinStatusHistory, winStatus, actualCreditedAmt, stakeAmount, actualDebitedAmt, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetResponse)) {
            return false;
        }
        PlaceBetResponse placeBetResponse = (PlaceBetResponse) other;
        return this.betId == placeBetResponse.betId && Intrinsics.g(this.currency, placeBetResponse.currency) && Intrinsics.g(this.maxPayoutMessage, placeBetResponse.maxPayoutMessage) && Intrinsics.g(this.payoutAmount, placeBetResponse.payoutAmount) && this.roundId == placeBetResponse.roundId && Double.compare(this.totalRoundPayouts, placeBetResponse.totalRoundPayouts) == 0 && Double.compare(this.totalRoundWinnings, placeBetResponse.totalRoundWinnings) == 0 && this.turnId == placeBetResponse.turnId && Double.compare(this.updatedWalletBalance, placeBetResponse.updatedWalletBalance) == 0 && Intrinsics.g(this.userCard, placeBetResponse.userCard) && Intrinsics.g(this.userHistory, placeBetResponse.userHistory) && Intrinsics.g(this.userWinStatusHistory, placeBetResponse.userWinStatusHistory) && this.winStatus == placeBetResponse.winStatus && Intrinsics.g(this.actualCreditedAmt, placeBetResponse.actualCreditedAmt) && Intrinsics.g(this.stakeAmount, placeBetResponse.stakeAmount) && Intrinsics.g(this.actualDebitedAmt, placeBetResponse.actualDebitedAmt) && Intrinsics.g(this.giftAmount, placeBetResponse.giftAmount);
    }

    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getMaxPayoutMessage() {
        return this.maxPayoutMessage;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final double getTotalRoundPayouts() {
        return this.totalRoundPayouts;
    }

    public final double getTotalRoundWinnings() {
        return this.totalRoundWinnings;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public final double getUpdatedWalletBalance() {
        return this.updatedWalletBalance;
    }

    public final UserCard getUserCard() {
        return this.userCard;
    }

    public final List<UserCard> getUserHistory() {
        return this.userHistory;
    }

    public final List<Boolean> getUserWinStatusHistory() {
        return this.userWinStatusHistory;
    }

    public final boolean getWinStatus() {
        return this.winStatus;
    }

    public int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.betId) * 31, 31, this.currency);
        String str = this.maxPayoutMessage;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.payoutAmount;
        int iA2 = mtg0.a(ai50.a(ai50.a((this.userCard.hashCode() + nrg0.a(gpp.a(this.turnId, nrg0.a(nrg0.a(f87.a((iHashCode + (d == null ? 0 : d.hashCode())) * 31, this.roundId, 31), 31, this.totalRoundPayouts), 31, this.totalRoundWinnings), 31), 31, this.updatedWalletBalance)) * 31, 31, this.userHistory), 31, this.userWinStatusHistory), 31, this.winStatus);
        Double d2 = this.actualCreditedAmt;
        int iHashCode2 = (iA2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.actualDebitedAmt;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.giftAmount;
        return iHashCode4 + (d5 != null ? d5.hashCode() : 0);
    }

    public String toString() {
        long j = this.betId;
        String str = this.currency;
        String str2 = this.maxPayoutMessage;
        Double d = this.payoutAmount;
        long j2 = this.roundId;
        double d2 = this.totalRoundPayouts;
        double d3 = this.totalRoundWinnings;
        int i = this.turnId;
        double d4 = this.updatedWalletBalance;
        UserCard userCard = this.userCard;
        List<UserCard> list = this.userHistory;
        List<Boolean> list2 = this.userWinStatusHistory;
        boolean z = this.winStatus;
        Double d5 = this.actualCreditedAmt;
        Double d6 = this.stakeAmount;
        Double d7 = this.actualDebitedAmt;
        Double d8 = this.giftAmount;
        StringBuilder sbA = b0.a(j, "PlaceBetResponse(betId=", ", currency=", str);
        sbA.append(", maxPayoutMessage=");
        sbA.append(str2);
        sbA.append(", payoutAmount=");
        sbA.append(d);
        g41.a(j2, ", roundId=", ", totalRoundPayouts=", sbA);
        sbA.append(d2);
        hib0.b(d3, ", totalRoundWinnings=", ", turnId=", sbA);
        sbA.append(i);
        sbA.append(", updatedWalletBalance=");
        sbA.append(d4);
        sbA.append(", userCard=");
        sbA.append(userCard);
        sbA.append(", userHistory=");
        sbA.append(list);
        sbA.append(", userWinStatusHistory=");
        sbA.append(list2);
        sbA.append(", winStatus=");
        sbA.append(z);
        lsv.a(d5, d6, ", actualCreditedAmt=", ", stakeAmount=", sbA);
        lsv.a(d7, d8, ", actualDebitedAmt=", ", giftAmount=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
