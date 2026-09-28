package com.sportygames.rush.model.response;

import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.k800;
import defpackage.s27;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001b\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014¨\u0006."}, d2 = {"Lcom/sportygames/rush/model/response/RushPlaceBetResponse;", "", "betRecordId", "", "userCoefficient", "", "stakeAmount", "payoutAmount", "currency", "", "houseCoefficient", "giftAmount", "actualDebitedAmt", "actualCreditedAmt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBetRecordId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStakeAmount", "getPayoutAmount", "getCurrency", "()Ljava/lang/String;", "getHouseCoefficient", "getGiftAmount", "getActualDebitedAmt", "getActualCreditedAmt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/rush/model/response/RushPlaceBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RushPlaceBetResponse {
    public static final int $stable = 0;
    private final Double actualCreditedAmt;
    private final Double actualDebitedAmt;
    private final Integer betRecordId;
    private final String currency;
    private final Double giftAmount;
    private final Double houseCoefficient;
    private final Double payoutAmount;
    private final Double stakeAmount;
    private final Double userCoefficient;

    public RushPlaceBetResponse(Integer num, Double d, Double d2, Double d3, String str, Double d4, Double d5, Double d6, Double d7) {
        this.betRecordId = num;
        this.userCoefficient = d;
        this.stakeAmount = d2;
        this.payoutAmount = d3;
        this.currency = str;
        this.houseCoefficient = d4;
        this.giftAmount = d5;
        this.actualDebitedAmt = d6;
        this.actualCreditedAmt = d7;
    }

    public static /* synthetic */ RushPlaceBetResponse copy$default(RushPlaceBetResponse rushPlaceBetResponse, Integer num, Double d, Double d2, Double d3, String str, Double d4, Double d5, Double d6, Double d7, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rushPlaceBetResponse.betRecordId;
        }
        if ((i & 2) != 0) {
            d = rushPlaceBetResponse.userCoefficient;
        }
        if ((i & 4) != 0) {
            d2 = rushPlaceBetResponse.stakeAmount;
        }
        if ((i & 8) != 0) {
            d3 = rushPlaceBetResponse.payoutAmount;
        }
        if ((i & 16) != 0) {
            str = rushPlaceBetResponse.currency;
        }
        if ((i & 32) != 0) {
            d4 = rushPlaceBetResponse.houseCoefficient;
        }
        if ((i & 64) != 0) {
            d5 = rushPlaceBetResponse.giftAmount;
        }
        if ((i & 128) != 0) {
            d6 = rushPlaceBetResponse.actualDebitedAmt;
        }
        if ((i & 256) != 0) {
            d7 = rushPlaceBetResponse.actualCreditedAmt;
        }
        Double d8 = d6;
        Double d9 = d7;
        Double d10 = d4;
        Double d11 = d5;
        String str2 = str;
        Double d12 = d2;
        return rushPlaceBetResponse.copy(num, d, d12, d3, str2, d10, d11, d8, d9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBetRecordId() {
        return this.betRecordId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getUserCoefficient() {
        return this.userCoefficient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    public final RushPlaceBetResponse copy(Integer betRecordId, Double userCoefficient, Double stakeAmount, Double payoutAmount, String currency, Double houseCoefficient, Double giftAmount, Double actualDebitedAmt, Double actualCreditedAmt) {
        return new RushPlaceBetResponse(betRecordId, userCoefficient, stakeAmount, payoutAmount, currency, houseCoefficient, giftAmount, actualDebitedAmt, actualCreditedAmt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RushPlaceBetResponse)) {
            return false;
        }
        RushPlaceBetResponse rushPlaceBetResponse = (RushPlaceBetResponse) other;
        return Intrinsics.g(this.betRecordId, rushPlaceBetResponse.betRecordId) && Intrinsics.g(this.userCoefficient, rushPlaceBetResponse.userCoefficient) && Intrinsics.g(this.stakeAmount, rushPlaceBetResponse.stakeAmount) && Intrinsics.g(this.payoutAmount, rushPlaceBetResponse.payoutAmount) && Intrinsics.g(this.currency, rushPlaceBetResponse.currency) && Intrinsics.g(this.houseCoefficient, rushPlaceBetResponse.houseCoefficient) && Intrinsics.g(this.giftAmount, rushPlaceBetResponse.giftAmount) && Intrinsics.g(this.actualDebitedAmt, rushPlaceBetResponse.actualDebitedAmt) && Intrinsics.g(this.actualCreditedAmt, rushPlaceBetResponse.actualCreditedAmt);
    }

    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    public final Integer getBetRecordId() {
        return this.betRecordId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Double getUserCoefficient() {
        return this.userCoefficient;
    }

    public int hashCode() {
        Integer num = this.betRecordId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.userCoefficient;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.payoutAmount;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.currency;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Double d4 = this.houseCoefficient;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.giftAmount;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.actualDebitedAmt;
        int iHashCode8 = (iHashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.actualCreditedAmt;
        return iHashCode8 + (d7 != null ? d7.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.betRecordId;
        Double d = this.userCoefficient;
        Double d2 = this.stakeAmount;
        Double d3 = this.payoutAmount;
        String str = this.currency;
        Double d4 = this.houseCoefficient;
        Double d5 = this.giftAmount;
        Double d6 = this.actualDebitedAmt;
        Double d7 = this.actualCreditedAmt;
        StringBuilder sb = new StringBuilder("RushPlaceBetResponse(betRecordId=");
        sb.append(num);
        sb.append(", userCoefficient=");
        sb.append(d);
        sb.append(", stakeAmount=");
        s27.a(d2, d3, ", payoutAmount=", OdQr.kDM, sb);
        k800.a(d4, str, ", houseCoefficient=", ", giftAmount=", sb);
        s27.a(d5, d6, ", actualDebitedAmt=", ", actualCreditedAmt=", sb);
        sb.append(d7);
        sb.append(")");
        return sb.toString();
    }
}
