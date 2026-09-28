package com.sportygames.wheelanddeal.model;

import defpackage.nrg0;
import defpackage.org0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDRiskAmountModel;", "", "minAmount", "", "maxAmount", "defaultAmount", "stepAmount", "<init>", "(DDDD)V", "getMinAmount", "()D", "getMaxAmount", "getDefaultAmount", "getStepAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDRiskAmountModel {
    public static final int $stable = 0;
    private final double defaultAmount;
    private final double maxAmount;
    private final double minAmount;
    private final double stepAmount;

    public /* synthetic */ WDRiskAmountModel(double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 100.0d : d2, (i & 4) != 0 ? 1.0d : d3, (i & 8) != 0 ? 1.0d : d4);
    }

    public static /* synthetic */ WDRiskAmountModel copy$default(WDRiskAmountModel wDRiskAmountModel, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = wDRiskAmountModel.minAmount;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = wDRiskAmountModel.maxAmount;
        }
        double d6 = d2;
        if ((i & 4) != 0) {
            d3 = wDRiskAmountModel.defaultAmount;
        }
        return wDRiskAmountModel.copy(d5, d6, d3, (i & 8) != 0 ? wDRiskAmountModel.stepAmount : d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getStepAmount() {
        return this.stepAmount;
    }

    public final WDRiskAmountModel copy(double minAmount, double maxAmount, double defaultAmount, double stepAmount) {
        return new WDRiskAmountModel(minAmount, maxAmount, defaultAmount, stepAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDRiskAmountModel)) {
            return false;
        }
        WDRiskAmountModel wDRiskAmountModel = (WDRiskAmountModel) other;
        return Double.compare(this.minAmount, wDRiskAmountModel.minAmount) == 0 && Double.compare(this.maxAmount, wDRiskAmountModel.maxAmount) == 0 && Double.compare(this.defaultAmount, wDRiskAmountModel.defaultAmount) == 0 && Double.compare(this.stepAmount, wDRiskAmountModel.stepAmount) == 0;
    }

    public final double getDefaultAmount() {
        return this.defaultAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final double getMinAmount() {
        return this.minAmount;
    }

    public final double getStepAmount() {
        return this.stepAmount;
    }

    public int hashCode() {
        return Double.hashCode(this.stepAmount) + nrg0.a(nrg0.a(Double.hashCode(this.minAmount) * 31, 31, this.maxAmount), 31, this.defaultAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDRiskAmountModel(minAmount=");
        sb.append(this.minAmount);
        sb.append(", maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", defaultAmount=");
        sb.append(this.defaultAmount);
        sb.append(", stepAmount=");
        return org0.a(sb, this.stepAmount, ')');
    }

    public WDRiskAmountModel(double d, double d2, double d3, double d4) {
        this.minAmount = d;
        this.maxAmount = d2;
        this.defaultAmount = d3;
        this.stepAmount = d4;
    }

    public WDRiskAmountModel() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 15, null);
    }
}
