package com.sportygames.spin2win.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/sportygames/spin2win/model/response/BetAmountList;", "", AnalyticsParam.EVENT_PARAM_ID, "", "countryCode", "", "currency", "betType", "isActive", "", "maxAmount", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCountryCode", "()Ljava/lang/String;", "getCurrency", "getBetType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)Lcom/sportygames/spin2win/model/response/BetAmountList;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetAmountList {
    public static final int $stable = 0;
    private final String betType;
    private final String countryCode;
    private final String currency;
    private final Integer id;
    private final Boolean isActive;
    private final Double maxAmount;

    public BetAmountList(Integer num, String str, String str2, String str3, Boolean bool, Double d) {
        this.id = num;
        this.countryCode = str;
        this.currency = str2;
        this.betType = str3;
        this.isActive = bool;
        this.maxAmount = d;
    }

    public static /* synthetic */ BetAmountList copy$default(BetAmountList betAmountList, Integer num, String str, String str2, String str3, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            num = betAmountList.id;
        }
        if ((i & 2) != 0) {
            str = betAmountList.countryCode;
        }
        if ((i & 4) != 0) {
            str2 = betAmountList.currency;
        }
        if ((i & 8) != 0) {
            str3 = betAmountList.betType;
        }
        if ((i & 16) != 0) {
            bool = betAmountList.isActive;
        }
        if ((i & 32) != 0) {
            d = betAmountList.maxAmount;
        }
        Boolean bool2 = bool;
        Double d2 = d;
        return betAmountList.copy(num, str, str2, str3, bool2, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    public final BetAmountList copy(Integer id, String countryCode, String currency, String betType, Boolean isActive, Double maxAmount) {
        return new BetAmountList(id, countryCode, currency, betType, isActive, maxAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetAmountList)) {
            return false;
        }
        BetAmountList betAmountList = (BetAmountList) other;
        return Intrinsics.g(this.id, betAmountList.id) && Intrinsics.g(this.countryCode, betAmountList.countryCode) && Intrinsics.g(this.currency, betAmountList.currency) && Intrinsics.g(this.betType, betAmountList.betType) && Intrinsics.g(this.isActive, betAmountList.isActive) && Intrinsics.g(this.maxAmount, betAmountList.maxAmount);
    }

    public final String getBetType() {
        return this.betType;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Double getMaxAmount() {
        return this.maxAmount;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.countryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isActive;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.maxAmount;
        return iHashCode5 + (d != null ? d.hashCode() : 0);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.countryCode;
        String str2 = this.currency;
        String str3 = this.betType;
        Boolean bool = this.isActive;
        Double d = this.maxAmount;
        StringBuilder sbA = pq6.a(num, "BetAmountList(id=", ", countryCode=", str, ", currency=");
        hxa.c(sbA, str2, ", betType=", str3, ", isActive=");
        sbA.append(bool);
        sbA.append(", maxAmount=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }
}
