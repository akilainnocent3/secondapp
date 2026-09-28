package com.sportybet.android.instantwin.presentation.widget;

import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchEventSpinnerViewHolder;
import defpackage.b5v;
import defpackage.bs3;
import defpackage.n4p;
import defpackage.sqo;
import defpackage.tlo;
import defpackage.u4v;
import defpackage.y4v;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class b implements OutcomeGeneralLayout.a<bs3> {
    public final /* synthetic */ OutcomeSpinnerLayout a;

    public b(OutcomeSpinnerLayout outcomeSpinnerLayout) {
        this.a = outcomeSpinnerLayout;
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
    public final void a(bs3 bs3Var) {
        bs3 bs3Var2 = bs3Var;
        OutcomeSpinnerLayout outcomeSpinnerLayout = this.a;
        Object obj = outcomeSpinnerLayout.c;
        if (obj != null) {
            int i = outcomeSpinnerLayout.i;
            u4v u4vVar = ((MatchEventSpinnerViewHolder.a) obj).a;
            if (u4vVar != null) {
                bs3Var2.d = i;
                u4vVar.a.q0(bs3Var2);
            }
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
    public final void b(bs3 bs3Var) {
        bs3 bs3Var2 = bs3Var;
        OutcomeSpinnerLayout outcomeSpinnerLayout = this.a;
        Object obj = outcomeSpinnerLayout.c;
        if (obj != null) {
            int i = outcomeSpinnerLayout.i;
            u4v u4vVar = ((MatchEventSpinnerViewHolder.a) obj).a;
            if (u4vVar != null) {
                bs3Var2.d = i;
                y4v y4vVar = u4vVar.a;
                tlo tloVarP0 = y4vVar.p0();
                BigDecimal bigDecimal = sqo.a;
                ((n4p) tloVarP0).I(sqo.b(bs3Var2.a, bs3Var2.b, bs3Var2.c));
                y4vVar.t0(bs3Var2, false);
                b5v b5vVar = y4vVar.B;
                if (b5vVar != null) {
                    b5vVar.u0();
                }
            }
        }
    }
}
