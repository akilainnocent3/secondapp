package com.sportygames.crash.remote.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.k800;
import defpackage.oie;
import defpackage.ry4;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015¨\u0006."}, d2 = {"Lcom/sportygames/crash/remote/models/RainTopicResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "claimCount", "startTime", "", "freeBetCount", AnalyticsParam.EVENT_STATUS, "totalFreeBetValue", "", "freeBetValue", "currency", "messageType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getClaimCount", "getStartTime", "()Ljava/lang/String;", "getFreeBetCount", "getStatus", "getTotalFreeBetValue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFreeBetValue", "getCurrency", "getMessageType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/crash/remote/models/RainTopicResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RainTopicResponse {
    public static final int $stable = 0;
    private final Integer claimCount;
    private final String currency;
    private final Integer freeBetCount;
    private final Double freeBetValue;
    private final Integer id;
    private final String messageType;
    private final String startTime;
    private final String status;
    private final Double totalFreeBetValue;

    public RainTopicResponse(Integer num, Integer num2, String str, Integer num3, String str2, Double d, Double d2, String str3, String str4) {
        this.id = num;
        this.claimCount = num2;
        this.startTime = str;
        this.freeBetCount = num3;
        this.status = str2;
        this.totalFreeBetValue = d;
        this.freeBetValue = d2;
        this.currency = str3;
        this.messageType = str4;
    }

    public static /* synthetic */ RainTopicResponse copy$default(RainTopicResponse rainTopicResponse, Integer num, Integer num2, String str, Integer num3, String str2, Double d, Double d2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rainTopicResponse.id;
        }
        if ((i & 2) != 0) {
            num2 = rainTopicResponse.claimCount;
        }
        if ((i & 4) != 0) {
            str = rainTopicResponse.startTime;
        }
        if ((i & 8) != 0) {
            num3 = rainTopicResponse.freeBetCount;
        }
        if ((i & 16) != 0) {
            str2 = rainTopicResponse.status;
        }
        if ((i & 32) != 0) {
            d = rainTopicResponse.totalFreeBetValue;
        }
        if ((i & 64) != 0) {
            d2 = rainTopicResponse.freeBetValue;
        }
        if ((i & 128) != 0) {
            str3 = rainTopicResponse.currency;
        }
        if ((i & 256) != 0) {
            str4 = rainTopicResponse.messageType;
        }
        String str5 = str3;
        String str6 = str4;
        Double d3 = d;
        Double d4 = d2;
        String str7 = str2;
        String str8 = str;
        return rainTopicResponse.copy(num, num2, str8, num3, str7, d3, d4, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClaimCount() {
        return this.claimCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFreeBetCount() {
        return this.freeBetCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getTotalFreeBetValue() {
        return this.totalFreeBetValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getFreeBetValue() {
        return this.freeBetValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    public final RainTopicResponse copy(Integer id, Integer claimCount, String startTime, Integer freeBetCount, String status, Double totalFreeBetValue, Double freeBetValue, String currency, String messageType) {
        return new RainTopicResponse(id, claimCount, startTime, freeBetCount, status, totalFreeBetValue, freeBetValue, currency, messageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RainTopicResponse)) {
            return false;
        }
        RainTopicResponse rainTopicResponse = (RainTopicResponse) other;
        return Intrinsics.g(this.id, rainTopicResponse.id) && Intrinsics.g(this.claimCount, rainTopicResponse.claimCount) && Intrinsics.g(this.startTime, rainTopicResponse.startTime) && Intrinsics.g(this.freeBetCount, rainTopicResponse.freeBetCount) && Intrinsics.g(this.status, rainTopicResponse.status) && Intrinsics.g(this.totalFreeBetValue, rainTopicResponse.totalFreeBetValue) && Intrinsics.g(this.freeBetValue, rainTopicResponse.freeBetValue) && Intrinsics.g(this.currency, rainTopicResponse.currency) && Intrinsics.g(this.messageType, rainTopicResponse.messageType);
    }

    public final Integer getClaimCount() {
        return this.claimCount;
    }

    public final String getCurrency() {
        return this.currency;
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

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Double getTotalFreeBetValue() {
        return this.totalFreeBetValue;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.claimCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.startTime;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.freeBetCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.totalFreeBetValue;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.freeBetValue;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.messageType;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.claimCount;
        String str = this.startTime;
        Integer num3 = this.freeBetCount;
        String str2 = this.status;
        Double d = this.totalFreeBetValue;
        Double d2 = this.freeBetValue;
        String str3 = this.currency;
        String str4 = this.messageType;
        StringBuilder sb = new StringBuilder("RainTopicResponse(id=");
        sb.append(num);
        sb.append(", claimCount=");
        sb.append(num2);
        sb.append(", startTime=");
        oie.a(num3, str, ", freeBetCount=", ", status=", sb);
        k800.a(d, str2, ", totalFreeBetValue=", ", freeBetValue=", sb);
        ry4.a(d2, ", currency=", str3, ", messageType=", sb);
        return uf80.a(sb, str4, ")");
    }
}
