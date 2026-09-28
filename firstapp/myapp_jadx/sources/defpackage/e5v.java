package defpackage;

import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventSpinnerAdapter;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchEventSpinnerViewHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class e5v extends BaseNodeProvider {
    public final tlo a;
    public final le8 b;

    public e5v(tlo tloVar, le8 le8Var) {
        tloVar.getClass();
        this.a = tloVar;
        this.b = le8Var;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        crg crgVar = baseNode2 instanceof crg ? (crg) baseNode2 : null;
        if (crgVar == null) {
            return;
        }
        MatchEventSpinnerViewHolder matchEventSpinnerViewHolder = baseViewHolder instanceof MatchEventSpinnerViewHolder ? (MatchEventSpinnerViewHolder) baseViewHolder : null;
        if (matchEventSpinnerViewHolder != null) {
            matchEventSpinnerViewHolder.setData(crgVar, ((MatchEventSpinnerAdapter) this.b.b).lambda$new$3());
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.iwqk_layout_match_event_spinner_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new MatchEventSpinnerViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.iwqk_layout_match_event_spinner_item), this.a);
    }
}
