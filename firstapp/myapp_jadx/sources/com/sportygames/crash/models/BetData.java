package com.sportygames.crash.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/crash/models/BetData;", "", "betValue", "", "cashOutValue", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getBetValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCashOutValue", "setCashOutValue", "(Ljava/lang/Double;)V", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportygames/crash/models/BetData;", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetData {
    public static final int $stable = 8;
    private final Double betValue;
    private Double cashOutValue;

    public /* synthetic */ BetData(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public static /* synthetic */ BetData copy$default(BetData betData, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = betData.betValue;
        }
        if ((i & 2) != 0) {
            d2 = betData.cashOutValue;
        }
        return betData.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getBetValue() {
        return this.betValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getCashOutValue() {
        return this.cashOutValue;
    }

    public final BetData copy(Double betValue, Double cashOutValue) {
        return new BetData(betValue, cashOutValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetData)) {
            return false;
        }
        BetData betData = (BetData) other;
        return Intrinsics.g(this.betValue, betData.betValue) && Intrinsics.g(this.cashOutValue, betData.cashOutValue);
    }

    public final Double getBetValue() {
        return this.betValue;
    }

    public final Double getCashOutValue() {
        return this.cashOutValue;
    }

    public int hashCode() {
        Double d = this.betValue;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.cashOutValue;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final void setCashOutValue(Double d) {
        this.cashOutValue = d;
    }

    public String toString() {
        return "BetData(betValue=" + this.betValue + ", cashOutValue=" + this.cashOutValue + ")";
    }

    public BetData(Double d, Double d2) {
        this.betValue = d;
        this.cashOutValue = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BetData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
