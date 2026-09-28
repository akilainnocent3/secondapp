package com.sportybet.feature.payment.impl.deposit.presentation.adapter;

import android.view.View;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import defpackage.f4z;
import defpackage.g4z;
import defpackage.i5e;
import defpackage.j5e;
import defpackage.k5e;
import defpackage.l5e;
import defpackage.m5e;
import defpackage.n5e;
import defpackage.q3z;
import defpackage.r3z;
import defpackage.x3z;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/adapter/DepositOthersAdapter;", "Lcom/chad/library/adapter/base/BaseNodeAdapter;", "data", "", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "goTransactionDeposit", "Lkotlin/Function0;", "", "goFixStatus", "routerOpen", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getItemType", "", "", "position", "lastTitleClickedPosition", "lastSubTitleClickedPosition", "titleExpandedItemCount", "subTitleExpandedItemCount", "onItemClick", "collapseExpandedTitleAndSubTitle", "updatedClickedPosition", "collapseExpandedSubTitle", "getNewPositionAfterCollapse", "lastThisLevelClickedPosition", "lastThisLevelExpandedItemCount", "isThisLevelExpanded", "", "lastItemTitlePosition", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DepositOthersAdapter extends BaseNodeAdapter {
    public static final int $stable = 8;
    private final Function0<Unit> goFixStatus;
    private final Function0<Unit> goTransactionDeposit;
    private int lastSubTitleClickedPosition;
    private int lastTitleClickedPosition;
    private final Function1<String, Unit> routerOpen;
    private int subTitleExpandedItemCount;
    private int titleExpandedItemCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DepositOthersAdapter(List<BaseNode> list, Function0<Unit> function0, Function0<Unit> function1, Function1<? super String, Unit> function2) {
        super(list);
        list.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        this.goTransactionDeposit = function0;
        this.goFixStatus = function1;
        this.routerOpen = function2;
        addNodeProvider(new n5e());
        addNodeProvider(new m5e());
        addNodeProvider(new k5e(function0, function1));
        addNodeProvider(new l5e(function0, new i5e(this, 0)));
        setOnItemClickListener(new j5e(this));
        this.lastTitleClickedPosition = -1;
        this.lastSubTitleClickedPosition = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DepositOthersAdapter depositOthersAdapter) {
        depositOthersAdapter.routerOpen.invoke("https://www.quickteller.com/sportybet");
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(DepositOthersAdapter depositOthersAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        baseQuickAdapter.getClass();
        view.getClass();
        depositOthersAdapter.onItemClick(i);
    }

    private final int collapseExpandedSubTitle(int updatedClickedPosition) {
        if (!isThisLevelExpanded(this.lastSubTitleClickedPosition)) {
            return updatedClickedPosition;
        }
        int newPositionAfterCollapse = getNewPositionAfterCollapse(updatedClickedPosition, this.lastSubTitleClickedPosition, this.subTitleExpandedItemCount);
        BaseNodeAdapter.collapse$default(this, this.lastSubTitleClickedPosition, false, false, null, 14, null);
        return newPositionAfterCollapse;
    }

    private final int collapseExpandedTitleAndSubTitle(int updatedClickedPosition) {
        int i;
        if (isThisLevelExpanded(this.lastSubTitleClickedPosition)) {
            int newPositionAfterCollapse = getNewPositionAfterCollapse(updatedClickedPosition, this.lastSubTitleClickedPosition, this.subTitleExpandedItemCount);
            this.lastTitleClickedPosition = getNewPositionAfterCollapse(this.lastTitleClickedPosition, this.lastSubTitleClickedPosition, this.subTitleExpandedItemCount);
            BaseNodeAdapter.collapse$default(this, this.lastSubTitleClickedPosition, false, false, null, 14, null);
            this.lastSubTitleClickedPosition = -1;
            i = newPositionAfterCollapse;
        } else {
            i = updatedClickedPosition;
        }
        int newPositionAfterCollapse2 = getNewPositionAfterCollapse(i, this.lastTitleClickedPosition, this.titleExpandedItemCount);
        BaseNodeAdapter.collapse$default(this, this.lastTitleClickedPosition, false, false, null, 14, null);
        this.lastTitleClickedPosition = -1;
        return newPositionAfterCollapse2;
    }

    private final int getNewPositionAfterCollapse(int position, int lastThisLevelClickedPosition, int lastThisLevelExpandedItemCount) {
        return position > lastThisLevelClickedPosition ? position - lastThisLevelExpandedItemCount : position;
    }

    private final boolean isThisLevelExpanded(int lastItemTitlePosition) {
        return lastItemTitlePosition != -1;
    }

    private final void onItemClick(int position) {
        int iCollapseExpandedTitleAndSubTitle;
        int iCollapseExpandedSubTitle;
        BaseNode item = getItem(position);
        BaseExpandNode baseExpandNode = item instanceof BaseExpandNode ? (BaseExpandNode) item : null;
        if (baseExpandNode == null) {
            return;
        }
        if (baseExpandNode.getIsExpanded()) {
            if (!(baseExpandNode instanceof f4z)) {
                if (baseExpandNode instanceof g4z) {
                    iCollapseExpandedSubTitle = collapseExpandedSubTitle(position);
                    this.lastSubTitleClickedPosition = -1;
                    this.lastTitleClickedPosition = -1;
                }
                BaseNodeAdapter.collapse$default(this, iCollapseExpandedSubTitle, false, false, null, 14, null);
                return;
            }
            this.lastSubTitleClickedPosition = -1;
            iCollapseExpandedSubTitle = position;
            BaseNodeAdapter.collapse$default(this, iCollapseExpandedSubTitle, false, false, null, 14, null);
            return;
        }
        boolean z = baseExpandNode instanceof f4z;
        if (z && isThisLevelExpanded(this.lastSubTitleClickedPosition)) {
            int newPositionAfterCollapse = getNewPositionAfterCollapse(position, this.lastSubTitleClickedPosition, this.subTitleExpandedItemCount);
            BaseNodeAdapter.collapse$default(this, this.lastSubTitleClickedPosition, false, false, null, 14, null);
            iCollapseExpandedTitleAndSubTitle = newPositionAfterCollapse;
        } else {
            iCollapseExpandedTitleAndSubTitle = ((baseExpandNode instanceof g4z) && isThisLevelExpanded(this.lastTitleClickedPosition)) ? collapseExpandedTitleAndSubTitle(position) : position;
        }
        int iExpand$default = BaseNodeAdapter.expand$default(this, iCollapseExpandedTitleAndSubTitle, false, false, null, 14, null);
        if (baseExpandNode instanceof g4z) {
            this.lastTitleClickedPosition = iCollapseExpandedTitleAndSubTitle;
            this.titleExpandedItemCount = iExpand$default;
        } else if (z) {
            this.lastSubTitleClickedPosition = iCollapseExpandedTitleAndSubTitle;
            this.subTitleExpandedItemCount = iExpand$default;
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public int getItemType(List<? extends BaseNode> data, int position) {
        data.getClass();
        BaseNode baseNode = data.get(position);
        if (baseNode instanceof g4z) {
            x3z[] x3zVarArr = x3z.a;
            return 0;
        }
        if (baseNode instanceof f4z) {
            x3z[] x3zVarArr2 = x3z.a;
            return 1;
        }
        if (baseNode instanceof q3z) {
            x3z[] x3zVarArr3 = x3z.a;
            return 2;
        }
        if (!(baseNode instanceof r3z)) {
            return -1;
        }
        x3z[] x3zVarArr4 = x3z.a;
        return 3;
    }
}
