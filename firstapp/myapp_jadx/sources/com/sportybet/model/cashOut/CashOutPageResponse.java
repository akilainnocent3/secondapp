package com.sportybet.model.cashOut;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallback;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Bet;
import defpackage.ai50;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.m2g;
import defpackage.qpu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R%\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006%"}, d2 = {"Lcom/sportybet/model/cashOut/CashOutPageResponse;", "", "totalNum", "", "totalNumByEventId", "cashAbleBets", "", "Lcom/sportybet/plugin/realsports/data/Bet;", "autoCashOuts", "Lcom/sporty/android/core/model/cashout/AutoCashOut;", "cashOutFallback", "Lcom/sporty/android/core/model/cashout/CashOutFallback;", "<init>", "(IILjava/util/List;Ljava/util/List;Lcom/sporty/android/core/model/cashout/CashOutFallback;)V", "getTotalNum", "()I", "getTotalNumByEventId", "getCashAbleBets", "()Ljava/util/List;", "getAutoCashOuts", "getCashOutFallback", "()Lcom/sporty/android/core/model/cashout/CashOutFallback;", "Lcom/google/gson/annotations/SerializedName;", "value", AnalyticsParam.DATA_FALLBACK, "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutPageResponse {
    public static final int $stable = 8;
    private final List<AutoCashOut> autoCashOuts;
    private final List<Bet> cashAbleBets;

    @SerializedName(AnalyticsParam.DATA_FALLBACK)
    private final CashOutFallback cashOutFallback;
    private final int totalNum;
    private final int totalNumByEventId;

    public CashOutPageResponse(int i, int i2, List list, List list2, CashOutFallback cashOutFallback, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? m2g.a : list, (i3 & 8) != 0 ? m2g.a : list2, (i3 & 16) != 0 ? new CashOutFallback(null, null, null, null, null, null, null, null, 255, null) : cashOutFallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutPageResponse copy$default(CashOutPageResponse cashOutPageResponse, int i, int i2, List list, List list2, CashOutFallback cashOutFallback, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cashOutPageResponse.totalNum;
        }
        if ((i3 & 2) != 0) {
            i2 = cashOutPageResponse.totalNumByEventId;
        }
        if ((i3 & 4) != 0) {
            list = cashOutPageResponse.cashAbleBets;
        }
        if ((i3 & 8) != 0) {
            list2 = cashOutPageResponse.autoCashOuts;
        }
        if ((i3 & 16) != 0) {
            cashOutFallback = cashOutPageResponse.cashOutFallback;
        }
        CashOutFallback cashOutFallback2 = cashOutFallback;
        List list3 = list;
        return cashOutPageResponse.copy(i, i2, list3, list2, cashOutFallback2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalNumByEventId() {
        return this.totalNumByEventId;
    }

    public final List<Bet> component3() {
        return this.cashAbleBets;
    }

    public final List<AutoCashOut> component4() {
        return this.autoCashOuts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CashOutFallback getCashOutFallback() {
        return this.cashOutFallback;
    }

    public final CashOutPageResponse copy(int totalNum, int totalNumByEventId, List<? extends Bet> cashAbleBets, List<? extends AutoCashOut> autoCashOuts, CashOutFallback cashOutFallback) {
        cashAbleBets.getClass();
        autoCashOuts.getClass();
        cashOutFallback.getClass();
        return new CashOutPageResponse(totalNum, totalNumByEventId, cashAbleBets, autoCashOuts, cashOutFallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutPageResponse)) {
            return false;
        }
        CashOutPageResponse cashOutPageResponse = (CashOutPageResponse) other;
        return this.totalNum == cashOutPageResponse.totalNum && this.totalNumByEventId == cashOutPageResponse.totalNumByEventId && Intrinsics.g(this.cashAbleBets, cashOutPageResponse.cashAbleBets) && Intrinsics.g(this.autoCashOuts, cashOutPageResponse.autoCashOuts) && Intrinsics.g(this.cashOutFallback, cashOutPageResponse.cashOutFallback);
    }

    public final List<AutoCashOut> getAutoCashOuts() {
        return this.autoCashOuts;
    }

    public final List<Bet> getCashAbleBets() {
        return this.cashAbleBets;
    }

    public final CashOutFallback getCashOutFallback() {
        return this.cashOutFallback;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public final int getTotalNumByEventId() {
        return this.totalNumByEventId;
    }

    public int hashCode() {
        return this.cashOutFallback.hashCode() + ai50.a(ai50.a(gpp.a(this.totalNumByEventId, Integer.hashCode(this.totalNum) * 31, 31), 31, this.cashAbleBets), 31, this.autoCashOuts);
    }

    public String toString() {
        int i = this.totalNum;
        int i2 = this.totalNumByEventId;
        List<Bet> list = this.cashAbleBets;
        List<AutoCashOut> list2 = this.autoCashOuts;
        CashOutFallback cashOutFallback = this.cashOutFallback;
        StringBuilder sbA = dy5.a("CashOutPageResponse(totalNum=", i, i2, ", totalNumByEventId=", ", cashAbleBets=");
        qpu.a(", autoCashOuts=", ", cashOutFallback=", sbA, list, list2);
        sbA.append(cashOutFallback);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashOutPageResponse(int i, int i2, List<? extends Bet> list, List<? extends AutoCashOut> list2, CashOutFallback cashOutFallback) {
        list.getClass();
        list2.getClass();
        cashOutFallback.getClass();
        this.totalNum = i;
        this.totalNumByEventId = i2;
        this.cashAbleBets = list;
        this.autoCashOuts = list2;
        this.cashOutFallback = cashOutFallback;
    }

    public CashOutPageResponse() {
        this(0, 0, null, null, null, 31, null);
    }
}
