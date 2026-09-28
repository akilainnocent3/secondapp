package com.sporty.android.core.model.account;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/account/MyFavoriteStake;", "", "defaultStake", "", "quickAddStake1", "quickAddStake2", "quickAddStake3", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getDefaultStake", "()Ljava/lang/Double;", "setDefaultStake", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getQuickAddStake1", "setQuickAddStake1", "getQuickAddStake2", "setQuickAddStake2", "getQuickAddStake3", "setQuickAddStake3", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sporty/android/core/model/account/MyFavoriteStake;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MyFavoriteStake {
    private Double defaultStake;
    private Double quickAddStake1;
    private Double quickAddStake2;
    private Double quickAddStake3;

    public /* synthetic */ MyFavoriteStake(Double d, Double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }

    public static /* synthetic */ MyFavoriteStake copy$default(MyFavoriteStake myFavoriteStake, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = myFavoriteStake.defaultStake;
        }
        if ((i & 2) != 0) {
            d2 = myFavoriteStake.quickAddStake1;
        }
        if ((i & 4) != 0) {
            d3 = myFavoriteStake.quickAddStake2;
        }
        if ((i & 8) != 0) {
            d4 = myFavoriteStake.quickAddStake3;
        }
        return myFavoriteStake.copy(d, d2, d3, d4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getDefaultStake() {
        return this.defaultStake;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getQuickAddStake1() {
        return this.quickAddStake1;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getQuickAddStake2() {
        return this.quickAddStake2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getQuickAddStake3() {
        return this.quickAddStake3;
    }

    public final MyFavoriteStake copy(Double defaultStake, Double quickAddStake1, Double quickAddStake2, Double quickAddStake3) {
        return new MyFavoriteStake(defaultStake, quickAddStake1, quickAddStake2, quickAddStake3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyFavoriteStake)) {
            return false;
        }
        MyFavoriteStake myFavoriteStake = (MyFavoriteStake) other;
        return Intrinsics.g(this.defaultStake, myFavoriteStake.defaultStake) && Intrinsics.g(this.quickAddStake1, myFavoriteStake.quickAddStake1) && Intrinsics.g(this.quickAddStake2, myFavoriteStake.quickAddStake2) && Intrinsics.g(this.quickAddStake3, myFavoriteStake.quickAddStake3);
    }

    public final Double getDefaultStake() {
        return this.defaultStake;
    }

    public final Double getQuickAddStake1() {
        return this.quickAddStake1;
    }

    public final Double getQuickAddStake2() {
        return this.quickAddStake2;
    }

    public final Double getQuickAddStake3() {
        return this.quickAddStake3;
    }

    public int hashCode() {
        Double d = this.defaultStake;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.quickAddStake1;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.quickAddStake2;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.quickAddStake3;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public final void setDefaultStake(Double d) {
        this.defaultStake = d;
    }

    public final void setQuickAddStake1(Double d) {
        this.quickAddStake1 = d;
    }

    public final void setQuickAddStake2(Double d) {
        this.quickAddStake2 = d;
    }

    public final void setQuickAddStake3(Double d) {
        this.quickAddStake3 = d;
    }

    public String toString() {
        return "MyFavoriteStake(defaultStake=" + this.defaultStake + ", quickAddStake1=" + this.quickAddStake1 + ", quickAddStake2=" + this.quickAddStake2 + ", quickAddStake3=" + this.quickAddStake3 + ")";
    }

    public MyFavoriteStake(Double d, Double d2, Double d3, Double d4) {
        this.defaultStake = d;
        this.quickAddStake1 = d2;
        this.quickAddStake2 = d3;
        this.quickAddStake3 = d4;
    }

    public MyFavoriteStake() {
        this(null, null, null, null, 15, null);
    }
}
