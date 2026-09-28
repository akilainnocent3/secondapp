package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJn\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\bHÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R)\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0007\u0010\u0016R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R)\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016R)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aÊ\u0001\u0002\b,¨\u0006+"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/OutcomeDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "voidProbability", "isActive", "", "desc", "isWinning", "refundFactor", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOdds", "getProbability", "getVoidProbability", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDesc", "getRefundFactor", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sporty/android/core/model/bookingcode/OutcomeDto;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutcomeDto {

    @SerializedName("desc")
    private final String desc;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("isActive")
    private final Integer isActive;

    @SerializedName("isWinning")
    private final Integer isWinning;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("probability")
    private final String probability;

    @SerializedName("refundFactor")
    private final Double refundFactor;

    @SerializedName("voidProbability")
    private final String voidProbability;

    public /* synthetic */ OutcomeDto(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : d);
    }

    public static /* synthetic */ OutcomeDto copy$default(OutcomeDto outcomeDto, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outcomeDto.id;
        }
        if ((i & 2) != 0) {
            str2 = outcomeDto.odds;
        }
        if ((i & 4) != 0) {
            str3 = outcomeDto.probability;
        }
        if ((i & 8) != 0) {
            str4 = outcomeDto.voidProbability;
        }
        if ((i & 16) != 0) {
            num = outcomeDto.isActive;
        }
        if ((i & 32) != 0) {
            str5 = outcomeDto.desc;
        }
        if ((i & 64) != 0) {
            num2 = outcomeDto.isWinning;
        }
        if ((i & 128) != 0) {
            d = outcomeDto.refundFactor;
        }
        Integer num3 = num2;
        Double d2 = d;
        Integer num4 = num;
        String str6 = str5;
        return outcomeDto.copy(str, str2, str3, str4, num4, str6, num3, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVoidProbability() {
        return this.voidProbability;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getIsWinning() {
        return this.isWinning;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getRefundFactor() {
        return this.refundFactor;
    }

    public final OutcomeDto copy(String id, String odds, String probability, String voidProbability, Integer isActive, String desc, Integer isWinning, Double refundFactor) {
        return new OutcomeDto(id, odds, probability, voidProbability, isActive, desc, isWinning, refundFactor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomeDto)) {
            return false;
        }
        OutcomeDto outcomeDto = (OutcomeDto) other;
        return Intrinsics.g(this.id, outcomeDto.id) && Intrinsics.g(this.odds, outcomeDto.odds) && Intrinsics.g(this.probability, outcomeDto.probability) && Intrinsics.g(this.voidProbability, outcomeDto.voidProbability) && Intrinsics.g(this.isActive, outcomeDto.isActive) && Intrinsics.g(this.desc, outcomeDto.desc) && Intrinsics.g(this.isWinning, outcomeDto.isWinning) && Intrinsics.g(this.refundFactor, outcomeDto.refundFactor);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getProbability() {
        return this.probability;
    }

    public final Double getRefundFactor() {
        return this.refundFactor;
    }

    public final String getVoidProbability() {
        return this.voidProbability;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.odds;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.probability;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.voidProbability;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.isActive;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.desc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.isWinning;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.refundFactor;
        return iHashCode7 + (d != null ? d.hashCode() : 0);
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public final Integer isWinning() {
        return this.isWinning;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        String str3 = this.probability;
        String str4 = this.voidProbability;
        Integer num = this.isActive;
        String str5 = this.desc;
        Integer num2 = this.isWinning;
        Double d = this.refundFactor;
        StringBuilder sbA = ux5.a("OutcomeDto(id=", str, ", odds=", str2, ", probability=");
        hxa.c(sbA, str3, ", voidProbability=", str4, ", isActive=");
        w03.a(num, ", desc=", str5, ", isWinning=", sbA);
        sbA.append(num2);
        sbA.append(", refundFactor=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public OutcomeDto(String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Double d) {
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.voidProbability = str4;
        this.isActive = num;
        this.desc = str5;
        this.isWinning = num2;
        this.refundFactor = d;
    }

    public OutcomeDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
