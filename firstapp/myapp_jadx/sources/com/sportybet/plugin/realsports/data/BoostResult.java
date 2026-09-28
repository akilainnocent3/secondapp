package com.sportybet.plugin.realsports.data;

import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0018"}, d2 = {"Lcom/sportybet/plugin/realsports/data/BoostResult;", "", "showUseBoost", "", "boostMatchList", "", "Lcom/sportybet/plugin/realsports/live/data/LiveBoostMatchItem;", "<init>", "(ZLjava/util/List;)V", "getShowUseBoost", "()Z", "setShowUseBoost", "(Z)V", "getBoostMatchList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BoostResult {
    public static final int $stable = 8;
    private final List<LiveBoostMatchItem> boostMatchList;
    private boolean showUseBoost;

    public BoostResult(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoostResult copy$default(BoostResult boostResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = boostResult.showUseBoost;
        }
        if ((i & 2) != 0) {
            list = boostResult.boostMatchList;
        }
        return boostResult.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowUseBoost() {
        return this.showUseBoost;
    }

    public final List<LiveBoostMatchItem> component2() {
        return this.boostMatchList;
    }

    public final BoostResult copy(boolean showUseBoost, List<LiveBoostMatchItem> boostMatchList) {
        boostMatchList.getClass();
        return new BoostResult(showUseBoost, boostMatchList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoostResult)) {
            return false;
        }
        BoostResult boostResult = (BoostResult) other;
        return this.showUseBoost == boostResult.showUseBoost && Intrinsics.g(this.boostMatchList, boostResult.boostMatchList);
    }

    public final List<LiveBoostMatchItem> getBoostMatchList() {
        return this.boostMatchList;
    }

    public final boolean getShowUseBoost() {
        return this.showUseBoost;
    }

    public int hashCode() {
        return this.boostMatchList.hashCode() + (Boolean.hashCode(this.showUseBoost) * 31);
    }

    public final void setShowUseBoost(boolean z) {
        this.showUseBoost = z;
    }

    public String toString() {
        return "BoostResult(showUseBoost=" + this.showUseBoost + ", boostMatchList=" + this.boostMatchList + ")";
    }

    public BoostResult(boolean z, List<LiveBoostMatchItem> list) {
        list.getClass();
        this.showUseBoost = z;
        this.boostMatchList = list;
    }

    public BoostResult() {
        this(false, null, 3, null);
    }
}
