package com.sporty.android.core.model.cashout;

import com.sporty.android.core.model.common.MapWrapper;
import defpackage.o2g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B#\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0005HÆ\u0003J%\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0002HÖ\u0081\u0004R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutAdditionalMarketSpecifierMap;", "Lcom/sporty/android/core/model/common/MapWrapper;", "", "", "map", "", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutAdditionalMarketSpecifierMap implements MapWrapper<String, List<? extends String>> {
    private final Map<String, List<String>> map;

    /* JADX WARN: Illegal instructions before constructor call */
    public CashoutAdditionalMarketSpecifierMap(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutAdditionalMarketSpecifierMap copy$default(CashoutAdditionalMarketSpecifierMap cashoutAdditionalMarketSpecifierMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cashoutAdditionalMarketSpecifierMap.map;
        }
        return cashoutAdditionalMarketSpecifierMap.copy(map);
    }

    public final Map<String, List<String>> component1() {
        return this.map;
    }

    public final CashoutAdditionalMarketSpecifierMap copy(Map<String, ? extends List<String>> map) {
        map.getClass();
        return new CashoutAdditionalMarketSpecifierMap(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashoutAdditionalMarketSpecifierMap) && Intrinsics.g(this.map, ((CashoutAdditionalMarketSpecifierMap) other).map);
    }

    @Override // com.sporty.android.core.model.common.MapWrapper
    public Map<String, List<? extends String>> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "CashoutAdditionalMarketSpecifierMap(map=" + this.map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashoutAdditionalMarketSpecifierMap(Map<String, ? extends List<String>> map) {
        map.getClass();
        this.map = map;
    }

    public CashoutAdditionalMarketSpecifierMap() {
        this(null, 1, null);
    }
}
