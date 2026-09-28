package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ew7;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR)\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018Ê\u0001\u0002\b'¨\u0006&"}, d2 = {"Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;", "", AnalyticsParam.EVENT_PARAM_ID, "", "product", "", "specifier", "desc", AnalyticsParam.EVENT_STATUS, "outcome", "Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSpecifier", "getDesc", "getStatus", "getOutcome", "()Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;)Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationMarket;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SingleBetCashoutRecommendationMarket {

    @SerializedName("desc")
    private final String desc;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("outcome")
    private final SingleBetCashoutRecommendationOutcome outcome;

    @SerializedName("product")
    private final Integer product;

    @SerializedName("specifier")
    private final String specifier;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    public SingleBetCashoutRecommendationMarket(String str, Integer num, String str2, String str3, Integer num2, SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome) {
        this.id = str;
        this.product = num;
        this.specifier = str2;
        this.desc = str3;
        this.status = num2;
        this.outcome = singleBetCashoutRecommendationOutcome;
    }

    public static /* synthetic */ SingleBetCashoutRecommendationMarket copy$default(SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket, String str, Integer num, String str2, String str3, Integer num2, SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleBetCashoutRecommendationMarket.id;
        }
        if ((i & 2) != 0) {
            num = singleBetCashoutRecommendationMarket.product;
        }
        if ((i & 4) != 0) {
            str2 = singleBetCashoutRecommendationMarket.specifier;
        }
        if ((i & 8) != 0) {
            str3 = singleBetCashoutRecommendationMarket.desc;
        }
        if ((i & 16) != 0) {
            num2 = singleBetCashoutRecommendationMarket.status;
        }
        if ((i & 32) != 0) {
            singleBetCashoutRecommendationOutcome = singleBetCashoutRecommendationMarket.outcome;
        }
        Integer num3 = num2;
        SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome2 = singleBetCashoutRecommendationOutcome;
        return singleBetCashoutRecommendationMarket.copy(str, num, str2, str3, num3, singleBetCashoutRecommendationOutcome2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SingleBetCashoutRecommendationOutcome getOutcome() {
        return this.outcome;
    }

    public final SingleBetCashoutRecommendationMarket copy(String id, Integer product, String specifier, String desc, Integer status, SingleBetCashoutRecommendationOutcome outcome) {
        return new SingleBetCashoutRecommendationMarket(id, product, specifier, desc, status, outcome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleBetCashoutRecommendationMarket)) {
            return false;
        }
        SingleBetCashoutRecommendationMarket singleBetCashoutRecommendationMarket = (SingleBetCashoutRecommendationMarket) other;
        return Intrinsics.g(this.id, singleBetCashoutRecommendationMarket.id) && Intrinsics.g(this.product, singleBetCashoutRecommendationMarket.product) && Intrinsics.g(this.specifier, singleBetCashoutRecommendationMarket.specifier) && Intrinsics.g(this.desc, singleBetCashoutRecommendationMarket.desc) && Intrinsics.g(this.status, singleBetCashoutRecommendationMarket.status) && Intrinsics.g(this.outcome, singleBetCashoutRecommendationMarket.outcome);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final SingleBetCashoutRecommendationOutcome getOutcome() {
        return this.outcome;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.product;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.specifier;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome = this.outcome;
        return iHashCode5 + (singleBetCashoutRecommendationOutcome != null ? singleBetCashoutRecommendationOutcome.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        Integer num = this.product;
        String str2 = this.specifier;
        String str3 = this.desc;
        Integer num2 = this.status;
        SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome = this.outcome;
        StringBuilder sbA = ew7.a(num, "SingleBetCashoutRecommendationMarket(id=", str, ", product=", ", specifier=");
        hxa.c(sbA, str2, ", desc=", str3, ", status=");
        sbA.append(num2);
        sbA.append(", outcome=");
        sbA.append(singleBetCashoutRecommendationOutcome);
        sbA.append(")");
        return sbA.toString();
    }
}
