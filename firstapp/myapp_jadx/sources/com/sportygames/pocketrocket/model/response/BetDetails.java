package com.sportygames.pocketrocket.model.response;

import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.q6a0;
import defpackage.qn4;
import defpackage.ry4;
import defpackage.to10;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\nHÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J´\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00162\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0006HÖ\u0001J\t\u0010L\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010!\"\u0004\b#\u0010$R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u00101R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u00101R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u00104\"\u0004\b5\u00106¨\u0006M"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/BetDetails;", "", "roundId", "", "betId", "roomId", "", "rocketType", "", "stakeAmount", "", "payoutAmount", "giftAmount", "currency", "cashoutCoefficient", "actualPayoutAmount", "autoCashoutAt", "nickName", "userId", "ticketStatus", "createdAt", "isBackground", "", "<init>", "(JJILjava/lang/String;DDLjava/lang/Double;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getRoundId", "()J", "getBetId", "getRoomId", "()I", "getRocketType", "()Ljava/lang/String;", "getStakeAmount", "()D", "getPayoutAmount", "setPayoutAmount", "(D)V", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getCashoutCoefficient", "setCashoutCoefficient", "getActualPayoutAmount", "getAutoCashoutAt", "getNickName", "getUserId", "getTicketStatus", "setTicketStatus", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "()Z", "setBackground", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(JJILjava/lang/String;DDLjava/lang/Double;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/sportygames/pocketrocket/model/response/BetDetails;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetDetails {
    public static final int $stable = 8;
    private final Double actualPayoutAmount;
    private final String autoCashoutAt;
    private final long betId;
    private double cashoutCoefficient;
    private String createdAt;
    private final String currency;
    private final Double giftAmount;
    private boolean isBackground;
    private final String nickName;
    private double payoutAmount;
    private final String rocketType;
    private final int roomId;
    private final long roundId;
    private final double stakeAmount;
    private String ticketStatus;
    private final String userId;

    public BetDetails(long j, long j2, int i, String str, double d, double d2, Double d3, String str2, double d4, Double d5, String str3, String str4, String str5, String str6, String str7, boolean z) {
        qn4.b(str, str2, str4, str5, str6);
        str7.getClass();
        this.roundId = j;
        this.betId = j2;
        this.roomId = i;
        this.rocketType = str;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.giftAmount = d3;
        this.currency = str2;
        this.cashoutCoefficient = d4;
        this.actualPayoutAmount = d5;
        this.autoCashoutAt = str3;
        this.nickName = str4;
        this.userId = str5;
        this.ticketStatus = str6;
        this.createdAt = str7;
        this.isBackground = z;
    }

    public static /* synthetic */ BetDetails copy$default(BetDetails betDetails, long j, long j2, int i, String str, double d, double d2, Double d3, String str2, double d4, Double d5, String str3, String str4, String str5, String str6, String str7, boolean z, int i2, Object obj) {
        long j3 = (i2 & 1) != 0 ? betDetails.roundId : j;
        return betDetails.copy(j3, (i2 & 2) != 0 ? betDetails.betId : j2, (i2 & 4) != 0 ? betDetails.roomId : i, (i2 & 8) != 0 ? betDetails.rocketType : str, (i2 & 16) != 0 ? betDetails.stakeAmount : d, (i2 & 32) != 0 ? betDetails.payoutAmount : d2, (i2 & 64) != 0 ? betDetails.giftAmount : d3, (i2 & 128) != 0 ? betDetails.currency : str2, (i2 & 256) != 0 ? betDetails.cashoutCoefficient : d4, (i2 & 512) != 0 ? betDetails.actualPayoutAmount : d5, (i2 & 1024) != 0 ? betDetails.autoCashoutAt : str3, (i2 & 2048) != 0 ? betDetails.nickName : str4, (i2 & 4096) != 0 ? betDetails.userId : str5, (i2 & 8192) != 0 ? betDetails.ticketStatus : str6, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betDetails.createdAt : str7, (i2 & 32768) != 0 ? betDetails.isBackground : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsBackground() {
        return this.isBackground;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRocketType() {
        return this.rocketType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final BetDetails copy(long roundId, long betId, int roomId, String rocketType, double stakeAmount, double payoutAmount, Double giftAmount, String currency, double cashoutCoefficient, Double actualPayoutAmount, String autoCashoutAt, String nickName, String userId, String ticketStatus, String createdAt, boolean isBackground) {
        qn4.b(rocketType, currency, nickName, userId, ticketStatus);
        createdAt.getClass();
        return new BetDetails(roundId, betId, roomId, rocketType, stakeAmount, payoutAmount, giftAmount, currency, cashoutCoefficient, actualPayoutAmount, autoCashoutAt, nickName, userId, ticketStatus, createdAt, isBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetDetails)) {
            return false;
        }
        BetDetails betDetails = (BetDetails) other;
        return this.roundId == betDetails.roundId && this.betId == betDetails.betId && this.roomId == betDetails.roomId && Intrinsics.g(this.rocketType, betDetails.rocketType) && Double.compare(this.stakeAmount, betDetails.stakeAmount) == 0 && Double.compare(this.payoutAmount, betDetails.payoutAmount) == 0 && Intrinsics.g(this.giftAmount, betDetails.giftAmount) && Intrinsics.g(this.currency, betDetails.currency) && Double.compare(this.cashoutCoefficient, betDetails.cashoutCoefficient) == 0 && Intrinsics.g(this.actualPayoutAmount, betDetails.actualPayoutAmount) && Intrinsics.g(this.autoCashoutAt, betDetails.autoCashoutAt) && Intrinsics.g(this.nickName, betDetails.nickName) && Intrinsics.g(this.userId, betDetails.userId) && Intrinsics.g(this.ticketStatus, betDetails.ticketStatus) && Intrinsics.g(this.createdAt, betDetails.createdAt) && this.isBackground == betDetails.isBackground;
    }

    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = nrg0.a(nrg0.a(gmf0.a(gpp.a(this.roomId, f87.a(Long.hashCode(this.roundId) * 31, this.betId, 31), 31), 31, this.rocketType), 31, this.stakeAmount), 31, this.payoutAmount);
        Double d = this.giftAmount;
        int iA2 = nrg0.a(gmf0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.currency), 31, this.cashoutCoefficient);
        Double d2 = this.actualPayoutAmount;
        int iHashCode = (iA2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.autoCashoutAt;
        return Boolean.hashCode(this.isBackground) + gmf0.a(gmf0.a(gmf0.a(gmf0.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.nickName), 31, this.userId), 31, this.ticketStatus), 31, this.createdAt);
    }

    public final boolean isBackground() {
        return this.isBackground;
    }

    public final void setBackground(boolean z) {
        this.isBackground = z;
    }

    public final void setCashoutCoefficient(double d) {
        this.cashoutCoefficient = d;
    }

    public final void setCreatedAt(String str) {
        str.getClass();
        this.createdAt = str;
    }

    public final void setPayoutAmount(double d) {
        this.payoutAmount = d;
    }

    public final void setTicketStatus(String str) {
        str.getClass();
        this.ticketStatus = str;
    }

    public String toString() {
        long j = this.roundId;
        long j2 = this.betId;
        int i = this.roomId;
        String str = this.rocketType;
        double d = this.stakeAmount;
        double d2 = this.payoutAmount;
        Double d3 = this.giftAmount;
        String str2 = this.currency;
        double d4 = this.cashoutCoefficient;
        Double d5 = this.actualPayoutAmount;
        String str3 = this.autoCashoutAt;
        String str4 = this.nickName;
        String str5 = this.userId;
        String str6 = this.ticketStatus;
        String str7 = this.createdAt;
        boolean z = this.isBackground;
        StringBuilder sbA = q6a0.a(j, "BetDetails(roundId=", ", betId=");
        to10.a(sbA, j2, ", roomId=", i);
        u4.a(sbA, ", rocketType=", str, ", stakeAmount=");
        sbA.append(d);
        hib0.b(d2, ", payoutAmount=", ", giftAmount=", sbA);
        ry4.a(d3, ", currency=", str2, ", cashoutCoefficient=", sbA);
        sbA.append(d4);
        sbA.append(", actualPayoutAmount=");
        sbA.append(d5);
        hxa.c(sbA, ", autoCashoutAt=", str3, ", nickName=", str4);
        hxa.c(sbA, ", userId=", str5, ", ticketStatus=", str6);
        sbA.append(", createdAt=");
        sbA.append(str7);
        sbA.append(", isBackground=");
        sbA.append(z);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ BetDetails(long j, long j2, int i, String str, double d, double d2, Double d3, String str2, double d4, Double d5, String str3, String str4, String str5, String str6, String str7, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, str, d, d2, d3, str2, d4, d5, str3, str4, str5, str6, str7, (i2 & 32768) != 0 ? false : z);
    }
}
