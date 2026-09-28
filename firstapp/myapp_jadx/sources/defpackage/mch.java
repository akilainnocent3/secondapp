package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class mch extends RecyclerView.f<b> {
    public final PreMatchEventActivity a;
    public final y8j b;
    public final ArrayList<Market> c;
    public Event d;

    public interface a {
        boolean e(Selection selection);

        boolean h(Market market, String str);

        void r0(Event event, Market market, Outcome outcome);
    }

    public final class b extends RecyclerView.d0 {
        public final p2p a;
        public final a b;
        public final y8j c;
        public final ga20 d;
        public final il40 e;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(p2p p2pVar, PreMatchEventActivity preMatchEventActivity, y8j y8jVar) {
            preMatchEventActivity.getClass();
            y8jVar.getClass();
            CardView cardView = p2pVar.a;
            super(cardView);
            this.a = p2pVar;
            this.b = preMatchEventActivity;
            this.c = y8jVar;
            ga20 ga20Var = new ga20();
            this.d = ga20Var;
            RecyclerView recyclerView = p2pVar.d;
            il40 il40Var = new il40(recyclerView, p2pVar.f, p2pVar.i);
            this.e = il40Var;
            recyclerView.setAdapter(ga20Var);
            recyclerView.setHasFixedSize(false);
            recyclerView.i(new g4s(cardView.getContext().getColor(R.color.border_secondary), zch0.b(Resources.getSystem(), 1), zch0.b(Resources.getSystem(), 3)));
            recyclerView.j(new ulx());
            recyclerView.k(new hl40(il40Var));
        }
    }

    public mch(PreMatchEventActivity preMatchEventActivity, y8j y8jVar) {
        y8jVar.getClass();
        this.a = preMatchEventActivity;
        this.b = y8jVar;
        this.c = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        bVar.getClass();
        Event event = this.d;
        if (event != null) {
            Market market = this.c.get(i);
            market.getClass();
            Market market2 = market;
            il40 il40Var = bVar.e;
            p2p p2pVar = bVar.a;
            y8j y8jVar = bVar.c;
            View view = p2pVar.c;
            RecyclerView recyclerView = p2pVar.d;
            OutcomeButton outcomeButton = p2pVar.b;
            y8jVar.c(view, AnalyticsParam.FEATURED_BB_CARD);
            List<Outcome> list = market2.outcomes;
            list.getClass();
            Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
            if (outcome == null) {
                recyclerView.setVisibility(8);
                il40Var.a();
                return;
            }
            nch nchVar = new nch(bVar, market2, event, outcome, i);
            a aVar = bVar.b;
            outcomeButton.setBackgroundResource(R.drawable.bg_filled_brand_secondary_variable_type1_with_brand_secondary);
            outcomeButton.setTextColor(o0b.b(outcomeButton.getContext(), R.color.text_color_custom_brand_secondary_variable_type2_type3_with_brand_tertiary));
            Selection selection = new Selection(apg.f(event), market2, outcome);
            if (market2.status == 0 && outcome.isActive == 1 && !TextUtils.isEmpty(outcome.odds)) {
                outcomeButton.setTag(selection);
                String str = outcome.odds;
                str.getClass();
                outcomeButton.setOdds(str);
                outcomeButton.setChecked(aVar.e(selection));
                outcomeButton.setOnClickListener(new och(0, nchVar, outcomeButton));
                if (!outcomeButton.isChecked()) {
                    String str2 = outcome.id;
                    str2.getClass();
                    outcomeButton.setEnabled(aVar.h(market2, str2));
                }
            } else {
                outcomeButton.setTag(null);
                outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
                outcomeButton.setChecked(false);
                outcomeButton.setEnabled(false);
                outcomeButton.setOnClickListener(null);
            }
            y8jVar.c(outcomeButton, AnalyticsParam.FEATURED_BB_OUTCOME);
            ga20 ga20Var = bVar.d;
            List<PreCannedBBOutcome> list2 = outcome.childOutcomes;
            list2.getClass();
            ga20Var.getClass();
            ArrayList<PreCannedBBOutcome> arrayList = ga20Var.a;
            arrayList.clear();
            arrayList.addAll(list2);
            ga20Var.notifyDataSetChanged();
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = il40Var.a;
            gl40 gl40Var = il40Var.f;
            recyclerView2.removeCallbacks(gl40Var);
            recyclerView2.post(gl40Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.item_featured_bb_list, viewGroup, false);
        int i2 = R.id.btnOdds;
        OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.btnOdds, viewA);
        if (outcomeButton != null) {
            i2 = R.id.ivBBTitle;
            if (((ImageView) h5e.a(R.id.ivBBTitle, viewA)) != null) {
                i2 = R.id.layout_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.layout_container, viewA);
                if (constraintLayout != null) {
                    i2 = R.id.rvSubCards;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rvSubCards, viewA);
                    if (recyclerView != null) {
                        i2 = R.id.tvBBTitle;
                        if (((TextView) h5e.a(R.id.tvBBTitle, viewA)) != null) {
                            i2 = R.id.vRvMarginProvider;
                            View viewA2 = h5e.a(R.id.vRvMarginProvider, viewA);
                            if (viewA2 != null) {
                                i2 = R.id.view_fade_edge;
                                View viewA3 = h5e.a(R.id.view_fade_edge, viewA);
                                if (viewA3 != null) {
                                    i2 = R.id.view_top_fade_edge;
                                    View viewA4 = h5e.a(R.id.view_top_fade_edge, viewA);
                                    if (viewA4 != null) {
                                        return new b(new p2p((CardView) viewA, outcomeButton, constraintLayout, recyclerView, viewA2, viewA3, viewA4), this.a, this.b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
