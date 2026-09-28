package com.sporty.android.core.model.loyalty;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/loyalty/TierDobConfig;", "", "currency", "", "tier", "", "tierDobRewardList", "", "Lcom/sporty/android/core/model/loyalty/TierDobReward;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "getTier", "()I", "getTierDobRewardList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TierDobConfig {
    private final String currency;
    private final int tier;
    private final List<TierDobReward> tierDobRewardList;

    public TierDobConfig(String str, int i, List<TierDobReward> list) {
        str.getClass();
        list.getClass();
        this.currency = str;
        this.tier = i;
        this.tierDobRewardList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TierDobConfig copy$default(TierDobConfig tierDobConfig, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tierDobConfig.currency;
        }
        if ((i2 & 2) != 0) {
            i = tierDobConfig.tier;
        }
        if ((i2 & 4) != 0) {
            list = tierDobConfig.tierDobRewardList;
        }
        return tierDobConfig.copy(str, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTier() {
        return this.tier;
    }

    public final List<TierDobReward> component3() {
        return this.tierDobRewardList;
    }

    public final TierDobConfig copy(String currency, int tier, List<TierDobReward> tierDobRewardList) {
        currency.getClass();
        tierDobRewardList.getClass();
        return new TierDobConfig(currency, tier, tierDobRewardList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierDobConfig)) {
            return false;
        }
        TierDobConfig tierDobConfig = (TierDobConfig) other;
        return Intrinsics.g(this.currency, tierDobConfig.currency) && this.tier == tierDobConfig.tier && Intrinsics.g(this.tierDobRewardList, tierDobConfig.tierDobRewardList);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getTier() {
        return this.tier;
    }

    public final List<TierDobReward> getTierDobRewardList() {
        return this.tierDobRewardList;
    }

    public int hashCode() {
        return this.tierDobRewardList.hashCode() + gpp.a(this.tier, this.currency.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.currency;
        int i = this.tier;
        return ng1.a(ml5.a(i, "TierDobConfig(currency=", str, ", tier=", ", tierDobRewardList="), this.tierDobRewardList, ")");
    }
}
