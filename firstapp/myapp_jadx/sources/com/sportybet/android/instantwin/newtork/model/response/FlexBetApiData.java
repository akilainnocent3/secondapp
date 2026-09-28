package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J<\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/FlexBetApiData;", "", AnalyticsParam.EVENT_STATUS, "", "oddsKey", "", "display", "flexibleMinOdds", "", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getOddsKey", "()Ljava/lang/String;", "getDisplay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFlexibleMinOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sportybet/android/instantwin/newtork/model/response/FlexBetApiData;", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FlexBetApiData {
    public static final int $stable = 0;

    @SerializedName("display")
    private final Integer display;

    @SerializedName("flexibleMinOdds")
    private final Double flexibleMinOdds;

    @SerializedName("oddsKey")
    private final String oddsKey;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public FlexBetApiData(int i, String str, Integer num, Double d) {
        this.status = i;
        this.oddsKey = str;
        this.display = num;
        this.flexibleMinOdds = d;
    }

    public static /* synthetic */ FlexBetApiData copy$default(FlexBetApiData flexBetApiData, int i, String str, Integer num, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = flexBetApiData.status;
        }
        if ((i2 & 2) != 0) {
            str = flexBetApiData.oddsKey;
        }
        if ((i2 & 4) != 0) {
            num = flexBetApiData.display;
        }
        if ((i2 & 8) != 0) {
            d = flexBetApiData.flexibleMinOdds;
        }
        return flexBetApiData.copy(i, str, num, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOddsKey() {
        return this.oddsKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final FlexBetApiData copy(int status, String oddsKey, Integer display, Double flexibleMinOdds) {
        return new FlexBetApiData(status, oddsKey, display, flexibleMinOdds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexBetApiData)) {
            return false;
        }
        FlexBetApiData flexBetApiData = (FlexBetApiData) other;
        return this.status == flexBetApiData.status && Intrinsics.g(this.oddsKey, flexBetApiData.oddsKey) && Intrinsics.g(this.display, flexBetApiData.display) && Intrinsics.g(this.flexibleMinOdds, flexBetApiData.flexibleMinOdds);
    }

    public final Integer getDisplay() {
        return this.display;
    }

    public final Double getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final String getOddsKey() {
        return this.oddsKey;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        String str = this.oddsKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.display;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.flexibleMinOdds;
        return iHashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        int i = this.status;
        String str = this.oddsKey;
        Integer num = this.display;
        Double d = this.flexibleMinOdds;
        StringBuilder sbA = uqe0.a(i, "FlexBetApiData(status=", ", oddsKey=", str, ", display=");
        sbA.append(num);
        sbA.append(", flexibleMinOdds=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ FlexBetApiData(int i, String str, Integer num, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, num, d);
    }
}
