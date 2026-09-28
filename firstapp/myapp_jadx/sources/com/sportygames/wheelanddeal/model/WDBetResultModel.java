package com.sportygames.wheelanddeal.model;

import defpackage.ai50;
import defpackage.nrg0;
import defpackage.rr1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDBetResultModel;", "", "arrangement", "", "", "color", "", "multiplier", "", "index", "<init>", "(Ljava/util/List;Ljava/util/List;DI)V", "getArrangement", "()Ljava/util/List;", "getColor", "getMultiplier", "()D", "getIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDBetResultModel {
    public static final int $stable = 8;
    private final List<Integer> arrangement;
    private final List<String> color;
    private final int index;
    private final double multiplier;

    public WDBetResultModel(List<Integer> list, List<String> list2, double d, int i) {
        list.getClass();
        list2.getClass();
        this.arrangement = list;
        this.color = list2;
        this.multiplier = d;
        this.index = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDBetResultModel copy$default(WDBetResultModel wDBetResultModel, List list, List list2, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = wDBetResultModel.arrangement;
        }
        if ((i2 & 2) != 0) {
            list2 = wDBetResultModel.color;
        }
        if ((i2 & 4) != 0) {
            d = wDBetResultModel.multiplier;
        }
        if ((i2 & 8) != 0) {
            i = wDBetResultModel.index;
        }
        int i3 = i;
        return wDBetResultModel.copy(list, list2, d, i3);
    }

    public final List<Integer> component1() {
        return this.arrangement;
    }

    public final List<String> component2() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final WDBetResultModel copy(List<Integer> arrangement, List<String> color, double multiplier, int index) {
        arrangement.getClass();
        color.getClass();
        return new WDBetResultModel(arrangement, color, multiplier, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDBetResultModel)) {
            return false;
        }
        WDBetResultModel wDBetResultModel = (WDBetResultModel) other;
        return Intrinsics.g(this.arrangement, wDBetResultModel.arrangement) && Intrinsics.g(this.color, wDBetResultModel.color) && Double.compare(this.multiplier, wDBetResultModel.multiplier) == 0 && this.index == wDBetResultModel.index;
    }

    public final List<Integer> getArrangement() {
        return this.arrangement;
    }

    public final List<String> getColor() {
        return this.color;
    }

    public final int getIndex() {
        return this.index;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + nrg0.a(ai50.a(this.arrangement.hashCode() * 31, 31, this.color), 31, this.multiplier);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDBetResultModel(arrangement=");
        sb.append(this.arrangement);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", multiplier=");
        sb.append(this.multiplier);
        sb.append(", index=");
        return rr1.b(sb, this.index, ')');
    }
}
