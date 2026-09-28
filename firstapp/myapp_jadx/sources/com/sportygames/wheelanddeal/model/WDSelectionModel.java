package com.sportygames.wheelanddeal.model;

import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDSelectionModel;", "", "risk", "", "", "segments", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getRisk", "()Ljava/util/List;", "getSegments", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDSelectionModel {
    public static final int $stable = 8;
    private final List<String> risk;
    private final List<Integer> segments;

    public WDSelectionModel(List<String> list, List<Integer> list2) {
        list.getClass();
        list2.getClass();
        this.risk = list;
        this.segments = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDSelectionModel copy$default(WDSelectionModel wDSelectionModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wDSelectionModel.risk;
        }
        if ((i & 2) != 0) {
            list2 = wDSelectionModel.segments;
        }
        return wDSelectionModel.copy(list, list2);
    }

    public final List<String> component1() {
        return this.risk;
    }

    public final List<Integer> component2() {
        return this.segments;
    }

    public final WDSelectionModel copy(List<String> risk, List<Integer> segments) {
        risk.getClass();
        segments.getClass();
        return new WDSelectionModel(risk, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDSelectionModel)) {
            return false;
        }
        WDSelectionModel wDSelectionModel = (WDSelectionModel) other;
        return Intrinsics.g(this.risk, wDSelectionModel.risk) && Intrinsics.g(this.segments, wDSelectionModel.segments);
    }

    public final List<String> getRisk() {
        return this.risk;
    }

    public final List<Integer> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return this.segments.hashCode() + (this.risk.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDSelectionModel(risk=");
        sb.append(this.risk);
        sb.append(", segments=");
        return o8i.a(sb, this.segments, ')');
    }
}
