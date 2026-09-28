package com.sporty.android.core.model.realsports;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.dd3;
import defpackage.gpp;
import defpackage.hb5;
import defpackage.iib0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020\fHÖ\u0081\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u00060"}, d2 = {"Lcom/sporty/android/core/model/realsports/StakeConfig;", "", "defStake", "Ljava/math/BigDecimal;", "minStake", "maxStake", "maxPayout", "minCashout", "maxCashout", "quickStakes", "", "maxSelectionLimit", "", "bettorLimitLossDefault", "bettorLimitTimeDefault", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;ILjava/math/BigDecimal;I)V", "getDefStake", "()Ljava/math/BigDecimal;", "getMinStake", "getMaxStake", "getMaxPayout", "getMinCashout", "getMaxCashout", "getQuickStakes", "()Ljava/util/List;", "getMaxSelectionLimit", "()I", "getBettorLimitLossDefault", "getBettorLimitTimeDefault", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StakeConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BigDecimal bettorLimitLossDefault;
    private final int bettorLimitTimeDefault;
    private final BigDecimal defStake;
    private final BigDecimal maxCashout;
    private final BigDecimal maxPayout;
    private final int maxSelectionLimit;
    private final BigDecimal maxStake;
    private final BigDecimal minCashout;
    private final BigDecimal minStake;
    private final List<BigDecimal> quickStakes;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007b\u0002\b\u0012b\u0002\b\u0013¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/realsports/StakeConfig$Companion;", "", "<init>", "()V", AnalyticsParam.DATA_FALLBACK, "Lcom/sporty/android/core/model/realsports/StakeConfig;", "defStake", "", "minStake", "maxStake", "maxPayout", "minCashout", "maxCashout", "maxSelectionLimit", "", "bettorLimitLossDefault", "bettorLimitTimeDefault", "(DDDDDDILjava/lang/Double;I)Lcom/sporty/android/core/model/realsports/StakeConfig;", "Lkotlin/jvm/JvmStatic;", "Lkotlin/jvm/JvmOverloads;", "scale", "Ljava/math/BigDecimal;", "value", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ StakeConfig fallback$default(Companion companion, double d, double d2, double d3, double d4, double d5, double d6, int i, Double d7, int i2, int i3, Object obj) {
            return companion.fallback(d, d2, d3, d4, d5, d6, (i3 & 64) != 0 ? 30 : i, (i3 & 128) != 0 ? null : d7, (i3 & 256) != 0 ? 0 : i2);
        }

        private final BigDecimal scale(double value) {
            BigDecimal scale = BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP);
            scale.getClass();
            return scale;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0040  */
        public final StakeConfig fallback(double defStake, double minStake, double maxStake, double maxPayout, double minCashout, double maxCashout, int maxSelectionLimit, Double bettorLimitLossDefault, int bettorLimitTimeDefault) {
            BigDecimal bigDecimalScale;
            BigDecimal bigDecimalScale2 = scale(defStake);
            BigDecimal bigDecimalScale3 = scale(minStake);
            BigDecimal bigDecimalScale4 = scale(maxStake);
            BigDecimal bigDecimalScale5 = scale(maxPayout);
            BigDecimal bigDecimalScale6 = scale(minCashout);
            BigDecimal bigDecimalScale7 = scale(maxCashout);
            List listK = b.k(bigDecimalScale2, scale(5.0d * defStake), scale(defStake * 10.0d));
            if (bettorLimitLossDefault != null) {
                bigDecimalScale = StakeConfig.INSTANCE.scale(bettorLimitLossDefault.doubleValue());
                if (bigDecimalScale == null) {
                    bigDecimalScale = BigDecimal.ZERO;
                }
            } else {
                bigDecimalScale = BigDecimal.ZERO;
            }
            bigDecimalScale.getClass();
            return new StakeConfig(bigDecimalScale2, bigDecimalScale3, bigDecimalScale4, bigDecimalScale5, bigDecimalScale6, bigDecimalScale7, listK, maxSelectionLimit, bigDecimalScale, bettorLimitTimeDefault);
        }

        private Companion() {
        }

        public final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6, int i) {
            return fallback$default(this, d, d2, d3, d4, d5, d6, i, null, 0, 384, null);
        }

        public final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6, int i, Double d7) {
            return fallback$default(this, d, d2, d3, d4, d5, d6, i, d7, 0, 256, null);
        }

        public final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6) {
            return fallback$default(this, d, d2, d3, d4, d5, d6, 0, null, 0, 448, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StakeConfig copy$default(StakeConfig stakeConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, List list, int i, BigDecimal bigDecimal7, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bigDecimal = stakeConfig.defStake;
        }
        if ((i3 & 2) != 0) {
            bigDecimal2 = stakeConfig.minStake;
        }
        if ((i3 & 4) != 0) {
            bigDecimal3 = stakeConfig.maxStake;
        }
        if ((i3 & 8) != 0) {
            bigDecimal4 = stakeConfig.maxPayout;
        }
        if ((i3 & 16) != 0) {
            bigDecimal5 = stakeConfig.minCashout;
        }
        if ((i3 & 32) != 0) {
            bigDecimal6 = stakeConfig.maxCashout;
        }
        if ((i3 & 64) != 0) {
            list = stakeConfig.quickStakes;
        }
        if ((i3 & 128) != 0) {
            i = stakeConfig.maxSelectionLimit;
        }
        if ((i3 & 256) != 0) {
            bigDecimal7 = stakeConfig.bettorLimitLossDefault;
        }
        if ((i3 & 512) != 0) {
            i2 = stakeConfig.bettorLimitTimeDefault;
        }
        BigDecimal bigDecimal8 = bigDecimal7;
        int i4 = i2;
        List list2 = list;
        int i5 = i;
        BigDecimal bigDecimal9 = bigDecimal5;
        BigDecimal bigDecimal10 = bigDecimal6;
        return stakeConfig.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal9, bigDecimal10, list2, i5, bigDecimal8, i4);
    }

    public static final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6, int i, Double d7, int i2) {
        return INSTANCE.fallback(d, d2, d3, d4, d5, d6, i, d7, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getDefStake() {
        return this.defStake;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBettorLimitTimeDefault() {
        return this.bettorLimitTimeDefault;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMinCashout() {
        return this.minCashout;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getMaxCashout() {
        return this.maxCashout;
    }

    public final List<BigDecimal> component7() {
        return this.quickStakes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxSelectionLimit() {
        return this.maxSelectionLimit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getBettorLimitLossDefault() {
        return this.bettorLimitLossDefault;
    }

    public final StakeConfig copy(BigDecimal defStake, BigDecimal minStake, BigDecimal maxStake, BigDecimal maxPayout, BigDecimal minCashout, BigDecimal maxCashout, List<? extends BigDecimal> quickStakes, int maxSelectionLimit, BigDecimal bettorLimitLossDefault, int bettorLimitTimeDefault) {
        defStake.getClass();
        minStake.getClass();
        maxStake.getClass();
        maxPayout.getClass();
        minCashout.getClass();
        maxCashout.getClass();
        quickStakes.getClass();
        bettorLimitLossDefault.getClass();
        return new StakeConfig(defStake, minStake, maxStake, maxPayout, minCashout, maxCashout, quickStakes, maxSelectionLimit, bettorLimitLossDefault, bettorLimitTimeDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StakeConfig)) {
            return false;
        }
        StakeConfig stakeConfig = (StakeConfig) other;
        return Intrinsics.g(this.defStake, stakeConfig.defStake) && Intrinsics.g(this.minStake, stakeConfig.minStake) && Intrinsics.g(this.maxStake, stakeConfig.maxStake) && Intrinsics.g(this.maxPayout, stakeConfig.maxPayout) && Intrinsics.g(this.minCashout, stakeConfig.minCashout) && Intrinsics.g(this.maxCashout, stakeConfig.maxCashout) && Intrinsics.g(this.quickStakes, stakeConfig.quickStakes) && this.maxSelectionLimit == stakeConfig.maxSelectionLimit && Intrinsics.g(this.bettorLimitLossDefault, stakeConfig.bettorLimitLossDefault) && this.bettorLimitTimeDefault == stakeConfig.bettorLimitTimeDefault;
    }

    public final BigDecimal getBettorLimitLossDefault() {
        return this.bettorLimitLossDefault;
    }

    public final int getBettorLimitTimeDefault() {
        return this.bettorLimitTimeDefault;
    }

    public final BigDecimal getDefStake() {
        return this.defStake;
    }

    public final BigDecimal getMaxCashout() {
        return this.maxCashout;
    }

    public final BigDecimal getMaxPayout() {
        return this.maxPayout;
    }

    public final int getMaxSelectionLimit() {
        return this.maxSelectionLimit;
    }

    public final BigDecimal getMaxStake() {
        return this.maxStake;
    }

    public final BigDecimal getMinCashout() {
        return this.minCashout;
    }

    public final BigDecimal getMinStake() {
        return this.minStake;
    }

    public final List<BigDecimal> getQuickStakes() {
        return this.quickStakes;
    }

    public int hashCode() {
        return Integer.hashCode(this.bettorLimitTimeDefault) + dd3.a(this.bettorLimitLossDefault, gpp.a(this.maxSelectionLimit, ai50.a(dd3.a(this.maxCashout, dd3.a(this.minCashout, dd3.a(this.maxPayout, dd3.a(this.maxStake, dd3.a(this.minStake, this.defStake.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.quickStakes), 31), 31);
    }

    public String toString() {
        BigDecimal bigDecimal = this.defStake;
        BigDecimal bigDecimal2 = this.minStake;
        BigDecimal bigDecimal3 = this.maxStake;
        BigDecimal bigDecimal4 = this.maxPayout;
        BigDecimal bigDecimal5 = this.minCashout;
        BigDecimal bigDecimal6 = this.maxCashout;
        List<BigDecimal> list = this.quickStakes;
        int i = this.maxSelectionLimit;
        BigDecimal bigDecimal7 = this.bettorLimitLossDefault;
        int i2 = this.bettorLimitTimeDefault;
        StringBuilder sb = new StringBuilder("StakeConfig(defStake=");
        sb.append(bigDecimal);
        sb.append(", minStake=");
        sb.append(bigDecimal2);
        sb.append(", maxStake=");
        iib0.b(sb, bigDecimal3, ", maxPayout=", bigDecimal4, ", minCashout=");
        iib0.b(sb, bigDecimal5, ", maxCashout=", bigDecimal6, ", quickStakes=");
        sb.append(list);
        sb.append(", maxSelectionLimit=");
        sb.append(i);
        sb.append(", bettorLimitLossDefault=");
        sb.append(bigDecimal7);
        sb.append(", bettorLimitTimeDefault=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public static final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6, int i) {
        return INSTANCE.fallback(d, d2, d3, d4, d5, d6, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StakeConfig(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, List<? extends BigDecimal> list, int i, BigDecimal bigDecimal7, int i2) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        bigDecimal5.getClass();
        bigDecimal6.getClass();
        list.getClass();
        bigDecimal7.getClass();
        this.defStake = bigDecimal;
        this.minStake = bigDecimal2;
        this.maxStake = bigDecimal3;
        this.maxPayout = bigDecimal4;
        this.minCashout = bigDecimal5;
        this.maxCashout = bigDecimal6;
        this.quickStakes = list;
        this.maxSelectionLimit = i;
        this.bettorLimitLossDefault = bigDecimal7;
        this.bettorLimitTimeDefault = i2;
        BigDecimal bigDecimal8 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal8) > 0) {
            if (bigDecimal2.compareTo(bigDecimal8) > 0) {
                if (bigDecimal3.compareTo(bigDecimal8) > 0) {
                    if (bigDecimal3.compareTo(bigDecimal2) >= 0) {
                        if (bigDecimal4.compareTo(bigDecimal8) > 0) {
                            if (bigDecimal5.compareTo(bigDecimal8) > 0) {
                                if (bigDecimal6.compareTo(bigDecimal8) > 0) {
                                    if (bigDecimal6.compareTo(bigDecimal5) >= 0) {
                                        if (i > 0) {
                                            return;
                                        }
                                        hb5.a("maxSelectionLimit must be positive");
                                        throw null;
                                    }
                                    hb5.a(iKBWavCysVP.xxNXV);
                                    throw null;
                                }
                                hb5.a("maxCashout must be positive");
                                throw null;
                            }
                            hb5.a("minCashout must be positive");
                            throw null;
                        }
                        hb5.a("maxPayout must be positive");
                        throw null;
                    }
                    hb5.a("maxStake must be >= minStake");
                    throw null;
                }
                hb5.a("maxStake must be positive");
                throw null;
            }
            hb5.a("minStake must be positive");
            throw null;
        }
        hb5.a("defStake must be positive");
        throw null;
    }

    public static final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6, int i, Double d7) {
        return INSTANCE.fallback(d, d2, d3, d4, d5, d6, i, d7);
    }

    public static final StakeConfig fallback(double d, double d2, double d3, double d4, double d5, double d6) {
        return INSTANCE.fallback(d, d2, d3, d4, d5, d6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StakeConfig(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, List list, int i, BigDecimal bigDecimal7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal bigDecimal8;
        if ((i3 & 256) != 0) {
            BigDecimal bigDecimal9 = BigDecimal.ZERO;
            bigDecimal9.getClass();
            bigDecimal8 = bigDecimal9;
        } else {
            bigDecimal8 = bigDecimal7;
        }
        this(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, list, i, bigDecimal8, (i3 & 512) != 0 ? 0 : i2);
    }
}
