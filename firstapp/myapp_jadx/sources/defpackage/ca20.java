package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ca20 extends RecyclerView.f<b> {
    public final x920 a;
    public final y8j b;
    public final ArrayList<Market> c;
    public Event d;
    public b e;

    public interface a {
        void K(Event event, Market market, Outcome outcome);

        boolean e(Selection selection);

        void x(Event event, Market market, Outcome outcome);
    }

    public final class b extends RecyclerView.d0 {
        public final g2p a;
        public final a b;
        public final y8j c;
        public final ga20 d;
        public final il40 e;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(g2p g2pVar, x920 x920Var, y8j y8jVar) {
            x920Var.getClass();
            y8jVar.getClass();
            CardView cardView = g2pVar.a;
            super(cardView);
            this.a = g2pVar;
            this.b = x920Var;
            this.c = y8jVar;
            ga20 ga20Var = new ga20();
            this.d = ga20Var;
            RecyclerView recyclerView = g2pVar.e;
            il40 il40Var = new il40(recyclerView, g2pVar.F, g2pVar.G);
            this.e = il40Var;
            recyclerView.setAdapter(ga20Var);
            recyclerView.setHasFixedSize(false);
            recyclerView.i(new g4s(cardView.getContext().getColor(R.color.border_secondary), zch0.b(Resources.getSystem(), 1), zch0.b(Resources.getSystem(), 3)));
            recyclerView.j(new ulx());
            recyclerView.k(new hl40(il40Var));
        }
    }

    public ca20(x920 x920Var, y8j y8jVar) {
        y8jVar.getClass();
        this.a = x920Var;
        this.b = y8jVar;
        this.c = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String strB;
        b bVar = (b) d0Var;
        bVar.getClass();
        Event event = this.d;
        if (event != null) {
            Market market = this.c.get(i);
            market.getClass();
            Market market2 = market;
            etj etjVar = new etj(this, 1);
            y8j y8jVar = bVar.c;
            il40 il40Var = bVar.e;
            g2p g2pVar = bVar.a;
            List<Outcome> list = market2.outcomes;
            list.getClass();
            Outcome outcome = (Outcome) CollectionsKt.firstOrNull(list);
            if (outcome != null) {
                TextView textView = g2pVar.z;
                String str = outcome.odds;
                if (str != null) {
                    strB = gky.a.b(Double.parseDouble(str), true);
                } else {
                    strB = null;
                }
                if (strB == null) {
                    strB = "";
                }
                textView.setText(strB);
                ga20 ga20Var = bVar.d;
                List<PreCannedBBOutcome> list2 = outcome.childOutcomes;
                list2.getClass();
                ga20Var.getClass();
                ArrayList<PreCannedBBOutcome> arrayList = ga20Var.a;
                arrayList.clear();
                arrayList.addAll(list2);
                ga20Var.notifyDataSetChanged();
                g2pVar.e.setVisibility(0);
                RecyclerView recyclerView = il40Var.a;
                gl40 gl40Var = il40Var.f;
                recyclerView.removeCallbacks(gl40Var);
                recyclerView.post(gl40Var);
            } else {
                g2pVar.e.setVisibility(8);
                il40Var.a();
            }
            ImageView imageView = g2pVar.c;
            ProgressButton progressButton = g2pVar.A;
            ProgressButton progressButton2 = g2pVar.i;
            y8jVar.c(imageView, AnalyticsParam.PCBB_SHARE);
            g2pVar.c.setOnClickListener(new da20(new cq40(), bVar, outcome, etjVar, market2, event, i));
            y8jVar.c(progressButton2, AnalyticsParam.PCBB_ADD_TO_BETSLIP);
            if (outcome == null || !bVar.b.e(new Selection(apg.f(event), market2, outcome))) {
                progressButton2.setVisibility(0);
                progressButton.setVisibility(4);
            } else {
                progressButton2.setVisibility(4);
                progressButton.setVisibility(0);
            }
            progressButton2.setOnClickListener(new ea20(new cq40(), outcome, bVar, market2, event, i));
            progressButton.setOnClickListener(new fa20(new cq40(), outcome, bVar, market2, event, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new b(g2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), this.a, this.b);
    }
}
