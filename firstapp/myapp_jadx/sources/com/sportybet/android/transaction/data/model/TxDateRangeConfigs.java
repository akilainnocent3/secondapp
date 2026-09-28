package com.sportybet.android.transaction.data.model;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\rÊ\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/sportybet/android/transaction/data/model/TxDateRangeConfigs;", "", "quickOptions", "", "", "maxRange", "<init>", "(Ljava/util/List;I)V", "getQuickOptions", "()Ljava/util/List;", "getMaxRange", "()I", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxDateRangeConfigs {
    public static final int $stable = 8;
    private final int maxRange;
    private final List<Integer> quickOptions;

    public TxDateRangeConfigs(List<Integer> list, int i) {
        list.getClass();
        this.quickOptions = list;
        this.maxRange = i;
    }

    public final int getMaxRange() {
        return this.maxRange;
    }

    public final List<Integer> getQuickOptions() {
        return this.quickOptions;
    }
}
