package com.sportygames.evenodd.remote.models;

import defpackage.gmf0;
import defpackage.gpp;
import defpackage.k800;
import defpackage.ry4;
import defpackage.wd7;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J|\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014¨\u00060"}, d2 = {"Lcom/sportygames/evenodd/remote/models/PlaceBetResponse;", "", "userPick", "", "stakeAmount", "", "payoutAmount", "currency", "houseDraw", "houseDrawSum", "", "houseDrawDecision", "actualCreditedAmt", "actualDebitedAmt", "giftAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getUserPick", "()Ljava/lang/String;", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPayoutAmount", "getCurrency", "getHouseDraw", "getHouseDrawSum", "()I", "getHouseDrawDecision", "getActualCreditedAmt", "getActualDebitedAmt", "getGiftAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/evenodd/remote/models/PlaceBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetResponse {
    public static final int $stable = 0;
    private final Double actualCreditedAmt;
    private final Double actualDebitedAmt;
    private final String currency;
    private final Double giftAmount;
    private final String houseDraw;
    private final String houseDrawDecision;
    private final int houseDrawSum;
    private final Double payoutAmount;
    private final Double stakeAmount;
    private final String userPick;

    public PlaceBetResponse(String str, Double d, Double d2, String str2, String str3, int i, String str4, Double d3, Double d4, Double d5) {
        wd7.a(str, str2, str3, str4);
        this.userPick = str;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.currency = str2;
        this.houseDraw = str3;
        this.houseDrawSum = i;
        this.houseDrawDecision = str4;
        this.actualCreditedAmt = d3;
        this.actualDebitedAmt = d4;
        this.giftAmount = d5;
    }

    public static /* synthetic */ PlaceBetResponse copy$default(PlaceBetResponse placeBetResponse, String str, Double d, Double d2, String str2, String str3, int i, String str4, Double d3, Double d4, Double d5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placeBetResponse.userPick;
        }
        if ((i2 & 2) != 0) {
            d = placeBetResponse.stakeAmount;
        }
        if ((i2 & 4) != 0) {
            d2 = placeBetResponse.payoutAmount;
        }
        if ((i2 & 8) != 0) {
            str2 = placeBetResponse.currency;
        }
        if ((i2 & 16) != 0) {
            str3 = placeBetResponse.houseDraw;
        }
        if ((i2 & 32) != 0) {
            i = placeBetResponse.houseDrawSum;
        }
        if ((i2 & 64) != 0) {
            str4 = placeBetResponse.houseDrawDecision;
        }
        if ((i2 & 128) != 0) {
            d3 = placeBetResponse.actualCreditedAmt;
        }
        if ((i2 & 256) != 0) {
            d4 = placeBetResponse.actualDebitedAmt;
        }
        if ((i2 & 512) != 0) {
            d5 = placeBetResponse.giftAmount;
        }
        Double d6 = d4;
        Double d7 = d5;
        String str5 = str4;
        Double d8 = d3;
        String str6 = str3;
        int i3 = i;
        return placeBetResponse.copy(str, d, d2, str2, str6, i3, str5, d8, d6, d7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHouseDraw() {
        return this.houseDraw;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHouseDrawSum() {
        return this.houseDrawSum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHouseDrawDecision() {
        return this.houseDrawDecision;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    public final PlaceBetResponse copy(String userPick, Double stakeAmount, Double payoutAmount, String currency, String houseDraw, int houseDrawSum, String houseDrawDecision, Double actualCreditedAmt, Double actualDebitedAmt, Double giftAmount) {
        userPick.getClass();
        currency.getClass();
        houseDraw.getClass();
        houseDrawDecision.getClass();
        return new PlaceBetResponse(userPick, stakeAmount, payoutAmount, currency, houseDraw, houseDrawSum, houseDrawDecision, actualCreditedAmt, actualDebitedAmt, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetResponse)) {
            return false;
        }
        PlaceBetResponse placeBetResponse = (PlaceBetResponse) other;
        return Intrinsics.g(this.userPick, placeBetResponse.userPick) && Intrinsics.g(this.stakeAmount, placeBetResponse.stakeAmount) && Intrinsics.g(this.payoutAmount, placeBetResponse.payoutAmount) && Intrinsics.g(this.currency, placeBetResponse.currency) && Intrinsics.g(this.houseDraw, placeBetResponse.houseDraw) && this.houseDrawSum == placeBetResponse.houseDrawSum && Intrinsics.g(this.houseDrawDecision, placeBetResponse.houseDrawDecision) && Intrinsics.g(this.actualCreditedAmt, placeBetResponse.actualCreditedAmt) && Intrinsics.g(this.actualDebitedAmt, placeBetResponse.actualDebitedAmt) && Intrinsics.g(this.giftAmount, placeBetResponse.giftAmount);
    }

    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getHouseDraw() {
        return this.houseDraw;
    }

    public final String getHouseDrawDecision() {
        return this.houseDrawDecision;
    }

    public final int getHouseDrawSum() {
        return this.houseDrawSum;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iHashCode = this.userPick.hashCode() * 31;
        Double d = this.stakeAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.payoutAmount;
        int iA = gmf0.a(gpp.a(this.houseDrawSum, gmf0.a(gmf0.a((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.currency), 31, this.houseDraw), 31), 31, this.houseDrawDecision);
        Double d3 = this.actualCreditedAmt;
        int iHashCode3 = (iA + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.actualDebitedAmt;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.giftAmount;
        return iHashCode4 + (d5 != null ? d5.hashCode() : 0);
    }

    public String toString() {
        String str = this.userPick;
        Double d = this.stakeAmount;
        Double d2 = this.payoutAmount;
        String str2 = this.currency;
        String str3 = this.houseDraw;
        int i = this.houseDrawSum;
        String str4 = this.houseDrawDecision;
        Double d3 = this.actualCreditedAmt;
        Double d4 = this.actualDebitedAmt;
        Double d5 = this.giftAmount;
        StringBuilder sb = new StringBuilder("PlaceBetResponse(userPick=");
        sb.append(str);
        sb.append(", stakeAmount=");
        sb.append(d);
        sb.append(", payoutAmount=");
        ry4.a(d2, ", currency=", str2, ", houseDraw=", sb);
        wxa.b(i, str3, ", houseDrawSum=", ", houseDrawDecision=", sb);
        k800.a(d3, str4, ", actualCreditedAmt=", ", actualDebitedAmt=", sb);
        sb.append(d4);
        sb.append(", giftAmount=");
        sb.append(d5);
        sb.append(")");
        return sb.toString();
    }
}
