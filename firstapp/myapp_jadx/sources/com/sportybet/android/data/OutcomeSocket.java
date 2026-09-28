package com.sportybet.android.data;

import defpackage.cv7;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0007HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0002\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\t\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012Ê\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0002¨\u0006*"}, d2 = {"Lcom/sportybet/android/data/OutcomeSocket;", "", "isWinning", "", "probability", "", "odds", "", "outcomeId", "isActive", "cashOutIsActive", "refundFactor", "voidProbability", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProbability", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOdds", "()Ljava/lang/String;", "getOutcomeId", "getCashOutIsActive", "getRefundFactor", "getVoidProbability", "getIsOutcomeActive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sportybet/android/data/OutcomeSocket;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutcomeSocket {
    public static final int $stable = 0;
    private final Integer cashOutIsActive;
    private final Integer isActive;
    private final Integer isWinning;
    private final String odds;
    private final String outcomeId;
    private final Double probability;
    private final Double refundFactor;
    private final Double voidProbability;

    public /* synthetic */ OutcomeSocket(Integer num, Double d, String str, String str2, Integer num2, Integer num3, Double d2, Double d3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, d, str, str2, num2, num3, d2, (i & 128) != 0 ? null : d3);
    }

    public static /* synthetic */ OutcomeSocket copy$default(OutcomeSocket outcomeSocket, Integer num, Double d, String str, String str2, Integer num2, Integer num3, Double d2, Double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = outcomeSocket.isWinning;
        }
        if ((i & 2) != 0) {
            d = outcomeSocket.probability;
        }
        if ((i & 4) != 0) {
            str = outcomeSocket.odds;
        }
        if ((i & 8) != 0) {
            str2 = outcomeSocket.outcomeId;
        }
        if ((i & 16) != 0) {
            num2 = outcomeSocket.isActive;
        }
        if ((i & 32) != 0) {
            num3 = outcomeSocket.cashOutIsActive;
        }
        if ((i & 64) != 0) {
            d2 = outcomeSocket.refundFactor;
        }
        if ((i & 128) != 0) {
            d3 = outcomeSocket.voidProbability;
        }
        Double d4 = d2;
        Double d5 = d3;
        Integer num4 = num2;
        Integer num5 = num3;
        return outcomeSocket.copy(num, d, str, str2, num4, num5, d4, d5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getIsWinning() {
        return this.isWinning;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCashOutIsActive() {
        return this.cashOutIsActive;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getRefundFactor() {
        return this.refundFactor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getVoidProbability() {
        return this.voidProbability;
    }

    public final OutcomeSocket copy(Integer isWinning, Double probability, String odds, String outcomeId, Integer isActive, Integer cashOutIsActive, Double refundFactor, Double voidProbability) {
        return new OutcomeSocket(isWinning, probability, odds, outcomeId, isActive, cashOutIsActive, refundFactor, voidProbability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomeSocket)) {
            return false;
        }
        OutcomeSocket outcomeSocket = (OutcomeSocket) other;
        return Intrinsics.g(this.isWinning, outcomeSocket.isWinning) && Intrinsics.g(this.probability, outcomeSocket.probability) && Intrinsics.g(this.odds, outcomeSocket.odds) && Intrinsics.g(this.outcomeId, outcomeSocket.outcomeId) && Intrinsics.g(this.isActive, outcomeSocket.isActive) && Intrinsics.g(this.cashOutIsActive, outcomeSocket.cashOutIsActive) && Intrinsics.g(this.refundFactor, outcomeSocket.refundFactor) && Intrinsics.g(this.voidProbability, outcomeSocket.voidProbability);
    }

    public final Integer getCashOutIsActive() {
        return this.cashOutIsActive;
    }

    public final int getIsOutcomeActive() {
        Integer num;
        Integer num2 = this.isActive;
        return ((num2 != null && num2.intValue() == 1) || ((num = this.cashOutIsActive) != null && num.intValue() == 1)) ? 1 : 0;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final Double getProbability() {
        return this.probability;
    }

    public final Double getRefundFactor() {
        return this.refundFactor;
    }

    public final Double getVoidProbability() {
        return this.voidProbability;
    }

    public int hashCode() {
        Integer num = this.isWinning;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.probability;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.odds;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.outcomeId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.isActive;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.cashOutIsActive;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.refundFactor;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.voidProbability;
        return iHashCode7 + (d3 != null ? d3.hashCode() : 0);
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public final Integer isWinning() {
        return this.isWinning;
    }

    public String toString() {
        Integer num = this.isWinning;
        Double d = this.probability;
        String str = this.odds;
        String str2 = this.outcomeId;
        Integer num2 = this.isActive;
        Integer num3 = this.cashOutIsActive;
        Double d2 = this.refundFactor;
        Double d3 = this.voidProbability;
        StringBuilder sb = new StringBuilder("OutcomeSocket(isWinning=");
        sb.append(num);
        sb.append(", probability=");
        sb.append(d);
        sb.append(", odds=");
        hxa.c(sb, str, ", outcomeId=", str2, ", isActive=");
        cv7.a(sb, num2, ", cashOutIsActive=", num3, ", refundFactor=");
        sb.append(d2);
        sb.append(", voidProbability=");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public OutcomeSocket(Integer num, Double d, String str, String str2, Integer num2, Integer num3, Double d2, Double d3) {
        this.isWinning = num;
        this.probability = d;
        this.odds = str;
        this.outcomeId = str2;
        this.isActive = num2;
        this.cashOutIsActive = num3;
        this.refundFactor = d2;
        this.voidProbability = d3;
    }
}
