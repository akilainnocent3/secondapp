package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR)\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR)\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/OneCutBetApiData;", "", AnalyticsParam.EVENT_STATUS, "", "display", "deductedBonusRatio", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/Double;)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getDisplay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeductedBonusRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Double;)Lcom/sportybet/android/instantwin/newtork/model/response/OneCutBetApiData;", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneCutBetApiData {
    public static final int $stable = 0;

    @SerializedName("deductedBonusRatio")
    private final Double deductedBonusRatio;

    @SerializedName("display")
    private final Integer display;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public OneCutBetApiData(int i, Integer num, Double d) {
        this.status = i;
        this.display = num;
        this.deductedBonusRatio = d;
    }

    public static /* synthetic */ OneCutBetApiData copy$default(OneCutBetApiData oneCutBetApiData, int i, Integer num, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneCutBetApiData.status;
        }
        if ((i2 & 2) != 0) {
            num = oneCutBetApiData.display;
        }
        if ((i2 & 4) != 0) {
            d = oneCutBetApiData.deductedBonusRatio;
        }
        return oneCutBetApiData.copy(i, num, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getDeductedBonusRatio() {
        return this.deductedBonusRatio;
    }

    public final OneCutBetApiData copy(int status, Integer display, Double deductedBonusRatio) {
        return new OneCutBetApiData(status, display, deductedBonusRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneCutBetApiData)) {
            return false;
        }
        OneCutBetApiData oneCutBetApiData = (OneCutBetApiData) other;
        return this.status == oneCutBetApiData.status && Intrinsics.g(this.display, oneCutBetApiData.display) && Intrinsics.g(this.deductedBonusRatio, oneCutBetApiData.deductedBonusRatio);
    }

    public final Double getDeductedBonusRatio() {
        return this.deductedBonusRatio;
    }

    public final Integer getDisplay() {
        return this.display;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        Integer num = this.display;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.deductedBonusRatio;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "OneCutBetApiData(status=" + this.status + ", display=" + this.display + ", deductedBonusRatio=" + this.deductedBonusRatio + ")";
    }

    public /* synthetic */ OneCutBetApiData(int i, Integer num, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, num, d);
    }
}
