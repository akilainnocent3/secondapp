package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.m;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0007HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00064"}, d2 = {"Lcom/sportygames/pingpong/remote/models/ActiveBetResponse;", "", "betId", "", "roundId", "roomId", "betIndex", "", "stakeAmount", "", "payoutAmount", "currency", "cashoutCoefficient", "userId", "nickName", "autoCashoutAt", "cashoutCoefficientStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDDLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBetId", "()Ljava/lang/String;", "getRoundId", "getRoomId", "getBetIndex", "()I", "getStakeAmount", "()D", "getPayoutAmount", "getCurrency", "getCashoutCoefficient", "getUserId", "getNickName", "getAutoCashoutAt", "getCashoutCoefficientStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActiveBetResponse {
    public static final int $stable = 0;
    private final String autoCashoutAt;
    private final String betId;
    private final int betIndex;
    private final String cashoutCoefficient;
    private final String cashoutCoefficientStr;
    private final String currency;
    private final String nickName;
    private final double payoutAmount;
    private final String roomId;
    private final String roundId;
    private final double stakeAmount;
    private final int userId;

    public ActiveBetResponse(String str, String str2, String str3, int i, double d, double d2, String str4, String str5, int i2, String str6, String str7, String str8) {
        qn4.b(str, str2, str3, str4, str5);
        m.a(str6, str7, str8);
        this.betId = str;
        this.roundId = str2;
        this.roomId = str3;
        this.betIndex = i;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.currency = str4;
        this.cashoutCoefficient = str5;
        this.userId = i2;
        this.nickName = str6;
        this.autoCashoutAt = str7;
        this.cashoutCoefficientStr = str8;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
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
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    public final ActiveBetResponse copy(String betId, String roundId, String roomId, int betIndex, double stakeAmount, double payoutAmount, String currency, String cashoutCoefficient, int userId, String nickName, String autoCashoutAt, String cashoutCoefficientStr) {
        qn4.b(betId, roundId, roomId, currency, cashoutCoefficient);
        nickName.getClass();
        autoCashoutAt.getClass();
        cashoutCoefficientStr.getClass();
        return new ActiveBetResponse(betId, roundId, roomId, betIndex, stakeAmount, payoutAmount, currency, cashoutCoefficient, userId, nickName, autoCashoutAt, cashoutCoefficientStr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveBetResponse)) {
            return false;
        }
        ActiveBetResponse activeBetResponse = (ActiveBetResponse) other;
        return Intrinsics.g(this.betId, activeBetResponse.betId) && Intrinsics.g(this.roundId, activeBetResponse.roundId) && Intrinsics.g(this.roomId, activeBetResponse.roomId) && this.betIndex == activeBetResponse.betIndex && Double.compare(this.stakeAmount, activeBetResponse.stakeAmount) == 0 && Double.compare(this.payoutAmount, activeBetResponse.payoutAmount) == 0 && Intrinsics.g(this.currency, activeBetResponse.currency) && Intrinsics.g(this.cashoutCoefficient, activeBetResponse.cashoutCoefficient) && this.userId == activeBetResponse.userId && Intrinsics.g(this.nickName, activeBetResponse.nickName) && Intrinsics.g(this.autoCashoutAt, activeBetResponse.autoCashoutAt) && Intrinsics.g(this.cashoutCoefficientStr, activeBetResponse.cashoutCoefficientStr);
    }

    public final String getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.cashoutCoefficientStr.hashCode() + gmf0.a(gmf0.a(gpp.a(this.userId, gmf0.a(gmf0.a(nrg0.a(nrg0.a(gpp.a(this.betIndex, gmf0.a(gmf0.a(this.betId.hashCode() * 31, 31, this.roundId), 31, this.roomId), 31), 31, this.stakeAmount), 31, this.payoutAmount), 31, this.currency), 31, this.cashoutCoefficient), 31), 31, this.nickName), 31, this.autoCashoutAt);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.roundId;
        String str3 = this.roomId;
        int i = this.betIndex;
        double d = this.stakeAmount;
        double d2 = this.payoutAmount;
        String str4 = this.currency;
        String str5 = this.cashoutCoefficient;
        int i2 = this.userId;
        String str6 = this.nickName;
        String str7 = this.autoCashoutAt;
        String str8 = this.cashoutCoefficientStr;
        StringBuilder sbA = ux5.a("ActiveBetResponse(betId=", str, ", roundId=", str2, ", roomId=");
        wxa.b(i, str3, ", betIndex=", ", stakeAmount=", sbA);
        sbA.append(d);
        hib0.b(d2, ", payoutAmount=", ", currency=", sbA);
        hxa.c(sbA, str4, ", cashoutCoefficient=", str5, ", userId=");
        f78.b(i2, ", nickName=", str6, ", autoCashoutAt=", sbA);
        return kwi.a(sbA, str7, ", cashoutCoefficientStr=", str8, ")");
    }
}
