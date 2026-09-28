package com.sportygames.rush.model.response;

import defpackage.s27;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0019\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0003J\u0088\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0011R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, d2 = {"Lcom/sportygames/rush/model/response/DetailResponse;", "", "defaultAmount", "", "minAmount", "maxAmount", "maxPayout", "minUserCoefficient", "maxUserCoefficient", "desiredRTP", "defaultUserCoefficient", "autoBetChips", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/ArrayList;)V", "getDefaultAmount", "()Ljava/lang/Double;", "setDefaultAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMinAmount", "getMaxAmount", "getMaxPayout", "getMinUserCoefficient", "getMaxUserCoefficient", "getDesiredRTP", "getDefaultUserCoefficient", "getAutoBetChips", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/ArrayList;)Lcom/sportygames/rush/model/response/DetailResponse;", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailResponse {
    public static final int $stable = 8;
    private final ArrayList<Double> autoBetChips;
    private Double defaultAmount;
    private final Double defaultUserCoefficient;
    private final Double desiredRTP;
    private final Double maxAmount;
    private final Double maxPayout;
    private final Double maxUserCoefficient;
    private final Double minAmount;
    private final Double minUserCoefficient;

    public DetailResponse(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, ArrayList<Double> arrayList) {
        arrayList.getClass();
        this.defaultAmount = d;
        this.minAmount = d2;
        this.maxAmount = d3;
        this.maxPayout = d4;
        this.minUserCoefficient = d5;
        this.maxUserCoefficient = d6;
        this.desiredRTP = d7;
        this.defaultUserCoefficient = d8;
        this.autoBetChips = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailResponse copy$default(DetailResponse detailResponse, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            d = detailResponse.defaultAmount;
        }
        if ((i & 2) != 0) {
            d2 = detailResponse.minAmount;
        }
        if ((i & 4) != 0) {
            d3 = detailResponse.maxAmount;
        }
        if ((i & 8) != 0) {
            d4 = detailResponse.maxPayout;
        }
        if ((i & 16) != 0) {
            d5 = detailResponse.minUserCoefficient;
        }
        if ((i & 32) != 0) {
            d6 = detailResponse.maxUserCoefficient;
        }
        if ((i & 64) != 0) {
            d7 = detailResponse.desiredRTP;
        }
        if ((i & 128) != 0) {
            d8 = detailResponse.defaultUserCoefficient;
        }
        if ((i & 256) != 0) {
            arrayList = detailResponse.autoBetChips;
        }
        Double d9 = d8;
        ArrayList arrayList2 = arrayList;
        Double d10 = d6;
        Double d11 = d7;
        Double d12 = d5;
        Double d13 = d3;
        return detailResponse.copy(d, d2, d13, d4, d12, d10, d11, d9, arrayList2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getMinUserCoefficient() {
        return this.minUserCoefficient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMaxUserCoefficient() {
        return this.maxUserCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getDesiredRTP() {
        return this.desiredRTP;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getDefaultUserCoefficient() {
        return this.defaultUserCoefficient;
    }

    public final ArrayList<Double> component9() {
        return this.autoBetChips;
    }

    public final DetailResponse copy(Double defaultAmount, Double minAmount, Double maxAmount, Double maxPayout, Double minUserCoefficient, Double maxUserCoefficient, Double desiredRTP, Double defaultUserCoefficient, ArrayList<Double> autoBetChips) {
        autoBetChips.getClass();
        return new DetailResponse(defaultAmount, minAmount, maxAmount, maxPayout, minUserCoefficient, maxUserCoefficient, desiredRTP, defaultUserCoefficient, autoBetChips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailResponse)) {
            return false;
        }
        DetailResponse detailResponse = (DetailResponse) other;
        return Intrinsics.g(this.defaultAmount, detailResponse.defaultAmount) && Intrinsics.g(this.minAmount, detailResponse.minAmount) && Intrinsics.g(this.maxAmount, detailResponse.maxAmount) && Intrinsics.g(this.maxPayout, detailResponse.maxPayout) && Intrinsics.g(this.minUserCoefficient, detailResponse.minUserCoefficient) && Intrinsics.g(this.maxUserCoefficient, detailResponse.maxUserCoefficient) && Intrinsics.g(this.desiredRTP, detailResponse.desiredRTP) && Intrinsics.g(this.defaultUserCoefficient, detailResponse.defaultUserCoefficient) && Intrinsics.g(this.autoBetChips, detailResponse.autoBetChips);
    }

    public final ArrayList<Double> getAutoBetChips() {
        return this.autoBetChips;
    }

    public final Double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final Double getDefaultUserCoefficient() {
        return this.defaultUserCoefficient;
    }

    public final Double getDesiredRTP() {
        return this.desiredRTP;
    }

    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    public final Double getMaxPayout() {
        return this.maxPayout;
    }

    public final Double getMaxUserCoefficient() {
        return this.maxUserCoefficient;
    }

    public final Double getMinAmount() {
        return this.minAmount;
    }

    public final Double getMinUserCoefficient() {
        return this.minUserCoefficient;
    }

    public int hashCode() {
        Double d = this.defaultAmount;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.minAmount;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.maxAmount;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.maxPayout;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.minUserCoefficient;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.maxUserCoefficient;
        int iHashCode6 = (iHashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.desiredRTP;
        int iHashCode7 = (iHashCode6 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.defaultUserCoefficient;
        return this.autoBetChips.hashCode() + ((iHashCode7 + (d8 != null ? d8.hashCode() : 0)) * 31);
    }

    public final void setDefaultAmount(Double d) {
        this.defaultAmount = d;
    }

    public String toString() {
        Double d = this.defaultAmount;
        Double d2 = this.minAmount;
        Double d3 = this.maxAmount;
        Double d4 = this.maxPayout;
        Double d5 = this.minUserCoefficient;
        Double d6 = this.maxUserCoefficient;
        Double d7 = this.desiredRTP;
        Double d8 = this.defaultUserCoefficient;
        ArrayList<Double> arrayList = this.autoBetChips;
        StringBuilder sb = new StringBuilder("DetailResponse(defaultAmount=");
        sb.append(d);
        sb.append(", minAmount=");
        sb.append(d2);
        sb.append(", maxAmount=");
        s27.a(d3, d4, ", maxPayout=", ", minUserCoefficient=", sb);
        s27.a(d5, d6, ", maxUserCoefficient=", ", desiredRTP=", sb);
        s27.a(d7, d8, ", defaultUserCoefficient=", ", autoBetChips=", sb);
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }
}
