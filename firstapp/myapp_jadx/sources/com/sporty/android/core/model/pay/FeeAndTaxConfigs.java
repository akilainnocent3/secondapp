package com.sporty.android.core.model.pay;

import com.sporty.android.core.model.common.Range;
import defpackage.ai50;
import defpackage.hfb0;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bÊ\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/pay/FeeAndTaxConfigs;", "", "withdrawFeeRanges", "", "Lcom/sporty/android/core/model/common/Range;", "withdrawTaxRanges", "entryDisplayOrders", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getWithdrawFeeRanges", "()Ljava/util/List;", "getWithdrawTaxRanges", "getEntryDisplayOrders", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeeAndTaxConfigs {
    private final List<String> entryDisplayOrders;
    private final List<Range> withdrawFeeRanges;
    private final List<Range> withdrawTaxRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public FeeAndTaxConfigs(List<? extends Range> list, List<? extends Range> list2, List<String> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.withdrawFeeRanges = list;
        this.withdrawTaxRanges = list2;
        this.entryDisplayOrders = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeeAndTaxConfigs copy$default(FeeAndTaxConfigs feeAndTaxConfigs, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feeAndTaxConfigs.withdrawFeeRanges;
        }
        if ((i & 2) != 0) {
            list2 = feeAndTaxConfigs.withdrawTaxRanges;
        }
        if ((i & 4) != 0) {
            list3 = feeAndTaxConfigs.entryDisplayOrders;
        }
        return feeAndTaxConfigs.copy(list, list2, list3);
    }

    public final List<Range> component1() {
        return this.withdrawFeeRanges;
    }

    public final List<Range> component2() {
        return this.withdrawTaxRanges;
    }

    public final List<String> component3() {
        return this.entryDisplayOrders;
    }

    public final FeeAndTaxConfigs copy(List<? extends Range> withdrawFeeRanges, List<? extends Range> withdrawTaxRanges, List<String> entryDisplayOrders) {
        withdrawFeeRanges.getClass();
        withdrawTaxRanges.getClass();
        entryDisplayOrders.getClass();
        return new FeeAndTaxConfigs(withdrawFeeRanges, withdrawTaxRanges, entryDisplayOrders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeeAndTaxConfigs)) {
            return false;
        }
        FeeAndTaxConfigs feeAndTaxConfigs = (FeeAndTaxConfigs) other;
        return Intrinsics.g(this.withdrawFeeRanges, feeAndTaxConfigs.withdrawFeeRanges) && Intrinsics.g(this.withdrawTaxRanges, feeAndTaxConfigs.withdrawTaxRanges) && Intrinsics.g(this.entryDisplayOrders, feeAndTaxConfigs.entryDisplayOrders);
    }

    public final List<String> getEntryDisplayOrders() {
        return this.entryDisplayOrders;
    }

    public final List<Range> getWithdrawFeeRanges() {
        return this.withdrawFeeRanges;
    }

    public final List<Range> getWithdrawTaxRanges() {
        return this.withdrawTaxRanges;
    }

    public int hashCode() {
        return this.entryDisplayOrders.hashCode() + ai50.a(this.withdrawFeeRanges.hashCode() * 31, 31, this.withdrawTaxRanges);
    }

    public String toString() {
        List<Range> list = this.withdrawFeeRanges;
        List<Range> list2 = this.withdrawTaxRanges;
        return ng1.a(hfb0.a("FeeAndTaxConfigs(withdrawFeeRanges=", ", withdrawTaxRanges=", ", entryDisplayOrders=", list, list2), this.entryDisplayOrders, ")");
    }
}
