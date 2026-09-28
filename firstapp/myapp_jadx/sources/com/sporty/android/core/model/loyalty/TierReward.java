package com.sporty.android.core.model.loyalty;

import defpackage.f87;
import defpackage.mtg0;
import defpackage.to10;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/loyalty/TierReward;", "", "currency", "", "enabled", "", "rewardAmount", "", "rewardType", "", "<init>", "(Ljava/lang/String;ZJI)V", "getCurrency", "()Ljava/lang/String;", "getEnabled", "()Z", "getRewardAmount", "()J", "getRewardType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TierReward {
    public static final int TYPE_FREE_BET_GIFT = 1;
    private final String currency;
    private final boolean enabled;
    private final long rewardAmount;
    private final int rewardType;

    public TierReward(String str, boolean z, long j, int i) {
        str.getClass();
        this.currency = str;
        this.enabled = z;
        this.rewardAmount = j;
        this.rewardType = i;
    }

    public static /* synthetic */ TierReward copy$default(TierReward tierReward, String str, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tierReward.currency;
        }
        if ((i2 & 2) != 0) {
            z = tierReward.enabled;
        }
        if ((i2 & 4) != 0) {
            j = tierReward.rewardAmount;
        }
        if ((i2 & 8) != 0) {
            i = tierReward.rewardType;
        }
        int i3 = i;
        return tierReward.copy(str, z, j, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRewardType() {
        return this.rewardType;
    }

    public final TierReward copy(String currency, boolean enabled, long rewardAmount, int rewardType) {
        currency.getClass();
        return new TierReward(currency, enabled, rewardAmount, rewardType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TierReward)) {
            return false;
        }
        TierReward tierReward = (TierReward) other;
        return Intrinsics.g(this.currency, tierReward.currency) && this.enabled == tierReward.enabled && this.rewardAmount == tierReward.rewardAmount && this.rewardType == tierReward.rewardType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    public final int getRewardType() {
        return this.rewardType;
    }

    public int hashCode() {
        return Integer.hashCode(this.rewardType) + f87.a(mtg0.a(this.currency.hashCode() * 31, 31, this.enabled), this.rewardAmount, 31);
    }

    public String toString() {
        String str = this.currency;
        boolean z = this.enabled;
        long j = this.rewardAmount;
        int i = this.rewardType;
        StringBuilder sbA = z620.a("TierReward(currency=", str, ", enabled=", ", rewardAmount=", z);
        to10.a(sbA, j, ", rewardType=", i);
        sbA.append(")");
        return sbA.toString();
    }
}
