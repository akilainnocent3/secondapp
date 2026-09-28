package com.sportybet.model.cashOut;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallback;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import defpackage.ai50;
import defpackage.gfs;
import defpackage.gmf0;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0014\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010)\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bÊ\u0001\u0002\b+Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0000¨\u0006*"}, d2 = {"Lcom/sportybet/model/cashOut/CashOutFilterPageResponse;", "", "totalNum", "", "cashAbleBets", "", "Lcom/sportybet/plugin/realsports/data/Bet;", "autoCashOuts", "Lcom/sporty/android/core/model/cashout/AutoCashOut;", "lastBetId", "", "moreBets", "", "cashOutFallback", "Lcom/sporty/android/core/model/cashout/CashOutFallback;", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/sporty/android/core/model/cashout/CashOutFallback;)V", "getTotalNum", "()I", "getCashAbleBets", "()Ljava/util/List;", "getAutoCashOuts", "getLastBetId", "()Ljava/lang/String;", "getMoreBets", "()Z", "getCashOutFallback", "()Lcom/sporty/android/core/model/cashout/CashOutFallback;", "Lcom/google/gson/annotations/SerializedName;", "value", AnalyticsParam.DATA_FALLBACK, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutFilterPageResponse {
    public static final int $stable = 8;
    private final List<AutoCashOut> autoCashOuts;
    private final List<Bet> cashAbleBets;

    @SerializedName(AnalyticsParam.DATA_FALLBACK)
    private final CashOutFallback cashOutFallback;
    private final String lastBetId;
    private final boolean moreBets;
    private final int totalNum;

    public /* synthetic */ CashOutFilterPageResponse(int i, List list, List list2, String str, boolean z, CashOutFallback cashOutFallback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, str, z, (i2 & 32) != 0 ? new CashOutFallback(null, null, null, null, null, null, null, null, 255, null) : cashOutFallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutFilterPageResponse copy$default(CashOutFilterPageResponse cashOutFilterPageResponse, int i, List list, List list2, String str, boolean z, CashOutFallback cashOutFallback, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cashOutFilterPageResponse.totalNum;
        }
        if ((i2 & 2) != 0) {
            list = cashOutFilterPageResponse.cashAbleBets;
        }
        if ((i2 & 4) != 0) {
            list2 = cashOutFilterPageResponse.autoCashOuts;
        }
        if ((i2 & 8) != 0) {
            str = cashOutFilterPageResponse.lastBetId;
        }
        if ((i2 & 16) != 0) {
            z = cashOutFilterPageResponse.moreBets;
        }
        if ((i2 & 32) != 0) {
            cashOutFallback = cashOutFilterPageResponse.cashOutFallback;
        }
        boolean z2 = z;
        CashOutFallback cashOutFallback2 = cashOutFallback;
        return cashOutFilterPageResponse.copy(i, list, list2, str, z2, cashOutFallback2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    public final List<Bet> component2() {
        return this.cashAbleBets;
    }

    public final List<AutoCashOut> component3() {
        return this.autoCashOuts;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastBetId() {
        return this.lastBetId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMoreBets() {
        return this.moreBets;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CashOutFallback getCashOutFallback() {
        return this.cashOutFallback;
    }

    public final CashOutFilterPageResponse copy(int totalNum, List<? extends Bet> cashAbleBets, List<? extends AutoCashOut> autoCashOuts, String lastBetId, boolean moreBets, CashOutFallback cashOutFallback) {
        cashAbleBets.getClass();
        autoCashOuts.getClass();
        lastBetId.getClass();
        cashOutFallback.getClass();
        return new CashOutFilterPageResponse(totalNum, cashAbleBets, autoCashOuts, lastBetId, moreBets, cashOutFallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutFilterPageResponse)) {
            return false;
        }
        CashOutFilterPageResponse cashOutFilterPageResponse = (CashOutFilterPageResponse) other;
        return this.totalNum == cashOutFilterPageResponse.totalNum && Intrinsics.g(this.cashAbleBets, cashOutFilterPageResponse.cashAbleBets) && Intrinsics.g(this.autoCashOuts, cashOutFilterPageResponse.autoCashOuts) && Intrinsics.g(this.lastBetId, cashOutFilterPageResponse.lastBetId) && this.moreBets == cashOutFilterPageResponse.moreBets && Intrinsics.g(this.cashOutFallback, cashOutFilterPageResponse.cashOutFallback);
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

    public final String getLastBetId() {
        return this.lastBetId;
    }

    public final boolean getMoreBets() {
        return this.moreBets;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return this.cashOutFallback.hashCode() + mtg0.a(gmf0.a(ai50.a(ai50.a(Integer.hashCode(this.totalNum) * 31, 31, this.cashAbleBets), 31, this.autoCashOuts), 31, this.lastBetId), 31, this.moreBets);
    }

    public String toString() {
        int i = this.totalNum;
        List<Bet> list = this.cashAbleBets;
        List<AutoCashOut> list2 = this.autoCashOuts;
        String str = this.lastBetId;
        boolean z = this.moreBets;
        CashOutFallback cashOutFallback = this.cashOutFallback;
        StringBuilder sb = new StringBuilder("CashOutFilterPageResponse(totalNum=");
        sb.append(i);
        sb.append(DZsoPoBl.dCxbJp);
        sb.append(list);
        sb.append(", autoCashOuts=");
        gfs.a(", lastBetId=", str, ", moreBets=", sb, list2);
        sb.append(z);
        sb.append(", cashOutFallback=");
        sb.append(cashOutFallback);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashOutFilterPageResponse(int i, List<? extends Bet> list, List<? extends AutoCashOut> list2, String str, boolean z, CashOutFallback cashOutFallback) {
        list.getClass();
        list2.getClass();
        str.getClass();
        cashOutFallback.getClass();
        this.totalNum = i;
        this.cashAbleBets = list;
        this.autoCashOuts = list2;
        this.lastBetId = str;
        this.moreBets = z;
        this.cashOutFallback = cashOutFallback;
    }
}
