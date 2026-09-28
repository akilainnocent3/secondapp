package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.TimelineView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class t6v extends uyy implements View.OnClickListener {
    public final g5p b;
    public final a c;
    public final ji2 d;
    public final boolean e;
    public final List<xzy> f;

    public interface a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t6v(g5p g5pVar, z0z z0zVar, ji2 ji2Var, boolean z, ArrayList arrayList) {
        z0zVar.getClass();
        ji2Var.getClass();
        RelativeLayout relativeLayout = g5pVar.a;
        relativeLayout.getClass();
        super(relativeLayout, arrayList);
        this.b = g5pVar;
        this.c = z0zVar;
        this.d = ji2Var;
        this.e = z;
        this.f = arrayList;
        TextView textView = g5pVar.w;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_drop_up_green_24dp), (Drawable) null);
        textView.setOnClickListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:32:0x011b  */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    @Override // defpackage.uyy
    public final void a(int i) {
        xzy.a aVar;
        String str;
        Integer num;
        boolean z;
        BetDetail betDetail;
        String str2;
        EventInRound eventInRound;
        j7g j7gVar;
        String str3;
        xzy xzyVarC = c(i);
        g5p g5pVar = this.b;
        if (xzyVarC == null || xzyVarC.c != 4) {
            g5pVar.w.setVisibility(8);
        } else {
            g5pVar.w.setVisibility(0);
        }
        if (xzyVarC != null) {
            Context context = this.itemView.getContext();
            ji2 ji2Var = xzyVarC.k;
            Round round = xzyVarC.a;
            BetDetail betDetail2 = xzyVarC.d;
            aVar = xzyVarC.j;
            if (aVar == null) {
                ArrayList arrayList = new ArrayList();
                j7g j7gVar2 = new j7g();
                if (ji2Var.b(betDetail2.marketId)) {
                    BetBuilderInRound betBuilderInRound = round.getLookupBetBuilderByBetBuilderIdMapping().get(betDetail2.outcomeId);
                    if (betBuilderInRound != null) {
                        j7gVar2.a(sn5.b(context, R.string.page_instant_virtual__bet_builder, new Object[0]));
                        j7gVar2.a(" @");
                        j7gVar2.d(gky.a(betBuilderInRound.odds), true);
                    }
                    for (BetBuilderSelection betBuilderSelection : betBuilderInRound.selections) {
                        String str4 = betBuilderSelection.marketId;
                        arrayList.add(round.getOutcomeBy(context, str4, betBuilderSelection.outcomeId, ji2Var.b(str4)).desc + ", " + round.getLookupMarketByMarketIdMapping().get(betBuilderSelection.marketId).title);
                    }
                } else {
                    OutcomeInRound outcomeBy = round.getOutcomeBy(context, betDetail2.marketId, betDetail2.outcomeId, false);
                    if (outcomeBy != null) {
                        j7gVar2.a(outcomeBy.desc);
                        j7gVar2.a(" @");
                        j7gVar2.d(gky.a(outcomeBy.odds), true);
                    }
                    MarketInRound marketInRound = round.getLookupMarketByMarketIdMapping().get(betDetail2.marketId);
                    String str5 = marketInRound != null ? marketInRound.title : "";
                    eventInRound = round.getLookupEventByEventIdMapping().get(betDetail2.eventId);
                    j7gVar = new j7g();
                    if (eventInRound != null) {
                        String strB = sn5.b(context, R.string.bet_history__vs, new Object[0]);
                        j7gVar.a(eventInRound.homeTeamName);
                        j7gVar.a(" ");
                        j7gVar.e(context.getColor(R.color.text_type1_secondary), strB);
                        j7gVar.a(" ");
                        j7gVar.a(eventInRound.awayTeamName);
                    }
                    if (eventInRound != null) {
                        str3 = eventInRound.leagueName;
                    } else {
                        str3 = null;
                    }
                    xzy.a aVar2 = new xzy.a();
                    aVar2.a = j7gVar2;
                    aVar2.b = str5;
                    aVar2.c = j7gVar;
                    aVar2.d = str3;
                    aVar2.e = arrayList;
                    xzyVarC.j = aVar2;
                    aVar = aVar2;
                }
                eventInRound = round.getLookupEventByEventIdMapping().get(betDetail2.eventId);
                j7gVar = new j7g();
                if (eventInRound != null) {
                    String strB2 = sn5.b(context, R.string.bet_history__vs, new Object[0]);
                    j7gVar.a(eventInRound.homeTeamName);
                    j7gVar.a(" ");
                    j7gVar.e(context.getColor(R.color.text_type1_secondary), strB2);
                    j7gVar.a(" ");
                    j7gVar.a(eventInRound.awayTeamName);
                }
                if (eventInRound != null) {
                    str3 = eventInRound.leagueName;
                } else {
                    str3 = null;
                }
                xzy.a aVar3 = new xzy.a();
                aVar3.a = j7gVar2;
                aVar3.b = str5;
                aVar3.c = j7gVar;
                aVar3.d = str3;
                aVar3.e = arrayList;
                xzyVarC.j = aVar3;
                aVar = aVar3;
            }
        } else {
            aVar = null;
        }
        TextView textView = g5pVar.v;
        LinearLayout linearLayout = g5pVar.b;
        TextView textView2 = g5pVar.f;
        TextView textView3 = g5pVar.i;
        TextView textView4 = g5pVar.e;
        textView.setText(aVar != null ? aVar.a : null);
        g5pVar.d.setText(aVar != null ? aVar.c : null);
        if (aVar == null || (str2 = aVar.d) == null) {
            str = null;
        } else {
            if (StringsKt.U(str2) || !this.e) {
                str2 = null;
            }
            if (str2 != null) {
                View view = this.itemView;
                view.getClass();
                str = sn5.c(view, R.string.common_functions__league, new Object[0]) + ": " + ((CharSequence) str2);
            } else {
                str = null;
            }
        }
        if (str != null) {
            textView2.setText(str);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (this.d.b((xzyVarC == null || (betDetail = xzyVarC.d) == null) ? null : betDetail.marketId)) {
            List list = aVar != null ? aVar.e : m2g.a;
            linearLayout.removeAllViews();
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 == 0 ? 1 : i2 == list.size() + (-1) ? 2 : 0;
                CharSequence charSequence = (CharSequence) list.get(i2);
                View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.iwqk_layout_bet_builder_market_desc, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.bet_builder_market_desc);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText(charSequence);
                int color = this.itemView.getContext().getColor(R.color.line_type1_secondary);
                View viewFindViewById2 = viewInflate.findViewById(R.id.timeline);
                viewFindViewById2.getClass();
                TimelineView timelineView = (TimelineView) viewFindViewById2;
                timelineView.a(i3);
                timelineView.setStartLineColor(color, i3);
                timelineView.setEndLineColor(color, i3);
                timelineView.setLineWidth(10);
                timelineView.setLinePadding(0);
                timelineView.setMarkerSize(15);
                View view2 = this.itemView;
                if (i3 == 0) {
                    timelineView.setMarker(view2.getContext().getDrawable(R.drawable.cmn_ic_timeline_marker_line), color);
                } else {
                    timelineView.setMarker(view2.getContext().getDrawable(R.drawable.cmn_ic_timeline_marker), color);
                }
                linearLayout.addView(viewInflate);
                i2++;
            }
            num = null;
            linearLayout.setVisibility(0);
            textView3.setVisibility(8);
        } else {
            num = null;
            textView3.setText(aVar != null ? aVar.b : null);
            textView3.setVisibility(0);
            linearLayout.setVisibility(8);
        }
        if (xzyVarC != null) {
            z = true;
            int i4 = xzyVarC.g ? 0 : 8;
            textView4.setVisibility(i4);
            if (xzyVarC == null && xzyVarC.g == z) {
                String str6 = xzyVarC.f;
                if (!Intrinsics.g(str6, SimulateBetConsts.BetslipType.FLEX)) {
                    if (!Intrinsics.g(str6, SimulateBetConsts.BetslipType.CUTBET)) {
                        textView4.setVisibility(8);
                        return;
                    } else {
                        textView4.setText("");
                        textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_one_bet_cut, 0, 0, 0);
                        return;
                    }
                }
                View view3 = this.itemView;
                view3.getClass();
                String strValueOf = String.valueOf(xzyVarC.e);
                List<BetDetail> list2 = xzyVarC.b.get(0).betDetails;
                textView4.setText(sn5.c(view3, R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, strValueOf, String.valueOf(list2 != null ? Integer.valueOf(list2.size()) : num)));
                textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_flexible_active, 0, 0, 0);
                return;
            }
        }
        z = true;
        textView4.setVisibility(i4);
        if (xzyVarC == null) {
        }
    }

    @Override // defpackage.uyy
    public final List<xzy> b() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        ((z0z) this.c).a.i();
    }
}
