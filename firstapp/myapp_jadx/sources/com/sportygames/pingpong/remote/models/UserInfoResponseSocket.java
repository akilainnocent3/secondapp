package com.sportygames.pingpong.remote.models;

import defpackage.d5d;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.ry4;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u009c\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\tHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006?"}, d2 = {"Lcom/sportygames/pingpong/remote/models/UserInfoResponseSocket;", "", "messageType", "", "timeStamp", "roundId", "", "betId", "roomId", "", "betIndex", "stakeAmount", "", "payoutAmount", "giftAmount", "currency", "cashoutCoefficient", "userId", "nickName", "autoCashoutAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIIDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessageType", "()Ljava/lang/String;", "getTimeStamp", "getRoundId", "()J", "getBetId", "getRoomId", "()I", "getBetIndex", "getStakeAmount", "()D", "getPayoutAmount", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getCashoutCoefficient", "getUserId", "getNickName", "getAutoCashoutAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;JJIIDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/pingpong/remote/models/UserInfoResponseSocket;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserInfoResponseSocket {
    public static final int $stable = 0;
    private final String autoCashoutAt;
    private final long betId;
    private final int betIndex;
    private final String cashoutCoefficient;
    private final String currency;
    private final Double giftAmount;
    private final String messageType;
    private final String nickName;
    private final double payoutAmount;
    private final int roomId;
    private final long roundId;
    private final double stakeAmount;
    private final String timeStamp;
    private final String userId;

    public UserInfoResponseSocket(String str, String str2, long j, long j2, int i, int i2, double d, double d2, Double d3, String str3, String str4, String str5, String str6, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.messageType = str;
        this.timeStamp = str2;
        this.roundId = j;
        this.betId = j2;
        this.roomId = i;
        this.betIndex = i2;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.giftAmount = d3;
        this.currency = str3;
        this.cashoutCoefficient = str4;
        this.userId = str5;
        this.nickName = str6;
        this.autoCashoutAt = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final UserInfoResponseSocket copy(String messageType, String timeStamp, long roundId, long betId, int roomId, int betIndex, double stakeAmount, double payoutAmount, Double giftAmount, String currency, String cashoutCoefficient, String userId, String nickName, String autoCashoutAt) {
        qn4.b(messageType, timeStamp, currency, cashoutCoefficient, userId);
        nickName.getClass();
        autoCashoutAt.getClass();
        return new UserInfoResponseSocket(messageType, timeStamp, roundId, betId, roomId, betIndex, stakeAmount, payoutAmount, giftAmount, currency, cashoutCoefficient, userId, nickName, autoCashoutAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoResponseSocket)) {
            return false;
        }
        UserInfoResponseSocket userInfoResponseSocket = (UserInfoResponseSocket) other;
        return Intrinsics.g(this.messageType, userInfoResponseSocket.messageType) && Intrinsics.g(this.timeStamp, userInfoResponseSocket.timeStamp) && this.roundId == userInfoResponseSocket.roundId && this.betId == userInfoResponseSocket.betId && this.roomId == userInfoResponseSocket.roomId && this.betIndex == userInfoResponseSocket.betIndex && Double.compare(this.stakeAmount, userInfoResponseSocket.stakeAmount) == 0 && Double.compare(this.payoutAmount, userInfoResponseSocket.payoutAmount) == 0 && Intrinsics.g(this.giftAmount, userInfoResponseSocket.giftAmount) && Intrinsics.g(this.currency, userInfoResponseSocket.currency) && Intrinsics.g(this.cashoutCoefficient, userInfoResponseSocket.cashoutCoefficient) && Intrinsics.g(this.userId, userInfoResponseSocket.userId) && Intrinsics.g(this.nickName, userInfoResponseSocket.nickName) && Intrinsics.g(this.autoCashoutAt, userInfoResponseSocket.autoCashoutAt);
    }

    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
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

    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = nrg0.a(nrg0.a(gpp.a(this.betIndex, gpp.a(this.roomId, f87.a(f87.a(gmf0.a(this.messageType.hashCode() * 31, 31, this.timeStamp), this.roundId, 31), this.betId, 31), 31), 31), 31, this.stakeAmount), 31, this.payoutAmount);
        Double d = this.giftAmount;
        return this.autoCashoutAt.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a((iA + (d == null ? 0 : d.hashCode())) * 31, 31, this.currency), 31, this.cashoutCoefficient), 31, this.userId), 31, this.nickName);
    }

    public String toString() {
        String str = this.messageType;
        String str2 = this.timeStamp;
        long j = this.roundId;
        long j2 = this.betId;
        int i = this.roomId;
        int i2 = this.betIndex;
        double d = this.stakeAmount;
        double d2 = this.payoutAmount;
        Double d3 = this.giftAmount;
        String str3 = this.currency;
        String str4 = this.cashoutCoefficient;
        String str5 = this.userId;
        String str6 = this.nickName;
        String str7 = this.autoCashoutAt;
        StringBuilder sbA = ux5.a("UserInfoResponseSocket(messageType=", str, ", timeStamp=", str2, ", roundId=");
        sbA.append(j);
        g41.a(j2, ", betId=", ", roomId=", sbA);
        d5d.a(sbA, i, ", betIndex=", i2, ", stakeAmount=");
        sbA.append(d);
        hib0.b(d2, ", payoutAmount=", ", giftAmount=", sbA);
        ry4.a(d3, ", currency=", str3, ", cashoutCoefficient=", sbA);
        hxa.c(sbA, str4, ", userId=", str5, ", nickName=");
        return kwi.a(sbA, str6, ", autoCashoutAt=", str7, ")");
    }
}
