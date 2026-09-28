package com.sporty.android.core.model.autobet;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/autobet/AutoBetListData;", "", "total", "", "autoBets", "", "Lcom/sporty/android/core/model/autobet/AutoBet;", "<init>", "(ILjava/util/List;)V", "getTotal", "()I", "getAutoBets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoBetListData {
    private final List<AutoBet> autoBets;
    private final int total;

    public AutoBetListData(int i, List<AutoBet> list) {
        list.getClass();
        this.total = i;
        this.autoBets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoBetListData copy$default(AutoBetListData autoBetListData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = autoBetListData.total;
        }
        if ((i2 & 2) != 0) {
            list = autoBetListData.autoBets;
        }
        return autoBetListData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<AutoBet> component2() {
        return this.autoBets;
    }

    public final AutoBetListData copy(int total, List<AutoBet> autoBets) {
        autoBets.getClass();
        return new AutoBetListData(total, autoBets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoBetListData)) {
            return false;
        }
        AutoBetListData autoBetListData = (AutoBetListData) other;
        return this.total == autoBetListData.total && Intrinsics.g(this.autoBets, autoBetListData.autoBets);
    }

    public final List<AutoBet> getAutoBets() {
        return this.autoBets;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return this.autoBets.hashCode() + (Integer.hashCode(this.total) * 31);
    }

    public String toString() {
        return "AutoBetListData(total=" + this.total + ", autoBets=" + this.autoBets + ")";
    }
}
