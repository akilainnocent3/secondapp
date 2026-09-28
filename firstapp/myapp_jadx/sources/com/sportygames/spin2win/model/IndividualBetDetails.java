package com.sportygames.spin2win.model;

import defpackage.hxa;
import defpackage.pq6;
import defpackage.rg2;
import defpackage.s27;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/sportygames/spin2win/model/IndividualBetDetails;", "", "betTypeId", "", "betCategory", "", "betType", "colour", "stakeAmount", "", "payoutAmount", "winStatus", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getBetTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBetCategory", "()Ljava/lang/String;", "getBetType", "getColour", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPayoutAmount", "getWinStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lcom/sportygames/spin2win/model/IndividualBetDetails;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndividualBetDetails {
    public static final int $stable = 0;
    private final String betCategory;
    private final String betType;
    private final Integer betTypeId;
    private final String colour;
    private final Double payoutAmount;
    private final Double stakeAmount;
    private final Boolean winStatus;

    public IndividualBetDetails(Integer num, String str, String str2, String str3, Double d, Double d2, Boolean bool) {
        this.betTypeId = num;
        this.betCategory = str;
        this.betType = str2;
        this.colour = str3;
        this.stakeAmount = d;
        this.payoutAmount = d2;
        this.winStatus = bool;
    }

    public static /* synthetic */ IndividualBetDetails copy$default(IndividualBetDetails individualBetDetails, Integer num, String str, String str2, String str3, Double d, Double d2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = individualBetDetails.betTypeId;
        }
        if ((i & 2) != 0) {
            str = individualBetDetails.betCategory;
        }
        if ((i & 4) != 0) {
            str2 = individualBetDetails.betType;
        }
        if ((i & 8) != 0) {
            str3 = individualBetDetails.colour;
        }
        if ((i & 16) != 0) {
            d = individualBetDetails.stakeAmount;
        }
        if ((i & 32) != 0) {
            d2 = individualBetDetails.payoutAmount;
        }
        if ((i & 64) != 0) {
            bool = individualBetDetails.winStatus;
        }
        Double d3 = d2;
        Boolean bool2 = bool;
        Double d4 = d;
        String str4 = str2;
        return individualBetDetails.copy(num, str, str4, str3, d4, d3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBetTypeId() {
        return this.betTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetCategory() {
        return this.betCategory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColour() {
        return this.colour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getWinStatus() {
        return this.winStatus;
    }

    public final IndividualBetDetails copy(Integer betTypeId, String betCategory, String betType, String colour, Double stakeAmount, Double payoutAmount, Boolean winStatus) {
        return new IndividualBetDetails(betTypeId, betCategory, betType, colour, stakeAmount, payoutAmount, winStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualBetDetails)) {
            return false;
        }
        IndividualBetDetails individualBetDetails = (IndividualBetDetails) other;
        return Intrinsics.g(this.betTypeId, individualBetDetails.betTypeId) && Intrinsics.g(this.betCategory, individualBetDetails.betCategory) && Intrinsics.g(this.betType, individualBetDetails.betType) && Intrinsics.g(this.colour, individualBetDetails.colour) && Intrinsics.g(this.stakeAmount, individualBetDetails.stakeAmount) && Intrinsics.g(this.payoutAmount, individualBetDetails.payoutAmount) && Intrinsics.g(this.winStatus, individualBetDetails.winStatus);
    }

    public final String getBetCategory() {
        return this.betCategory;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final Integer getBetTypeId() {
        return this.betTypeId;
    }

    public final String getColour() {
        return this.colour;
    }

    public final Double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Boolean getWinStatus() {
        return this.winStatus;
    }

    public int hashCode() {
        Integer num = this.betTypeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.betCategory;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.betType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.colour;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.payoutAmount;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.winStatus;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.betTypeId;
        String str = this.betCategory;
        String str2 = this.betType;
        String str3 = this.colour;
        Double d = this.stakeAmount;
        Double d2 = this.payoutAmount;
        Boolean bool = this.winStatus;
        StringBuilder sbA = pq6.a(num, "IndividualBetDetails(betTypeId=", ", betCategory=", str, ", betType=");
        hxa.c(sbA, str2, ", colour=", str3, ", stakeAmount=");
        s27.a(d, d2, ", payoutAmount=", ", winStatus=", sbA);
        return rg2.a(sbA, bool, ")");
    }
}
