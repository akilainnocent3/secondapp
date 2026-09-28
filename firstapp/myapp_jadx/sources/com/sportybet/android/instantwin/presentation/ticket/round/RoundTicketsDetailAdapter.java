package com.sportybet.android.instantwin.presentation.ticket.round;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.dpy;
import defpackage.f060;
import defpackage.geo;
import defpackage.ji2;
import defpackage.ov7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoundTicketsDetailAdapter extends BaseNodeAdapter implements RoundTicketsSummaryViewHolder.a {
    private final ji2 betBuilderUtil;
    private a mOnScrollListener;
    private Round mRound;

    public interface a {
    }

    public RoundTicketsDetailAdapter(ji2 ji2Var, dpy dpyVar) {
        super(null);
        this.betBuilderUtil = ji2Var;
        addNodeProvider(new f060(this, dpyVar));
        setOnItemClickListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setOnItemClickListener$0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BaseNode item = getItem(i);
        if (item instanceof BaseExpandNode) {
            if (((BaseExpandNode) item).getIsExpanded()) {
                collapse(i);
                return;
            }
            expand(i);
            if (findParentNode(item) == i) {
                ((LinearLayoutManager) ((RecyclerView) ((ov7) this.mOnScrollListener).a).getLayoutManager()).w1(i, 0);
            }
        }
    }

    private void setOnItemClickListener() {
        setOnItemClickListener(new OnItemClickListener() { // from class: e060
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.lambda$setOnItemClickListener$0(baseQuickAdapter, view, i);
            }
        });
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder.a
    public BigDecimal getFlexTotalOdds(TicketInRound ticketInRound) {
        return !TextUtils.isEmpty(ticketInRound.totalOdds) ? new BigDecimal(ticketInRound.totalOdds).setScale(2, RoundingMode.HALF_UP) : BigDecimal.ZERO;
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public int getItemType(List<? extends BaseNode> list, int i) {
        return R.layout.iwqk_layout_round_ticket_detail_item;
    }

    public Round getRound() {
        return this.mRound;
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder.a
    public BigDecimal getTotalBonus(List<Bet> list) {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<Bet> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it.next().bonus).divide(geo.a));
        }
        return bigDecimalAdd;
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder.a
    public BigDecimal getTotalOdds(String str, List<Bet> list) {
        if (TextUtils.equals(str, SimulateBetConsts.BetslipType.SINGLE)) {
            if (list.size() == 1 && list.get(0).betDetails.size() == 1) {
                String str2 = list.get(0).betDetails.get(0).marketId;
                OutcomeInRound outcomeBy = this.mRound.getOutcomeBy(getContext(), str2, list.get(0).betDetails.get(0).outcomeId, this.betBuilderUtil.b(str2));
                if (outcomeBy != null) {
                    return new BigDecimal(outcomeBy.odds);
                }
            }
        } else if (TextUtils.equals(str, SimulateBetConsts.BetslipType.MULTIPLE)) {
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            for (Bet bet : list) {
                BigDecimal bigDecimalMultiply = BigDecimal.ONE;
                for (BetDetail betDetail : bet.betDetails) {
                    Round round = this.mRound;
                    Context context = getContext();
                    String str3 = betDetail.marketId;
                    OutcomeInRound outcomeBy2 = round.getOutcomeBy(context, str3, betDetail.outcomeId, this.betBuilderUtil.b(str3));
                    if (outcomeBy2 != null) {
                        bigDecimalMultiply = bigDecimalMultiply.multiply(new BigDecimal(outcomeBy2.odds));
                    }
                }
                bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
            }
            return bigDecimalAdd;
        }
        return BigDecimal.ZERO;
    }

    public void setOnScrollListener(a aVar) {
        this.mOnScrollListener = aVar;
    }

    public void setRound(Round round) {
        this.mRound = round;
    }
}
