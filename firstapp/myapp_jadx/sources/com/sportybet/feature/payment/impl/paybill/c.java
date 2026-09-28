package com.sportybet.feature.payment.impl.paybill;

import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends BaseNodeProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        b bVar = baseNode2 instanceof b ? (b) baseNode2 : null;
        if (bVar == null) {
            return;
        }
        PaybillListAdapter.PaybillListItemDetailViewHolder paybillListItemDetailViewHolder = baseViewHolder instanceof PaybillListAdapter.PaybillListItemDetailViewHolder ? (PaybillListAdapter.PaybillListItemDetailViewHolder) baseViewHolder : null;
        if (paybillListItemDetailViewHolder != null) {
            paybillListItemDetailViewHolder.bindData(bVar);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        PaybillListAdapter.a[] aVarArr = PaybillListAdapter.a.a;
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.layout_paybill_detail_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new PaybillListAdapter.PaybillListItemDetailViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.layout_paybill_detail_item));
    }
}
