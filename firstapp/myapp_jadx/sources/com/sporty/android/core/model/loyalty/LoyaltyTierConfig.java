package com.sporty.android.core.model.loyalty;

import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/loyalty/LoyaltyTierConfig;", "", "tierConfigList", "", "Lcom/sporty/android/core/model/loyalty/TierConfig;", "tierDobConfigList", "Lcom/sporty/android/core/model/loyalty/TierDobConfig;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTierConfigList", "()Ljava/util/List;", "getTierDobConfigList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyTierConfig {
    private final List<TierConfig> tierConfigList;
    private final List<TierDobConfig> tierDobConfigList;

    public LoyaltyTierConfig(List<TierConfig> list, List<TierDobConfig> list2) {
        list.getClass();
        this.tierConfigList = list;
        this.tierDobConfigList = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyTierConfig copy$default(LoyaltyTierConfig loyaltyTierConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loyaltyTierConfig.tierConfigList;
        }
        if ((i & 2) != 0) {
            list2 = loyaltyTierConfig.tierDobConfigList;
        }
        return loyaltyTierConfig.copy(list, list2);
    }

    public final List<TierConfig> component1() {
        return this.tierConfigList;
    }

    public final List<TierDobConfig> component2() {
        return this.tierDobConfigList;
    }

    public final LoyaltyTierConfig copy(List<TierConfig> tierConfigList, List<TierDobConfig> tierDobConfigList) {
        tierConfigList.getClass();
        return new LoyaltyTierConfig(tierConfigList, tierDobConfigList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyTierConfig)) {
            return false;
        }
        LoyaltyTierConfig loyaltyTierConfig = (LoyaltyTierConfig) other;
        return Intrinsics.g(this.tierConfigList, loyaltyTierConfig.tierConfigList) && Intrinsics.g(this.tierDobConfigList, loyaltyTierConfig.tierDobConfigList);
    }

    public final List<TierConfig> getTierConfigList() {
        return this.tierConfigList;
    }

    public final List<TierDobConfig> getTierDobConfigList() {
        return this.tierDobConfigList;
    }

    public int hashCode() {
        int iHashCode = this.tierConfigList.hashCode() * 31;
        List<TierDobConfig> list = this.tierDobConfigList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return w9d.a("LoyaltyTierConfig(tierConfigList=", ", tierDobConfigList=", ")", this.tierConfigList, this.tierDobConfigList);
    }
}
