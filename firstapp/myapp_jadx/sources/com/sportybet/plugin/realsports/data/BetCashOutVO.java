package com.sportybet.plugin.realsports.data;

import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\b\u0010\u0012Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0002¨\u0006!"}, d2 = {"Lcom/sportybet/plugin/realsports/data/BetCashOutVO;", "", "betId", "", "orderId", "userId", "currency", "usedStake", "isPartial", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBetId", "()Ljava/lang/String;", "getOrderId", "getUserId", "getCurrency", "getUsedStake", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportybet/plugin/realsports/data/BetCashOutVO;", "equals", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetCashOutVO {
    public static final int $stable = 0;
    private final String betId;
    private final String currency;
    private final Boolean isPartial;
    private final String orderId;
    private final String usedStake;
    private final String userId;

    public BetCashOutVO(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.betId = str;
        this.orderId = str2;
        this.userId = str3;
        this.currency = str4;
        this.usedStake = str5;
        this.isPartial = bool;
    }

    public static /* synthetic */ BetCashOutVO copy$default(BetCashOutVO betCashOutVO, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betCashOutVO.betId;
        }
        if ((i & 2) != 0) {
            str2 = betCashOutVO.orderId;
        }
        if ((i & 4) != 0) {
            str3 = betCashOutVO.userId;
        }
        if ((i & 8) != 0) {
            str4 = betCashOutVO.currency;
        }
        if ((i & 16) != 0) {
            str5 = betCashOutVO.usedStake;
        }
        if ((i & 32) != 0) {
            bool = betCashOutVO.isPartial;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        return betCashOutVO.copy(str, str2, str3, str4, str6, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUsedStake() {
        return this.usedStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsPartial() {
        return this.isPartial;
    }

    public final BetCashOutVO copy(String betId, String orderId, String userId, String currency, String usedStake, Boolean isPartial) {
        return new BetCashOutVO(betId, orderId, userId, currency, usedStake, isPartial);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetCashOutVO)) {
            return false;
        }
        BetCashOutVO betCashOutVO = (BetCashOutVO) other;
        return Intrinsics.g(this.betId, betCashOutVO.betId) && Intrinsics.g(this.orderId, betCashOutVO.orderId) && Intrinsics.g(this.userId, betCashOutVO.userId) && Intrinsics.g(this.currency, betCashOutVO.currency) && Intrinsics.g(this.usedStake, betCashOutVO.usedStake) && Intrinsics.g(this.isPartial, betCashOutVO.isPartial);
    }

    public final String getBetId() {
        return this.betId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getUsedStake() {
        return this.usedStake;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.betId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.usedStake;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isPartial;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isPartial() {
        return this.isPartial;
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.orderId;
        String str3 = this.userId;
        String str4 = this.currency;
        String str5 = this.usedStake;
        Boolean bool = this.isPartial;
        StringBuilder sbA = ux5.a("BetCashOutVO(betId=", str, ", orderId=", str2, ", userId=");
        hxa.c(sbA, str3, ", currency=", str4, ", usedStake=");
        sbA.append(str5);
        sbA.append(", isPartial=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }
}
