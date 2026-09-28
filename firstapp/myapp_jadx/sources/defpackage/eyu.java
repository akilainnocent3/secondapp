package defpackage;

import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventAdapter;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchEventViewHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class eyu extends BaseNodeProvider {
    public final dyu a;

    public eyu(dyu dyuVar) {
        this.a = dyuVar;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        mpg mpgVar = baseNode2 instanceof mpg ? (mpg) baseNode2 : null;
        if (mpgVar == null) {
            return;
        }
        MatchEventViewHolder matchEventViewHolder = baseViewHolder instanceof MatchEventViewHolder ? (MatchEventViewHolder) baseViewHolder : null;
        if (matchEventViewHolder != null) {
            matchEventViewHolder.setData(mpgVar, ((MatchEventAdapter) this.a.b).lambda$new$0());
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.iwqk_layout_match_event_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new MatchEventViewHolder(AdapterUtilsKt.getItemView(viewGroup, R.layout.iwqk_layout_match_event_item));
    }
}
