package com.sporty.android.core.model.cashout;

import defpackage.nrg0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012$\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005HÆ\u0003Ja\u0010\u0017\u001a\u00020\u00002&\b\u0002\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0004HÖ\u0081\u0004R/\u0010\u0002\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutSuspendDeactivateAllowConfigs;", "", "suspended", "", "", "", "deactivated", "threshold", "", "deactivatedAllowedMarkets", "<init>", "(Ljava/util/Map;Ljava/util/Map;DLjava/util/List;)V", "getSuspended", "()Ljava/util/Map;", "getDeactivated", "getThreshold", "()D", "getDeactivatedAllowedMarkets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutSuspendDeactivateAllowConfigs {
    private final Map<String, String> deactivated;
    private final List<String> deactivatedAllowedMarkets;
    private final Map<String, Map<String, List<String>>> suspended;
    private final double threshold;

    /* JADX WARN: Multi-variable type inference failed */
    public CashoutSuspendDeactivateAllowConfigs(Map<String, ? extends Map<String, ? extends List<String>>> map, Map<String, String> map2, double d, List<String> list) {
        map.getClass();
        map2.getClass();
        list.getClass();
        this.suspended = map;
        this.deactivated = map2;
        this.threshold = d;
        this.deactivatedAllowedMarkets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashoutSuspendDeactivateAllowConfigs copy$default(CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs, Map map, Map map2, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = cashoutSuspendDeactivateAllowConfigs.suspended;
        }
        if ((i & 2) != 0) {
            map2 = cashoutSuspendDeactivateAllowConfigs.deactivated;
        }
        if ((i & 4) != 0) {
            d = cashoutSuspendDeactivateAllowConfigs.threshold;
        }
        if ((i & 8) != 0) {
            list = cashoutSuspendDeactivateAllowConfigs.deactivatedAllowedMarkets;
        }
        List list2 = list;
        return cashoutSuspendDeactivateAllowConfigs.copy(map, map2, d, list2);
    }

    public final Map<String, Map<String, List<String>>> component1() {
        return this.suspended;
    }

    public final Map<String, String> component2() {
        return this.deactivated;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getThreshold() {
        return this.threshold;
    }

    public final List<String> component4() {
        return this.deactivatedAllowedMarkets;
    }

    public final CashoutSuspendDeactivateAllowConfigs copy(Map<String, ? extends Map<String, ? extends List<String>>> suspended, Map<String, String> deactivated, double threshold, List<String> deactivatedAllowedMarkets) {
        suspended.getClass();
        deactivated.getClass();
        deactivatedAllowedMarkets.getClass();
        return new CashoutSuspendDeactivateAllowConfigs(suspended, deactivated, threshold, deactivatedAllowedMarkets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutSuspendDeactivateAllowConfigs)) {
            return false;
        }
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs = (CashoutSuspendDeactivateAllowConfigs) other;
        return Intrinsics.g(this.suspended, cashoutSuspendDeactivateAllowConfigs.suspended) && Intrinsics.g(this.deactivated, cashoutSuspendDeactivateAllowConfigs.deactivated) && Double.compare(this.threshold, cashoutSuspendDeactivateAllowConfigs.threshold) == 0 && Intrinsics.g(this.deactivatedAllowedMarkets, cashoutSuspendDeactivateAllowConfigs.deactivatedAllowedMarkets);
    }

    public final Map<String, String> getDeactivated() {
        return this.deactivated;
    }

    public final List<String> getDeactivatedAllowedMarkets() {
        return this.deactivatedAllowedMarkets;
    }

    public final Map<String, Map<String, List<String>>> getSuspended() {
        return this.suspended;
    }

    public final double getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return this.deactivatedAllowedMarkets.hashCode() + nrg0.a((this.deactivated.hashCode() + (this.suspended.hashCode() * 31)) * 31, 31, this.threshold);
    }

    public String toString() {
        return "CashoutSuspendDeactivateAllowConfigs(suspended=" + this.suspended + ", deactivated=" + this.deactivated + ", threshold=" + this.threshold + ", deactivatedAllowedMarkets=" + this.deactivatedAllowedMarkets + ")";
    }
}
