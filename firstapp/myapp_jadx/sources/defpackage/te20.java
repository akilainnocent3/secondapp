package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class te20 extends RecyclerView.d0 {
    public final sjd0 a;
    public final ag20 b;
    public final ity c;
    public final List<OutcomeButton> d;
    public u8z e;
    public zf20 f;
    public final Context i;
    public final lty v;
    public final re20 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public te20(sjd0 sjd0Var, SearchPreMatchPanel searchPreMatchPanel, ity ityVar) {
        searchPreMatchPanel.getClass();
        FrameLayout frameLayout = sjd0Var.a;
        super(frameLayout);
        this.a = sjd0Var;
        this.b = searchPreMatchPanel;
        this.c = ityVar;
        this.d = b.k(sjd0Var.w, sjd0Var.y, sjd0Var.z, sjd0Var.A);
        this.i = frameLayout.getContext();
        this.v = ityVar.b(sjd0Var.C);
        this.w = new re20(this);
        b3.H(sjd0Var.v, R.color.cmn_cool_grey);
        sjd0Var.J.setOnClickListener(new View.OnClickListener() { // from class: ie20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                te20 te20Var = this.a;
                Object tag = te20Var.a.i.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null) {
                    return;
                }
                te20Var.b.c(event);
            }
        });
    }

    public final void a(final OutcomeButton outcomeButton, Market market, Outcome outcome, Event event) {
        c8i0.n(outcomeButton);
        if (market.status != 0) {
            outcomeButton.setText(zch0.h(outcomeButton.getContext()));
            outcomeButton.setEnabled(false);
            return;
        }
        outcomeButton.setEnabled(outcome.isActive == 1);
        if (outcome.isActive != 1) {
            outcomeButton.setTextOnAndOff(zch0.h(this.i));
        } else {
            String str = outcome.odds;
            str.getClass();
            outcomeButton.setOdds(str);
        }
        int i = outcome.flag;
        if (i == 1) {
            outcomeButton.g();
            outcome.flag = 0;
        } else if (i == 2) {
            outcomeButton.c();
            outcome.flag = 0;
        }
        outcomeButton.setTag(new Selection(event, market, outcome));
        outcomeButton.setChecked(iu2.n(event, market, outcome));
        outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: ke20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ag20 ag20Var = this.a.b;
                OutcomeButton outcomeButton2 = outcomeButton;
                boolean zIsChecked = outcomeButton2.isChecked();
                Object tag = outcomeButton2.getTag();
                tag.getClass();
                ag20Var.d(outcomeButton2, zIsChecked, (Selection) tag);
            }
        });
    }
}
