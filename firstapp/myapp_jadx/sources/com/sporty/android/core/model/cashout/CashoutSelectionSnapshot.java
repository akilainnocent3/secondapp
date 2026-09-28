package com.sporty.android.core.model.cashout;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gpp;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010$\u001a\u00020\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018Jt\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018Ê\u0001\u0002\b.¨\u0006-"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashoutSelectionSnapshot;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "marketId", AnalyticsParam.EVENT_PARAM_ID, AnalyticsParam.EVENT_STATUS, "", "odds", "marketStatus", "isOutcomeActive", "lastOddsChangeTime", "", "cashOutStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;JLjava/lang/Integer;)V", "getEventId", "()Ljava/lang/String;", "getMarketId", "getId", "getStatus", "()I", "getOdds", "getMarketStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastOddsChangeTime", "()J", "getCashOutStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;JLjava/lang/Integer;)Lcom/sporty/android/core/model/cashout/CashoutSelectionSnapshot;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashoutSelectionSnapshot {
    private final Integer cashOutStatus;
    private final String eventId;
    private final String id;
    private final Integer isOutcomeActive;
    private final long lastOddsChangeTime;
    private final String marketId;
    private final int marketStatus;
    private final String odds;
    private final int status;

    public /* synthetic */ CashoutSelectionSnapshot(String str, String str2, String str3, int i, String str4, int i2, Integer num, long j, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? 0L : j, (i3 & 256) != 0 ? null : num2);
    }

    public static /* synthetic */ CashoutSelectionSnapshot copy$default(CashoutSelectionSnapshot cashoutSelectionSnapshot, String str, String str2, String str3, int i, String str4, int i2, Integer num, long j, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cashoutSelectionSnapshot.eventId;
        }
        if ((i3 & 2) != 0) {
            str2 = cashoutSelectionSnapshot.marketId;
        }
        if ((i3 & 4) != 0) {
            str3 = cashoutSelectionSnapshot.id;
        }
        if ((i3 & 8) != 0) {
            i = cashoutSelectionSnapshot.status;
        }
        if ((i3 & 16) != 0) {
            str4 = cashoutSelectionSnapshot.odds;
        }
        if ((i3 & 32) != 0) {
            i2 = cashoutSelectionSnapshot.marketStatus;
        }
        if ((i3 & 64) != 0) {
            num = cashoutSelectionSnapshot.isOutcomeActive;
        }
        if ((i3 & 128) != 0) {
            j = cashoutSelectionSnapshot.lastOddsChangeTime;
        }
        if ((i3 & 256) != 0) {
            num2 = cashoutSelectionSnapshot.cashOutStatus;
        }
        Integer num3 = num2;
        long j2 = j;
        int i4 = i2;
        Integer num4 = num;
        String str5 = str4;
        String str6 = str3;
        return cashoutSelectionSnapshot.copy(str, str2, str6, i, str5, i4, num4, j2, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMarketStatus() {
        return this.marketStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getIsOutcomeActive() {
        return this.isOutcomeActive;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final CashoutSelectionSnapshot copy(String eventId, String marketId, String id, int status, String odds, int marketStatus, Integer isOutcomeActive, long lastOddsChangeTime, Integer cashOutStatus) {
        return new CashoutSelectionSnapshot(eventId, marketId, id, status, odds, marketStatus, isOutcomeActive, lastOddsChangeTime, cashOutStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashoutSelectionSnapshot)) {
            return false;
        }
        CashoutSelectionSnapshot cashoutSelectionSnapshot = (CashoutSelectionSnapshot) other;
        return Intrinsics.g(this.eventId, cashoutSelectionSnapshot.eventId) && Intrinsics.g(this.marketId, cashoutSelectionSnapshot.marketId) && Intrinsics.g(this.id, cashoutSelectionSnapshot.id) && this.status == cashoutSelectionSnapshot.status && Intrinsics.g(this.odds, cashoutSelectionSnapshot.odds) && this.marketStatus == cashoutSelectionSnapshot.marketStatus && Intrinsics.g(this.isOutcomeActive, cashoutSelectionSnapshot.isOutcomeActive) && this.lastOddsChangeTime == cashoutSelectionSnapshot.lastOddsChangeTime && Intrinsics.g(this.cashOutStatus, cashoutSelectionSnapshot.cashOutStatus);
    }

    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final int getMarketStatus() {
        return this.marketStatus;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iA = gpp.a(this.status, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.odds;
        int iA2 = gpp.a(this.marketStatus, (iA + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Integer num = this.isOutcomeActive;
        int iA3 = f87.a((iA2 + (num == null ? 0 : num.hashCode())) * 31, this.lastOddsChangeTime, 31);
        Integer num2 = this.cashOutStatus;
        return iA3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Integer isOutcomeActive() {
        return this.isOutcomeActive;
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.marketId;
        String str3 = this.id;
        int i = this.status;
        String str4 = this.odds;
        int i2 = this.marketStatus;
        Integer num = this.isOutcomeActive;
        long j = this.lastOddsChangeTime;
        Integer num2 = this.cashOutStatus;
        StringBuilder sbA = ux5.a("CashoutSelectionSnapshot(eventId=", str, ", marketId=", str2, ", id=");
        wxa.b(i, str3, ", status=", ", odds=", sbA);
        wxa.b(i2, str4, ", marketStatus=", ", isOutcomeActive=", sbA);
        sbA.append(num);
        sbA.append(", lastOddsChangeTime=");
        sbA.append(j);
        sbA.append(", cashOutStatus=");
        sbA.append(num2);
        sbA.append(")");
        return sbA.toString();
    }

    public CashoutSelectionSnapshot(String str, String str2, String str3, int i, String str4, int i2, Integer num, long j, Integer num2) {
        this.eventId = str;
        this.marketId = str2;
        this.id = str3;
        this.status = i;
        this.odds = str4;
        this.marketStatus = i2;
        this.isOutcomeActive = num;
        this.lastOddsChangeTime = j;
        this.cashOutStatus = num2;
    }

    public CashoutSelectionSnapshot() {
        this(null, null, null, 0, null, 0, null, 0L, null, 511, null);
    }
}
