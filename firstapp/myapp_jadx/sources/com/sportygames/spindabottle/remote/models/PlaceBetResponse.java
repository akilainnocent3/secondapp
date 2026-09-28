package com.sportygames.spindabottle.remote.models;

import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.s27;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013¨\u0006-"}, d2 = {"Lcom/sportygames/spindabottle/remote/models/PlaceBetResponse;", "", "userPick", "", "payoutAmount", "", "currency", "houseDraw", "houseDrawSum", "", "houseDrawDecision", "actualCreditedAmt", "actualDebitedAmt", "giftAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getUserPick", "()Ljava/lang/String;", "getPayoutAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getHouseDraw", "getHouseDrawSum", "()I", "getHouseDrawDecision", "getActualCreditedAmt", "getActualDebitedAmt", "getGiftAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/spindabottle/remote/models/PlaceBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private final String userPick;

    public PlaceBetResponse(String str, Double d, String str2, String str3, int i, String str4, Double d2, Double d3, Double d4) {
        wd7.a(str, str2, str3, str4);
        this.userPick = str;
        this.payoutAmount = d;
        this.currency = str2;
        this.houseDraw = str3;
        this.houseDrawSum = i;
        this.houseDrawDecision = str4;
        this.actualCreditedAmt = d2;
        this.actualDebitedAmt = d3;
        this.giftAmount = d4;
    }

    public static /* synthetic */ PlaceBetResponse copy$default(PlaceBetResponse placeBetResponse, String str, Double d, String str2, String str3, int i, String str4, Double d2, Double d3, Double d4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placeBetResponse.userPick;
        }
        if ((i2 & 2) != 0) {
            d = placeBetResponse.payoutAmount;
        }
        if ((i2 & 4) != 0) {
            str2 = placeBetResponse.currency;
        }
        if ((i2 & 8) != 0) {
            str3 = placeBetResponse.houseDraw;
        }
        if ((i2 & 16) != 0) {
            i = placeBetResponse.houseDrawSum;
        }
        if ((i2 & 32) != 0) {
            str4 = placeBetResponse.houseDrawDecision;
        }
        if ((i2 & 64) != 0) {
            d2 = placeBetResponse.actualCreditedAmt;
        }
        if ((i2 & 128) != 0) {
            d3 = placeBetResponse.actualDebitedAmt;
        }
        if ((i2 & 256) != 0) {
            d4 = placeBetResponse.giftAmount;
        }
        Double d5 = d3;
        Double d6 = d4;
        String str5 = str4;
        Double d7 = d2;
        int i3 = i;
        String str6 = str2;
        return placeBetResponse.copy(str, d, str6, str3, i3, str5, d7, d5, d6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHouseDraw() {
        return this.houseDraw;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHouseDrawSum() {
        return this.houseDrawSum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHouseDrawDecision() {
        return this.houseDrawDecision;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final PlaceBetResponse copy(String userPick, Double payoutAmount, String currency, String houseDraw, int houseDrawSum, String houseDrawDecision, Double actualCreditedAmt, Double actualDebitedAmt, Double giftAmount) {
        userPick.getClass();
        currency.getClass();
        houseDraw.getClass();
        houseDrawDecision.getClass();
        return new PlaceBetResponse(userPick, payoutAmount, currency, houseDraw, houseDrawSum, houseDrawDecision, actualCreditedAmt, actualDebitedAmt, giftAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetResponse)) {
            return false;
        }
        PlaceBetResponse placeBetResponse = (PlaceBetResponse) other;
        return Intrinsics.g(this.userPick, placeBetResponse.userPick) && Intrinsics.g(this.payoutAmount, placeBetResponse.payoutAmount) && Intrinsics.g(this.currency, placeBetResponse.currency) && Intrinsics.g(this.houseDraw, placeBetResponse.houseDraw) && this.houseDrawSum == placeBetResponse.houseDrawSum && Intrinsics.g(this.houseDrawDecision, placeBetResponse.houseDrawDecision) && Intrinsics.g(this.actualCreditedAmt, placeBetResponse.actualCreditedAmt) && Intrinsics.g(this.actualDebitedAmt, placeBetResponse.actualDebitedAmt) && Intrinsics.g(this.giftAmount, placeBetResponse.giftAmount);
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

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iHashCode = this.userPick.hashCode() * 31;
        Double d = this.payoutAmount;
        int iA = gmf0.a(gpp.a(this.houseDrawSum, gmf0.a(gmf0.a((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.currency), 31, this.houseDraw), 31), 31, this.houseDrawDecision);
        Double d2 = this.actualCreditedAmt;
        int iHashCode2 = (iA + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.actualDebitedAmt;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.giftAmount;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        String str = this.userPick;
        Double d = this.payoutAmount;
        String str2 = this.currency;
        String str3 = this.houseDraw;
        int i = this.houseDrawSum;
        String str4 = this.houseDrawDecision;
        Double d2 = this.actualCreditedAmt;
        Double d3 = this.actualDebitedAmt;
        Double d4 = this.giftAmount;
        StringBuilder sb = new StringBuilder("PlaceBetResponse(userPick=");
        sb.append(str);
        sb.append(", payoutAmount=");
        sb.append(d);
        sb.append(", currency=");
        hxa.c(sb, str2, ", houseDraw=", str3, ", houseDrawSum=");
        f78.b(i, ", houseDrawDecision=", str4, ", actualCreditedAmt=", sb);
        s27.a(d2, d3, ", actualDebitedAmt=", ", giftAmount=", sb);
        sb.append(d4);
        sb.append(")");
        return sb.toString();
    }
}
