package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ux5;
import defpackage.w03;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJJ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0003HÖ\u0081\u0004R/\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0002¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dÊ\u0001\u0002\b,¨\u0006+"}, d2 = {"Lcom/sporty/android/core/model/cashout/AdditionOutcome;", "", AnalyticsParam.EVENT_PARAM_ID, "", "probability", "isActive", "", "odds", "voidProbability", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lcom/google/gson/annotations/SerializedName;", "value", "getProbability", "setProbability", "()Ljava/lang/Integer;", "setActive", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOdds", "setOdds", "getVoidProbability", "()Ljava/lang/Double;", "setVoidProbability", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/sporty/android/core/model/cashout/AdditionOutcome;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AdditionOutcome {

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private String id;
    private Integer isActive;
    private String odds;
    private String probability;
    private Double voidProbability;

    public /* synthetic */ AdditionOutcome(String str, String str2, Integer num, String str3, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : d);
    }

    public static /* synthetic */ AdditionOutcome copy$default(AdditionOutcome additionOutcome, String str, String str2, Integer num, String str3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionOutcome.id;
        }
        if ((i & 2) != 0) {
            str2 = additionOutcome.probability;
        }
        if ((i & 4) != 0) {
            num = additionOutcome.isActive;
        }
        if ((i & 8) != 0) {
            str3 = additionOutcome.odds;
        }
        if ((i & 16) != 0) {
            d = additionOutcome.voidProbability;
        }
        Double d2 = d;
        Integer num2 = num;
        return additionOutcome.copy(str, str2, num2, str3, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getVoidProbability() {
        return this.voidProbability;
    }

    public final AdditionOutcome copy(String id, String probability, Integer isActive, String odds, Double voidProbability) {
        return new AdditionOutcome(id, probability, isActive, odds, voidProbability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionOutcome)) {
            return false;
        }
        AdditionOutcome additionOutcome = (AdditionOutcome) other;
        return Intrinsics.g(this.id, additionOutcome.id) && Intrinsics.g(this.probability, additionOutcome.probability) && Intrinsics.g(this.isActive, additionOutcome.isActive) && Intrinsics.g(this.odds, additionOutcome.odds) && Intrinsics.g(this.voidProbability, additionOutcome.voidProbability);
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

    public final Double getVoidProbability() {
        return this.voidProbability;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.probability;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.isActive;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.odds;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.voidProbability;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public final void setActive(Integer num) {
        this.isActive = num;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setOdds(String str) {
        this.odds = str;
    }

    public final void setProbability(String str) {
        this.probability = str;
    }

    public final void setVoidProbability(Double d) {
        this.voidProbability = d;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.probability;
        Integer num = this.isActive;
        String str3 = this.odds;
        Double d = this.voidProbability;
        StringBuilder sbA = ux5.a("AdditionOutcome(id=", str, ", probability=", str2, ", isActive=");
        w03.a(num, ", odds=", str3, ", voidProbability=", sbA);
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public AdditionOutcome(String str, String str2, Integer num, String str3, Double d) {
        this.id = str;
        this.probability = str2;
        this.isActive = num;
        this.odds = str3;
        this.voidProbability = d;
    }

    public AdditionOutcome() {
        this(null, null, null, null, null, 31, null);
    }
}
