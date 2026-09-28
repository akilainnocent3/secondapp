package com.sporty.android.core.model.loyalty.streak;

import defpackage.dy5;
import defpackage.gpp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/LoyaltyBettingStreakLevel;", "", "level", "", "threshold", "boost", "", "<init>", "(IID)V", "getLevel", "()I", "getThreshold", "getBoost", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LoyaltyBettingStreakLevel {
    private final double boost;
    private final int level;
    private final int threshold;

    public LoyaltyBettingStreakLevel(int i, int i2, double d) {
        this.level = i;
        this.threshold = i2;
        this.boost = d;
    }

    public static /* synthetic */ LoyaltyBettingStreakLevel copy$default(LoyaltyBettingStreakLevel loyaltyBettingStreakLevel, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = loyaltyBettingStreakLevel.level;
        }
        if ((i3 & 2) != 0) {
            i2 = loyaltyBettingStreakLevel.threshold;
        }
        if ((i3 & 4) != 0) {
            d = loyaltyBettingStreakLevel.boost;
        }
        return loyaltyBettingStreakLevel.copy(i, i2, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getBoost() {
        return this.boost;
    }

    public final LoyaltyBettingStreakLevel copy(int level, int threshold, double boost) {
        return new LoyaltyBettingStreakLevel(level, threshold, boost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyBettingStreakLevel)) {
            return false;
        }
        LoyaltyBettingStreakLevel loyaltyBettingStreakLevel = (LoyaltyBettingStreakLevel) other;
        return this.level == loyaltyBettingStreakLevel.level && this.threshold == loyaltyBettingStreakLevel.threshold && Double.compare(this.boost, loyaltyBettingStreakLevel.boost) == 0;
    }

    public final double getBoost() {
        return this.boost;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return Double.hashCode(this.boost) + gpp.a(this.threshold, Integer.hashCode(this.level) * 31, 31);
    }

    public String toString() {
        int i = this.level;
        int i2 = this.threshold;
        double d = this.boost;
        StringBuilder sbA = dy5.a("LoyaltyBettingStreakLevel(level=", i, i2, ", threshold=", ", boost=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }
}
