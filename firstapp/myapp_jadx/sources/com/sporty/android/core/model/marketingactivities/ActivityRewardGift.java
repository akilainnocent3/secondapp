package com.sporty.android.core.model.marketingactivities;

import com.appsflyer.internal.a0;
import defpackage.f87;
import defpackage.pr0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/marketingactivities/ActivityRewardGift;", "", "kind", "", "value", "", "currency", "", "<init>", "(IJLjava/lang/String;)V", "getKind", "()I", "getValue", "()J", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ActivityRewardGift {
    private final String currency;
    private final int kind;
    private final long value;

    public ActivityRewardGift(int i, long j, String str) {
        str.getClass();
        this.kind = i;
        this.value = j;
        this.currency = str;
    }

    public static /* synthetic */ ActivityRewardGift copy$default(ActivityRewardGift activityRewardGift, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = activityRewardGift.kind;
        }
        if ((i2 & 2) != 0) {
            j = activityRewardGift.value;
        }
        if ((i2 & 4) != 0) {
            str = activityRewardGift.currency;
        }
        return activityRewardGift.copy(i, j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final ActivityRewardGift copy(int kind, long value, String currency) {
        currency.getClass();
        return new ActivityRewardGift(kind, value, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRewardGift)) {
            return false;
        }
        ActivityRewardGift activityRewardGift = (ActivityRewardGift) other;
        return this.kind == activityRewardGift.kind && this.value == activityRewardGift.value && Intrinsics.g(this.currency, activityRewardGift.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getKind() {
        return this.kind;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.currency.hashCode() + f87.a(Integer.hashCode(this.kind) * 31, this.value, 31);
    }

    public String toString() {
        int i = this.kind;
        long j = this.value;
        return pr0.a(a0.a("ActivityRewardGift(kind=", ", value=", i, j), ", currency=", this.currency, ")");
    }
}
