package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27611b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f27610a = str;
        this.f27611b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f27611b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f27610a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f27611b + ", label=" + this.f27610a + "}";
    }
}
