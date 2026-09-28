package com.sportygames.sportyherov2.remote.models;

import com.appsflyer.internal.a0;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.nrz;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/CashoutException;", "", "betIndex", "", "betId", "", "bizCode", "betTypeEnum", "", "exMessage", "roundId", "<init>", "(IJILjava/lang/String;Ljava/lang/String;J)V", "getBetIndex", "()I", "getBetId", "()J", "getBizCode", "getBetTypeEnum", "()Ljava/lang/String;", "getExMessage", "getRoundId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashoutException {
    public static final int $stable = 0;
    private final long betId;
    private final int betIndex;
    private final String betTypeEnum;
    private final int bizCode;
    private final String exMessage;
    private final long roundId;

    public CashoutException(int i, long j, int i2, String str, String str2, long j2) {
        str.getClass();
        str2.getClass();
        this.betIndex = i;
        this.betId = j;
        this.bizCode = i2;
        this.betTypeEnum = str;
        this.exMessage = str2;
        this.roundId = j2;
    }

    public static /* synthetic */ CashoutException copy$default(CashoutException cashoutException, int i, long j, int i2, String str, String str2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cashoutException.betIndex;
        }
        if ((i3 & 2) != 0) {
            j = cashoutException.betId;
        }
        if ((i3 & 4) != 0) {
            i2 = cashoutException.bizCode;
        }
        if ((i3 & 8) != 0) {
            str = cashoutException.betTypeEnum;
        }
        if ((i3 & 16) != 0) {
            str2 = cashoutException.exMessage;
        }
        if ((i3 & 32) != 0) {
            j2 = cashoutException.roundId;
        }
        String str3 = str2;
        int i4 = i2;
        return cashoutException.copy(i, j, i4, str, str3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBetTypeEnum() {
        return this.betTypeEnum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExMessage() {
        return this.exMessage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    public final CashoutException copy(int betIndex, long betId, int bizCode, String betTypeEnum, String exMessage, long roundId) {
        betTypeEnum.getClass();
        exMessage.getClass();
        return new CashoutException(betIndex, betId, bizCode, betTypeEnum, exMessage, roundId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutException)) {
            return false;
        }
        CashoutException cashoutException = (CashoutException) other;
        return this.betIndex == cashoutException.betIndex && this.betId == cashoutException.betId && this.bizCode == cashoutException.bizCode && Intrinsics.g(this.betTypeEnum, cashoutException.betTypeEnum) && Intrinsics.g(this.exMessage, cashoutException.exMessage) && this.roundId == cashoutException.roundId;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final String getBetTypeEnum() {
        return this.betTypeEnum;
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final String getExMessage() {
        return this.exMessage;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        return Long.hashCode(this.roundId) + gmf0.a(gmf0.a(gpp.a(this.bizCode, f87.a(Integer.hashCode(this.betIndex) * 31, this.betId, 31), 31), 31, this.betTypeEnum), 31, this.exMessage);
    }

    public String toString() {
        int i = this.betIndex;
        long j = this.betId;
        int i2 = this.bizCode;
        String str = this.betTypeEnum;
        String str2 = this.exMessage;
        long j2 = this.roundId;
        StringBuilder sbA = a0.a("CashoutException(betIndex=", ", betId=", i, j);
        sbA.append(", bizCode=");
        sbA.append(i2);
        sbA.append(", betTypeEnum=");
        sbA.append(str);
        u4.a(sbA, yFmFZvuWxAYfEj.QKWKjqTZuFGTH, str2, ", roundId=");
        return nrz.a(j2, ")", sbA);
    }
}
