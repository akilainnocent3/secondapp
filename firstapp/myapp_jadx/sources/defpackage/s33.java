package defpackage;

import android.view.View;
import android.widget.CheckBox;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final class s33 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ BetSlipFooter b;

    public s33(cq40 cq40Var, BetSlipFooter betSlipFooter) {
        this.a = cq40Var;
        this.b = betSlipFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avy avyVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        BetSlipFooter betSlipFooter = this.b;
        betSlipFooter.d0 = betSlipFooter.c0;
        if (view instanceof CheckBox) {
            boolean zIsChecked = ((CheckBox) view).isChecked();
            betSlipFooter.d0 = betSlipFooter.c0;
            huy huyVar = betSlipFooter.W;
            if (zIsChecked) {
                avyVar = huyVar == huy.a ? avy.a : avy.b;
            } else {
                avyVar = avy.c;
            }
            betSlipFooter.c0 = avyVar;
            betSlipFooter.b0 = avyVar;
        }
        betSlipFooter.f0.onClick(view);
    }
}
