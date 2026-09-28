package com.sportygames.fruithunt.network.models;

import defpackage.k800;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011¨\u0006/"}, d2 = {"Lcom/sportygames/fruithunt/network/models/FHPlaceBetResponse;", "", "actualCreditedAmt", "", "actualDebitedAmt", "betId", "", "currency", "", "fruitsEnum", "giftAmount", "multiplier", "payoutAmount", "stakeAmount", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getActualCreditedAmt", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getActualDebitedAmt", "getBetId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getFruitsEnum", "getGiftAmount", "getMultiplier", "getPayoutAmount", "getStakeAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/fruithunt/network/models/FHPlaceBetResponse;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FHPlaceBetResponse {
    public static final int $stable = 0;
    private final Double actualCreditedAmt;
    private final Double actualDebitedAmt;
    private final Long betId;
    private final String currency;
    private final String fruitsEnum;
    private final Double giftAmount;
    private final String multiplier;
    private final Double payoutAmount;
    private final Double stakeAmount;

    public FHPlaceBetResponse(Double d, Double d2, Long l, String str, String str2, Double d3, String str3, Double d4, Double d5) {
        this.actualCreditedAmt = d;
        this.actualDebitedAmt = d2;
        this.betId = l;
        this.currency = str;
        this.fruitsEnum = str2;
        this.giftAmount = d3;
        this.multiplier = str3;
        this.payoutAmount = d4;
        this.stakeAmount = d5;
    }

    public static /* synthetic */ FHPlaceBetResponse copy$default(FHPlaceBetResponse fHPlaceBetResponse, Double d, Double d2, Long l, String str, String str2, Double d3, String str3, Double d4, Double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fHPlaceBetResponse.actualCreditedAmt;
        }
        if ((i & 2) != 0) {
            d2 = fHPlaceBetResponse.actualDebitedAmt;
        }
        if ((i & 4) != 0) {
            l = fHPlaceBetResponse.betId;
        }
        if ((i & 8) != 0) {
            str = fHPlaceBetResponse.currency;
        }
        if ((i & 16) != 0) {
            str2 = fHPlaceBetResponse.fruitsEnum;
        }
        if ((i & 32) != 0) {
            d3 = fHPlaceBetResponse.giftAmount;
        }
        if ((i & 64) != 0) {
            str3 = fHPlaceBetResponse.multiplier;
        }
        if ((i & 128) != 0) {
            d4 = fHPlaceBetResponse.payoutAmount;
        }
        if ((i & 256) != 0) {
            d5 = fHPlaceBetResponse.stakeAmount;
        }
        Double d6 = d4;
        Double d7 = d5;
        Double d8 = d3;
        String str4 = str3;
        String str5 = str2;
        Long l2 = l;
        return fHPlaceBetResponse.copy(d, d2, l2, str, str5, d8, str4, d6, d7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFruitsEnum() {
        return this.fruitsEnum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final FHPlaceBetResponse copy(Double actualCreditedAmt, Double actualDebitedAmt, Long betId, String currency, String fruitsEnum, Double giftAmount, String multiplier, Double payoutAmount, Double stakeAmount) {
        return new FHPlaceBetResponse(actualCreditedAmt, actualDebitedAmt, betId, currency, fruitsEnum, giftAmount, multiplier, payoutAmount, stakeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FHPlaceBetResponse)) {
            return false;
        }
        FHPlaceBetResponse fHPlaceBetResponse = (FHPlaceBetResponse) other;
        return Intrinsics.g(this.actualCreditedAmt, fHPlaceBetResponse.actualCreditedAmt) && Intrinsics.g(this.actualDebitedAmt, fHPlaceBetResponse.actualDebitedAmt) && Intrinsics.g(this.betId, fHPlaceBetResponse.betId) && Intrinsics.g(this.currency, fHPlaceBetResponse.currency) && Intrinsics.g(this.fruitsEnum, fHPlaceBetResponse.fruitsEnum) && Intrinsics.g(this.giftAmount, fHPlaceBetResponse.giftAmount) && Intrinsics.g(this.multiplier, fHPlaceBetResponse.multiplier) && Intrinsics.g(this.payoutAmount, fHPlaceBetResponse.payoutAmount) && Intrinsics.g(this.stakeAmount, fHPlaceBetResponse.stakeAmount);
    }

    public final Double getActualCreditedAmt() {
        return this.actualCreditedAmt;
    }

    public final Double getActualDebitedAmt() {
        return this.actualDebitedAmt;
    }

    public final Long getBetId() {
        return this.betId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFruitsEnum() {
        return this.fruitsEnum;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public int hashCode() {
        Double d = this.actualCreditedAmt;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.actualDebitedAmt;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.betId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fruitsEnum;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.giftAmount;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.multiplier;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d4 = this.payoutAmount;
        int iHashCode8 = (iHashCode7 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.stakeAmount;
        return iHashCode8 + (d5 != null ? d5.hashCode() : 0);
    }

    public String toString() {
        Double d = this.actualCreditedAmt;
        Double d2 = this.actualDebitedAmt;
        Long l = this.betId;
        String str = this.currency;
        String str2 = this.fruitsEnum;
        Double d3 = this.giftAmount;
        String str3 = this.multiplier;
        Double d4 = this.payoutAmount;
        Double d5 = this.stakeAmount;
        StringBuilder sb = new StringBuilder("FHPlaceBetResponse(actualCreditedAmt=");
        sb.append(d);
        sb.append(", actualDebitedAmt=");
        sb.append(d2);
        sb.append(", betId=");
        sb.append(l);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", fruitsEnum=");
        k800.a(d3, str2, ", giftAmount=", ", multiplier=", sb);
        k800.a(d4, str3, ", payoutAmount=", ", stakeAmount=", sb);
        sb.append(d5);
        sb.append(")");
        return sb.toString();
    }
}
