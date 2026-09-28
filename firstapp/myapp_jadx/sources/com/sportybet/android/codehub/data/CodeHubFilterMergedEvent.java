package com.sportybet.android.codehub.data;

import defpackage.ai50;
import defpackage.hfb0;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0004HÖ\u0081\u0004R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fÊ\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/android/codehub/data/CodeHubFilterMergedEvent;", "", "time", "", "", "folds", "", "odds", "", "sortBy", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTime", "()Ljava/util/List;", "setTime", "(Ljava/util/List;)V", "getFolds", "setFolds", "getOdds", "setOdds", "getSortBy", "setSortBy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeHubFilterMergedEvent {
    public static final int $stable = 8;
    private List<Integer> folds;
    private List<Double> odds;
    private List<String> sortBy;
    private List<String> time;

    public CodeHubFilterMergedEvent(List<String> list, List<Integer> list2, List<Double> list3, List<String> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.time = list;
        this.folds = list2;
        this.odds = list3;
        this.sortBy = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeHubFilterMergedEvent copy$default(CodeHubFilterMergedEvent codeHubFilterMergedEvent, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = codeHubFilterMergedEvent.time;
        }
        if ((i & 2) != 0) {
            list2 = codeHubFilterMergedEvent.folds;
        }
        if ((i & 4) != 0) {
            list3 = codeHubFilterMergedEvent.odds;
        }
        if ((i & 8) != 0) {
            list4 = codeHubFilterMergedEvent.sortBy;
        }
        return codeHubFilterMergedEvent.copy(list, list2, list3, list4);
    }

    public final List<String> component1() {
        return this.time;
    }

    public final List<Integer> component2() {
        return this.folds;
    }

    public final List<Double> component3() {
        return this.odds;
    }

    public final List<String> component4() {
        return this.sortBy;
    }

    public final CodeHubFilterMergedEvent copy(List<String> time, List<Integer> folds, List<Double> odds, List<String> sortBy) {
        time.getClass();
        folds.getClass();
        odds.getClass();
        sortBy.getClass();
        return new CodeHubFilterMergedEvent(time, folds, odds, sortBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeHubFilterMergedEvent)) {
            return false;
        }
        CodeHubFilterMergedEvent codeHubFilterMergedEvent = (CodeHubFilterMergedEvent) other;
        return Intrinsics.g(this.time, codeHubFilterMergedEvent.time) && Intrinsics.g(this.folds, codeHubFilterMergedEvent.folds) && Intrinsics.g(this.odds, codeHubFilterMergedEvent.odds) && Intrinsics.g(this.sortBy, codeHubFilterMergedEvent.sortBy);
    }

    public final List<Integer> getFolds() {
        return this.folds;
    }

    public final List<Double> getOdds() {
        return this.odds;
    }

    public final List<String> getSortBy() {
        return this.sortBy;
    }

    public final List<String> getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.sortBy.hashCode() + ai50.a(ai50.a(this.time.hashCode() * 31, 31, this.folds), 31, this.odds);
    }

    public final void setFolds(List<Integer> list) {
        list.getClass();
        this.folds = list;
    }

    public final void setOdds(List<Double> list) {
        list.getClass();
        this.odds = list;
    }

    public final void setSortBy(List<String> list) {
        list.getClass();
        this.sortBy = list;
    }

    public final void setTime(List<String> list) {
        list.getClass();
        this.time = list;
    }

    public String toString() {
        List<String> list = this.time;
        List<Integer> list2 = this.folds;
        return v9d.a(", sortBy=", ")", hfb0.a("CodeHubFilterMergedEvent(time=", ", folds=", ", odds=", list, list2), this.odds, this.sortBy);
    }
}
