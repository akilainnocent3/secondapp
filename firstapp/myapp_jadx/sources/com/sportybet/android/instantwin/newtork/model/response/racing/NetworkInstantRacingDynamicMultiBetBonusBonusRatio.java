package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.zk1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingDynamicMultiBetBonusBonusRatio;", "", "selections", "", "min", "max", "<init>", "(III)V", "getSelections", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMin", "getMax", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingDynamicMultiBetBonusBonusRatio {
    public static final int $stable = 0;

    @SerializedName("max")
    private final int max;

    @SerializedName("min")
    private final int min;

    @SerializedName("selections")
    private final int selections;

    public NetworkInstantRacingDynamicMultiBetBonusBonusRatio(int i, int i2, int i3) {
        this.selections = i;
        this.min = i2;
        this.max = i3;
    }

    public static /* synthetic */ NetworkInstantRacingDynamicMultiBetBonusBonusRatio copy$default(NetworkInstantRacingDynamicMultiBetBonusBonusRatio networkInstantRacingDynamicMultiBetBonusBonusRatio, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = networkInstantRacingDynamicMultiBetBonusBonusRatio.selections;
        }
        if ((i4 & 2) != 0) {
            i2 = networkInstantRacingDynamicMultiBetBonusBonusRatio.min;
        }
        if ((i4 & 4) != 0) {
            i3 = networkInstantRacingDynamicMultiBetBonusBonusRatio.max;
        }
        return networkInstantRacingDynamicMultiBetBonusBonusRatio.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelections() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final NetworkInstantRacingDynamicMultiBetBonusBonusRatio copy(int selections, int min, int max) {
        return new NetworkInstantRacingDynamicMultiBetBonusBonusRatio(selections, min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingDynamicMultiBetBonusBonusRatio)) {
            return false;
        }
        NetworkInstantRacingDynamicMultiBetBonusBonusRatio networkInstantRacingDynamicMultiBetBonusBonusRatio = (NetworkInstantRacingDynamicMultiBetBonusBonusRatio) other;
        return this.selections == networkInstantRacingDynamicMultiBetBonusBonusRatio.selections && this.min == networkInstantRacingDynamicMultiBetBonusBonusRatio.min && this.max == networkInstantRacingDynamicMultiBetBonusBonusRatio.max;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + gpp.a(this.min, Integer.hashCode(this.selections) * 31, 31);
    }

    public String toString() {
        return zk1.a(this.max, ")", dy5.a("NetworkInstantRacingDynamicMultiBetBonusBonusRatio(selections=", this.selections, this.min, ", min=", ", max="));
    }
}
