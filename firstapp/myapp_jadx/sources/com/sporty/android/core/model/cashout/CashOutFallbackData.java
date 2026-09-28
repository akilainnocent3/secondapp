package com.sporty.android.core.model.cashout;

import defpackage.o2g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010%J\u009e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00104J\u0014\u00105\u001a\u00020\u00052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00107\u001a\u00020\u0011HÖ\u0081\u0004J\n\u00108\u001a\u00020\bHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%Ê\u0001\u0002\b:¨\u00069"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "", "cfr", "", "ccfBlocked", "", "betaSettings", "", "", "globalCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackQuota;", "userCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "selectionCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackSelectionCashOutQuota;", "maxCashOutPayoutAmount", "trfIntervalSeconds", "", "minCapEnabled", "trfGracePeriodSeconds", "<init>", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/Map;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getCfr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCcfBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBetaSettings", "()Ljava/util/Map;", "getGlobalCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackQuota;", "getUserCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "getSelectionCashOutQuota", "getMaxCashOutPayoutAmount", "getTrfIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinCapEnabled", "getTrfGracePeriodSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/Map;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutFallbackData {
    private final Map<String, Double> betaSettings;
    private final Boolean ccfBlocked;
    private final Double cfr;
    private final FallbackQuota globalCashOutQuota;
    private final Double maxCashOutPayoutAmount;
    private final Boolean minCapEnabled;
    private final Map<String, FallbackSelectionCashOutQuota> selectionCashOutQuota;
    private final Integer trfGracePeriodSeconds;
    private final Integer trfIntervalSeconds;
    private final FallbackUserCashOutQuota userCashOutQuota;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashOutFallbackData(Double d, Boolean bool, Map map, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map2, Double d2, Integer num, Boolean bool2, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Map map3;
        Double dValueOf = Double.valueOf(0.0d);
        d = (i & 1) != 0 ? dValueOf : d;
        bool = (i & 2) != 0 ? Boolean.FALSE : bool;
        if ((i & 4) != 0) {
            map = o2g.a;
            map.getClass();
        }
        fallbackQuota = (i & 8) != 0 ? new FallbackQuota(0.0d) : fallbackQuota;
        FallbackUserCashOutQuota fallbackUserCashOutQuota2 = (i & 16) != 0 ? new FallbackUserCashOutQuota(0.0d, 0) : fallbackUserCashOutQuota;
        if ((i & 32) != 0) {
            map3 = o2g.a;
            map3.getClass();
        } else {
            map3 = map2;
        }
        this(d, bool, map, fallbackQuota, fallbackUserCashOutQuota2, map3, (i & 64) == 0 ? d2 : dValueOf, (i & 128) != 0 ? 0 : num, (i & 256) != 0 ? Boolean.FALSE : bool2, (i & 512) != 0 ? 0 : num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutFallbackData copy$default(CashOutFallbackData cashOutFallbackData, Double d, Boolean bool, Map map, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map2, Double d2, Integer num, Boolean bool2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cashOutFallbackData.cfr;
        }
        if ((i & 2) != 0) {
            bool = cashOutFallbackData.ccfBlocked;
        }
        if ((i & 4) != 0) {
            map = cashOutFallbackData.betaSettings;
        }
        if ((i & 8) != 0) {
            fallbackQuota = cashOutFallbackData.globalCashOutQuota;
        }
        if ((i & 16) != 0) {
            fallbackUserCashOutQuota = cashOutFallbackData.userCashOutQuota;
        }
        if ((i & 32) != 0) {
            map2 = cashOutFallbackData.selectionCashOutQuota;
        }
        if ((i & 64) != 0) {
            d2 = cashOutFallbackData.maxCashOutPayoutAmount;
        }
        if ((i & 128) != 0) {
            num = cashOutFallbackData.trfIntervalSeconds;
        }
        if ((i & 256) != 0) {
            bool2 = cashOutFallbackData.minCapEnabled;
        }
        if ((i & 512) != 0) {
            num2 = cashOutFallbackData.trfGracePeriodSeconds;
        }
        Boolean bool3 = bool2;
        Integer num3 = num2;
        Double d3 = d2;
        Integer num4 = num;
        FallbackUserCashOutQuota fallbackUserCashOutQuota2 = fallbackUserCashOutQuota;
        Map map3 = map2;
        return cashOutFallbackData.copy(d, bool, map, fallbackQuota, fallbackUserCashOutQuota2, map3, d3, num4, bool3, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCfr() {
        return this.cfr;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getTrfGracePeriodSeconds() {
        return this.trfGracePeriodSeconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getCcfBlocked() {
        return this.ccfBlocked;
    }

    public final Map<String, Double> component3() {
        return this.betaSettings;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FallbackQuota getGlobalCashOutQuota() {
        return this.globalCashOutQuota;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FallbackUserCashOutQuota getUserCashOutQuota() {
        return this.userCashOutQuota;
    }

    public final Map<String, FallbackSelectionCashOutQuota> component6() {
        return this.selectionCashOutQuota;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getMaxCashOutPayoutAmount() {
        return this.maxCashOutPayoutAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTrfIntervalSeconds() {
        return this.trfIntervalSeconds;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getMinCapEnabled() {
        return this.minCapEnabled;
    }

    public final CashOutFallbackData copy(Double cfr, Boolean ccfBlocked, Map<String, Double> betaSettings, FallbackQuota globalCashOutQuota, FallbackUserCashOutQuota userCashOutQuota, Map<String, FallbackSelectionCashOutQuota> selectionCashOutQuota, Double maxCashOutPayoutAmount, Integer trfIntervalSeconds, Boolean minCapEnabled, Integer trfGracePeriodSeconds) {
        return new CashOutFallbackData(cfr, ccfBlocked, betaSettings, globalCashOutQuota, userCashOutQuota, selectionCashOutQuota, maxCashOutPayoutAmount, trfIntervalSeconds, minCapEnabled, trfGracePeriodSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutFallbackData)) {
            return false;
        }
        CashOutFallbackData cashOutFallbackData = (CashOutFallbackData) other;
        return Intrinsics.g(this.cfr, cashOutFallbackData.cfr) && Intrinsics.g(this.ccfBlocked, cashOutFallbackData.ccfBlocked) && Intrinsics.g(this.betaSettings, cashOutFallbackData.betaSettings) && Intrinsics.g(this.globalCashOutQuota, cashOutFallbackData.globalCashOutQuota) && Intrinsics.g(this.userCashOutQuota, cashOutFallbackData.userCashOutQuota) && Intrinsics.g(this.selectionCashOutQuota, cashOutFallbackData.selectionCashOutQuota) && Intrinsics.g(this.maxCashOutPayoutAmount, cashOutFallbackData.maxCashOutPayoutAmount) && Intrinsics.g(this.trfIntervalSeconds, cashOutFallbackData.trfIntervalSeconds) && Intrinsics.g(this.minCapEnabled, cashOutFallbackData.minCapEnabled) && Intrinsics.g(this.trfGracePeriodSeconds, cashOutFallbackData.trfGracePeriodSeconds);
    }

    public final Map<String, Double> getBetaSettings() {
        return this.betaSettings;
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

    public final Boolean getMinCapEnabled() {
        return this.minCapEnabled;
    }

    public final Map<String, FallbackSelectionCashOutQuota> getSelectionCashOutQuota() {
        return this.selectionCashOutQuota;
    }

    public final Integer getTrfGracePeriodSeconds() {
        return this.trfGracePeriodSeconds;
    }

    public final Integer getTrfIntervalSeconds() {
        return this.trfIntervalSeconds;
    }

    public final FallbackUserCashOutQuota getUserCashOutQuota() {
        return this.userCashOutQuota;
    }

    public int hashCode() {
        Double d = this.cfr;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Boolean bool = this.ccfBlocked;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Double> map = this.betaSettings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        FallbackQuota fallbackQuota = this.globalCashOutQuota;
        int iHashCode4 = (iHashCode3 + (fallbackQuota == null ? 0 : fallbackQuota.hashCode())) * 31;
        FallbackUserCashOutQuota fallbackUserCashOutQuota = this.userCashOutQuota;
        int iHashCode5 = (iHashCode4 + (fallbackUserCashOutQuota == null ? 0 : fallbackUserCashOutQuota.hashCode())) * 31;
        Map<String, FallbackSelectionCashOutQuota> map2 = this.selectionCashOutQuota;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Double d2 = this.maxCashOutPayoutAmount;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.trfIntervalSeconds;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.minCapEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.trfGracePeriodSeconds;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "CashOutFallbackData(cfr=" + this.cfr + ", ccfBlocked=" + this.ccfBlocked + ", betaSettings=" + this.betaSettings + ", globalCashOutQuota=" + this.globalCashOutQuota + ", userCashOutQuota=" + this.userCashOutQuota + ", selectionCashOutQuota=" + this.selectionCashOutQuota + ", maxCashOutPayoutAmount=" + this.maxCashOutPayoutAmount + ", trfIntervalSeconds=" + this.trfIntervalSeconds + Chyeyik.KdFlliYFJHtpy + this.minCapEnabled + ", trfGracePeriodSeconds=" + this.trfGracePeriodSeconds + ")";
    }

    public CashOutFallbackData(Double d, Boolean bool, Map<String, Double> map, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map<String, FallbackSelectionCashOutQuota> map2, Double d2, Integer num, Boolean bool2, Integer num2) {
        this.cfr = d;
        this.ccfBlocked = bool;
        this.betaSettings = map;
        this.globalCashOutQuota = fallbackQuota;
        this.userCashOutQuota = fallbackUserCashOutQuota;
        this.selectionCashOutQuota = map2;
        this.maxCashOutPayoutAmount = d2;
        this.trfIntervalSeconds = num;
        this.minCapEnabled = bool2;
        this.trfGracePeriodSeconds = num2;
    }

    public CashOutFallbackData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
