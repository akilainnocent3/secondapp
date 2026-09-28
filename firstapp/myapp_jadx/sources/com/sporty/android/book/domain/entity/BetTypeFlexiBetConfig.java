package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dd3;
import defpackage.mtg0;
import defpackage.o2g;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001J\u0014\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010*\u001a\u00020\fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dÊ\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006+"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetTypeFlexiBetConfig;", "", "oddsKey", "Ljava/math/BigDecimal;", "oddsKeys", "", "", "flexiWeightedRtpEnabled", "", "flexiAverageWeightedRtpMultiplier", "flexiAverageWeightedMinEffectiveRtp", "flexiWeightedRtpSupportedMinVersion", "", "flexibleMinOdds", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/math/BigDecimal;Ljava/util/Map;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;I)V", "getOddsKey", "()Ljava/math/BigDecimal;", "getOddsKeys", "()Ljava/util/Map;", "getFlexiWeightedRtpEnabled", "()Z", "getFlexiAverageWeightedRtpMultiplier", "getFlexiAverageWeightedMinEffectiveRtp", "getFlexiWeightedRtpSupportedMinVersion", "()Ljava/lang/String;", "getFlexibleMinOdds", "getStatus", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeFlexiBetConfig {
    public static final int $stable = 8;
    private final BigDecimal flexiAverageWeightedMinEffectiveRtp;
    private final BigDecimal flexiAverageWeightedRtpMultiplier;
    private final boolean flexiWeightedRtpEnabled;
    private final String flexiWeightedRtpSupportedMinVersion;
    private final BigDecimal flexibleMinOdds;
    private final BigDecimal oddsKey;
    private final Map<Integer, BigDecimal> oddsKeys;
    private final int status;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetTypeFlexiBetConfig(BigDecimal bigDecimal, Map map, boolean z, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        bigDecimal = (i2 & 1) != 0 ? FlexiBetConfigConstants.INSTANCE.getDEFAULT_ODDS_KEY() : bigDecimal;
        if ((i2 & 2) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(bigDecimal, map, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? FlexiBetConfigConstants.INSTANCE.getDEFAULT_WEIGHTED_RTP_MULTIPLIER() : bigDecimal2, (i2 & 16) != 0 ? FlexiBetConfigConstants.INSTANCE.getDEFAULT_MIN_EFFECTIVE_WEIGHTED_RTP() : bigDecimal3, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? FlexiBetConfigConstants.INSTANCE.getDEFAULT_MIN_ODDS() : bigDecimal4, (i2 & 128) != 0 ? 2 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetTypeFlexiBetConfig copy$default(BetTypeFlexiBetConfig betTypeFlexiBetConfig, BigDecimal bigDecimal, Map map, boolean z, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = betTypeFlexiBetConfig.oddsKey;
        }
        if ((i2 & 2) != 0) {
            map = betTypeFlexiBetConfig.oddsKeys;
        }
        if ((i2 & 4) != 0) {
            z = betTypeFlexiBetConfig.flexiWeightedRtpEnabled;
        }
        if ((i2 & 8) != 0) {
            bigDecimal2 = betTypeFlexiBetConfig.flexiAverageWeightedRtpMultiplier;
        }
        if ((i2 & 16) != 0) {
            bigDecimal3 = betTypeFlexiBetConfig.flexiAverageWeightedMinEffectiveRtp;
        }
        if ((i2 & 32) != 0) {
            str = betTypeFlexiBetConfig.flexiWeightedRtpSupportedMinVersion;
        }
        if ((i2 & 64) != 0) {
            bigDecimal4 = betTypeFlexiBetConfig.flexibleMinOdds;
        }
        if ((i2 & 128) != 0) {
            i = betTypeFlexiBetConfig.status;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        int i3 = i;
        BigDecimal bigDecimal6 = bigDecimal3;
        String str2 = str;
        return betTypeFlexiBetConfig.copy(bigDecimal, map, z, bigDecimal2, bigDecimal6, str2, bigDecimal5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getOddsKey() {
        return this.oddsKey;
    }

    public final Map<Integer, BigDecimal> component2() {
        return this.oddsKeys;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFlexiWeightedRtpEnabled() {
        return this.flexiWeightedRtpEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getFlexiAverageWeightedRtpMultiplier() {
        return this.flexiAverageWeightedRtpMultiplier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFlexiAverageWeightedMinEffectiveRtp() {
        return this.flexiAverageWeightedMinEffectiveRtp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFlexiWeightedRtpSupportedMinVersion() {
        return this.flexiWeightedRtpSupportedMinVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final BetTypeFlexiBetConfig copy(BigDecimal oddsKey, Map<Integer, ? extends BigDecimal> oddsKeys, boolean flexiWeightedRtpEnabled, BigDecimal flexiAverageWeightedRtpMultiplier, BigDecimal flexiAverageWeightedMinEffectiveRtp, String flexiWeightedRtpSupportedMinVersion, BigDecimal flexibleMinOdds, int status) {
        oddsKey.getClass();
        oddsKeys.getClass();
        flexiAverageWeightedRtpMultiplier.getClass();
        flexiAverageWeightedMinEffectiveRtp.getClass();
        flexibleMinOdds.getClass();
        return new BetTypeFlexiBetConfig(oddsKey, oddsKeys, flexiWeightedRtpEnabled, flexiAverageWeightedRtpMultiplier, flexiAverageWeightedMinEffectiveRtp, flexiWeightedRtpSupportedMinVersion, flexibleMinOdds, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeFlexiBetConfig)) {
            return false;
        }
        BetTypeFlexiBetConfig betTypeFlexiBetConfig = (BetTypeFlexiBetConfig) other;
        return Intrinsics.g(this.oddsKey, betTypeFlexiBetConfig.oddsKey) && Intrinsics.g(this.oddsKeys, betTypeFlexiBetConfig.oddsKeys) && this.flexiWeightedRtpEnabled == betTypeFlexiBetConfig.flexiWeightedRtpEnabled && Intrinsics.g(this.flexiAverageWeightedRtpMultiplier, betTypeFlexiBetConfig.flexiAverageWeightedRtpMultiplier) && Intrinsics.g(this.flexiAverageWeightedMinEffectiveRtp, betTypeFlexiBetConfig.flexiAverageWeightedMinEffectiveRtp) && Intrinsics.g(this.flexiWeightedRtpSupportedMinVersion, betTypeFlexiBetConfig.flexiWeightedRtpSupportedMinVersion) && Intrinsics.g(this.flexibleMinOdds, betTypeFlexiBetConfig.flexibleMinOdds) && this.status == betTypeFlexiBetConfig.status;
    }

    public final BigDecimal getFlexiAverageWeightedMinEffectiveRtp() {
        return this.flexiAverageWeightedMinEffectiveRtp;
    }

    public final BigDecimal getFlexiAverageWeightedRtpMultiplier() {
        return this.flexiAverageWeightedRtpMultiplier;
    }

    public final boolean getFlexiWeightedRtpEnabled() {
        return this.flexiWeightedRtpEnabled;
    }

    public final String getFlexiWeightedRtpSupportedMinVersion() {
        return this.flexiWeightedRtpSupportedMinVersion;
    }

    public final BigDecimal getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final BigDecimal getOddsKey() {
        return this.oddsKey;
    }

    public final Map<Integer, BigDecimal> getOddsKeys() {
        return this.oddsKeys;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = dd3.a(this.flexiAverageWeightedMinEffectiveRtp, dd3.a(this.flexiAverageWeightedRtpMultiplier, mtg0.a((this.oddsKeys.hashCode() + (this.oddsKey.hashCode() * 31)) * 31, 31, this.flexiWeightedRtpEnabled), 31), 31);
        String str = this.flexiWeightedRtpSupportedMinVersion;
        return Integer.hashCode(this.status) + dd3.a(this.flexibleMinOdds, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        return "BetTypeFlexiBetConfig(oddsKey=" + this.oddsKey + ", oddsKeys=" + this.oddsKeys + ", flexiWeightedRtpEnabled=" + this.flexiWeightedRtpEnabled + ", flexiAverageWeightedRtpMultiplier=" + this.flexiAverageWeightedRtpMultiplier + ", flexiAverageWeightedMinEffectiveRtp=" + this.flexiAverageWeightedMinEffectiveRtp + ", flexiWeightedRtpSupportedMinVersion=" + this.flexiWeightedRtpSupportedMinVersion + ", flexibleMinOdds=" + this.flexibleMinOdds + ", status=" + this.status + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BetTypeFlexiBetConfig(BigDecimal bigDecimal, Map<Integer, ? extends BigDecimal> map, boolean z, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, int i) {
        bigDecimal.getClass();
        map.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        bigDecimal4.getClass();
        this.oddsKey = bigDecimal;
        this.oddsKeys = map;
        this.flexiWeightedRtpEnabled = z;
        this.flexiAverageWeightedRtpMultiplier = bigDecimal2;
        this.flexiAverageWeightedMinEffectiveRtp = bigDecimal3;
        this.flexiWeightedRtpSupportedMinVersion = str;
        this.flexibleMinOdds = bigDecimal4;
        this.status = i;
    }

    public BetTypeFlexiBetConfig() {
        this(null, null, false, null, null, null, null, 0, 255, null);
    }
}
