package com.sporty.android.core.model.multimaker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/multimaker/MultiMakerTotalOddsBOSettings;", "", "min", "", "max", "delta", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getMin", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMax", "getDelta", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/sporty/android/core/model/multimaker/MultiMakerTotalOddsBOSettings;", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerTotalOddsBOSettings {
    private final Float delta;
    private final Float max;
    private final Float min;

    public /* synthetic */ MultiMakerTotalOddsBOSettings(Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.valueOf(10.0f) : f, (i & 2) != 0 ? Float.valueOf(100.0f) : f2, (i & 4) != 0 ? Float.valueOf(1.0f) : f3);
    }

    public static /* synthetic */ MultiMakerTotalOddsBOSettings copy$default(MultiMakerTotalOddsBOSettings multiMakerTotalOddsBOSettings, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = multiMakerTotalOddsBOSettings.min;
        }
        if ((i & 2) != 0) {
            f2 = multiMakerTotalOddsBOSettings.max;
        }
        if ((i & 4) != 0) {
            f3 = multiMakerTotalOddsBOSettings.delta;
        }
        return multiMakerTotalOddsBOSettings.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getDelta() {
        return this.delta;
    }

    public final MultiMakerTotalOddsBOSettings copy(Float min, Float max, Float delta) {
        return new MultiMakerTotalOddsBOSettings(min, max, delta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiMakerTotalOddsBOSettings)) {
            return false;
        }
        MultiMakerTotalOddsBOSettings multiMakerTotalOddsBOSettings = (MultiMakerTotalOddsBOSettings) other;
        return Intrinsics.g(this.min, multiMakerTotalOddsBOSettings.min) && Intrinsics.g(this.max, multiMakerTotalOddsBOSettings.max) && Intrinsics.g(this.delta, multiMakerTotalOddsBOSettings.delta);
    }

    public final Float getDelta() {
        return this.delta;
    }

    public final Float getMax() {
        return this.max;
    }

    public final Float getMin() {
        return this.min;
    }

    public int hashCode() {
        Float f = this.min;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.max;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.delta;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public String toString() {
        return "MultiMakerTotalOddsBOSettings(min=" + this.min + ", max=" + this.max + ", delta=" + this.delta + ")";
    }

    public MultiMakerTotalOddsBOSettings(Float f, Float f2, Float f3) {
        this.min = f;
        this.max = f2;
        this.delta = f3;
    }

    public MultiMakerTotalOddsBOSettings() {
        this(null, null, null, 7, null);
    }
}
