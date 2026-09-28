package defpackage;

import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchLeagueViewHolder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g5v extends BaseNodeProvider {
    public final ie8 a;
    public final je8 b;
    public final c5v c;

    public g5v(ie8 ie8Var, je8 je8Var, c5v c5vVar) {
        this.a = ie8Var;
        this.b = je8Var;
        this.c = c5vVar;
    }

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
            List<String> list = (List) this.a.invoke();
            Integer num = (Integer) this.b.invoke();
            final c5v c5vVar = this.c;
            matchLeagueViewHolder.bind(p2sVar, list, num, new OutcomeSpinnerLayout.c() { // from class: f5v
                @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout.c
                public final void a(int i) {
                    c5vVar.invoke(Integer.valueOf(i));
                }
            });
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
