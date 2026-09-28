package com.sportygames.chat.remote.models;

import defpackage.cv7;
import defpackage.ry4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/sportygames/chat/remote/models/ClaimErrorParams;", "", "wagerPeriodMinutes", "", "minimumWagerAmount", "", "minimumBalance", "currency", "", "claimLimitation", "claimLimitationPeriod", "minimumCashoutCoefficient", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "getWagerPeriodMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinimumWagerAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinimumBalance", "getCurrency", "()Ljava/lang/String;", "getClaimLimitation", "getClaimLimitationPeriod", "getMinimumCashoutCoefficient", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/sportygames/chat/remote/models/ClaimErrorParams;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClaimErrorParams {
    public static final int $stable = 0;
    private final Integer claimLimitation;
    private final Integer claimLimitationPeriod;
    private final String currency;
    private final Double minimumBalance;
    private final Float minimumCashoutCoefficient;
    private final Double minimumWagerAmount;
    private final Integer wagerPeriodMinutes;

    public ClaimErrorParams(Integer num, Double d, Double d2, String str, Integer num2, Integer num3, Float f) {
        this.wagerPeriodMinutes = num;
        this.minimumWagerAmount = d;
        this.minimumBalance = d2;
        this.currency = str;
        this.claimLimitation = num2;
        this.claimLimitationPeriod = num3;
        this.minimumCashoutCoefficient = f;
    }

    public static /* synthetic */ ClaimErrorParams copy$default(ClaimErrorParams claimErrorParams, Integer num, Double d, Double d2, String str, Integer num2, Integer num3, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            num = claimErrorParams.wagerPeriodMinutes;
        }
        if ((i & 2) != 0) {
            d = claimErrorParams.minimumWagerAmount;
        }
        if ((i & 4) != 0) {
            d2 = claimErrorParams.minimumBalance;
        }
        if ((i & 8) != 0) {
            str = claimErrorParams.currency;
        }
        if ((i & 16) != 0) {
            num2 = claimErrorParams.claimLimitation;
        }
        if ((i & 32) != 0) {
            num3 = claimErrorParams.claimLimitationPeriod;
        }
        if ((i & 64) != 0) {
            f = claimErrorParams.minimumCashoutCoefficient;
        }
        Integer num4 = num3;
        Float f2 = f;
        Integer num5 = num2;
        Double d3 = d2;
        return claimErrorParams.copy(num, d, d3, str, num5, num4, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getWagerPeriodMinutes() {
        return this.wagerPeriodMinutes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMinimumWagerAmount() {
        return this.minimumWagerAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getMinimumBalance() {
        return this.minimumBalance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getClaimLimitation() {
        return this.claimLimitation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getClaimLimitationPeriod() {
        return this.claimLimitationPeriod;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getMinimumCashoutCoefficient() {
        return this.minimumCashoutCoefficient;
    }

    public final ClaimErrorParams copy(Integer wagerPeriodMinutes, Double minimumWagerAmount, Double minimumBalance, String currency, Integer claimLimitation, Integer claimLimitationPeriod, Float minimumCashoutCoefficient) {
        return new ClaimErrorParams(wagerPeriodMinutes, minimumWagerAmount, minimumBalance, currency, claimLimitation, claimLimitationPeriod, minimumCashoutCoefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimErrorParams)) {
            return false;
        }
        ClaimErrorParams claimErrorParams = (ClaimErrorParams) other;
        return Intrinsics.g(this.wagerPeriodMinutes, claimErrorParams.wagerPeriodMinutes) && Intrinsics.g(this.minimumWagerAmount, claimErrorParams.minimumWagerAmount) && Intrinsics.g(this.minimumBalance, claimErrorParams.minimumBalance) && Intrinsics.g(this.currency, claimErrorParams.currency) && Intrinsics.g(this.claimLimitation, claimErrorParams.claimLimitation) && Intrinsics.g(this.claimLimitationPeriod, claimErrorParams.claimLimitationPeriod) && Intrinsics.g(this.minimumCashoutCoefficient, claimErrorParams.minimumCashoutCoefficient);
    }

    public final Integer getClaimLimitation() {
        return this.claimLimitation;
    }

    public final Integer getClaimLimitationPeriod() {
        return this.claimLimitationPeriod;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getMinimumBalance() {
        return this.minimumBalance;
    }

    public final Float getMinimumCashoutCoefficient() {
        return this.minimumCashoutCoefficient;
    }

    public final Double getMinimumWagerAmount() {
        return this.minimumWagerAmount;
    }

    public final Integer getWagerPeriodMinutes() {
        return this.wagerPeriodMinutes;
    }

    public int hashCode() {
        Integer num = this.wagerPeriodMinutes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.minimumWagerAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minimumBalance;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.claimLimitation;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.claimLimitationPeriod;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.minimumCashoutCoefficient;
        return iHashCode6 + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.wagerPeriodMinutes;
        Double d = this.minimumWagerAmount;
        Double d2 = this.minimumBalance;
        String str = this.currency;
        Integer num2 = this.claimLimitation;
        Integer num3 = this.claimLimitationPeriod;
        Float f = this.minimumCashoutCoefficient;
        StringBuilder sb = new StringBuilder("ClaimErrorParams(wagerPeriodMinutes=");
        sb.append(num);
        sb.append(", minimumWagerAmount=");
        sb.append(d);
        sb.append(", minimumBalance=");
        ry4.a(d2, ", currency=", str, ", claimLimitation=", sb);
        cv7.a(sb, num2, ", claimLimitationPeriod=", num3, ", minimumCashoutCoefficient=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
