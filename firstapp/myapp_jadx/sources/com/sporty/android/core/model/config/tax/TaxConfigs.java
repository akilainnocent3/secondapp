package com.sporty.android.core.model.config.tax;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/config/tax/TaxConfigs;", "", "realSportTaxConfig", "Lcom/sporty/android/core/model/config/tax/TaxConfig;", "virtualTaxConfig", "<init>", "(Lcom/sporty/android/core/model/config/tax/TaxConfig;Lcom/sporty/android/core/model/config/tax/TaxConfig;)V", "getRealSportTaxConfig", "()Lcom/sporty/android/core/model/config/tax/TaxConfig;", "getVirtualTaxConfig", "getConfig", "isSimulatedMode", "", "hasRate", "getRateAsPercentage", "", "hasExciseTaxRate", "getExciseTax", "Ljava/math/BigDecimal;", "stake", "getType", "getTax", "potWin", "getNetWin", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TaxConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TaxConfig realSportTaxConfig;
    private final TaxConfig virtualTaxConfig;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005H\u0007b\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sporty/android/core/model/config/tax/TaxConfigs$Companion;", "", "<init>", "()V", "getDefault", "Lcom/sporty/android/core/model/config/tax/TaxConfigs;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TaxConfigs getDefault() {
            TaxConfig.Companion companion = TaxConfig.INSTANCE;
            return new TaxConfigs(companion.getDefault(), companion.getDefault());
        }

        private Companion() {
        }
    }

    public TaxConfigs(TaxConfig taxConfig, TaxConfig taxConfig2) {
        taxConfig.getClass();
        taxConfig2.getClass();
        this.realSportTaxConfig = taxConfig;
        this.virtualTaxConfig = taxConfig2;
    }

    public static /* synthetic */ TaxConfigs copy$default(TaxConfigs taxConfigs, TaxConfig taxConfig, TaxConfig taxConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            taxConfig = taxConfigs.realSportTaxConfig;
        }
        if ((i & 2) != 0) {
            taxConfig2 = taxConfigs.virtualTaxConfig;
        }
        return taxConfigs.copy(taxConfig, taxConfig2);
    }

    public static final TaxConfigs getDefault() {
        return INSTANCE.getDefault();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TaxConfig getRealSportTaxConfig() {
        return this.realSportTaxConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TaxConfig getVirtualTaxConfig() {
        return this.virtualTaxConfig;
    }

    public final TaxConfigs copy(TaxConfig realSportTaxConfig, TaxConfig virtualTaxConfig) {
        realSportTaxConfig.getClass();
        virtualTaxConfig.getClass();
        return new TaxConfigs(realSportTaxConfig, virtualTaxConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxConfigs)) {
            return false;
        }
        TaxConfigs taxConfigs = (TaxConfigs) other;
        return Intrinsics.g(this.realSportTaxConfig, taxConfigs.realSportTaxConfig) && Intrinsics.g(this.virtualTaxConfig, taxConfigs.virtualTaxConfig);
    }

    public final TaxConfig getConfig(boolean isSimulatedMode) {
        return isSimulatedMode ? this.virtualTaxConfig : this.realSportTaxConfig;
    }

    public final BigDecimal getExciseTax(boolean isSimulatedMode, BigDecimal stake) {
        stake.getClass();
        return isSimulatedMode ? this.virtualTaxConfig.getExciseTax(stake) : this.realSportTaxConfig.getExciseTax(stake);
    }

    public final BigDecimal getNetWin(boolean isSimulatedMode, BigDecimal potWin, BigDecimal stake) {
        potWin.getClass();
        stake.getClass();
        return isSimulatedMode ? this.virtualTaxConfig.getNetWin(potWin, stake) : this.realSportTaxConfig.getNetWin(potWin, stake);
    }

    public final int getRateAsPercentage(boolean isSimulatedMode) {
        if (!isSimulatedMode && this.realSportTaxConfig.hasRate()) {
            return this.realSportTaxConfig.getRateAsPercentage();
        }
        if (isSimulatedMode && this.virtualTaxConfig.hasRate()) {
            return this.virtualTaxConfig.getRateAsPercentage();
        }
        return 0;
    }

    public final TaxConfig getRealSportTaxConfig() {
        return this.realSportTaxConfig;
    }

    public final BigDecimal getTax(boolean isSimulatedMode, BigDecimal potWin, BigDecimal stake) {
        potWin.getClass();
        stake.getClass();
        return isSimulatedMode ? this.virtualTaxConfig.getTax(potWin, stake) : this.realSportTaxConfig.getTax(potWin, stake);
    }

    public final int getType(boolean isSimulatedMode) {
        return isSimulatedMode ? this.virtualTaxConfig.getType() : this.realSportTaxConfig.getType();
    }

    public final TaxConfig getVirtualTaxConfig() {
        return this.virtualTaxConfig;
    }

    public final boolean hasExciseTaxRate(boolean isSimulatedMode) {
        if (isSimulatedMode || this.realSportTaxConfig.getExciseTaxRateToShow() <= 0.0d) {
            return isSimulatedMode && this.virtualTaxConfig.getExciseTaxRateToShow() > 0.0d;
        }
        return true;
    }

    public final boolean hasRate(boolean isSimulatedMode) {
        if (isSimulatedMode || !this.realSportTaxConfig.hasRate()) {
            return isSimulatedMode && this.virtualTaxConfig.hasRate();
        }
        return true;
    }

    public int hashCode() {
        return this.virtualTaxConfig.hashCode() + (this.realSportTaxConfig.hashCode() * 31);
    }

    public String toString() {
        return "TaxConfigs(realSportTaxConfig=" + this.realSportTaxConfig + ", virtualTaxConfig=" + this.virtualTaxConfig + ")";
    }
}
