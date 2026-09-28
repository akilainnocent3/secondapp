package com.sportygames.wheelanddeal.model;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import defpackage.ai50;
import defpackage.gpp;
import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lcom/sportygames/wheelanddeal/model/WDPayoutsModel;", "", "risk", "", "segments", "", "arrangement", "", "multiplier", "", "color", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRisk", "()Ljava/lang/String;", "getSegments", "()I", "getArrangement", "()Ljava/util/List;", "getMultiplier", "getColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "game-wheelanddeal_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WDPayoutsModel {
    public static final int $stable = 8;
    private final List<Integer> arrangement;
    private final List<String> color;
    private final List<Float> multiplier;
    private final String risk;
    private final int segments;

    public WDPayoutsModel(String str, int i, List<Integer> list, List<Float> list2, List<String> list3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.risk = str;
        this.segments = i;
        this.arrangement = list;
        this.multiplier = list2;
        this.color = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WDPayoutsModel copy$default(WDPayoutsModel wDPayoutsModel, String str, int i, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wDPayoutsModel.risk;
        }
        if ((i2 & 2) != 0) {
            i = wDPayoutsModel.segments;
        }
        if ((i2 & 4) != 0) {
            list = wDPayoutsModel.arrangement;
        }
        if ((i2 & 8) != 0) {
            list2 = wDPayoutsModel.multiplier;
        }
        if ((i2 & 16) != 0) {
            list3 = wDPayoutsModel.color;
        }
        List list4 = list3;
        List list5 = list;
        return wDPayoutsModel.copy(str, i, list5, list2, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRisk() {
        return this.risk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSegments() {
        return this.segments;
    }

    public final List<Integer> component3() {
        return this.arrangement;
    }

    public final List<Float> component4() {
        return this.multiplier;
    }

    public final List<String> component5() {
        return this.color;
    }

    public final WDPayoutsModel copy(String risk, int segments, List<Integer> arrangement, List<Float> multiplier, List<String> color) {
        risk.getClass();
        arrangement.getClass();
        multiplier.getClass();
        color.getClass();
        return new WDPayoutsModel(risk, segments, arrangement, multiplier, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WDPayoutsModel)) {
            return false;
        }
        WDPayoutsModel wDPayoutsModel = (WDPayoutsModel) other;
        return Intrinsics.g(this.risk, wDPayoutsModel.risk) && this.segments == wDPayoutsModel.segments && Intrinsics.g(this.arrangement, wDPayoutsModel.arrangement) && Intrinsics.g(this.multiplier, wDPayoutsModel.multiplier) && Intrinsics.g(this.color, wDPayoutsModel.color);
    }

    public final List<Integer> getArrangement() {
        return this.arrangement;
    }

    public final List<String> getColor() {
        return this.color;
    }

    public final List<Float> getMultiplier() {
        return this.multiplier;
    }

    public final String getRisk() {
        return this.risk;
    }

    public final int getSegments() {
        return this.segments;
    }

    public int hashCode() {
        return this.color.hashCode() + ai50.a(ai50.a(gpp.a(this.segments, this.risk.hashCode() * 31, 31), 31, this.arrangement), 31, this.multiplier);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WDPayoutsModel(risk=");
        sb.append(this.risk);
        sb.append(", segments=");
        sb.append(this.segments);
        sb.append(", arrangement=");
        sb.append(this.arrangement);
        sb.append(", multiplier=");
        sb.append(this.multiplier);
        sb.append(xOgHBQVl.DfbKJ);
        return o8i.a(sb, this.color, ')');
    }
}
