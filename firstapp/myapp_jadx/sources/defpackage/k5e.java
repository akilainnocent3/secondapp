package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.viewholder.OthersDirectBankContentViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class k5e extends BaseNodeProvider {
    public final Function0<Unit> a;
    public final Function0<Unit> b;

    public k5e(Function0<Unit> function0, Function0<Unit> function1) {
        function0.getClass();
        function1.getClass();
        this.a = function0;
        this.b = function1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        q3z q3zVar = baseNode2 instanceof q3z ? (q3z) baseNode2 : null;
        if (q3zVar == null) {
            return;
        }
        OthersDirectBankContentViewHolder othersDirectBankContentViewHolder = baseViewHolder instanceof OthersDirectBankContentViewHolder ? (OthersDirectBankContentViewHolder) baseViewHolder : null;
        if (othersDirectBankContentViewHolder != null) {
            othersDirectBankContentViewHolder.bindData(q3zVar);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        x3z[] x3zVarArr = x3z.a;
        return 2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.layout_deposit_others_direct_bank_content_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.layout_deposit_others_direct_bank_content_item, viewGroup, false);
        int i2 = R.id.idbi_tv_check_transaction;
        TextView textView = (TextView) h5e.a(R.id.idbi_tv_check_transaction, viewA);
        if (textView != null) {
            i2 = R.id.idbi_tv_deposit_not_arrived;
            TextView textView2 = (TextView) h5e.a(R.id.idbi_tv_deposit_not_arrived, viewA);
            if (textView2 != null) {
                i2 = R.id.idbi_tv_steps;
                TextView textView3 = (TextView) h5e.a(R.id.idbi_tv_steps, viewA);
                if (textView3 != null) {
                    i2 = R.id.idbi_tv_visit_deposit;
                    TextView textView4 = (TextView) h5e.a(R.id.idbi_tv_visit_deposit, viewA);
                    if (textView4 != null) {
                        return new OthersDirectBankContentViewHolder(new vrr((LinearLayout) viewA, textView, textView2, textView3, textView4), this.a, this.b);
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
