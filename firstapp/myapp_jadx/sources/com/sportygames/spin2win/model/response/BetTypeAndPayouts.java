package com.sportygames.spin2win.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/sportygames/spin2win/model/response/BetTypeAndPayouts;", "", AnalyticsParam.EVENT_PARAM_ID, "", "betTitle", "", "betCategory", "betType", "isActive", "", "payMultiplier", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBetTitle", "()Ljava/lang/String;", "getBetCategory", "getBetType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPayMultiplier", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)Lcom/sportygames/spin2win/model/response/BetTypeAndPayouts;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetTypeAndPayouts {
    public static final int $stable = 0;
    private final String betCategory;
    private final String betTitle;
    private final String betType;
    private final Integer id;
    private final Boolean isActive;
    private final Double payMultiplier;

    public BetTypeAndPayouts(Integer num, String str, String str2, String str3, Boolean bool, Double d) {
        this.id = num;
        this.betTitle = str;
        this.betCategory = str2;
        this.betType = str3;
        this.isActive = bool;
        this.payMultiplier = d;
    }

    public static /* synthetic */ BetTypeAndPayouts copy$default(BetTypeAndPayouts betTypeAndPayouts, Integer num, String str, String str2, String str3, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            num = betTypeAndPayouts.id;
        }
        if ((i & 2) != 0) {
            str = betTypeAndPayouts.betTitle;
        }
        if ((i & 4) != 0) {
            str2 = betTypeAndPayouts.betCategory;
        }
        if ((i & 8) != 0) {
            str3 = betTypeAndPayouts.betType;
        }
        if ((i & 16) != 0) {
            bool = betTypeAndPayouts.isActive;
        }
        if ((i & 32) != 0) {
            d = betTypeAndPayouts.payMultiplier;
        }
        Boolean bool2 = bool;
        Double d2 = d;
        return betTypeAndPayouts.copy(num, str, str2, str3, bool2, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetTitle() {
        return this.betTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetCategory() {
        return this.betCategory;
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
    public final Double getPayMultiplier() {
        return this.payMultiplier;
    }

    public final BetTypeAndPayouts copy(Integer id, String betTitle, String betCategory, String betType, Boolean isActive, Double payMultiplier) {
        return new BetTypeAndPayouts(id, betTitle, betCategory, betType, isActive, payMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeAndPayouts)) {
            return false;
        }
        BetTypeAndPayouts betTypeAndPayouts = (BetTypeAndPayouts) other;
        return Intrinsics.g(this.id, betTypeAndPayouts.id) && Intrinsics.g(this.betTitle, betTypeAndPayouts.betTitle) && Intrinsics.g(this.betCategory, betTypeAndPayouts.betCategory) && Intrinsics.g(this.betType, betTypeAndPayouts.betType) && Intrinsics.g(this.isActive, betTypeAndPayouts.isActive) && Intrinsics.g(this.payMultiplier, betTypeAndPayouts.payMultiplier);
    }

    public final String getBetCategory() {
        return this.betCategory;
    }

    public final String getBetTitle() {
        return this.betTitle;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Double getPayMultiplier() {
        return this.payMultiplier;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.betTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.betCategory;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.betType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isActive;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.payMultiplier;
        return iHashCode5 + (d != null ? d.hashCode() : 0);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        Integer num = this.id;
        String str = this.betTitle;
        String str2 = this.betCategory;
        String str3 = this.betType;
        Boolean bool = this.isActive;
        Double d = this.payMultiplier;
        StringBuilder sbA = pq6.a(num, "BetTypeAndPayouts(id=", ", betTitle=", str, ", betCategory=");
        hxa.c(sbA, str2, ", betType=", str3, ", isActive=");
        sbA.append(bool);
        sbA.append(", payMultiplier=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }
}
