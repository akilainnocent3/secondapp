package com.sportybet.android.data;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0007¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\u0002\b\u0007¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/data/GetInsureBetResult;", "", "odds", "Ljava/math/BigDecimal;", "oddsKey", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "Lkotlin/jvm/JvmField;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GetInsureBetResult {
    public static final int $stable = 8;
    public BigDecimal odds;
    public BigDecimal oddsKey;

    public /* synthetic */ GetInsureBetResult(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 2) != 0 ? BigDecimal.ZERO : bigDecimal2);
    }

    public static /* synthetic */ GetInsureBetResult copy$default(GetInsureBetResult getInsureBetResult, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = getInsureBetResult.odds;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = getInsureBetResult.oddsKey;
        }
        return getInsureBetResult.copy(bigDecimal, bigDecimal2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getOddsKey() {
        return this.oddsKey;
    }

    public final GetInsureBetResult copy(BigDecimal odds, BigDecimal oddsKey) {
        return new GetInsureBetResult(odds, oddsKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetInsureBetResult)) {
            return false;
        }
        GetInsureBetResult getInsureBetResult = (GetInsureBetResult) other;
        return Intrinsics.g(this.odds, getInsureBetResult.odds) && Intrinsics.g(this.oddsKey, getInsureBetResult.oddsKey);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.odds;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.oddsKey;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    public String toString() {
        return "GetInsureBetResult(odds=" + this.odds + ", oddsKey=" + this.oddsKey + ")";
    }

    public GetInsureBetResult(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.odds = bigDecimal;
        this.oddsKey = bigDecimal2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetInsureBetResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
