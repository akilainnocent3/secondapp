package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.d5d;
import defpackage.dd3;
import defpackage.gpp;
import defpackage.zk1;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015Ê\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0000¨\u0006&"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetTypeAnyWinConfig;", "", "minOdds", "Ljava/math/BigDecimal;", "oddsKey", "oddsKeys", "", "", "minSelectionOdds", "maxSelectionNum", "minSelectionNum", AnalyticsParam.EVENT_STATUS, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;Ljava/math/BigDecimal;III)V", "getMinOdds", "()Ljava/math/BigDecimal;", "getOddsKey", "getOddsKeys", "()Ljava/util/Map;", "getMinSelectionOdds", "getMaxSelectionNum", "()I", "getMinSelectionNum", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeAnyWinConfig {
    public static final int $stable = 8;
    private final int maxSelectionNum;
    private final BigDecimal minOdds;
    private final int minSelectionNum;
    private final BigDecimal minSelectionOdds;
    private final BigDecimal oddsKey;
    private final Map<Integer, BigDecimal> oddsKeys;
    private final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public BetTypeAnyWinConfig(BigDecimal bigDecimal, BigDecimal bigDecimal2, Map<Integer, ? extends BigDecimal> map, BigDecimal bigDecimal3, int i, int i2, int i3) {
        bigDecimal.getClass();
        bigDecimal2.getClass();
        map.getClass();
        bigDecimal3.getClass();
        this.minOdds = bigDecimal;
        this.oddsKey = bigDecimal2;
        this.oddsKeys = map;
        this.minSelectionOdds = bigDecimal3;
        this.maxSelectionNum = i;
        this.minSelectionNum = i2;
        this.status = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetTypeAnyWinConfig copy$default(BetTypeAnyWinConfig betTypeAnyWinConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, Map map, BigDecimal bigDecimal3, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bigDecimal = betTypeAnyWinConfig.minOdds;
        }
        if ((i4 & 2) != 0) {
            bigDecimal2 = betTypeAnyWinConfig.oddsKey;
        }
        if ((i4 & 4) != 0) {
            map = betTypeAnyWinConfig.oddsKeys;
        }
        if ((i4 & 8) != 0) {
            bigDecimal3 = betTypeAnyWinConfig.minSelectionOdds;
        }
        if ((i4 & 16) != 0) {
            i = betTypeAnyWinConfig.maxSelectionNum;
        }
        if ((i4 & 32) != 0) {
            i2 = betTypeAnyWinConfig.minSelectionNum;
        }
        if ((i4 & 64) != 0) {
            i3 = betTypeAnyWinConfig.status;
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        Map map2 = map;
        return betTypeAnyWinConfig.copy(bigDecimal, bigDecimal2, map2, bigDecimal3, i7, i5, i6);
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
    public final int getMaxSelectionNum() {
        return this.maxSelectionNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinSelectionNum() {
        return this.minSelectionNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final BetTypeAnyWinConfig copy(BigDecimal minOdds, BigDecimal oddsKey, Map<Integer, ? extends BigDecimal> oddsKeys, BigDecimal minSelectionOdds, int maxSelectionNum, int minSelectionNum, int status) {
        minOdds.getClass();
        oddsKey.getClass();
        oddsKeys.getClass();
        minSelectionOdds.getClass();
        return new BetTypeAnyWinConfig(minOdds, oddsKey, oddsKeys, minSelectionOdds, maxSelectionNum, minSelectionNum, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeAnyWinConfig)) {
            return false;
        }
        BetTypeAnyWinConfig betTypeAnyWinConfig = (BetTypeAnyWinConfig) other;
        return Intrinsics.g(this.minOdds, betTypeAnyWinConfig.minOdds) && Intrinsics.g(this.oddsKey, betTypeAnyWinConfig.oddsKey) && Intrinsics.g(this.oddsKeys, betTypeAnyWinConfig.oddsKeys) && Intrinsics.g(this.minSelectionOdds, betTypeAnyWinConfig.minSelectionOdds) && this.maxSelectionNum == betTypeAnyWinConfig.maxSelectionNum && this.minSelectionNum == betTypeAnyWinConfig.minSelectionNum && this.status == betTypeAnyWinConfig.status;
    }

    public final int getMaxSelectionNum() {
        return this.maxSelectionNum;
    }

    public final BigDecimal getMinOdds() {
        return this.minOdds;
    }

    public final int getMinSelectionNum() {
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

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + gpp.a(this.minSelectionNum, gpp.a(this.maxSelectionNum, dd3.a(this.minSelectionOdds, (this.oddsKeys.hashCode() + dd3.a(this.oddsKey, this.minOdds.hashCode() * 31, 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        BigDecimal bigDecimal = this.minOdds;
        BigDecimal bigDecimal2 = this.oddsKey;
        Map<Integer, BigDecimal> map = this.oddsKeys;
        BigDecimal bigDecimal3 = this.minSelectionOdds;
        int i = this.maxSelectionNum;
        int i2 = this.minSelectionNum;
        int i3 = this.status;
        StringBuilder sb = new StringBuilder("BetTypeAnyWinConfig(minOdds=");
        sb.append(bigDecimal);
        sb.append(", oddsKey=");
        sb.append(bigDecimal2);
        sb.append(", oddsKeys=");
        sb.append(map);
        sb.append(", minSelectionOdds=");
        sb.append(bigDecimal3);
        sb.append(", maxSelectionNum=");
        d5d.a(sb, i, ", minSelectionNum=", i2, ", status=");
        return zk1.a(i3, ")", sb);
    }
}
