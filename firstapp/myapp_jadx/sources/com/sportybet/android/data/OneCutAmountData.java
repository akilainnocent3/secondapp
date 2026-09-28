package com.sportybet.android.data;

import defpackage.dd3;
import defpackage.mh2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/data/OneCutAmountData;", "", "allWinAmount", "Ljava/math/BigDecimal;", "oneCutAmount", "allWinRawData", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAllWinAmount", "()Ljava/math/BigDecimal;", "getOneCutAmount", "getAllWinRawData", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneCutAmountData {
    public static final int $stable = 0;
    private final BigDecimal allWinAmount;
    private final BigDecimal allWinRawData;
    private final BigDecimal oneCutAmount;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OneCutAmountData(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            bigDecimal = BigDecimal.ZERO;
            bigDecimal.getClass();
        }
        if ((i & 2) != 0) {
            bigDecimal2 = BigDecimal.ZERO;
            bigDecimal2.getClass();
        }
        if ((i & 4) != 0) {
            bigDecimal3 = BigDecimal.ZERO;
            bigDecimal3.getClass();
        }
        this(bigDecimal, bigDecimal2, bigDecimal3);
    }

    public static /* synthetic */ OneCutAmountData copy$default(OneCutAmountData oneCutAmountData, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = oneCutAmountData.allWinAmount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = oneCutAmountData.oneCutAmount;
        }
        if ((i & 4) != 0) {
            bigDecimal3 = oneCutAmountData.allWinRawData;
        }
        return oneCutAmountData.copy(bigDecimal, bigDecimal2, bigDecimal3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAllWinAmount() {
        return this.allWinAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getOneCutAmount() {
        return this.oneCutAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getAllWinRawData() {
        return this.allWinRawData;
    }

    public final OneCutAmountData copy(BigDecimal allWinAmount, BigDecimal oneCutAmount, BigDecimal allWinRawData) {
        allWinAmount.getClass();
        oneCutAmount.getClass();
        allWinRawData.getClass();
        return new OneCutAmountData(allWinAmount, oneCutAmount, allWinRawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneCutAmountData)) {
            return false;
        }
        OneCutAmountData oneCutAmountData = (OneCutAmountData) other;
        return Intrinsics.g(this.allWinAmount, oneCutAmountData.allWinAmount) && Intrinsics.g(this.oneCutAmount, oneCutAmountData.oneCutAmount) && Intrinsics.g(this.allWinRawData, oneCutAmountData.allWinRawData);
    }

    public final BigDecimal getAllWinAmount() {
        return this.allWinAmount;
    }

    public final BigDecimal getAllWinRawData() {
        return this.allWinRawData;
    }

    public final BigDecimal getOneCutAmount() {
        return this.oneCutAmount;
    }

    public int hashCode() {
        return this.allWinRawData.hashCode() + dd3.a(this.oneCutAmount, this.allWinAmount.hashCode() * 31, 31);
    }

    public String toString() {
        BigDecimal bigDecimal = this.allWinAmount;
        BigDecimal bigDecimal2 = this.oneCutAmount;
        BigDecimal bigDecimal3 = this.allWinRawData;
        StringBuilder sb = new StringBuilder("OneCutAmountData(allWinAmount=");
        sb.append(bigDecimal);
        sb.append(", oneCutAmount=");
        sb.append(bigDecimal2);
        sb.append(", allWinRawData=");
        return mh2.a(")", sb, bigDecimal3);
    }

    public OneCutAmountData(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.allWinAmount = bigDecimal;
        this.oneCutAmount = bigDecimal2;
        this.allWinRawData = bigDecimal3;
    }

    public OneCutAmountData() {
        this(null, null, null, 7, null);
    }
}
