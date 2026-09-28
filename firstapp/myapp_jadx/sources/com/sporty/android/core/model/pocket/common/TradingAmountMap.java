package com.sporty.android.core.model.pocket.common;

import com.sporty.android.core.model.common.MapWrapper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0002HÖ\u0081\u0004R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/TradingAmountMap;", "Lcom/sporty/android/core/model/common/MapWrapper;", "", "Lcom/sporty/android/core/model/pocket/common/TradingAmountRange;", "map", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TradingAmountMap implements MapWrapper<String, TradingAmountRange> {
    private final Map<String, TradingAmountRange> map;

    public TradingAmountMap(Map<String, TradingAmountRange> map) {
        map.getClass();
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradingAmountMap copy$default(TradingAmountMap tradingAmountMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tradingAmountMap.map;
        }
        return tradingAmountMap.copy(map);
    }

    public final Map<String, TradingAmountRange> component1() {
        return this.map;
    }

    public final TradingAmountMap copy(Map<String, TradingAmountRange> map) {
        map.getClass();
        return new TradingAmountMap(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TradingAmountMap) && Intrinsics.g(this.map, ((TradingAmountMap) other).map);
    }

    @Override // com.sporty.android.core.model.common.MapWrapper
    public Map<String, TradingAmountRange> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "TradingAmountMap(map=" + this.map + ")";
    }
}
