package com.sportybet.android.globalpay.quickinput.model;

import com.sporty.android.core.model.common.MapWrapper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B-\u0012$\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003HÆ\u0003J1\u0010\f\u001a\u00020\u00002&\b\u0002\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0002HÖ\u0081\u0004R2\u0010\u0006\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/globalpay/quickinput/model/QuickInputConfigMap;", "Lcom/sporty/android/core/model/common/MapWrapper;", "", "", "", "", "map", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class QuickInputConfigMap implements MapWrapper<String, Map<String, ? extends List<? extends Integer>>> {
    public static final int $stable = 8;
    private final Map<String, Map<String, List<Integer>>> map;

    /* JADX WARN: Multi-variable type inference failed */
    public QuickInputConfigMap(Map<String, ? extends Map<String, ? extends List<Integer>>> map) {
        map.getClass();
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickInputConfigMap copy$default(QuickInputConfigMap quickInputConfigMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = quickInputConfigMap.map;
        }
        return quickInputConfigMap.copy(map);
    }

    public final Map<String, Map<String, List<Integer>>> component1() {
        return this.map;
    }

    public final QuickInputConfigMap copy(Map<String, ? extends Map<String, ? extends List<Integer>>> map) {
        map.getClass();
        return new QuickInputConfigMap(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuickInputConfigMap) && Intrinsics.g(this.map, ((QuickInputConfigMap) other).map);
    }

    @Override // com.sporty.android.core.model.common.MapWrapper
    public Map<String, Map<String, ? extends List<? extends Integer>>> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "QuickInputConfigMap(map=" + this.map + ")";
    }
}
