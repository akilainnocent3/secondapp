package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class phl extends uyy {
    public final h5p b;
    public final a c;
    public final List<xzy> d;

    public interface a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public phl(h5p h5pVar, OpenBetsActivity openBetsActivity, tlo tloVar, ArrayList arrayList) {
        openBetsActivity.getClass();
        tloVar.getClass();
        ConstraintLayout constraintLayout = h5pVar.a;
        constraintLayout.getClass();
        super(constraintLayout, arrayList);
        this.b = h5pVar;
        this.c = openBetsActivity;
        this.d = arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x010e, please report this as an issue */
    @Override // defpackage.uyy
    public final void a(int i) {
        List<BetDetail> list;
        int size;
        Context context;
        String strB;
        String strA;
        final xzy xzyVarC = c(i);
        if (xzyVarC == null) {
            return;
        }
        Round round = xzyVarC.a;
        List<Bet> list2 = xzyVarC.b;
        h5p h5pVar = this.b;
        TextView textView = h5pVar.e;
        TextView textView2 = h5pVar.c;
        TicketInRound ticketInRound = round.getLookupTicketByBetIdMapping().get(list2.get(0).betId);
        String str = ticketInRound != null ? ticketInRound.type : null;
        if (str != null) {
            switch (str) {
                case "cutbet":
                    View view = this.itemView;
                    view.getClass();
                    strA = sn5.c(view, R.string.bet_history__multiple, new Object[0]);
                    break;
                case "single":
                    View view2 = this.itemView;
                    view2.getClass();
                    strA = sn5.c(view2, R.string.component_betslip__singles, new Object[0]);
                    break;
                case "multiple":
                    View view3 = this.itemView;
                    view3.getClass();
                    strA = sn5.c(view3, R.string.bet_history__multiple, new Object[0]);
                    if (list2.size() > 1) {
                        strA = strA + " (x" + list2.size() + ")";
                    }
                    break;
                case "flexible":
                    View view4 = this.itemView;
                    view4.getClass();
                    strA = sn5.c(view4, R.string.bet_history__multiple, new Object[0]);
                    break;
                default:
                    list = list2.get(0).betDetails;
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    context = this.itemView.getContext();
                    BigDecimal bigDecimal = sqo.a;
                    if (size != 1) {
                        strB = sn5.b(context, R.string.component_betslip__single, new Object[0]);
                    } else if (size != 2) {
                        strB = sn5.b(context, R.string.component_betslip__doubles, new Object[0]);
                    } else if (size != 3) {
                        strB = sn5.b(context, R.string.component_betslip__veventsize_folds, String.valueOf(size));
                    } else {
                        strB = sn5.b(context, R.string.component_betslip__trebles, new Object[0]);
                    }
                    View view5 = this.itemView;
                    view5.getClass();
                    strA = tug.a(sn5.c(view5, R.string.common_functions__system, new Object[0]), " - ", strB);
                    if (list2.size() > 1) {
                        strA = strA + " (x" + list2.size() + ")";
                    }
                    break;
            }
        } else {
            list = list2.get(0).betDetails;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            context = this.itemView.getContext();
            BigDecimal bigDecimal2 = sqo.a;
            if (size != 1) {
                strB = sn5.b(context, R.string.component_betslip__single, new Object[0]);
            } else if (size != 2) {
                strB = sn5.b(context, R.string.component_betslip__doubles, new Object[0]);
            } else if (size != 3) {
                strB = sn5.b(context, R.string.component_betslip__veventsize_folds, String.valueOf(size));
            } else {
                strB = sn5.b(context, R.string.component_betslip__trebles, new Object[0]);
            }
            View view6 = this.itemView;
            view6.getClass();
            strA = tug.a(sn5.c(view6, R.string.common_functions__system, new Object[0]), " - ", strB);
            if (list2.size() > 1) {
                strA = strA + " (x" + list2.size() + ")";
            }
        }
        textView.setText(strA);
        TextView textView3 = h5pVar.d;
        View view7 = this.itemView;
        view7.getClass();
        TicketInRound ticketInRound2 = round.getLookupTicketByBetIdMapping().get(list2.get(0).betId);
        String str2 = ticketInRound2 != null ? ticketInRound2.ticketNumber : null;
        if (str2 == null) {
            str2 = "";
        }
        textView3.setText(sn5.c(view7, R.string.bet_history__ticket_id_vid, str2));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: jhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                OpenBetsActivity openBetsActivity = (OpenBetsActivity) this.a.c;
                openBetsActivity.I.a(new a5o.e0(openBetsActivity.i.c()), k00.d);
                if (openBetsActivity.i.N()) {
                    n4p n4pVar = openBetsActivity.i;
                    sqo.i(openBetsActivity, n4pVar.s, n4pVar.F());
                    return;
                }
                xzy xzyVar = xzyVarC;
                Round round2 = xzyVar.a;
                LinkedList<xzy> linkedList = xzyVar.h;
                if (linkedList == null || linkedList.isEmpty()) {
                    openBetsActivity.i.I = false;
                    openBetsActivity.I1();
                    return;
                }
                int size2 = openBetsActivity.i.d.size();
                Iterator<xzy> it = linkedList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    BetDetail betDetail = it.next().d;
                    if (betDetail != null && openBetsActivity.i.q(betDetail.getCustomKey()) == null) {
                        i2++;
                    }
                }
                if (size2 + i2 > openBetsActivity.i.m()) {
                    n4p n4pVar2 = openBetsActivity.i;
                    n4pVar2.J = true;
                    n4pVar2.I = false;
                    openBetsActivity.I1();
                    return;
                }
                Iterator<xzy> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    BetDetail betDetail2 = it2.next().d;
                    if (betDetail2 != null) {
                        EventInRound eventInRound = round2.getLookupEventByEventIdMapping().get(betDetail2.eventId);
                        MarketInRound marketInRound = round2.getLookupMarketByMarketIdMapping().get(betDetail2.marketId);
                        OutcomeInRound outcomeInRound = round2.getLookupOutcomeByOutcomeIdMapping().get(betDetail2.outcomeId);
                        if (eventInRound != null && marketInRound != null && outcomeInRound != null) {
                            BetSlipData betSlipData = new BetSlipData(betDetail2.eventId, betDetail2.marketId, betDetail2.outcomeId, marketInRound.title, outcomeInRound.desc, outcomeInRound.odds, eventInRound.homeTeamName, eventInRound.awayTeamName, outcomeInRound.prob, openBetsActivity.i.q(betDetail2.getCustomKey()) == null);
                            BigDecimal bigDecimal3 = sqo.a;
                            openBetsActivity.i.v(sqo.b(betSlipData.eventId, betSlipData.marketId, betSlipData.outcomeId), betSlipData);
                            n4p n4pVar3 = openBetsActivity.i;
                            if (!n4pVar3.H) {
                                n4pVar3.H = true;
                            }
                        }
                    }
                }
                openBetsActivity.i.x(null);
                openBetsActivity.i.I = false;
                openBetsActivity.I1();
            }
        });
        LinkedList<xzy> linkedList = xzyVarC.h;
        linkedList.getClass();
        textView2.setVisibility(linkedList.isEmpty() ? 8 : 0);
    }

    @Override // defpackage.uyy
    public final List<xzy> b() {
        return this.d;
    }
}
