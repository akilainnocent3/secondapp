package com.sporty.android.core.model.cashout;

import defpackage.o2g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!Jz\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0014\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\u000fHÖ\u0081\u0004J\n\u00101\u001a\u00020\fHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!Ê\u0001\u0002\b3¨\u00062"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutFallbackSettingsDto;", "", "cfr", "", "ccfBlocked", "", "globalCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackQuota;", "userCashOutQuota", "Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "betaSettings", "", "", "maxCashOutPayoutAmount", "trfIntervalSeconds", "", "trfGracePeriodSeconds", "<init>", "(Ljava/lang/Double;Ljava/lang/Boolean;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCfr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCcfBlocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGlobalCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackQuota;", "getUserCashOutQuota", "()Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;", "getBetaSettings", "()Ljava/util/Map;", "getMaxCashOutPayoutAmount", "getTrfIntervalSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrfGracePeriodSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/lang/Boolean;Lcom/sporty/android/core/model/cashout/FallbackQuota;Lcom/sporty/android/core/model/cashout/FallbackUserCashOutQuota;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sporty/android/core/model/cashout/CashoutFallbackSettingsDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutFallbackSettingsDto {
    private final Map<String, Double> betaSettings;
    private final Boolean ccfBlocked;
    private final Double cfr;
    private final FallbackQuota globalCashOutQuota;
    private final Double maxCashOutPayoutAmount;
    private final Integer trfGracePeriodSeconds;
    private final Integer trfIntervalSeconds;
    private final FallbackUserCashOutQuota userCashOutQuota;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashoutFallbackSettingsDto(Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map, Double d2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        d = (i & 1) != 0 ? dValueOf : d;
        bool = (i & 2) != 0 ? Boolean.FALSE : bool;
        fallbackQuota = (i & 4) != 0 ? new FallbackQuota(0.0d) : fallbackQuota;
        fallbackUserCashOutQuota = (i & 8) != 0 ? new FallbackUserCashOutQuota(0.0d, 0) : fallbackUserCashOutQuota;
        if ((i & 16) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(d, bool, fallbackQuota, fallbackUserCashOutQuota, map, (i & 32) != 0 ? dValueOf : d2, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? 0 : num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutFallbackSettingsDto copy$default(CashoutFallbackSettingsDto cashoutFallbackSettingsDto, Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map map, Double d2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cashoutFallbackSettingsDto.cfr;
        }
        if ((i & 2) != 0) {
            bool = cashoutFallbackSettingsDto.ccfBlocked;
        }
        if ((i & 4) != 0) {
            fallbackQuota = cashoutFallbackSettingsDto.globalCashOutQuota;
        }
        if ((i & 8) != 0) {
            fallbackUserCashOutQuota = cashoutFallbackSettingsDto.userCashOutQuota;
        }
        if ((i & 16) != 0) {
            map = cashoutFallbackSettingsDto.betaSettings;
        }
        if ((i & 32) != 0) {
            d2 = cashoutFallbackSettingsDto.maxCashOutPayoutAmount;
        }
        if ((i & 64) != 0) {
            num = cashoutFallbackSettingsDto.trfIntervalSeconds;
        }
        if ((i & 128) != 0) {
            num2 = cashoutFallbackSettingsDto.trfGracePeriodSeconds;
        }
        Integer num3 = num;
        Integer num4 = num2;
        Map map2 = map;
        Double d3 = d2;
        return cashoutFallbackSettingsDto.copy(d, bool, fallbackQuota, fallbackUserCashOutQuota, map2, d3, num3, num4);
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

    public final Map<String, Double> component5() {
        return this.betaSettings;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMaxCashOutPayoutAmount() {
        return this.maxCashOutPayoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTrfIntervalSeconds() {
        return this.trfIntervalSeconds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTrfGracePeriodSeconds() {
        return this.trfGracePeriodSeconds;
    }

    public final CashoutFallbackSettingsDto copy(Double cfr, Boolean ccfBlocked, FallbackQuota globalCashOutQuota, FallbackUserCashOutQuota userCashOutQuota, Map<String, Double> betaSettings, Double maxCashOutPayoutAmount, Integer trfIntervalSeconds, Integer trfGracePeriodSeconds) {
        return new CashoutFallbackSettingsDto(cfr, ccfBlocked, globalCashOutQuota, userCashOutQuota, betaSettings, maxCashOutPayoutAmount, trfIntervalSeconds, trfGracePeriodSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutFallbackSettingsDto)) {
            return false;
        }
        CashoutFallbackSettingsDto cashoutFallbackSettingsDto = (CashoutFallbackSettingsDto) other;
        return Intrinsics.g(this.cfr, cashoutFallbackSettingsDto.cfr) && Intrinsics.g(this.ccfBlocked, cashoutFallbackSettingsDto.ccfBlocked) && Intrinsics.g(this.globalCashOutQuota, cashoutFallbackSettingsDto.globalCashOutQuota) && Intrinsics.g(this.userCashOutQuota, cashoutFallbackSettingsDto.userCashOutQuota) && Intrinsics.g(this.betaSettings, cashoutFallbackSettingsDto.betaSettings) && Intrinsics.g(this.maxCashOutPayoutAmount, cashoutFallbackSettingsDto.maxCashOutPayoutAmount) && Intrinsics.g(this.trfIntervalSeconds, cashoutFallbackSettingsDto.trfIntervalSeconds) && Intrinsics.g(this.trfGracePeriodSeconds, cashoutFallbackSettingsDto.trfGracePeriodSeconds);
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
        FallbackQuota fallbackQuota = this.globalCashOutQuota;
        int iHashCode3 = (iHashCode2 + (fallbackQuota == null ? 0 : fallbackQuota.hashCode())) * 31;
        FallbackUserCashOutQuota fallbackUserCashOutQuota = this.userCashOutQuota;
        int iHashCode4 = (iHashCode3 + (fallbackUserCashOutQuota == null ? 0 : fallbackUserCashOutQuota.hashCode())) * 31;
        Map<String, Double> map = this.betaSettings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Double d2 = this.maxCashOutPayoutAmount;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.trfIntervalSeconds;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.trfGracePeriodSeconds;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "CashoutFallbackSettingsDto(cfr=" + this.cfr + ", ccfBlocked=" + this.ccfBlocked + ", globalCashOutQuota=" + this.globalCashOutQuota + ", userCashOutQuota=" + this.userCashOutQuota + ", betaSettings=" + this.betaSettings + ", maxCashOutPayoutAmount=" + this.maxCashOutPayoutAmount + ", trfIntervalSeconds=" + this.trfIntervalSeconds + ", trfGracePeriodSeconds=" + this.trfGracePeriodSeconds + ")";
    }

    public CashoutFallbackSettingsDto(Double d, Boolean bool, FallbackQuota fallbackQuota, FallbackUserCashOutQuota fallbackUserCashOutQuota, Map<String, Double> map, Double d2, Integer num, Integer num2) {
        this.cfr = d;
        this.ccfBlocked = bool;
        this.globalCashOutQuota = fallbackQuota;
        this.userCashOutQuota = fallbackUserCashOutQuota;
        this.betaSettings = map;
        this.maxCashOutPayoutAmount = d2;
        this.trfIntervalSeconds = num;
        this.trfGracePeriodSeconds = num2;
    }

    public CashoutFallbackSettingsDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
