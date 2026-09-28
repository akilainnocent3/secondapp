package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.x;
import defpackage.f87;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/loyalty/FootballClaim;", "", "currency", "", "rewardAmount", "", "userCCF", "", "<init>", "(Ljava/lang/String;JF)V", "getCurrency", "()Ljava/lang/String;", "getRewardAmount", "()J", "getUserCCF", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FootballClaim {
    private final String currency;
    private final long rewardAmount;
    private final float userCCF;

    public FootballClaim(String str, long j, float f) {
        str.getClass();
        this.currency = str;
        this.rewardAmount = j;
        this.userCCF = f;
    }

    public static /* synthetic */ FootballClaim copy$default(FootballClaim footballClaim, String str, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footballClaim.currency;
        }
        if ((i & 2) != 0) {
            j = footballClaim.rewardAmount;
        }
        if ((i & 4) != 0) {
            f = footballClaim.userCCF;
        }
        return footballClaim.copy(str, j, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUserCCF() {
        return this.userCCF;
    }

    public final FootballClaim copy(String currency, long rewardAmount, float userCCF) {
        currency.getClass();
        return new FootballClaim(currency, rewardAmount, userCCF);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballClaim)) {
            return false;
        }
        FootballClaim footballClaim = (FootballClaim) other;
        return Intrinsics.g(this.currency, footballClaim.currency) && this.rewardAmount == footballClaim.rewardAmount && Float.compare(this.userCCF, footballClaim.userCCF) == 0;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    public final float getUserCCF() {
        return this.userCCF;
    }

    public int hashCode() {
        return Float.hashCode(this.userCCF) + f87.a(this.currency.hashCode() * 31, this.rewardAmount, 31);
    }

    public String toString() {
        String str = this.currency;
        long j = this.rewardAmount;
        float f = this.userCCF;
        StringBuilder sbA = x.a(j, "FootballClaim(currency=", str, ", rewardAmount=");
        sbA.append(", userCCF=");
        sbA.append(f);
        sbA.append(")");
        return sbA.toString();
    }
}
