package com.sportygames.pocketrocket.model.response;

import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/CashoutException;", "", "betId", "", "bizCode", "", "rocketType", "", "exMessage", "roundId", "<init>", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBetId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBizCode", "()I", "getRocketType", "()Ljava/lang/String;", "getExMessage", "getRoundId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/sportygames/pocketrocket/model/response/CashoutException;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashoutException {
    public static final int $stable = 0;
    private final Long betId;
    private final int bizCode;
    private final String exMessage;
    private final String rocketType;
    private final Long roundId;

    public /* synthetic */ CashoutException(Long l, int i, String str, String str2, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : l, i, (i2 & 4) != 0 ? "" : str, str2, (i2 & 16) != 0 ? 0L : l2);
    }

    public static /* synthetic */ CashoutException copy$default(CashoutException cashoutException, Long l, int i, String str, String str2, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = cashoutException.betId;
        }
        if ((i2 & 2) != 0) {
            i = cashoutException.bizCode;
        }
        if ((i2 & 4) != 0) {
            str = cashoutException.rocketType;
        }
        if ((i2 & 8) != 0) {
            str2 = cashoutException.exMessage;
        }
        if ((i2 & 16) != 0) {
            l2 = cashoutException.roundId;
        }
        Long l3 = l2;
        String str3 = str;
        return cashoutException.copy(l, i, str3, str2, l3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRocketType() {
        return this.rocketType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExMessage() {
        return this.exMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRoundId() {
        return this.roundId;
    }

    public final CashoutException copy(Long betId, int bizCode, String rocketType, String exMessage, Long roundId) {
        exMessage.getClass();
        return new CashoutException(betId, bizCode, rocketType, exMessage, roundId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutException)) {
            return false;
        }
        CashoutException cashoutException = (CashoutException) other;
        return Intrinsics.g(this.betId, cashoutException.betId) && this.bizCode == cashoutException.bizCode && Intrinsics.g(this.rocketType, cashoutException.rocketType) && Intrinsics.g(this.exMessage, cashoutException.exMessage) && Intrinsics.g(this.roundId, cashoutException.roundId);
    }

    public final Long getBetId() {
        return this.betId;
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final String getExMessage() {
        return this.exMessage;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final Long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        Long l = this.betId;
        int iA = gpp.a(this.bizCode, (l == null ? 0 : l.hashCode()) * 31, 31);
        String str = this.rocketType;
        int iA2 = gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.exMessage);
        Long l2 = this.roundId;
        return iA2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        Long l = this.betId;
        int i = this.bizCode;
        String str = this.rocketType;
        String str2 = this.exMessage;
        Long l2 = this.roundId;
        StringBuilder sb = new StringBuilder("CashoutException(betId=");
        sb.append(l);
        sb.append(", bizCode=");
        sb.append(i);
        sb.append(", rocketType=");
        hxa.c(sb, str, ", exMessage=", str2, ", roundId=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }

    public CashoutException(Long l, int i, String str, String str2, Long l2) {
        str2.getClass();
        this.betId = l;
        this.bizCode = i;
        this.rocketType = str;
        this.exMessage = str2;
        this.roundId = l2;
    }
}
