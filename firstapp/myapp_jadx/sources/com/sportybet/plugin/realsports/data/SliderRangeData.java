package com.sportybet.plugin.realsports.data;

import defpackage.dy5;
import defpackage.gpp;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SliderRangeData;", "", "left", "", "right", "firstLaunch", "", "<init>", "(IIZ)V", "getLeft", "()I", "getRight", "getFirstLaunch", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SliderRangeData {
    public static final int $stable = 0;
    private final boolean firstLaunch;
    private final int left;
    private final int right;

    public /* synthetic */ SliderRangeData(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? true : z);
    }

    public static /* synthetic */ SliderRangeData copy$default(SliderRangeData sliderRangeData, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sliderRangeData.left;
        }
        if ((i3 & 2) != 0) {
            i2 = sliderRangeData.right;
        }
        if ((i3 & 4) != 0) {
            z = sliderRangeData.firstLaunch;
        }
        return sliderRangeData.copy(i, i2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    public final SliderRangeData copy(int left, int right, boolean firstLaunch) {
        return new SliderRangeData(left, right, firstLaunch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderRangeData)) {
            return false;
        }
        SliderRangeData sliderRangeData = (SliderRangeData) other;
        return this.left == sliderRangeData.left && this.right == sliderRangeData.right && this.firstLaunch == sliderRangeData.firstLaunch;
    }

    public final boolean getFirstLaunch() {
        return this.firstLaunch;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public int hashCode() {
        return Boolean.hashCode(this.firstLaunch) + gpp.a(this.right, Integer.hashCode(this.left) * 31, 31);
    }

    public String toString() {
        int i = this.left;
        int i2 = this.right;
        return mq0.a(dy5.a("SliderRangeData(left=", i, i2, ", right=", ", firstLaunch="), this.firstLaunch, ")");
    }

    public SliderRangeData(int i, int i2, boolean z) {
        this.left = i;
        this.right = i2;
        this.firstLaunch = z;
    }

    public SliderRangeData() {
        this(0, 0, false, 7, null);
    }
}
