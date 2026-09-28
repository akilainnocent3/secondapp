package com.sporty.android.core.model.cashout;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.oie;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0006\u0010\u0011R'\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fÊ\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "isActive", "", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOdds", "getProbability", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDesc", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sporty/android/core/model/cashout/SingleBetCashoutRecommendationOutcome;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SingleBetCashoutRecommendationOutcome {

    @SerializedName("desc")
    private final String desc;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    @SerializedName("isActive")
    private final Integer isActive;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("probability")
    private final String probability;

    public SingleBetCashoutRecommendationOutcome(String str, String str2, String str3, Integer num, String str4) {
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.isActive = num;
        this.desc = str4;
    }

    public static /* synthetic */ SingleBetCashoutRecommendationOutcome copy$default(SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = singleBetCashoutRecommendationOutcome.id;
        }
        if ((i & 2) != 0) {
            str2 = singleBetCashoutRecommendationOutcome.odds;
        }
        if ((i & 4) != 0) {
            str3 = singleBetCashoutRecommendationOutcome.probability;
        }
        if ((i & 8) != 0) {
            num = singleBetCashoutRecommendationOutcome.isActive;
        }
        if ((i & 16) != 0) {
            str4 = singleBetCashoutRecommendationOutcome.desc;
        }
        String str5 = str4;
        String str6 = str3;
        return singleBetCashoutRecommendationOutcome.copy(str, str2, str6, num, str5);
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
    public final Integer getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final SingleBetCashoutRecommendationOutcome copy(String id, String odds, String probability, Integer isActive, String desc) {
        return new SingleBetCashoutRecommendationOutcome(id, odds, probability, isActive, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleBetCashoutRecommendationOutcome)) {
            return false;
        }
        SingleBetCashoutRecommendationOutcome singleBetCashoutRecommendationOutcome = (SingleBetCashoutRecommendationOutcome) other;
        return Intrinsics.g(this.id, singleBetCashoutRecommendationOutcome.id) && Intrinsics.g(this.odds, singleBetCashoutRecommendationOutcome.odds) && Intrinsics.g(this.probability, singleBetCashoutRecommendationOutcome.probability) && Intrinsics.g(this.isActive, singleBetCashoutRecommendationOutcome.isActive) && Intrinsics.g(this.desc, singleBetCashoutRecommendationOutcome.desc);
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

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.odds;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.probability;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.isActive;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.desc;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        String str3 = this.probability;
        Integer num = this.isActive;
        String str4 = this.desc;
        StringBuilder sbA = ux5.a("SingleBetCashoutRecommendationOutcome(id=", str, ", odds=", str2, ", probability=");
        oie.a(num, str3, ", isActive=", ", desc=", sbA);
        return uf80.a(sbA, str4, ")");
    }
}
