package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final class r33 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ BetSlipFooter b;
    public final /* synthetic */ mgd0 c;

    public r33(cq40 cq40Var, BetSlipFooter betSlipFooter, mgd0 mgd0Var) {
        this.a = cq40Var;
        this.b = betSlipFooter;
        this.c = mgd0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        mgd0 mgd0Var = this.c;
        CheckBox checkBox = mgd0Var.I0;
        TextView textView = mgd0Var.L0;
        BetSlipFooter betSlipFooter = this.b;
        n33 n33Var = new n33(betSlipFooter);
        int i = BetSlipFooter.j0;
        betSlipFooter.g(view, checkBox, textView, n33Var);
    }
}
