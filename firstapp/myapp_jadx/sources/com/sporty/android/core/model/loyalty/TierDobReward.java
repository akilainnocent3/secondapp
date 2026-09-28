package com.sporty.android.core.model.loyalty;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/loyalty/TierDobReward;", "", "currency", "", "dobRewardType", "", "enabled", "", "rewardAmount", "", "<init>", "(Ljava/lang/String;IZD)V", "getCurrency", "()Ljava/lang/String;", "getDobRewardType", "()I", "getEnabled", "()Z", "getRewardAmount", "()D", "mappedDobRewardType", "Lcom/sporty/android/core/model/loyalty/DobRewardType;", "getMappedDobRewardType", "()Lcom/sporty/android/core/model/loyalty/DobRewardType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TierDobReward {
    private final String currency;
    private final int dobRewardType;
    private final boolean enabled;
    private final double rewardAmount;

    public TierDobReward(String str, int i, boolean z, double d) {
        str.getClass();
        this.currency = str;
        this.dobRewardType = i;
        this.enabled = z;
        this.rewardAmount = d;
    }

    public static /* synthetic */ TierDobReward copy$default(TierDobReward tierDobReward, String str, int i, boolean z, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tierDobReward.currency;
        }
        if ((i2 & 2) != 0) {
            i = tierDobReward.dobRewardType;
        }
        if ((i2 & 4) != 0) {
            z = tierDobReward.enabled;
        }
        if ((i2 & 8) != 0) {
            d = tierDobReward.rewardAmount;
        }
        boolean z2 = z;
        return tierDobReward.copy(str, i, z2, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDobRewardType() {
        return this.dobRewardType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public final TierDobReward copy(String currency, int dobRewardType, boolean enabled, double rewardAmount) {
        currency.getClass();
        return new TierDobReward(currency, dobRewardType, enabled, rewardAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierDobReward)) {
            return false;
        }
        TierDobReward tierDobReward = (TierDobReward) other;
        return Intrinsics.g(this.currency, tierDobReward.currency) && this.dobRewardType == tierDobReward.dobRewardType && this.enabled == tierDobReward.enabled && Double.compare(this.rewardAmount, tierDobReward.rewardAmount) == 0;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDobRewardType() {
        return this.dobRewardType;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final DobRewardType getMappedDobRewardType() {
        return DobRewardType.INSTANCE.fromInt(Integer.valueOf(this.dobRewardType));
    }

    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public int hashCode() {
        return Double.hashCode(this.rewardAmount) + mtg0.a(gpp.a(this.dobRewardType, this.currency.hashCode() * 31, 31), 31, this.enabled);
    }

    public String toString() {
        String str = this.currency;
        int i = this.dobRewardType;
        boolean z = this.enabled;
        double d = this.rewardAmount;
        StringBuilder sbA = ml5.a(i, "TierDobReward(currency=", str, ", dobRewardType=", ", enabled=");
        sbA.append(z);
        sbA.append(", rewardAmount=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }
}
