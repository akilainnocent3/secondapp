package com.sporty.android.core.model.cashout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/cashout/FallbackCtr;", "", "prematch", "", "live", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getPrematch", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLive", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/sporty/android/core/model/cashout/FallbackCtr;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FallbackCtr {
    private final Double live;
    private final Double prematch;

    public /* synthetic */ FallbackCtr(Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public static /* synthetic */ FallbackCtr copy$default(FallbackCtr fallbackCtr, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fallbackCtr.prematch;
        }
        if ((i & 2) != 0) {
            d2 = fallbackCtr.live;
        }
        return fallbackCtr.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getPrematch() {
        return this.prematch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getLive() {
        return this.live;
    }

    public final FallbackCtr copy(Double prematch, Double live) {
        return new FallbackCtr(prematch, live);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackCtr)) {
            return false;
        }
        FallbackCtr fallbackCtr = (FallbackCtr) other;
        return Intrinsics.g(this.prematch, fallbackCtr.prematch) && Intrinsics.g(this.live, fallbackCtr.live);
    }

    public final Double getLive() {
        return this.live;
    }

    public final Double getPrematch() {
        return this.prematch;
    }

    public int hashCode() {
        Double d = this.prematch;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.live;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "FallbackCtr(prematch=" + this.prematch + ", live=" + this.live + ")";
    }

    public FallbackCtr(Double d, Double d2) {
        this.prematch = d;
        this.live = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FallbackCtr() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
