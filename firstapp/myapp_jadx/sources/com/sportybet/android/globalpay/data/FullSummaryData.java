package com.sportybet.android.globalpay.data;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import defpackage.hfb0;
import defpackage.ng1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bBA\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/globalpay/data/FullSummaryData;", "", "channelSummary", "", "", "Lcom/sportybet/android/globalpay/data/FullSummaryData$MapValue;", "combinedSummary", "Lcom/sportybet/android/globalpay/data/FullSummaryData$CombinedSummary;", "providerSummary", "<init>", "(Ljava/util/Map;Lcom/sportybet/android/globalpay/data/FullSummaryData$CombinedSummary;Ljava/util/Map;)V", "getChannelSummary", "()Ljava/util/Map;", "getCombinedSummary", "()Lcom/sportybet/android/globalpay/data/FullSummaryData$CombinedSummary;", "getProviderSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "MapValue", "CombinedSummary", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FullSummaryData {
    public static final int $stable = 0;
    private final Map<Integer, MapValue> channelSummary;
    private final CombinedSummary combinedSummary;
    private final Map<Integer, MapValue> providerSummary;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/globalpay/data/FullSummaryData$CombinedSummary;", "", "daily", "", "Lcom/sportybet/android/globalpay/data/AccumulatedAmount;", "lifetime", "monthly", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDaily", "()Ljava/util/List;", "getLifetime", "getMonthly", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CombinedSummary {
        public static final int $stable = 0;
        private final List<AccumulatedAmount> daily;
        private final List<AccumulatedAmount> lifetime;
        private final List<AccumulatedAmount> monthly;

        public CombinedSummary(List<AccumulatedAmount> list, List<AccumulatedAmount> list2, List<AccumulatedAmount> list3) {
            this.daily = list;
            this.lifetime = list2;
            this.monthly = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CombinedSummary copy$default(CombinedSummary combinedSummary, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = combinedSummary.daily;
            }
            if ((i & 2) != 0) {
                list2 = combinedSummary.lifetime;
            }
            if ((i & 4) != 0) {
                list3 = combinedSummary.monthly;
            }
            return combinedSummary.copy(list, list2, list3);
        }

        public final List<AccumulatedAmount> component1() {
            return this.daily;
        }

        public final List<AccumulatedAmount> component2() {
            return this.lifetime;
        }

        public final List<AccumulatedAmount> component3() {
            return this.monthly;
        }

        public final CombinedSummary copy(List<AccumulatedAmount> daily, List<AccumulatedAmount> lifetime, List<AccumulatedAmount> monthly) {
            return new CombinedSummary(daily, lifetime, monthly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CombinedSummary)) {
                return false;
            }
            CombinedSummary combinedSummary = (CombinedSummary) other;
            return Intrinsics.g(this.daily, combinedSummary.daily) && Intrinsics.g(this.lifetime, combinedSummary.lifetime) && Intrinsics.g(this.monthly, combinedSummary.monthly);
        }

        public final List<AccumulatedAmount> getDaily() {
            return this.daily;
        }

        public final List<AccumulatedAmount> getLifetime() {
            return this.lifetime;
        }

        public final List<AccumulatedAmount> getMonthly() {
            return this.monthly;
        }

        public int hashCode() {
            List<AccumulatedAmount> list = this.daily;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<AccumulatedAmount> list2 = this.lifetime;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<AccumulatedAmount> list3 = this.monthly;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public String toString() {
            List<AccumulatedAmount> list = this.daily;
            List<AccumulatedAmount> list2 = this.lifetime;
            return ng1.a(hfb0.a("CombinedSummary(daily=", ", lifetime=", ", monthly=", list, list2), this.monthly, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/globalpay/data/FullSummaryData$MapValue;", "", "daily", "", "Lcom/sportybet/android/globalpay/data/AccumulatedAmount;", "lifetime", "monthly", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDaily", "()Ljava/util/List;", "getLifetime", "getMonthly", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MapValue {
        public static final int $stable = 0;
        private final List<AccumulatedAmount> daily;
        private final List<AccumulatedAmount> lifetime;
        private final List<AccumulatedAmount> monthly;

        public MapValue(List<AccumulatedAmount> list, List<AccumulatedAmount> list2, List<AccumulatedAmount> list3) {
            this.daily = list;
            this.lifetime = list2;
            this.monthly = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapValue copy$default(MapValue mapValue, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mapValue.daily;
            }
            if ((i & 2) != 0) {
                list2 = mapValue.lifetime;
            }
            if ((i & 4) != 0) {
                list3 = mapValue.monthly;
            }
            return mapValue.copy(list, list2, list3);
        }

        public final List<AccumulatedAmount> component1() {
            return this.daily;
        }

        public final List<AccumulatedAmount> component2() {
            return this.lifetime;
        }

        public final List<AccumulatedAmount> component3() {
            return this.monthly;
        }

        public final MapValue copy(List<AccumulatedAmount> daily, List<AccumulatedAmount> lifetime, List<AccumulatedAmount> monthly) {
            return new MapValue(daily, lifetime, monthly);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapValue)) {
                return false;
            }
            MapValue mapValue = (MapValue) other;
            return Intrinsics.g(this.daily, mapValue.daily) && Intrinsics.g(this.lifetime, mapValue.lifetime) && Intrinsics.g(this.monthly, mapValue.monthly);
        }

        public final List<AccumulatedAmount> getDaily() {
            return this.daily;
        }

        public final List<AccumulatedAmount> getLifetime() {
            return this.lifetime;
        }

        public final List<AccumulatedAmount> getMonthly() {
            return this.monthly;
        }

        public int hashCode() {
            List<AccumulatedAmount> list = this.daily;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<AccumulatedAmount> list2 = this.lifetime;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<AccumulatedAmount> list3 = this.monthly;
            return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public String toString() {
            List<AccumulatedAmount> list = this.daily;
            List<AccumulatedAmount> list2 = this.lifetime;
            return ng1.a(hfb0.a("MapValue(daily=", ", lifetime=", ", monthly=", list, list2), this.monthly, tYcQsJyaojE.TQOKNS);
        }
    }

    public FullSummaryData(Map<Integer, MapValue> map, CombinedSummary combinedSummary, Map<Integer, MapValue> map2) {
        this.channelSummary = map;
        this.combinedSummary = combinedSummary;
        this.providerSummary = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FullSummaryData copy$default(FullSummaryData fullSummaryData, Map map, CombinedSummary combinedSummary, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fullSummaryData.channelSummary;
        }
        if ((i & 2) != 0) {
            combinedSummary = fullSummaryData.combinedSummary;
        }
        if ((i & 4) != 0) {
            map2 = fullSummaryData.providerSummary;
        }
        return fullSummaryData.copy(map, combinedSummary, map2);
    }

    public final Map<Integer, MapValue> component1() {
        return this.channelSummary;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CombinedSummary getCombinedSummary() {
        return this.combinedSummary;
    }

    public final Map<Integer, MapValue> component3() {
        return this.providerSummary;
    }

    public final FullSummaryData copy(Map<Integer, MapValue> channelSummary, CombinedSummary combinedSummary, Map<Integer, MapValue> providerSummary) {
        return new FullSummaryData(channelSummary, combinedSummary, providerSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullSummaryData)) {
            return false;
        }
        FullSummaryData fullSummaryData = (FullSummaryData) other;
        return Intrinsics.g(this.channelSummary, fullSummaryData.channelSummary) && Intrinsics.g(this.combinedSummary, fullSummaryData.combinedSummary) && Intrinsics.g(this.providerSummary, fullSummaryData.providerSummary);
    }

    public final Map<Integer, MapValue> getChannelSummary() {
        return this.channelSummary;
    }

    public final CombinedSummary getCombinedSummary() {
        return this.combinedSummary;
    }

    public final Map<Integer, MapValue> getProviderSummary() {
        return this.providerSummary;
    }

    public int hashCode() {
        Map<Integer, MapValue> map = this.channelSummary;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        CombinedSummary combinedSummary = this.combinedSummary;
        int iHashCode2 = (iHashCode + (combinedSummary == null ? 0 : combinedSummary.hashCode())) * 31;
        Map<Integer, MapValue> map2 = this.providerSummary;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "FullSummaryData(channelSummary=" + this.channelSummary + ", combinedSummary=" + this.combinedSummary + ", providerSummary=" + this.providerSummary + ")";
    }
}
