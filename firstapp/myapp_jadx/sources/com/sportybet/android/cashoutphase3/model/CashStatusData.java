package com.sportybet.android.cashoutphase3.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.data.OutcomeSocket;
import defpackage.cv7;
import defpackage.m2g;
import defpackage.ng1;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0086\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010+J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\tHÖ\u0081\u0004J\n\u00100\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001d\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fÊ\u0001\u0002\b2Ê\u0001\f\b3\u0012\b\b4\u0012\u0004\b\u0003\u0010\u0002¨\u00061"}, d2 = {"Lcom/sportybet/android/cashoutphase3/model/CashStatusData;", "", "topic", "", "product", "pushTime", "", "suspendedReason", "cashOutStatus", "", AnalyticsParam.EVENT_STATUS, "lastOddsChangeTime", "outcomes", "", "Lcom/sportybet/android/data/OutcomeSocket;", "winningOutcomes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)V", "getTopic", "()Ljava/lang/String;", "getProduct", "getPushTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSuspendedReason", "getCashOutStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "getLastOddsChangeTime", "getOutcomes", "()Ljava/util/List;", "getWinningOutcomes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)Lcom/sportybet/android/cashoutphase3/model/CashStatusData;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashStatusData {
    public static final int $stable = 0;
    private final Integer cashOutStatus;
    private final Long lastOddsChangeTime;
    private final List<OutcomeSocket> outcomes;
    private final String product;
    private final Long pushTime;
    private final Integer status;
    private final String suspendedReason;
    private final String topic;
    private final List<String> winningOutcomes;

    public CashStatusData(String str, String str2, Long l, String str3, Integer num, Integer num2, Long l2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l, str3, num, num2, l2, (i & 128) != 0 ? m2g.a : list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashStatusData copy$default(CashStatusData cashStatusData, String str, String str2, Long l, String str3, Integer num, Integer num2, Long l2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashStatusData.topic;
        }
        if ((i & 2) != 0) {
            str2 = cashStatusData.product;
        }
        if ((i & 4) != 0) {
            l = cashStatusData.pushTime;
        }
        if ((i & 8) != 0) {
            str3 = cashStatusData.suspendedReason;
        }
        if ((i & 16) != 0) {
            num = cashStatusData.cashOutStatus;
        }
        if ((i & 32) != 0) {
            num2 = cashStatusData.status;
        }
        if ((i & 64) != 0) {
            l2 = cashStatusData.lastOddsChangeTime;
        }
        if ((i & 128) != 0) {
            list = cashStatusData.outcomes;
        }
        if ((i & 256) != 0) {
            list2 = cashStatusData.winningOutcomes;
        }
        List list3 = list;
        List list4 = list2;
        Integer num3 = num2;
        Long l3 = l2;
        Integer num4 = num;
        Long l4 = l;
        return cashStatusData.copy(str, str2, l4, str3, num4, num3, l3, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPushTime() {
        return this.pushTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final List<OutcomeSocket> component8() {
        return this.outcomes;
    }

    public final List<String> component9() {
        return this.winningOutcomes;
    }

    public final CashStatusData copy(String topic, String product, Long pushTime, String suspendedReason, Integer cashOutStatus, Integer status, Long lastOddsChangeTime, List<OutcomeSocket> outcomes, List<String> winningOutcomes) {
        return new CashStatusData(topic, product, pushTime, suspendedReason, cashOutStatus, status, lastOddsChangeTime, outcomes, winningOutcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashStatusData)) {
            return false;
        }
        CashStatusData cashStatusData = (CashStatusData) other;
        return Intrinsics.g(this.topic, cashStatusData.topic) && Intrinsics.g(this.product, cashStatusData.product) && Intrinsics.g(this.pushTime, cashStatusData.pushTime) && Intrinsics.g(this.suspendedReason, cashStatusData.suspendedReason) && Intrinsics.g(this.cashOutStatus, cashStatusData.cashOutStatus) && Intrinsics.g(this.status, cashStatusData.status) && Intrinsics.g(this.lastOddsChangeTime, cashStatusData.lastOddsChangeTime) && Intrinsics.g(this.outcomes, cashStatusData.outcomes) && Intrinsics.g(this.winningOutcomes, cashStatusData.winningOutcomes);
    }

    public final Integer getCashOutStatus() {
        return this.cashOutStatus;
    }

    public final Long getLastOddsChangeTime() {
        return this.lastOddsChangeTime;
    }

    public final List<OutcomeSocket> getOutcomes() {
        return this.outcomes;
    }

    public final String getProduct() {
        return this.product;
    }

    public final Long getPushTime() {
        return this.pushTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getSuspendedReason() {
        return this.suspendedReason;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final List<String> getWinningOutcomes() {
        return this.winningOutcomes;
    }

    public int hashCode() {
        String str = this.topic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.product;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.pushTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.suspendedReason;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.cashOutStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.lastOddsChangeTime;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<OutcomeSocket> list = this.outcomes;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.winningOutcomes;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.topic;
        String str2 = this.product;
        Long l = this.pushTime;
        String str3 = this.suspendedReason;
        Integer num = this.cashOutStatus;
        Integer num2 = this.status;
        Long l2 = this.lastOddsChangeTime;
        List<OutcomeSocket> list = this.outcomes;
        List<String> list2 = this.winningOutcomes;
        StringBuilder sbA = ux5.a("CashStatusData(topic=", str, ", product=", str2, ", pushTime=");
        sbA.append(l);
        sbA.append(", suspendedReason=");
        sbA.append(str3);
        sbA.append(", cashOutStatus=");
        cv7.a(sbA, num, ", status=", num2, ", lastOddsChangeTime=");
        sbA.append(l2);
        sbA.append(", outcomes=");
        sbA.append(list);
        sbA.append(", winningOutcomes=");
        return ng1.a(sbA, list2, ")");
    }

    public CashStatusData(String str, String str2, Long l, String str3, Integer num, Integer num2, Long l2, List<OutcomeSocket> list, List<String> list2) {
        this.topic = str;
        this.product = str2;
        this.pushTime = l;
        this.suspendedReason = str3;
        this.cashOutStatus = num;
        this.status = num2;
        this.lastOddsChangeTime = l2;
        this.outcomes = list;
        this.winningOutcomes = list2;
    }
}
