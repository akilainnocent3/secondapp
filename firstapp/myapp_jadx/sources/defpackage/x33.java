package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final class x33 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ BetSlipFooter b;

    public x33(cq40 cq40Var, BetSlipFooter betSlipFooter) {
        this.a = cq40Var;
        this.b = betSlipFooter;
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
        this.b.g0.onClick(view);
    }
}
