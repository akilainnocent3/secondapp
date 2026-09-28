package com.sporty.android.core.model.marketingactivities;

import com.appsflyer.internal.x;
import defpackage.f87;
import defpackage.ka1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/marketingactivities/ActivityReward;", "", "minDepositCurrency", "", "minDepositAmount", "", "gifts", "", "Lcom/sporty/android/core/model/marketingactivities/ActivityRewardGift;", "<init>", "(Ljava/lang/String;JLjava/util/List;)V", "getMinDepositCurrency", "()Ljava/lang/String;", "getMinDepositAmount", "()J", "getGifts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ActivityReward {
    private final List<ActivityRewardGift> gifts;
    private final long minDepositAmount;
    private final String minDepositCurrency;

    public ActivityReward(String str, long j, List<ActivityRewardGift> list) {
        str.getClass();
        list.getClass();
        this.minDepositCurrency = str;
        this.minDepositAmount = j;
        this.gifts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityReward copy$default(ActivityReward activityReward, String str, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityReward.minDepositCurrency;
        }
        if ((i & 2) != 0) {
            j = activityReward.minDepositAmount;
        }
        if ((i & 4) != 0) {
            list = activityReward.gifts;
        }
        return activityReward.copy(str, j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMinDepositCurrency() {
        return this.minDepositCurrency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public final List<ActivityRewardGift> component3() {
        return this.gifts;
    }

    public final ActivityReward copy(String minDepositCurrency, long minDepositAmount, List<ActivityRewardGift> gifts) {
        minDepositCurrency.getClass();
        gifts.getClass();
        return new ActivityReward(minDepositCurrency, minDepositAmount, gifts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityReward)) {
            return false;
        }
        ActivityReward activityReward = (ActivityReward) other;
        return Intrinsics.g(this.minDepositCurrency, activityReward.minDepositCurrency) && this.minDepositAmount == activityReward.minDepositAmount && Intrinsics.g(this.gifts, activityReward.gifts);
    }

    public final List<ActivityRewardGift> getGifts() {
        return this.gifts;
    }

    public final long getMinDepositAmount() {
        return this.minDepositAmount;
    }

    public final String getMinDepositCurrency() {
        return this.minDepositCurrency;
    }

    public int hashCode() {
        return this.gifts.hashCode() + f87.a(this.minDepositCurrency.hashCode() * 31, this.minDepositAmount, 31);
    }

    public String toString() {
        String str = this.minDepositCurrency;
        long j = this.minDepositAmount;
        return ka1.a(x.a(j, "ActivityReward(minDepositCurrency=", str, ", minDepositAmount="), ", gifts=", this.gifts, ")");
    }
}
