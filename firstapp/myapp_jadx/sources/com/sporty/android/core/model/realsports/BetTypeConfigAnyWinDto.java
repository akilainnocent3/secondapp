package com.sporty.android.core.model.realsports;

import com.appsflyer.internal.v;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015Jr\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR#\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015Ê\u0001\u0002\b)¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/realsports/BetTypeConfigAnyWinDto;", "", "minOdds", "Ljava/math/BigDecimal;", "oddsKey", "oddsKeys", "", "", "minSelectionOdds", "maxSelectionNum", "minSelectionNum", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMinOdds", "()Ljava/math/BigDecimal;", "getOddsKey", "getOddsKeys", "()Ljava/util/Map;", "getMinSelectionOdds", "getMaxSelectionNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinSelectionNum", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sporty/android/core/model/realsports/BetTypeConfigAnyWinDto;", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeConfigAnyWinDto {
    private final Integer maxSelectionNum;
    private final BigDecimal minOdds;
    private final Integer minSelectionNum;
    private final BigDecimal minSelectionOdds;
    private final BigDecimal oddsKey;
    private final Map<Integer, BigDecimal> oddsKeys;
    private final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public BetTypeConfigAnyWinDto(BigDecimal bigDecimal, BigDecimal bigDecimal2, Map<Integer, ? extends BigDecimal> map, BigDecimal bigDecimal3, Integer num, Integer num2, Integer num3) {
        this.minOdds = bigDecimal;
        this.oddsKey = bigDecimal2;
        this.oddsKeys = map;
        this.minSelectionOdds = bigDecimal3;
        this.maxSelectionNum = num;
        this.minSelectionNum = num2;
        this.status = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetTypeConfigAnyWinDto copy$default(BetTypeConfigAnyWinDto betTypeConfigAnyWinDto, BigDecimal bigDecimal, BigDecimal bigDecimal2, Map map, BigDecimal bigDecimal3, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = betTypeConfigAnyWinDto.minOdds;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = betTypeConfigAnyWinDto.oddsKey;
        }
        if ((i & 4) != 0) {
            map = betTypeConfigAnyWinDto.oddsKeys;
        }
        if ((i & 8) != 0) {
            bigDecimal3 = betTypeConfigAnyWinDto.minSelectionOdds;
        }
        if ((i & 16) != 0) {
            num = betTypeConfigAnyWinDto.maxSelectionNum;
        }
        if ((i & 32) != 0) {
            num2 = betTypeConfigAnyWinDto.minSelectionNum;
        }
        if ((i & 64) != 0) {
            num3 = betTypeConfigAnyWinDto.status;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Integer num6 = num;
        Map map2 = map;
        return betTypeConfigAnyWinDto.copy(bigDecimal, bigDecimal2, map2, bigDecimal3, num6, num4, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getMinOdds() {
        return this.minOdds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getOddsKey() {
        return this.oddsKey;
    }

    public final Map<Integer, BigDecimal> component3() {
        return this.oddsKeys;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMinSelectionOdds() {
        return this.minSelectionOdds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMaxSelectionNum() {
        return this.maxSelectionNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMinSelectionNum() {
        return this.minSelectionNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    public final BetTypeConfigAnyWinDto copy(BigDecimal minOdds, BigDecimal oddsKey, Map<Integer, ? extends BigDecimal> oddsKeys, BigDecimal minSelectionOdds, Integer maxSelectionNum, Integer minSelectionNum, Integer status) {
        return new BetTypeConfigAnyWinDto(minOdds, oddsKey, oddsKeys, minSelectionOdds, maxSelectionNum, minSelectionNum, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeConfigAnyWinDto)) {
            return false;
        }
        BetTypeConfigAnyWinDto betTypeConfigAnyWinDto = (BetTypeConfigAnyWinDto) other;
        return Intrinsics.g(this.minOdds, betTypeConfigAnyWinDto.minOdds) && Intrinsics.g(this.oddsKey, betTypeConfigAnyWinDto.oddsKey) && Intrinsics.g(this.oddsKeys, betTypeConfigAnyWinDto.oddsKeys) && Intrinsics.g(this.minSelectionOdds, betTypeConfigAnyWinDto.minSelectionOdds) && Intrinsics.g(this.maxSelectionNum, betTypeConfigAnyWinDto.maxSelectionNum) && Intrinsics.g(this.minSelectionNum, betTypeConfigAnyWinDto.minSelectionNum) && Intrinsics.g(this.status, betTypeConfigAnyWinDto.status);
    }

    public final Integer getMaxSelectionNum() {
        return this.maxSelectionNum;
    }

    public final BigDecimal getMinOdds() {
        return this.minOdds;
    }

    public final Integer getMinSelectionNum() {
        return this.minSelectionNum;
    }

    public final BigDecimal getMinSelectionOdds() {
        return this.minSelectionOdds;
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
        BigDecimal bigDecimal = this.minOdds;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.oddsKey;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Map<Integer, BigDecimal> map = this.oddsKeys;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.minSelectionOdds;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Integer num = this.maxSelectionNum;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minSelectionNum;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        BigDecimal bigDecimal = this.minOdds;
        BigDecimal bigDecimal2 = this.oddsKey;
        Map<Integer, BigDecimal> map = this.oddsKeys;
        BigDecimal bigDecimal3 = this.minSelectionOdds;
        Integer num = this.maxSelectionNum;
        Integer num2 = this.minSelectionNum;
        Integer num3 = this.status;
        StringBuilder sb = new StringBuilder("BetTypeConfigAnyWinDto(minOdds=");
        sb.append(bigDecimal);
        sb.append(", oddsKey=");
        sb.append(bigDecimal2);
        sb.append(", oddsKeys=");
        sb.append(map);
        sb.append(", minSelectionOdds=");
        sb.append(bigDecimal3);
        sb.append(", maxSelectionNum=");
        cv7.a(sb, num, ", minSelectionNum=", num2, ", status=");
        return v.a(sb, num3, ")");
    }
}
