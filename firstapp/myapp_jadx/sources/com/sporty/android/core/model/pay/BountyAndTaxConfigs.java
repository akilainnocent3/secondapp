package com.sporty.android.core.model.pay;

import com.sporty.android.core.model.common.Range;
import defpackage.ai50;
import defpackage.hfb0;
import defpackage.qpu;
import defpackage.rg2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016Jr\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\tHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016Ê\u0001\u0002\b)¨\u0006("}, d2 = {"Lcom/sporty/android/core/model/pay/BountyAndTaxConfigs;", "", "bountyRanges", "", "Lcom/sporty/android/core/model/common/Range;", "depositTaxRanges", "quickInputs", "Lcom/sporty/android/core/model/pay/QuickInput;", "entryDisplayOrders", "", "depositButtonTextDisplay", "", "depositQuickInputButtonDisplay", "depositExclusiveOfferDisplay", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBountyRanges", "()Ljava/util/List;", "getDepositTaxRanges", "getQuickInputs", "getEntryDisplayOrders", "getDepositButtonTextDisplay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDepositQuickInputButtonDisplay", "getDepositExclusiveOfferDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/pay/BountyAndTaxConfigs;", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BountyAndTaxConfigs {
    private final List<Range> bountyRanges;
    private final Boolean depositButtonTextDisplay;
    private final Boolean depositExclusiveOfferDisplay;
    private final Boolean depositQuickInputButtonDisplay;
    private final List<Range> depositTaxRanges;
    private final List<String> entryDisplayOrders;
    private final List<QuickInput> quickInputs;

    public /* synthetic */ BountyAndTaxConfigs(List list, List list2, List list3, List list4, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? Boolean.TRUE : bool2, (i & 64) != 0 ? Boolean.TRUE : bool3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BountyAndTaxConfigs copy$default(BountyAndTaxConfigs bountyAndTaxConfigs, List list, List list2, List list3, List list4, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bountyAndTaxConfigs.bountyRanges;
        }
        if ((i & 2) != 0) {
            list2 = bountyAndTaxConfigs.depositTaxRanges;
        }
        if ((i & 4) != 0) {
            list3 = bountyAndTaxConfigs.quickInputs;
        }
        if ((i & 8) != 0) {
            list4 = bountyAndTaxConfigs.entryDisplayOrders;
        }
        if ((i & 16) != 0) {
            bool = bountyAndTaxConfigs.depositButtonTextDisplay;
        }
        if ((i & 32) != 0) {
            bool2 = bountyAndTaxConfigs.depositQuickInputButtonDisplay;
        }
        if ((i & 64) != 0) {
            bool3 = bountyAndTaxConfigs.depositExclusiveOfferDisplay;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Boolean bool6 = bool;
        List list5 = list3;
        return bountyAndTaxConfigs.copy(list, list2, list5, list4, bool6, bool4, bool5);
    }

    public final List<Range> component1() {
        return this.bountyRanges;
    }

    public final List<Range> component2() {
        return this.depositTaxRanges;
    }

    public final List<QuickInput> component3() {
        return this.quickInputs;
    }

    public final List<String> component4() {
        return this.entryDisplayOrders;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getDepositButtonTextDisplay() {
        return this.depositButtonTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDepositQuickInputButtonDisplay() {
        return this.depositQuickInputButtonDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDepositExclusiveOfferDisplay() {
        return this.depositExclusiveOfferDisplay;
    }

    public final BountyAndTaxConfigs copy(List<? extends Range> bountyRanges, List<? extends Range> depositTaxRanges, List<QuickInput> quickInputs, List<String> entryDisplayOrders, Boolean depositButtonTextDisplay, Boolean depositQuickInputButtonDisplay, Boolean depositExclusiveOfferDisplay) {
        bountyRanges.getClass();
        depositTaxRanges.getClass();
        quickInputs.getClass();
        entryDisplayOrders.getClass();
        return new BountyAndTaxConfigs(bountyRanges, depositTaxRanges, quickInputs, entryDisplayOrders, depositButtonTextDisplay, depositQuickInputButtonDisplay, depositExclusiveOfferDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BountyAndTaxConfigs)) {
            return false;
        }
        BountyAndTaxConfigs bountyAndTaxConfigs = (BountyAndTaxConfigs) other;
        return Intrinsics.g(this.bountyRanges, bountyAndTaxConfigs.bountyRanges) && Intrinsics.g(this.depositTaxRanges, bountyAndTaxConfigs.depositTaxRanges) && Intrinsics.g(this.quickInputs, bountyAndTaxConfigs.quickInputs) && Intrinsics.g(this.entryDisplayOrders, bountyAndTaxConfigs.entryDisplayOrders) && Intrinsics.g(this.depositButtonTextDisplay, bountyAndTaxConfigs.depositButtonTextDisplay) && Intrinsics.g(this.depositQuickInputButtonDisplay, bountyAndTaxConfigs.depositQuickInputButtonDisplay) && Intrinsics.g(this.depositExclusiveOfferDisplay, bountyAndTaxConfigs.depositExclusiveOfferDisplay);
    }

    public final List<Range> getBountyRanges() {
        return this.bountyRanges;
    }

    public final Boolean getDepositButtonTextDisplay() {
        return this.depositButtonTextDisplay;
    }

    public final Boolean getDepositExclusiveOfferDisplay() {
        return this.depositExclusiveOfferDisplay;
    }

    public final Boolean getDepositQuickInputButtonDisplay() {
        return this.depositQuickInputButtonDisplay;
    }

    public final List<Range> getDepositTaxRanges() {
        return this.depositTaxRanges;
    }

    public final List<String> getEntryDisplayOrders() {
        return this.entryDisplayOrders;
    }

    public final List<QuickInput> getQuickInputs() {
        return this.quickInputs;
    }

    public int hashCode() {
        int iA = ai50.a(ai50.a(ai50.a(this.bountyRanges.hashCode() * 31, 31, this.depositTaxRanges), 31, this.quickInputs), 31, this.entryDisplayOrders);
        Boolean bool = this.depositButtonTextDisplay;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.depositQuickInputButtonDisplay;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.depositExclusiveOfferDisplay;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        List<Range> list = this.bountyRanges;
        List<Range> list2 = this.depositTaxRanges;
        List<QuickInput> list3 = this.quickInputs;
        List<String> list4 = this.entryDisplayOrders;
        Boolean bool = this.depositButtonTextDisplay;
        Boolean bool2 = this.depositQuickInputButtonDisplay;
        Boolean bool3 = this.depositExclusiveOfferDisplay;
        StringBuilder sbA = hfb0.a("BountyAndTaxConfigs(bountyRanges=", ", depositTaxRanges=", ", quickInputs=", list, list2);
        qpu.a(", entryDisplayOrders=", ", depositButtonTextDisplay=", sbA, list3, list4);
        sbA.append(bool);
        sbA.append(", depositQuickInputButtonDisplay=");
        sbA.append(bool2);
        sbA.append(", depositExclusiveOfferDisplay=");
        return rg2.a(sbA, bool3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BountyAndTaxConfigs(List<? extends Range> list, List<? extends Range> list2, List<QuickInput> list3, List<String> list4, Boolean bool, Boolean bool2, Boolean bool3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.bountyRanges = list;
        this.depositTaxRanges = list2;
        this.quickInputs = list3;
        this.entryDisplayOrders = list4;
        this.depositButtonTextDisplay = bool;
        this.depositQuickInputButtonDisplay = bool2;
        this.depositExclusiveOfferDisplay = bool3;
    }
}
