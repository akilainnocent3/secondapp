package com.sporty.android.core.model.sportysim;

import com.appsflyer.internal.a0;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/sportysim/SimBonusRatiosData;", "", "selections", "", "min", "", "max", "<init>", "(IJJ)V", "getSelections", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMin", "()J", "getMax", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SimBonusRatiosData {

    @SerializedName("max")
    private final long max;

    @SerializedName("min")
    private final long min;

    @SerializedName("selections")
    private final int selections;

    public /* synthetic */ SimBonusRatiosData(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2);
    }

    public static /* synthetic */ SimBonusRatiosData copy$default(SimBonusRatiosData simBonusRatiosData, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simBonusRatiosData.selections;
        }
        if ((i2 & 2) != 0) {
            j = simBonusRatiosData.min;
        }
        if ((i2 & 4) != 0) {
            j2 = simBonusRatiosData.max;
        }
        return simBonusRatiosData.copy(i, j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelections() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMax() {
        return this.max;
    }

    public final SimBonusRatiosData copy(int selections, long min, long max) {
        return new SimBonusRatiosData(selections, min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimBonusRatiosData)) {
            return false;
        }
        SimBonusRatiosData simBonusRatiosData = (SimBonusRatiosData) other;
        return this.selections == simBonusRatiosData.selections && this.min == simBonusRatiosData.min && this.max == simBonusRatiosData.max;
    }

    public final long getMax() {
        return this.max;
    }

    public final long getMin() {
        return this.min;
    }

    public final int getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return Long.hashCode(this.max) + f87.a(Integer.hashCode(this.selections) * 31, this.min, 31);
    }

    public String toString() {
        return zug.a(this.max, ", max=", ")", a0.a("SimBonusRatiosData(selections=", ", min=", this.selections, this.min));
    }

    public SimBonusRatiosData(int i, long j, long j2) {
        this.selections = i;
        this.min = j;
        this.max = j2;
    }

    public SimBonusRatiosData() {
        this(0, 0L, 0L, 7, null);
    }
}
