package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.provider.BaseNodeProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.ticket.round.RoundTicketsDetailAdapter;
import com.sportybet.android.instantwin.presentation.widget.RoundTicketDetailContent;
import com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder;

/* JADX INFO: loaded from: classes.dex */
public final class f060 extends BaseNodeProvider {
    public final RoundTicketsDetailAdapter a;
    public final dpy b;

    public f060(RoundTicketsDetailAdapter roundTicketsDetailAdapter, dpy dpyVar) {
        dpyVar.getClass();
        this.a = roundTicketsDetailAdapter;
        this.b = dpyVar;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final void convert(BaseViewHolder baseViewHolder, BaseNode baseNode) {
        BaseNode baseNode2 = baseNode;
        baseViewHolder.getClass();
        baseNode2.getClass();
        d060 d060Var = baseNode2 instanceof d060 ? (d060) baseNode2 : null;
        if (d060Var == null) {
            return;
        }
        RoundTicketsSummaryViewHolder roundTicketsSummaryViewHolder = baseViewHolder instanceof RoundTicketsSummaryViewHolder ? (RoundTicketsSummaryViewHolder) baseViewHolder : null;
        if (roundTicketsSummaryViewHolder != null) {
            roundTicketsSummaryViewHolder.setData(d060Var, this.b);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getItemViewType() {
        return R.layout.iwqk_layout_round_ticket_detail_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final int getLayoutId() {
        return R.layout.iwqk_layout_round_ticket_detail_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    public final BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.iwqk_layout_round_ticket_detail_item, viewGroup, false);
        if (viewA != null) {
            RoundTicketDetailContent roundTicketDetailContent = (RoundTicketDetailContent) viewA;
            return new RoundTicketsSummaryViewHolder(new e5p(roundTicketDetailContent, roundTicketDetailContent), this.a);
        }
        bmy.a("rootView");
        return null;
    }
}
