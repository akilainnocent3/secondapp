package com.sportygames.sportyherov2.remote.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.kwi;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/RainStatusResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "endTime", "", "freeBetCount", "freeBetValue", "", "currency", "messageType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndTime", "()Ljava/lang/String;", "getFreeBetCount", "getFreeBetValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/sportyherov2/remote/models/RainStatusResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RainStatusResponse {
    public static final int $stable = 0;
    private final String currency;
    private final String endTime;
    private final Integer freeBetCount;
    private final Double freeBetValue;
    private final Integer id;
    private final String messageType;

    public RainStatusResponse(Integer num, String str, Integer num2, Double d, String str2, String str3) {
        this.id = num;
        this.endTime = str;
        this.freeBetCount = num2;
        this.freeBetValue = d;
        this.currency = str2;
        this.messageType = str3;
    }

    public static /* synthetic */ RainStatusResponse copy$default(RainStatusResponse rainStatusResponse, Integer num, String str, Integer num2, Double d, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rainStatusResponse.id;
        }
        if ((i & 2) != 0) {
            str = rainStatusResponse.endTime;
        }
        if ((i & 4) != 0) {
            num2 = rainStatusResponse.freeBetCount;
        }
        if ((i & 8) != 0) {
            d = rainStatusResponse.freeBetValue;
        }
        if ((i & 16) != 0) {
            str2 = rainStatusResponse.currency;
        }
        if ((i & 32) != 0) {
            str3 = rainStatusResponse.messageType;
        }
        String str4 = str2;
        String str5 = str3;
        return rainStatusResponse.copy(num, str, num2, d, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getFreeBetValue() {
        return this.freeBetValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    public final RainStatusResponse copy(Integer id, String endTime, Integer freeBetCount, Double freeBetValue, String currency, String messageType) {
        return new RainStatusResponse(id, endTime, freeBetCount, freeBetValue, currency, messageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainStatusResponse)) {
            return false;
        }
        RainStatusResponse rainStatusResponse = (RainStatusResponse) other;
        return Intrinsics.g(this.id, rainStatusResponse.id) && Intrinsics.g(this.endTime, rainStatusResponse.endTime) && Intrinsics.g(this.freeBetCount, rainStatusResponse.freeBetCount) && Intrinsics.g(this.freeBetValue, rainStatusResponse.freeBetValue) && Intrinsics.g(this.currency, rainStatusResponse.currency) && Intrinsics.g(this.messageType, rainStatusResponse.messageType);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    public final Double getFreeBetValue() {
        return this.freeBetValue;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.endTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.freeBetCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.freeBetValue;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.messageType;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        String str = this.endTime;
        Integer num2 = this.freeBetCount;
        Double d = this.freeBetValue;
        String str2 = this.currency;
        String str3 = this.messageType;
        StringBuilder sbA = pq6.a(num, "RainStatusResponse(id=", ", endTime=", str, ", freeBetCount=");
        sbA.append(num2);
        sbA.append(", freeBetValue=");
        sbA.append(d);
        sbA.append(", currency=");
        return kwi.a(sbA, str2, ", messageType=", str3, ")");
    }
}
