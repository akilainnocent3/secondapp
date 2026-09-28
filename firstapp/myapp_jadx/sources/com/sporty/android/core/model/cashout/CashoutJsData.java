package com.sporty.android.core.model.cashout;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJr\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\bHÖ\u0081\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\f\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cÊ\u0001\u0002\b3¨\u00062"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutJsData;", "", "isFeatureEnabled", "", "cashOutFactorSettings", "", "Lcom/sporty/android/core/model/cashout/CashoutJsData$CashoutFactorSettings;", "ladderMode", "", "minCashOutAmount", "", "maxCashOutAmount", "isUserCCFCheckPass", "oddsTolerance", "", "zeroMarginCashOutEnabled", "<init>", "(ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;)V", "()Z", "getCashOutFactorSettings", "()Ljava/util/List;", "getLadderMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinCashOutAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxCashOutAmount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOddsTolerance", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getZeroMarginCashOutEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/cashout/CashoutJsData;", "equals", "other", "hashCode", "toString", "", "CashoutFactorSettings", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutJsData {
    private final List<CashoutFactorSettings> cashOutFactorSettings;
    private final boolean isFeatureEnabled;
    private final Boolean isUserCCFCheckPass;
    private final Integer ladderMode;
    private final Double maxCashOutAmount;
    private final Double minCashOutAmount;
    private final Float oddsTolerance;
    private final Boolean zeroMarginCashOutEnabled;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutJsData$CashoutFactorSettings;", "", "tvf", "", "ddf", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getTvf", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDdf", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/sporty/android/core/model/cashout/CashoutJsData$CashoutFactorSettings;", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CashoutFactorSettings {
        private final Long ddf;
        private final Long tvf;

        public CashoutFactorSettings(Long l, Long l2) {
            this.tvf = l;
            this.ddf = l2;
        }

        public static /* synthetic */ CashoutFactorSettings copy$default(CashoutFactorSettings cashoutFactorSettings, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = cashoutFactorSettings.tvf;
            }
            if ((i & 2) != 0) {
                l2 = cashoutFactorSettings.ddf;
            }
            return cashoutFactorSettings.copy(l, l2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getTvf() {
            return this.tvf;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDdf() {
            return this.ddf;
        }

        public final CashoutFactorSettings copy(Long tvf, Long ddf) {
            return new CashoutFactorSettings(tvf, ddf);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashoutFactorSettings)) {
                return false;
            }
            CashoutFactorSettings cashoutFactorSettings = (CashoutFactorSettings) other;
            return Intrinsics.g(this.tvf, cashoutFactorSettings.tvf) && Intrinsics.g(this.ddf, cashoutFactorSettings.ddf);
        }

        public final Long getDdf() {
            return this.ddf;
        }

        public final Long getTvf() {
            return this.tvf;
        }

        public int hashCode() {
            Long l = this.tvf;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.ddf;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "CashoutFactorSettings(tvf=" + this.tvf + LGxrN.zDKBqqMFokT + this.ddf + ")";
        }
    }

    public CashoutJsData(boolean z, List<CashoutFactorSettings> list, Integer num, Double d, Double d2, Boolean bool, Float f, Boolean bool2) {
        this.isFeatureEnabled = z;
        this.cashOutFactorSettings = list;
        this.ladderMode = num;
        this.minCashOutAmount = d;
        this.maxCashOutAmount = d2;
        this.isUserCCFCheckPass = bool;
        this.oddsTolerance = f;
        this.zeroMarginCashOutEnabled = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutJsData copy$default(CashoutJsData cashoutJsData, boolean z, List list, Integer num, Double d, Double d2, Boolean bool, Float f, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cashoutJsData.isFeatureEnabled;
        }
        if ((i & 2) != 0) {
            list = cashoutJsData.cashOutFactorSettings;
        }
        if ((i & 4) != 0) {
            num = cashoutJsData.ladderMode;
        }
        if ((i & 8) != 0) {
            d = cashoutJsData.minCashOutAmount;
        }
        if ((i & 16) != 0) {
            d2 = cashoutJsData.maxCashOutAmount;
        }
        if ((i & 32) != 0) {
            bool = cashoutJsData.isUserCCFCheckPass;
        }
        if ((i & 64) != 0) {
            f = cashoutJsData.oddsTolerance;
        }
        if ((i & 128) != 0) {
            bool2 = cashoutJsData.zeroMarginCashOutEnabled;
        }
        Float f2 = f;
        Boolean bool3 = bool2;
        Double d3 = d2;
        Boolean bool4 = bool;
        return cashoutJsData.copy(z, list, num, d, d3, bool4, f2, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsFeatureEnabled() {
        return this.isFeatureEnabled;
    }

    public final List<CashoutFactorSettings> component2() {
        return this.cashOutFactorSettings;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLadderMode() {
        return this.ladderMode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMinCashOutAmount() {
        return this.minCashOutAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getMaxCashOutAmount() {
        return this.maxCashOutAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsUserCCFCheckPass() {
        return this.isUserCCFCheckPass;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getOddsTolerance() {
        return this.oddsTolerance;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getZeroMarginCashOutEnabled() {
        return this.zeroMarginCashOutEnabled;
    }

    public final CashoutJsData copy(boolean isFeatureEnabled, List<CashoutFactorSettings> cashOutFactorSettings, Integer ladderMode, Double minCashOutAmount, Double maxCashOutAmount, Boolean isUserCCFCheckPass, Float oddsTolerance, Boolean zeroMarginCashOutEnabled) {
        return new CashoutJsData(isFeatureEnabled, cashOutFactorSettings, ladderMode, minCashOutAmount, maxCashOutAmount, isUserCCFCheckPass, oddsTolerance, zeroMarginCashOutEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutJsData)) {
            return false;
        }
        CashoutJsData cashoutJsData = (CashoutJsData) other;
        return this.isFeatureEnabled == cashoutJsData.isFeatureEnabled && Intrinsics.g(this.cashOutFactorSettings, cashoutJsData.cashOutFactorSettings) && Intrinsics.g(this.ladderMode, cashoutJsData.ladderMode) && Intrinsics.g(this.minCashOutAmount, cashoutJsData.minCashOutAmount) && Intrinsics.g(this.maxCashOutAmount, cashoutJsData.maxCashOutAmount) && Intrinsics.g(this.isUserCCFCheckPass, cashoutJsData.isUserCCFCheckPass) && Intrinsics.g(this.oddsTolerance, cashoutJsData.oddsTolerance) && Intrinsics.g(this.zeroMarginCashOutEnabled, cashoutJsData.zeroMarginCashOutEnabled);
    }

    public final List<CashoutFactorSettings> getCashOutFactorSettings() {
        return this.cashOutFactorSettings;
    }

    public final Integer getLadderMode() {
        return this.ladderMode;
    }

    public final Double getMaxCashOutAmount() {
        return this.maxCashOutAmount;
    }

    public final Double getMinCashOutAmount() {
        return this.minCashOutAmount;
    }

    public final Float getOddsTolerance() {
        return this.oddsTolerance;
    }

    public final Boolean getZeroMarginCashOutEnabled() {
        return this.zeroMarginCashOutEnabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isFeatureEnabled) * 31;
        List<CashoutFactorSettings> list = this.cashOutFactorSettings;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.ladderMode;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.minCashOutAmount;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.maxCashOutAmount;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.isUserCCFCheckPass;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.oddsTolerance;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool2 = this.zeroMarginCashOutEnabled;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isFeatureEnabled() {
        return this.isFeatureEnabled;
    }

    public final Boolean isUserCCFCheckPass() {
        return this.isUserCCFCheckPass;
    }

    public String toString() {
        return "CashoutJsData(isFeatureEnabled=" + this.isFeatureEnabled + ", cashOutFactorSettings=" + this.cashOutFactorSettings + ", ladderMode=" + this.ladderMode + ", minCashOutAmount=" + this.minCashOutAmount + ", maxCashOutAmount=" + this.maxCashOutAmount + ", isUserCCFCheckPass=" + this.isUserCCFCheckPass + ", oddsTolerance=" + this.oddsTolerance + ", zeroMarginCashOutEnabled=" + this.zeroMarginCashOutEnabled + ")";
    }
}
