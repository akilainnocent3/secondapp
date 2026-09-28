package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.x;
import defpackage.f87;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/RewardData;", "", "currency", "", "rewardAmount", "", "userCCF", "<init>", "(Ljava/lang/String;JJ)V", "getCurrency", "()Ljava/lang/String;", "getRewardAmount", "()J", "getUserCCF", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RewardData {
    public static final int $stable = 0;
    private final String currency;
    private final long rewardAmount;
    private final long userCCF;

    public RewardData(String str, long j, long j2) {
        str.getClass();
        this.currency = str;
        this.rewardAmount = j;
        this.userCCF = j2;
    }

    public static /* synthetic */ RewardData copy$default(RewardData rewardData, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardData.currency;
        }
        if ((i & 2) != 0) {
            j = rewardData.rewardAmount;
        }
        if ((i & 4) != 0) {
            j2 = rewardData.userCCF;
        }
        return rewardData.copy(str, j, j2);
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
    public final long getUserCCF() {
        return this.userCCF;
    }

    public final RewardData copy(String currency, long rewardAmount, long userCCF) {
        currency.getClass();
        return new RewardData(currency, rewardAmount, userCCF);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardData)) {
            return false;
        }
        RewardData rewardData = (RewardData) other;
        return Intrinsics.g(this.currency, rewardData.currency) && this.rewardAmount == rewardData.rewardAmount && this.userCCF == rewardData.userCCF;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final long getRewardAmount() {
        return this.rewardAmount;
    }

    public final long getUserCCF() {
        return this.userCCF;
    }

    public int hashCode() {
        return Long.hashCode(this.userCCF) + f87.a(this.currency.hashCode() * 31, this.rewardAmount, 31);
    }

    public String toString() {
        String str = this.currency;
        return zug.a(this.userCCF, ", userCCF=", ")", x.a(this.rewardAmount, "RewardData(currency=", str, ", rewardAmount="));
    }
}
