package com.sporty.android.core.model.cashout;

import defpackage.o2g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010&Jx\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00101J\u0014\u00102\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00104\u001a\u00020\u0012HÖ\u0081\u0004J\n\u00105\u001a\u00020\fHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&Ê\u0001\u0002\b7¨\u00066"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutFallback;", "", "cfr", "", "ccfBlocked", "", "globalCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackQuota;", "userCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "selectionCashOutQuota", "", "", "Lcom/sporty/android/core/model/cashout/FallbackSelectionCashOutQuota;", "maxCashOutPayoutAmount", "oddsChangeTimeForFallback", "", "trfGracePeriodSeconds", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Boolean;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;)V", "getCfr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCcfBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGlobalCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackQuota;", "getUserCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "getSelectionCashOutQuota", "()Ljava/util/Map;", "getMaxCashOutPayoutAmount", "getOddsChangeTimeForFallback", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTrfGracePeriodSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/lang/Boolean;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/sporty/android/core/model/cashout/CashOutFallback;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutFallback {
    private final Boolean ccfBlocked;
    private final Double cfr;
    private final FallbackQuota globalCashOutQuota;
    private final Double maxCashOutPayoutAmount;
    private final Long oddsChangeTimeForFallback;
    private final Map<String, FallbackSelectionCashOutQuota> selectionCashOutQuota;
    private final Integer trfGracePeriodSeconds;
    private final FallbackUserCashOutQuota userCashOutQuota;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashOutFallback(Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map, Double d2, Long l, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        d = (i & 1) != 0 ? dValueOf : d;
        bool = (i & 2) != 0 ? Boolean.FALSE : bool;
        fallbackQuota = (i & 4) != 0 ? new FallbackQuota(0.0d) : fallbackQuota;
        fallbackUserCashOutQuota = (i & 8) != 0 ? new FallbackUserCashOutQuota(0.0d, 0) : fallbackUserCashOutQuota;
        if ((i & 16) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(d, bool, fallbackQuota, fallbackUserCashOutQuota, map, (i & 32) != 0 ? dValueOf : d2, (i & 64) != 0 ? 0L : l, (i & 128) != 0 ? 0 : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutFallback copy$default(CashOutFallback cashOutFallback, Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map, Double d2, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cashOutFallback.cfr;
        }
        if ((i & 2) != 0) {
            bool = cashOutFallback.ccfBlocked;
        }
        if ((i & 4) != 0) {
            fallbackQuota = cashOutFallback.globalCashOutQuota;
        }
        if ((i & 8) != 0) {
            fallbackUserCashOutQuota = cashOutFallback.userCashOutQuota;
        }
        if ((i & 16) != 0) {
            map = cashOutFallback.selectionCashOutQuota;
        }
        if ((i & 32) != 0) {
            d2 = cashOutFallback.maxCashOutPayoutAmount;
        }
        if ((i & 64) != 0) {
            l = cashOutFallback.oddsChangeTimeForFallback;
        }
        if ((i & 128) != 0) {
            num = cashOutFallback.trfGracePeriodSeconds;
        }
        Long l2 = l;
        Integer num2 = num;
        Map map2 = map;
        Double d3 = d2;
        return cashOutFallback.copy(d, bool, fallbackQuota, fallbackUserCashOutQuota, map2, d3, l2, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCfr() {
        return this.cfr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCcfBlocked() {
        return this.ccfBlocked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FallbackQuota getGlobalCashOutQuota() {
        return this.globalCashOutQuota;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FallbackUserCashOutQuota getUserCashOutQuota() {
        return this.userCashOutQuota;
    }

    public final Map<String, FallbackSelectionCashOutQuota> component5() {
        return this.selectionCashOutQuota;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMaxCashOutPayoutAmount() {
        return this.maxCashOutPayoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getOddsChangeTimeForFallback() {
        return this.oddsChangeTimeForFallback;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTrfGracePeriodSeconds() {
        return this.trfGracePeriodSeconds;
    }

    public final CashOutFallback copy(Double cfr, Boolean ccfBlocked, FallbackQuota globalCashOutQuota, FallbackUserCashOutQuota userCashOutQuota, Map<String, FallbackSelectionCashOutQuota> selectionCashOutQuota, Double maxCashOutPayoutAmount, Long oddsChangeTimeForFallback, Integer trfGracePeriodSeconds) {
        selectionCashOutQuota.getClass();
        return new CashOutFallback(cfr, ccfBlocked, globalCashOutQuota, userCashOutQuota, selectionCashOutQuota, maxCashOutPayoutAmount, oddsChangeTimeForFallback, trfGracePeriodSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutFallback)) {
            return false;
        }
        CashOutFallback cashOutFallback = (CashOutFallback) other;
        return Intrinsics.g(this.cfr, cashOutFallback.cfr) && Intrinsics.g(this.ccfBlocked, cashOutFallback.ccfBlocked) && Intrinsics.g(this.globalCashOutQuota, cashOutFallback.globalCashOutQuota) && Intrinsics.g(this.userCashOutQuota, cashOutFallback.userCashOutQuota) && Intrinsics.g(this.selectionCashOutQuota, cashOutFallback.selectionCashOutQuota) && Intrinsics.g(this.maxCashOutPayoutAmount, cashOutFallback.maxCashOutPayoutAmount) && Intrinsics.g(this.oddsChangeTimeForFallback, cashOutFallback.oddsChangeTimeForFallback) && Intrinsics.g(this.trfGracePeriodSeconds, cashOutFallback.trfGracePeriodSeconds);
    }

    public final Boolean getCcfBlocked() {
        return this.ccfBlocked;
    }

    public final Double getCfr() {
        return this.cfr;
    }

    public final FallbackQuota getGlobalCashOutQuota() {
        return this.globalCashOutQuota;
    }

    public final Double getMaxCashOutPayoutAmount() {
        return this.maxCashOutPayoutAmount;
    }

    public final Long getOddsChangeTimeForFallback() {
        return this.oddsChangeTimeForFallback;
    }

    public final Map<String, FallbackSelectionCashOutQuota> getSelectionCashOutQuota() {
        return this.selectionCashOutQuota;
    }

    public final Integer getTrfGracePeriodSeconds() {
        return this.trfGracePeriodSeconds;
    }

    public final FallbackUserCashOutQuota getUserCashOutQuota() {
        return this.userCashOutQuota;
    }

    public int hashCode() {
        Double d = this.cfr;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Boolean bool = this.ccfBlocked;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        FallbackQuota fallbackQuota = this.globalCashOutQuota;
        int iHashCode3 = (iHashCode2 + (fallbackQuota == null ? 0 : fallbackQuota.hashCode())) * 31;
        FallbackUserCashOutQuota fallbackUserCashOutQuota = this.userCashOutQuota;
        int iHashCode4 = (this.selectionCashOutQuota.hashCode() + ((iHashCode3 + (fallbackUserCashOutQuota == null ? 0 : fallbackUserCashOutQuota.hashCode())) * 31)) * 31;
        Double d2 = this.maxCashOutPayoutAmount;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.oddsChangeTimeForFallback;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.trfGracePeriodSeconds;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "CashOutFallback(cfr=" + this.cfr + ", ccfBlocked=" + this.ccfBlocked + ", globalCashOutQuota=" + this.globalCashOutQuota + ", userCashOutQuota=" + this.userCashOutQuota + ", selectionCashOutQuota=" + this.selectionCashOutQuota + ", maxCashOutPayoutAmount=" + this.maxCashOutPayoutAmount + ", oddsChangeTimeForFallback=" + this.oddsChangeTimeForFallback + ", trfGracePeriodSeconds=" + this.trfGracePeriodSeconds + ")";
    }

    public CashOutFallback(Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map<String, FallbackSelectionCashOutQuota> map, Double d2, Long l, Integer num) {
        map.getClass();
        this.cfr = d;
        this.ccfBlocked = bool;
        this.globalCashOutQuota = fallbackQuota;
        this.userCashOutQuota = fallbackUserCashOutQuota;
        this.selectionCashOutQuota = map;
        this.maxCashOutPayoutAmount = d2;
        this.oddsChangeTimeForFallback = l;
        this.trfGracePeriodSeconds = num;
    }

    public CashOutFallback() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
