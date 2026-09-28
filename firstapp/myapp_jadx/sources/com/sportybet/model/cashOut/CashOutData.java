package com.sportybet.model.cashOut;

import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sportybet.plugin.realsports.data.Bet;
import defpackage.ai50;
import defpackage.gfs;
import defpackage.gmf0;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.nng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010(\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cÊ\u0001\u0002\b*Ê\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0000¨\u0006)"}, d2 = {"Lcom/sportybet/model/cashOut/CashOutData;", "", "totalNum", "", "cashAbleBets", "", "Lcom/sportybet/plugin/realsports/data/Bet;", "autoCashOuts", "Lcom/sporty/android/core/model/cashout/AutoCashOut;", "lastBetId", "", "moreBets", "", "isFilter", "cashOutFallbackData", "Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;ZZLcom/sporty/android/core/model/cashout/CashOutFallbackData;)V", "getTotalNum", "()I", "getCashAbleBets", "()Ljava/util/List;", "getAutoCashOuts", "getLastBetId", "()Ljava/lang/String;", "getMoreBets", "()Z", "getCashOutFallbackData", "()Lcom/sporty/android/core/model/cashout/CashOutFallbackData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutData {
    public static final int $stable = 8;
    private final List<AutoCashOut> autoCashOuts;
    private final List<Bet> cashAbleBets;
    private final CashOutFallbackData cashOutFallbackData;
    private final boolean isFilter;
    private final String lastBetId;
    private final boolean moreBets;
    private final int totalNum;

    public CashOutData(int i, List list, List list2, String str, boolean z, boolean z2, CashOutFallbackData cashOutFallbackData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? m2g.a : list, (i2 & 4) != 0 ? m2g.a : list2, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? false : z, (i2 & 32) == 0 ? z2 : false, (i2 & 64) != 0 ? new CashOutFallbackData(null, null, null, null, null, null, null, null, null, null, 1023, null) : cashOutFallbackData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutData copy$default(CashOutData cashOutData, int i, List list, List list2, String str, boolean z, boolean z2, CashOutFallbackData cashOutFallbackData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cashOutData.totalNum;
        }
        if ((i2 & 2) != 0) {
            list = cashOutData.cashAbleBets;
        }
        if ((i2 & 4) != 0) {
            list2 = cashOutData.autoCashOuts;
        }
        if ((i2 & 8) != 0) {
            str = cashOutData.lastBetId;
        }
        if ((i2 & 16) != 0) {
            z = cashOutData.moreBets;
        }
        if ((i2 & 32) != 0) {
            z2 = cashOutData.isFilter;
        }
        if ((i2 & 64) != 0) {
            cashOutFallbackData = cashOutData.cashOutFallbackData;
        }
        boolean z3 = z2;
        CashOutFallbackData cashOutFallbackData2 = cashOutFallbackData;
        boolean z4 = z;
        List list3 = list2;
        return cashOutData.copy(i, list, list3, str, z4, z3, cashOutFallbackData2);
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
    public final boolean getIsFilter() {
        return this.isFilter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CashOutFallbackData getCashOutFallbackData() {
        return this.cashOutFallbackData;
    }

    public final CashOutData copy(int totalNum, List<? extends Bet> cashAbleBets, List<? extends AutoCashOut> autoCashOuts, String lastBetId, boolean moreBets, boolean isFilter, CashOutFallbackData cashOutFallbackData) {
        cashAbleBets.getClass();
        autoCashOuts.getClass();
        lastBetId.getClass();
        cashOutFallbackData.getClass();
        return new CashOutData(totalNum, cashAbleBets, autoCashOuts, lastBetId, moreBets, isFilter, cashOutFallbackData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashOutData)) {
            return false;
        }
        CashOutData cashOutData = (CashOutData) other;
        return this.totalNum == cashOutData.totalNum && Intrinsics.g(this.cashAbleBets, cashOutData.cashAbleBets) && Intrinsics.g(this.autoCashOuts, cashOutData.autoCashOuts) && Intrinsics.g(this.lastBetId, cashOutData.lastBetId) && this.moreBets == cashOutData.moreBets && this.isFilter == cashOutData.isFilter && Intrinsics.g(this.cashOutFallbackData, cashOutData.cashOutFallbackData);
    }

    public final List<AutoCashOut> getAutoCashOuts() {
        return this.autoCashOuts;
    }

    public final List<Bet> getCashAbleBets() {
        return this.cashAbleBets;
    }

    public final CashOutFallbackData getCashOutFallbackData() {
        return this.cashOutFallbackData;
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
        return this.cashOutFallbackData.hashCode() + mtg0.a(mtg0.a(gmf0.a(ai50.a(ai50.a(Integer.hashCode(this.totalNum) * 31, 31, this.cashAbleBets), 31, this.autoCashOuts), 31, this.lastBetId), 31, this.moreBets), 31, this.isFilter);
    }

    public final boolean isFilter() {
        return this.isFilter;
    }

    public String toString() {
        int i = this.totalNum;
        List<Bet> list = this.cashAbleBets;
        List<AutoCashOut> list2 = this.autoCashOuts;
        String str = this.lastBetId;
        boolean z = this.moreBets;
        boolean z2 = this.isFilter;
        CashOutFallbackData cashOutFallbackData = this.cashOutFallbackData;
        StringBuilder sb = new StringBuilder("CashOutData(totalNum=");
        sb.append(i);
        sb.append(", cashAbleBets=");
        sb.append(list);
        sb.append(", autoCashOuts=");
        gfs.a(", lastBetId=", str, ", moreBets=", sb, list2);
        nng.a(", isFilter=", ", cashOutFallbackData=", sb, z, z2);
        sb.append(cashOutFallbackData);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashOutData(int i, List<? extends Bet> list, List<? extends AutoCashOut> list2, String str, boolean z, boolean z2, CashOutFallbackData cashOutFallbackData) {
        list.getClass();
        list2.getClass();
        str.getClass();
        cashOutFallbackData.getClass();
        this.totalNum = i;
        this.cashAbleBets = list;
        this.autoCashOuts = list2;
        this.lastBetId = str;
        this.moreBets = z;
        this.isFilter = z2;
        this.cashOutFallbackData = cashOutFallbackData;
    }

    public CashOutData() {
        this(0, null, null, null, false, false, null, 127, null);
    }
}
