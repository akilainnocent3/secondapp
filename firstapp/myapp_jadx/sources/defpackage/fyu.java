package defpackage;

import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchLeagueViewHolder;

/* JADX INFO: loaded from: classes5.dex */
public final class fyu extends BaseNodeProvider {
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        p2s p2sVar = baseNode2 instanceof p2s ? (p2s) baseNode2 : null;
        if (p2sVar == null) {
            return;
        }
        MatchLeagueViewHolder matchLeagueViewHolder = baseViewHolder instanceof MatchLeagueViewHolder ? (MatchLeagueViewHolder) baseViewHolder : null;
        if (matchLeagueViewHolder != null) {
            matchLeagueViewHolder.bind(p2sVar, null, null, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        return 0;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.iwqk_layout_league_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        MatchLeagueViewHolder.INSTANCE.getClass();
        return MatchLeagueViewHolder.Companion.a(viewGroup);
    }
}
