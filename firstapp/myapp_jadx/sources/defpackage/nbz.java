package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class nbz extends z72 {
    public final gbz a;

    /* JADX WARN: Illegal instructions before constructor call */
    public nbz(gbz gbzVar) {
        ConstraintLayout constraintLayout = gbzVar.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.a = gbzVar;
    }

    @Override // defpackage.z72
    public final void a(final fbz fbzVar) {
        fbzVar.getClass();
        gbz gbzVar = this.a;
        TextView textView = gbzVar.c;
        Outcome outcome = fbzVar.c;
        textView.setText(outcome.desc);
        final OutcomeButton outcomeButton = gbzVar.b;
        Event event = fbzVar.a;
        Market market = fbzVar.b;
        if (market.status == 0) {
            outcomeButton.setEnabled(outcome.isActive == 1);
            if (outcome.isActive != 1) {
                outcomeButton.setTextOnAndOff(zch0.h(this.itemView.getContext()));
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
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: mbz
                /* JADX WARN: Code duplicated, block: B:14:0x004c  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutrightsActivity outrightsActivity = fbzVar.d;
                    OutcomeButton outcomeButton2 = outcomeButton;
                    boolean zIsChecked = outcomeButton2.isChecked();
                    Object tag = outcomeButton2.getTag();
                    tag.getClass();
                    Selection selection = (Selection) tag;
                    if (iu2.t(selection.a, selection.b, selection.c, zIsChecked, false, null, 16368)) {
                        q8i0 q8i0Var = outrightsActivity.D;
                        if (zIsChecked) {
                            ((of20) q8i0Var.getValue()).z1(selection);
                        } else {
                            ((of20) q8i0Var.getValue()).C.a(selection);
                        }
                    } else {
                        outcomeButton2.setChecked(false);
                        if (kni0.m()) {
                            iu2.r(outrightsActivity);
                        } else {
                            if (iu2.l()) {
                                qz3.p(outrightsActivity);
                            }
                            if (iu2.f(selection)) {
                                qz3.m(outrightsActivity);
                            } else {
                                Event event2 = selection.a;
                                event2.getClass();
                                if (iu2.g(event2)) {
                                    qz3.m(outrightsActivity);
                                }
                            }
                        }
                    }
                    if (iu2.p() && zIsChecked && !iu2.o(selection)) {
                        iu2.e(outrightsActivity, selection);
                    }
                }
            });
        } else {
            outcomeButton.setText(zch0.h(outcomeButton.getContext()));
            outcomeButton.setEnabled(false);
        }
        gbzVar.a.setOnClickListener(new View.OnClickListener() { // from class: lbz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fbz fbzVar2 = fbzVar;
                OutrightsActivity outrightsActivity = fbzVar2.d;
                new Selection(fbzVar2.a, fbzVar2.b, fbzVar2.c);
            }
        });
    }
}
