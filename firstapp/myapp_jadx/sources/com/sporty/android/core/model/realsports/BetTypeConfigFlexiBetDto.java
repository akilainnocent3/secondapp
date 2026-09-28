package com.sporty.android.core.model.realsports;

import com.appsflyer.internal.v;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.iib0;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJr\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aÊ\u0001\u0002\b+¨\u0006*"}, d2 = {"Lcom/sporty/android/core/model/realsports/BetTypeConfigFlexiBetDto;", "", "oddsKey", "Ljava/math/BigDecimal;", "oddsKeys", "", "", "flexiWeightedRtpEnabled", "", "flexiAverageWeightedRtpMultiplier", "flexiAverageWeightedMinEffectiveRtp", "flexibleMinOdds", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/math/BigDecimal;Ljava/util/Map;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getOddsKey", "()Ljava/math/BigDecimal;", "getOddsKeys", "()Ljava/util/Map;", "getFlexiWeightedRtpEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFlexiAverageWeightedRtpMultiplier", "getFlexiAverageWeightedMinEffectiveRtp", "getFlexibleMinOdds", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/util/Map;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/sporty/android/core/model/realsports/BetTypeConfigFlexiBetDto;", "equals", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeConfigFlexiBetDto {
    private final BigDecimal flexiAverageWeightedMinEffectiveRtp;
    private final BigDecimal flexiAverageWeightedRtpMultiplier;
    private final Boolean flexiWeightedRtpEnabled;
    private final BigDecimal flexibleMinOdds;
    private final BigDecimal oddsKey;
    private final Map<Integer, BigDecimal> oddsKeys;
    private final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public BetTypeConfigFlexiBetDto(BigDecimal bigDecimal, Map<Integer, ? extends BigDecimal> map, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num) {
        this.oddsKey = bigDecimal;
        this.oddsKeys = map;
        this.flexiWeightedRtpEnabled = bool;
        this.flexiAverageWeightedRtpMultiplier = bigDecimal2;
        this.flexiAverageWeightedMinEffectiveRtp = bigDecimal3;
        this.flexibleMinOdds = bigDecimal4;
        this.status = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetTypeConfigFlexiBetDto copy$default(BetTypeConfigFlexiBetDto betTypeConfigFlexiBetDto, BigDecimal bigDecimal, Map map, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = betTypeConfigFlexiBetDto.oddsKey;
        }
        if ((i & 2) != 0) {
            map = betTypeConfigFlexiBetDto.oddsKeys;
        }
        if ((i & 4) != 0) {
            bool = betTypeConfigFlexiBetDto.flexiWeightedRtpEnabled;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = betTypeConfigFlexiBetDto.flexiAverageWeightedRtpMultiplier;
        }
        if ((i & 16) != 0) {
            bigDecimal3 = betTypeConfigFlexiBetDto.flexiAverageWeightedMinEffectiveRtp;
        }
        if ((i & 32) != 0) {
            bigDecimal4 = betTypeConfigFlexiBetDto.flexibleMinOdds;
        }
        if ((i & 64) != 0) {
            num = betTypeConfigFlexiBetDto.status;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        Integer num2 = num;
        BigDecimal bigDecimal6 = bigDecimal3;
        Boolean bool2 = bool;
        return betTypeConfigFlexiBetDto.copy(bigDecimal, map, bool2, bigDecimal2, bigDecimal6, bigDecimal5, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getOddsKey() {
        return this.oddsKey;
    }

    public final Map<Integer, BigDecimal> component2() {
        return this.oddsKeys;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getFlexiWeightedRtpEnabled() {
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
    public final BigDecimal getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    public final BetTypeConfigFlexiBetDto copy(BigDecimal oddsKey, Map<Integer, ? extends BigDecimal> oddsKeys, Boolean flexiWeightedRtpEnabled, BigDecimal flexiAverageWeightedRtpMultiplier, BigDecimal flexiAverageWeightedMinEffectiveRtp, BigDecimal flexibleMinOdds, Integer status) {
        return new BetTypeConfigFlexiBetDto(oddsKey, oddsKeys, flexiWeightedRtpEnabled, flexiAverageWeightedRtpMultiplier, flexiAverageWeightedMinEffectiveRtp, flexibleMinOdds, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeConfigFlexiBetDto)) {
            return false;
        }
        BetTypeConfigFlexiBetDto betTypeConfigFlexiBetDto = (BetTypeConfigFlexiBetDto) other;
        return Intrinsics.g(this.oddsKey, betTypeConfigFlexiBetDto.oddsKey) && Intrinsics.g(this.oddsKeys, betTypeConfigFlexiBetDto.oddsKeys) && Intrinsics.g(this.flexiWeightedRtpEnabled, betTypeConfigFlexiBetDto.flexiWeightedRtpEnabled) && Intrinsics.g(this.flexiAverageWeightedRtpMultiplier, betTypeConfigFlexiBetDto.flexiAverageWeightedRtpMultiplier) && Intrinsics.g(this.flexiAverageWeightedMinEffectiveRtp, betTypeConfigFlexiBetDto.flexiAverageWeightedMinEffectiveRtp) && Intrinsics.g(this.flexibleMinOdds, betTypeConfigFlexiBetDto.flexibleMinOdds) && Intrinsics.g(this.status, betTypeConfigFlexiBetDto.status);
    }

    public final BigDecimal getFlexiAverageWeightedMinEffectiveRtp() {
        return this.flexiAverageWeightedMinEffectiveRtp;
    }

    public final BigDecimal getFlexiAverageWeightedRtpMultiplier() {
        return this.flexiAverageWeightedRtpMultiplier;
    }

    public final Boolean getFlexiWeightedRtpEnabled() {
        return this.flexiWeightedRtpEnabled;
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

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.oddsKey;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Map<Integer, BigDecimal> map = this.oddsKeys;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.flexiWeightedRtpEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.flexiAverageWeightedRtpMultiplier;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.flexiAverageWeightedMinEffectiveRtp;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.flexibleMinOdds;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Integer num = this.status;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        BigDecimal bigDecimal = this.oddsKey;
        Map<Integer, BigDecimal> map = this.oddsKeys;
        Boolean bool = this.flexiWeightedRtpEnabled;
        BigDecimal bigDecimal2 = this.flexiAverageWeightedRtpMultiplier;
        BigDecimal bigDecimal3 = this.flexiAverageWeightedMinEffectiveRtp;
        BigDecimal bigDecimal4 = this.flexibleMinOdds;
        Integer num = this.status;
        StringBuilder sb = new StringBuilder("BetTypeConfigFlexiBetDto(oddsKey=");
        sb.append(bigDecimal);
        sb.append(", oddsKeys=");
        sb.append(map);
        sb.append(", flexiWeightedRtpEnabled=");
        sb.append(bool);
        sb.append(", flexiAverageWeightedRtpMultiplier=");
        sb.append(bigDecimal2);
        sb.append(", flexiAverageWeightedMinEffectiveRtp=");
        iib0.b(sb, bigDecimal3, ", flexibleMinOdds=", bigDecimal4, ", status=");
        return v.a(sb, num, ")");
    }
}
