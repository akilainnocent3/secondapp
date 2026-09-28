package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011Ê\u0001\u0002\b Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OneCutData;", "", AnalyticsParam.EVENT_STATUS, "", "sliderEnabled", "", "minOneCutStakePct", "", "maxOneCutStakePct", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "getStatus", "()I", "getSliderEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinOneCutStakePct", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxOneCutStakePct", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportybet/plugin/realsports/data/OneCutData;", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneCutData {
    public static final int $stable = 0;
    private final Double maxOneCutStakePct;
    private final Double minOneCutStakePct;
    private final Boolean sliderEnabled;
    private final int status;

    public OneCutData(int i, Boolean bool, Double d, Double d2) {
        this.status = i;
        this.sliderEnabled = bool;
        this.minOneCutStakePct = d;
        this.maxOneCutStakePct = d2;
    }

    public static /* synthetic */ OneCutData copy$default(OneCutData oneCutData, int i, Boolean bool, Double d, Double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneCutData.status;
        }
        if ((i2 & 2) != 0) {
            bool = oneCutData.sliderEnabled;
        }
        if ((i2 & 4) != 0) {
            d = oneCutData.minOneCutStakePct;
        }
        if ((i2 & 8) != 0) {
            d2 = oneCutData.maxOneCutStakePct;
        }
        return oneCutData.copy(i, bool, d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSliderEnabled() {
        return this.sliderEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMinOneCutStakePct() {
        return this.minOneCutStakePct;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getMaxOneCutStakePct() {
        return this.maxOneCutStakePct;
    }

    public final OneCutData copy(int status, Boolean sliderEnabled, Double minOneCutStakePct, Double maxOneCutStakePct) {
        return new OneCutData(status, sliderEnabled, minOneCutStakePct, maxOneCutStakePct);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneCutData)) {
            return false;
        }
        OneCutData oneCutData = (OneCutData) other;
        return this.status == oneCutData.status && Intrinsics.g(this.sliderEnabled, oneCutData.sliderEnabled) && Intrinsics.g(this.minOneCutStakePct, oneCutData.minOneCutStakePct) && Intrinsics.g(this.maxOneCutStakePct, oneCutData.maxOneCutStakePct);
    }

    public final Double getMaxOneCutStakePct() {
        return this.maxOneCutStakePct;
    }

    public final Double getMinOneCutStakePct() {
        return this.minOneCutStakePct;
    }

    public final Boolean getSliderEnabled() {
        return this.sliderEnabled;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        Boolean bool = this.sliderEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.minOneCutStakePct;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.maxOneCutStakePct;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        return "OneCutData(status=" + this.status + ", sliderEnabled=" + this.sliderEnabled + ", minOneCutStakePct=" + this.minOneCutStakePct + ", maxOneCutStakePct=" + this.maxOneCutStakePct + ")";
    }

    public /* synthetic */ OneCutData(int i, Boolean bool, Double d, Double d2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, bool, d, d2);
    }
}
